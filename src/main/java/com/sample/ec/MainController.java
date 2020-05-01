package com.sample.ec;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class MainController {
      @Autowired
      private BookRepository bookRepository;
      
      @RequestMapping(value = "/book",method = RequestMethod.GET)    
      public String  displayList(Model model) {    
	    List<Book> books = bookRepository.findAll();
		model.addAttribute("books", books);   
      return "service/book";    
      }
      
      
      
}