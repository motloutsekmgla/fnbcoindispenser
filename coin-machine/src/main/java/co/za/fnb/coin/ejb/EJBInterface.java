package co.za.fnb.coin.ejb;

import java.util.Map;

import javax.ejb.Local;

import co.za.fnb.coin.entities.Login;

@Local
public interface EJBInterface {
	<T> T getEntityByQuery(Class<T> clazz, String queryString, Map<String, Object> parameters);
	Login getLogindetails(String username, String password);
	

}
