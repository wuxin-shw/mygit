package com.bjpowernode.controller;

import com.bjpowernode.pojo.Books;
import com.bjpowernode.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;

/**
 * 孙豪文
 * 2020/12/5
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //查询全部
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.getAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }

    @Autowired
    //@Qualifier(name = "bookService" )
    private BookService bookService;

    //跳转书籍添加页面
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    //添加书籍请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("books=>"+books);
        bookService.addbook(books);
        return "redirect:/book/allBook";
    }

    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdateBook(int id,Model model){
        Books books = bookService.selectBookById(id);
        model.addAttribute("SBook", books);
        return "updateBook";
    }
    //修改书籍
    @RequestMapping("/update")
    public String updateBook(Books books){
        System.out.println("books=>"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //删除书籍
    @RequestMapping("/delete/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        System.out.println(id);
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //查询书籍
    @RequestMapping("/searchBook")
    public String searchBook(String bookName,Model model){
        List<Books> list = bookService.selectBookByname(bookName);
        model.addAttribute("list",list);



        return "allBook";
    }
}
