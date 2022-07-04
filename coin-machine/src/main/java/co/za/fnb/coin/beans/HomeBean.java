package co.za.fnb.coin.beans;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.za.fnb.coin.entities.Login;
import co.za.fnb.coin.entities.User;
import co.za.fnb.coin.service.CoinService;

@ManagedBean(name = "homeBean")
@ViewScoped
public class HomeBean {
		
	private static final String String = null;

	private Login login;
	
	@Inject
	private CoinService coinservice;
	
	private String amount;
	private String denomination;
	private List<Integer> change;
		

	    @PostConstruct
	    public void init() {
	    	login =  (Login) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("loged");
	    	
	    }

	    public String getConfig(){
	    	String pp = null;
	    	try {
				Properties prop=new Properties();
			//	String configFilePath ="src/config.properties";
				//FileInputStream ip= new FileInputStream(configFilePath);
				InputStream is = getClass().getClassLoader().getResourceAsStream("config.properties");
				
				if(is == null)
				{
					
					System.out.println("hjsfkahdflfhdsjjhfdfhajk");
				}
				prop.load(is);
				pp = prop.getProperty("url");				
			
			} catch (FileNotFoundException e) {
	        e.printStackTrace();
			} catch (IOException e) {
	        e.printStackTrace();
			}
			return pp;
	    }
	    
	    //the get change method
		@SuppressWarnings("unchecked")
		public void getChangeMethod(){
				
			change = (List<Integer>)clientWebsrive(getConfig(), amount, denomination,login.getToken());
				
		}
		
		//the client for the service
		private List<Integer> clientWebsrive(String urllink,String amount, String denomination, String token )
		{
			ObjectMapper mapper = new ObjectMapper();
			StringBuffer sb = new StringBuffer();
			List<Integer>  results = null;
			
			 try {
				
				 
					URL url = new URL(urllink+"coindispenser/"+amount + "/" + denomination+"/"+token);
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setDoOutput(true);
					conn.setRequestMethod("GET");
					conn.setRequestProperty("Content-Type", "application/json");
			
					
					if (conn.getResponseCode() == 400) {
						FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Denominations must be comma separated !!", "Denominations must be comma separated!!"));
						this.denomination = null;
						return null;
					}

					BufferedReader br = new BufferedReader(new InputStreamReader(
						(conn.getInputStream())));

					String output;
					
					while ((output = br.readLine()) != null) {
						System.out.println(output);
					sb.append(output);
					}
					
					
					results = mapper.readValue(sb.toString(),new TypeReference<ArrayList<Integer>>() {});
					
					conn.disconnect();

				  } catch (MalformedURLException e) {

					// e.printStackTrace();

				  } catch(EOFException e) {
					  
				// 	  do nothing to avoid printing nothing
				  }
			        catch (IOException e) {

					// e.printStackTrace();

				  }
			return results;
		}
		

		public String getAmount() {
			return amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}

		public String getDenomination() {
			return denomination;
		}

		public void setDenomination(String denomination) {
			this.denomination = denomination;
		}

		public List<Integer> getChange() {
			return change;
		}

		public void setChange(List<Integer> change) {
			this.change = change;
		}

		

}
