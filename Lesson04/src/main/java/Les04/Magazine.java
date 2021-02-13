package Les04;

public class Magazine {
	
	private int id;
	private String magazine_name;
	private int magazine_pages;
	private double magazine_price;
	
	public Magazine(int id, String magazine_name, int magazine_pages, double magazine_price) {
		super();
		this.id = id;
		this.magazine_name = magazine_name;
		this.magazine_pages = magazine_pages;
		this.magazine_price = magazine_price;
	}

	public Magazine(String magazine_name, int magazine_pages, double magazine_price) {
		super();
		this.magazine_name = magazine_name;
		this.magazine_pages = magazine_pages;
		this.magazine_price = magazine_price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMagazine_name() {
		return magazine_name;
	}

	public void setMagazine_name(String magazine_name) {
		this.magazine_name = magazine_name;
	}

	public int getMagazine_pages() {
		return magazine_pages;
	}

	public void setMagazine_pages(int magazine_pages) {
		this.magazine_pages = magazine_pages;
	}

	public double getMagazine_price() {
		return magazine_price;
	}

	public void setMagazine_price(double magazine_price) {
		this.magazine_price = magazine_price;
	}

	@Override
	public String toString() {
		return "Magazine [id=" + id + ", magazine_name=" + magazine_name + ", magazine_pages=" + magazine_pages
				+ ", magazine_price=" + magazine_price + "]";
	}
	
	

}
