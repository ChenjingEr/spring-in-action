package pro.jing.springmvc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.BootstrapWith;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import pro.jing.springmvc.bean.Book;
import pro.jing.springmvc.dao.BookDao;

@Controller
public class MvController {
	
	public static final String VIEW_NAME = "success";
	
	@Autowired
	private BookDao bookDao;
	
	
	@RequestMapping("/mv")
	public String mv() {
		return "mv";
	}
	
	@RequestMapping("/map")
	public String map(Map<String,Object> map) {
		map.put("msg", "Hello QIQI");
		return VIEW_NAME;
	}
	
	@RequestMapping("/modelAndView")
	public ModelAndView modelAndView() {
		ModelAndView mv = new ModelAndView(VIEW_NAME);
		mv.addObject("msg", "Hello QIQI");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping("/bjson")
	public List<Book> getBooks() {
		return bookDao.getBookList();
	}
}
