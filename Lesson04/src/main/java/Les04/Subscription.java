package Les04;

public class Subscription {
	
	private int id;
	private int magazine_id;
	private int user_id;
	
	public Subscription(int id, int magazine_id, int user_id) {
		super();
		this.id = id;
		this.magazine_id = magazine_id;
		this.user_id = user_id;
	}

	public Subscription(int magazine_id, int user_id) {
		super();
		this.magazine_id = magazine_id;
		this.user_id = user_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMagazine_id() {
		return magazine_id;
	}

	public void setMagazine_id(int magazine_id) {
		this.magazine_id = magazine_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Subscription [id=" + id + ", magazine_id=" + magazine_id + ", user_id=" + user_id + "]";
	}
	
	

}
