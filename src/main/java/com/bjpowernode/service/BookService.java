package com.bjpowernode.service;

import com.bjpowernode.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 孙豪文
 * 2020/12/4
 */
public interface BookService {
    //增
    int addbook(Books books);
    //删
    int deleteBookById( int id);
    //改
    int updateBook(Books books);
    //查
    Books selectBookById(int id);
    //查全部
    List<Books> getAllBook();
    //根据书名查
    List<Books> selectBookByname(String bookName);
}
