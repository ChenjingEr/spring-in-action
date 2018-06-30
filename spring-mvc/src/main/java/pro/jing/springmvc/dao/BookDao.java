package pro.jing.springmvc.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import pro.jing.springmvc.bean.Book;
import pro.jing.springmvc.bean.PublishingCompany;

@Repository
public class BookDao {

	private static Map<Integer, Book> books = null;

	static {
		books = new HashMap<>();
		books.put(1001, new Book(1001, "创世纪", "张爱玲", 100.5, new PublishingCompany(1100, "百花洲文艺出版社", "北京")));
		books.put(1002, new Book(1002, "那不勒斯的萤火", "马西米利亚诺· 威尔吉利奥", 33.20, new PublishingCompany(1100, "百花洲文艺出版社", "北京")));
		books.put(1003,
				new Book(1003, "剩下来的孩子", "莉安侬·纳文", 33.20, new PublishingCompany(1100, "百花洲文艺出版社", "北京")));
		books.put(1004,
				new Book(1004, "寻找时间的人", "凯特·汤普森", 31.70, new PublishingCompany(1101, "中信出版社", "北京")));
		books.put(1005,
				new Book(1005, "娱乐至死", "（美）波兹曼", 31.70, new PublishingCompany(1102, "四川文艺出版社", "四川")));
		books.put(1006,
				new Book(1006, " 上帝怀中的羔羊", "凯洛琳·米勒", 33.20, new PublishingCompany(1102, "四川文艺出版社", "四川")));
	}

	public Book getBookById(Integer id) {
		return books.get(id);
	}

	public List<Book> getBookList() {
		return new ArrayList<>(books.values());
	}

	public void save(Book book) {
		if (book.getId() == null)
			book.setId((int)(Math.random() * 1000));
		books.put(book.getId(), book);
	}

	public void delete(Integer id) {
		books.remove(id);
	}
}
