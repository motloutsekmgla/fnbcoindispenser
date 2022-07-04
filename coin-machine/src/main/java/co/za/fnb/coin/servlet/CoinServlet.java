package co.za.fnb.coin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class CoinServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	UserProfileWrapper newsUerProfile = null;
		String token = request.getParameter("id");
		
		 //configtable = scsEJBInterface.findEntityByForeignId(ConfigTable.class, "portalLink", false);	
	
		
		

		  HttpSession session =
		  request.getSession(); System.out.println("Portal HttpSession id: " +
		  session.getId());
		  
		  
		//  session.setAttribute("userProfile", new UserProfileWrapper());
		 
			
			// call activity client to get groups...for the user if groups is null then the person is a citizen. 
			//grouplist = new GroupService(scsEJBInterface.findEntityByForeignId(ConfigTable.class, "workflowlink", false).getConfigvalue()).getlistofGroupByUsername(newsUerProfile.getIdNumber(), "MO");
			

				 response.sendRedirect("faces/login/login.xhtml");
				

			
		
	}
		
	

}
