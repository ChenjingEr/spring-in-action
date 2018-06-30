package pro.jing.springmvc.bean;

public class Book {

	private Integer id;
	private String bookName;
	private String authoerName;
	private Double price;
	private PublishingCompany publishingCompany;

	public Book(Integer id, String bookName, String authoerName, Double price, PublishingCompany publishingCompany) {
		this.id = id;
		this.bookName = bookName;
		this.authoerName = authoerName;
		this.price = price;
		this.publishingCompany = publishingCompany;
	}

	public PublishingCompany getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(PublishingCompany publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	public Book() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthoerName() {
		return authoerName;
	}

	public void setAuthoerName(String authoerName) {
		this.authoerName = authoerName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", authoerName=" + authoerName + ", price=" + price + "]";
	}

}
