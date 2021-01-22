ackage com.example.springpj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// menandakan bahwa class ini sebagai entity dan table dengan nama user.
@Entity
@Table(name = "user")
public class User {

	// membuat entity baru dengan nama id yang mempunyai properties sebagai primary dan auto_increment.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	// membuat entity baru dengan nama username
	@Column(name = "username")
	private String userName;
	
	// membuat entity baru dengan nama password
	@Column(name = "password")
	private String password;
	
    // membuat entity baru dengan nama email
	@Column(name = "email")
	private String email;
	
	// membuat entity baru dengan nama phone
	@Column(name = "phone")
	private String phone;
	
	// membuat entity baru dengan nama country
	@Column(name = "country")
	private String country;
    
    // membuat entity baru dengan nama city
	@Column(name = "city")
	private String city;
	
	// membuat entity baru dengan nama postcode
	@Column(name = "postcode")
	private String postCode;
	
	// membuat entity baru dengan nama name
	@Column(name = "name")
    private String name;
    
    // membuat entity baru dengan nama address
	@Column(name = "address")
	private String address;


	// setter gettter
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
  
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
    }

    public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
    }

    public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
    }

    public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
    }

    public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
    }
    //untuk name
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
