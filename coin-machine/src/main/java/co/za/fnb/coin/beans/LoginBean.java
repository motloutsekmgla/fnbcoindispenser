package co.za.fnb.coin.beans;


import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.commons.codec.digest.DigestUtils;
import org.primefaces.PrimeFaces;

import co.za.fnb.coin.constants.DateUtils;
import co.za.fnb.coin.ejb.EJBInterface;
import co.za.fnb.coin.entities.Login;
import co.za.fnb.coin.entities.User;








@ManagedBean(name = "loginBean")
@ViewScoped
public class LoginBean implements Serializable {

	/**
	 * 
	 */
	
	@EJB
	private EJBInterface  ejb;
	
	private static final long serialVersionUID = 1L;



	private String username;
	private String password;
	private Login login;
	private User user;


	@PostConstruct
	protected void initIt(){
		login = new Login();
		user = new User();
		username =getUsername();
		password =getPassword();
	}


	
	
	
	public String cancel(){
		  return"loginPage.xhtml?faces-redirect=true";
		  
	  }
	
	//this is a login method
	public String login() throws IOException {
		if(username.length()> 0 && !username.isEmpty() && username != null){
			System.out.println(" this is what I am trying to find  :  " + username);
				Map<String, Object> map1 = new HashMap<String, Object>();
				
				System.out.println(DigestUtils.sha256Hex(password));
				map1.put("foreignId", username);
				map1.put("pass", DigestUtils.sha256Hex(password));
				login = ejb.getEntityByQuery(Login.class, "authuser", map1);

				if(login == null) {
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Username or Password is incorrect!!", "username or password is incorrect!!"));
					return ""; 
				}else
						{
							FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("loged", login);
							FacesContext.getCurrentInstance().getExternalContext().redirect("home.xhtml");
							
						}
 // Admin page  
		}
			
		
		return null; 
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Login getLogin() {
		return login;
	}



	public void setLogin(Login login) {
		this.login = login;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}


	

}
