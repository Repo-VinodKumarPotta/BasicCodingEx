package com.java.designpatterens.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    String shopName;
    List<Book> bookList = new ArrayList<> ();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", bookList=" + bookList +
                '}';
    }

    public void loadBooks() {
        for(int i=0;i<=10;i++){
            Book b = new Book ();
            b.setId (i);
            b.setName ("Book "+i);
            this.getBookList ().add (b);
        }
    }

/*
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone ( );
    }
*/

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bs = new BookShop ();
        //bs.loadBooks (); //this means fetching data from database
        for (Book b : this.getBookList ()){
            bs.getBookList ().add (b);
        }
        return bs;
    }
}
