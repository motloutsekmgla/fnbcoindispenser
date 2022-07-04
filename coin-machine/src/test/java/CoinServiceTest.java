

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import co.za.fnb.coin.service.CoinService;

public class CoinServiceTest {
	
	@Inject
	CoinService coins;
	
	 
	 @Test
     public void client(){
    	  
     				URL url;
				try {
					url = new URL("http://localhost:8080/fnbcoin/rest/coindispenser/10/2,3,4/BA7816BF8F01CFEA414140DE5DAE2223B00361A396177A9CB410FF61F20015AD");
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setDoOutput(true);
					conn.setRequestMethod("GET");
					conn.setRequestProperty("Content-Type", "application/json");
			
					
			//		return conn.getResponseCode() ;
					 assertEquals(200l,Long.valueOf(conn.getResponseCode()).longValue());
					
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
  			
				
      
      
}

      }