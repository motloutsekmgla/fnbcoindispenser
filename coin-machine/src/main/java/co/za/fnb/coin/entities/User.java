package co.za.fnb.coin.entities;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonSerialize;



import java.util.Collection;
import java.util.Date;
import java.util.List;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

@Entity
@Table(name="user")
@NamedQueries({ 
@NamedQuery(name="User.findAll", query="SELECT u FROM User u"),
@NamedQuery(name="User.finduserroles", query="SELECT u FROM User u where u.id = :userId"),
@NamedQuery(name="User.findemail", query="SELECT u FROM User u where u.emailaddress = :foreignId")
})
public class User{
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name="active_flag")
	private String activeFlag;

	@Temporal(TemporalType.DATE)
	private Date datecreated;

	private String emailaddress;

	private String name;

	private String surname;

	public String getActiveFlag() {
		return activeFlag;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

}