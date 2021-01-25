package com.bjpowernode.pojo;



/**
 * 孙豪文
 * 2020/12/3
 */

public class Books {
    private int bookid;
    private String bookName;
    private int bookCounts;
    private String derail;

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookCounts() {
        return bookCounts;
    }

    public void setBookCounts(int bookCounts) {
        this.bookCounts = bookCounts;
    }

    public String getDerail() {
        return derail;
    }

    public void setDerail(String derail) {
        this.derail = derail;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookid=" + bookid +
                ", bookName='" + bookName + '\'' +
                ", bookCounts=" + bookCounts +
                ", derail='" + derail + '\'' +
                '}';
    }
}
