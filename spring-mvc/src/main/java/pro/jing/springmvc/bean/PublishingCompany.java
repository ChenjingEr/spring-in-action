package pro.jing.springmvc.bean;

public class PublishingCompany {

	private Integer id;
	private String companyName;
	private String companyAddress;

	public PublishingCompany() {
	}

	public PublishingCompany(Integer id, String companyName, String companyAddress) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}

	public Integer getId() {

		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	@Override
	public String toString() {
		return "PublishingCompany [id=" + id + ", companyName=" + companyName + ", companyAddress=" + companyAddress
				+ "]";
	}

}
