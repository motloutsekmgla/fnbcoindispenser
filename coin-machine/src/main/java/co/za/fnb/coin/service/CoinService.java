package co.za.fnb.coin.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.za.fnb.coin.ejb.EJBInterface;
import co.za.fnb.coin.entities.Login;

@Stateless
@Path("/rest")
public class CoinService {
	
	@EJB
	private EJBInterface  ejb;
	
	//maximum number of input amount
	final int MAX = 100000;
	 
	// tempReslt array to memoize the results
	int []tempReslt = new int[MAX + 1];
	 
	// List to store the result
	List<Integer> denomination =  new ArrayList<Integer>();
	 
	// Initialize result
	int ret = Integer.MAX_VALUE;
		
		/*
		 * this isthe resful webservice to get changein coins
		 * the service takes 4 parameters
		 */
		@GET
	    @Path("/coindispenser/" + "{amount}/"+ "{denomination}/"+ "{token}")
	    @Produces(MediaType.APPLICATION_JSON)
	 public Response getCoins(@PathParam("amount") String amount, @PathParam("denomination") String denomination,@PathParam("token") String token ) throws IOException{
		
			//check if the token is valid
			if((Autheticate(token)))		{
				return  Response.status(Response.Status.FORBIDDEN).entity("User not allowed to use service").build();
			}
			//check if the amount is not empty
			if (amount == null || amount.isEmpty())
			{
				return Response.status(Response.Status.BAD_REQUEST).entity("amount cannot be empty").build();
			}			
			
			 // split an array of string where there is a coma
			 String[] arryString = denomination.split(",");
			 //check if the length of the string is equals to 1, then return a response
			 if (arryString.length == 1)
				{
					return Response.status(Response.Status.BAD_REQUEST).entity("Denominations must be comma separated").build();
				}
							 
			 //declare an int arry with the sane length as the string array
			 int[] intarry = new int[arryString.length];
			 
			 // loop through string array and add the values to int array
			 for(int i=0;i<arryString.length;i++){
				 intarry[i] = Integer.valueOf(arryString[i]);
			 }
			 
			  CointTestFunction ct2 = new CointTestFunction();
			  // Function Call
			 List<Integer> li = ct2.countMinCoinsUtil(Integer.valueOf(amount), intarry);

		return Response.ok(li).build();

	 }
		
		
		//check the token 
		boolean Autheticate(String token)
		{
			
			Map<String, Object> map1 = new HashMap<String, Object>();
			
			map1.put("token", token);
			Login object = ejb.getEntityByQuery(Login.class, "findtoken", map1);	
			System.out.println("my storry " + object);
			return object == null;
		}
		
		
		

}
