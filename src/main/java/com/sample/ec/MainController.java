package com.sample.ec;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
      @Autowired
      private BookRepository bookRepository;

      @RequestMapping(value = "/")
      public List<Book> get(){
         return bookRepository.findAll();
      }


}