package Les04;

public class User {
	
	private int id;
	private String user_firstname;
	private String user_lastname;
	private int user_age;
	private String user_email;
	private String user_pass;
	private String user_level;
	
	
	public User(String user_firstname, String user_lastname, int user_age, String user_email, String user_pass,
			String user_level) {
		
		this.user_firstname = user_firstname;
		this.user_lastname = user_lastname;
		this.user_age = user_age;
		this.user_email = user_email;
		this.user_pass = user_pass;
		this.user_level = user_level;
	}


	public User(int id, String user_firstname, String user_lastname, int user_age, String user_email, String user_pass,
			String user_level) {
		super();
		this.id = id;
		this.user_firstname = user_firstname;
		this.user_lastname = user_lastname;
		this.user_age = user_age;
		this.user_email = user_email;
		this.user_pass = user_pass;
		this.user_level = user_level;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUser_firstname() {
		return user_firstname;
	}


	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}


	public String getUser_lastname() {
		return user_lastname;
	}


	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}


	public int getUser_age() {
		return user_age;
	}


	public void setUser_age(int user_age) {
		this.user_age = user_age;
	}


	public String getUser_email() {
		return user_email;
	}


	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}


	public String getUser_pass() {
		return user_pass;
	}


	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}


	public String getUser_level() {
		return user_level;
	}


	public void setUser_level(String user_level) {
		this.user_level = user_level;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", user_firstname=" + user_firstname + ", user_lastname=" + user_lastname
				+ ", user_age=" + user_age + ", user_email=" + user_email + ", user_pass=" + user_pass + ", user_level="
				+ user_level + "]";
	}
	
}
	
	