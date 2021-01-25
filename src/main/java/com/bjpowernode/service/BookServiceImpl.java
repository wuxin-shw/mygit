package com.bjpowernode.service;

import com.bjpowernode.dao.BookMapper;
import com.bjpowernode.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

/**
 * 孙豪文
 * 2020/12/4
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addbook(Books books) {
        return bookMapper.addbook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books selectBookById(int id) {
        return bookMapper.selectBookById(id);
    }

    @Override
    public List<Books> getAllBook() {
        return bookMapper.getAllBook();
    }

    @Override
    public List<Books> selectBookByname(String bookName) {
        return bookMapper.selectBookByname(bookName);
    }
}
