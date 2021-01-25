package com.bjpowernode.dao;


import com.bjpowernode.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 孙豪文
 * 2020/12/4
 */
public interface BookMapper {
    //增
    int addbook(Books book);
    //删
    int deleteBookById(@Param("bookId") int id);
    //改
    int updateBook(Books book);
    //查
    Books selectBookById(@Param("bookid")int id);
    //查全部
    List<Books> getAllBook();
    //根据书名来查询书
    List<Books> selectBookByname(@Param("bookName")String bookName);
}
