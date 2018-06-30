package pro.jing.springmvc.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import pro.jing.springmvc.bean.PublishingCompany;

@Repository
public class PublishingCompanyDao {

	private static Map<Integer, PublishingCompany> companys = null;
	
	static {
		companys = new HashMap<>();
		companys.put(1100, new PublishingCompany(1100, "百花洲文艺出版社", "北京"));
		companys.put(1101, new PublishingCompany(1101, "中信出版社", "北京"));
		companys.put(1102, new PublishingCompany(1102, "四川文艺出版社", "四川"));
	}
	
	public PublishingCompany getPublishingCompanyById(Integer id) {
		return companys.get(id);
	}
	
	public List<PublishingCompany> getPublishingCompanyList() {
		return new ArrayList<>(companys.values());
	}
}
