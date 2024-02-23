package libraryapp.model;

public class BookModel {

	private int id;
	private String name;
	private String author;
	private String publiction;
	private int price;
	private String category;
	private boolean status = false;
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}
	
	public BookModel() {
		
	}

	public BookModel(String name, String author, String publiction, int price, String category) {
		this.name = name;
		this.author = author;
		this.publiction = publiction;
		this.price = price;
		this.category = category;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPubliction() {
		return publiction;
	}
	public void setPubliction(String publiction) {
		this.publiction = publiction;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
