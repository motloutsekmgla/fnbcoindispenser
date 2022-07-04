package co.za.fnb.coin.ejb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.codehaus.jackson.map.ObjectMapper;

import co.za.fnb.coin.entities.Login;

@SuppressWarnings("unchecked")
@Stateless
public class EJBImplementation implements EJBInterface{
	
	@PersistenceContext(unitName = "fnbcoin", type=PersistenceContextType.TRANSACTION)
	private EntityManager em;
	
	/*@Resource(mappedName="java:jboss/datasources/fnbcoinDS")
	private DataSource datasource;
	private Connection connection;
	private  ObjectMapper om = new ObjectMapper();*/
	
	@SuppressWarnings("unchecked")
	public <T> T getEntityByQuery(Class<T> clazz, String queryString, Map<String, Object> parameters) {
		List<T> list = null;
		String mine = clazz.getSimpleName()+"."+ queryString;
		System.out.println("getEntityByQuery result " + mine);
		Query queryname = em.createNamedQuery(mine);
		
		if(parameters == null){
		return null;
	       }else{
	    	   for(Map.Entry<String, Object> m: parameters.entrySet()){  
	    		   queryname.setParameter(m.getKey(), m.getValue());
	    		   
	       }
		
	    	   list = queryname.getResultList();
		if(list != null && list.size()>0) {
			return list.get(0);
		}else {
			return null;
		}
	}
	
	}

	@Override
	public Login getLogindetails(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*public Login getLogindetails(String username, String password) {
	PreparedStatement statement = null;    
    ResultSet rs = null;

	try {
		connection = datasource.getConnection();   
		
		statement = connection.prepareStatement("select * from login where username = ? and password = ? ");
		statement.setString(1, username);
		statement.setString(2, password);
		
		rs = statement.executeQuery();
		 
 		while (rs.next()) {
 			Login login = new Login();
 			login.setUsername(rs.getString("username"));
 			login.setPassword(rs.getString("password"));
 			
 			return login;
 			
 		}
		
	} catch (SQLException e) {
		e.printStackTrace();
		
	}finally
	{
		
		try {
			rs.close();
		} catch (Exception e) {			
			
		}
		
		try {
			statement.close();
		} catch (Exception e) {
		
		}
			
		try {
			//connection.close();
		} catch (Exception e) {
			
		}
	}
	
	
	return null;
}*/

	

	

}

