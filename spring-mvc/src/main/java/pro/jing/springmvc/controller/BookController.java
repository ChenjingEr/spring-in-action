package pro.jing.springmvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pro.jing.springmvc.bean.Book;
import pro.jing.springmvc.dao.BookDao;
import pro.jing.springmvc.dao.PublishingCompanyDao;

@Controller
public class BookController {

	@Autowired
	private BookDao bookDao;
	@Autowired
	private PublishingCompanyDao companyDao;

	@RequestMapping("/books")
	public String list(Map<String, Object> map) {
		map.put("books", bookDao.getBookList());
		return "list";
	}

	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public String input(Map<String, Object> map) {
		map.put("companys", companyDao.getPublishingCompanyList());
		map.put("book", new Book());
		// map.put("book", bookDao.getBookById(1004));
		return "input";
	}

	@RequestMapping(value = "/book", method = RequestMethod.POST)
	public String save(Book book) {
		bookDao.save(book);
		return "redirect:/books";
	}

	@RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") Integer id) {
		bookDao.delete(id);
		return "redirect:/books";
	}

	@ModelAttribute
	public void getBook(@RequestParam(value = "id", required = false) Integer id, Map<String, Object> map) {
		if (id != null) {
			map.put("book", bookDao.getBookById(id));
		}
	}

	@RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
	public String input(@PathVariable(value = "id") Integer id, Map<String, Object> map) {
		map.put("companys", companyDao.getPublishingCompanyList());
		map.put("book", bookDao.getBookById(id));
		// map.put("book", bookDao.getBookById(1004));
		return "input";
	}

	@RequestMapping(value = "/book", method = RequestMethod.PUT)
	public String update(Book book) {
		bookDao.save(book);
		return "redirect:/books";
	}
}
