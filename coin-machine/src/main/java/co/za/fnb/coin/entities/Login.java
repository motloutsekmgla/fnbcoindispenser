package co.za.fnb.coin.entities;

import java.io.Serializable;
import javax.persistence.*;




import java.util.Date;


/**
 * The persistent class for the login database table.
 * 
 */
@Entity
@Table(name="login")
@NamedQueries({ 
@NamedQuery(name="Login.findAll", query="SELECT l FROM Login l"),
@NamedQuery(name="Login.authuser", query="SELECT l FROM Login l where l.username = :foreignId and l.password = :pass and l.user.activeFlag = '1'"),
@NamedQuery(name="Login.findtoken", query="SELECT l FROM Login l where l.token = :token")
})
public class Login  {
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue
	@Column(name = "id")
	private int id;

	private String password;

	@OneToOne
    @JoinColumn(name = "userid")
	private User user;

	
	private String username;
	
	private String token;

	public Login() {
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}

}