package pro.jing.jdbc.bean;

public class City {

	private Integer id;
	private String cityCode;
	private String cityName;
	
	public City() {}
	
	public City(String cityCode, String cityName) {
		this.cityCode = cityCode;
		this.cityName = cityName;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", cityCode=" + cityCode + ", cityName=" + cityName + "]";
	}
	
}
