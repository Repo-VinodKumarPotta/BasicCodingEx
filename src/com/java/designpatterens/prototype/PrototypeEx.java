package com.java.designpatterens.prototype;

public class PrototypeEx {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop ();
        bs.setShopName ("VenkatBookStall");
        bs.loadBooks();

        BookShop bs1 = bs.clone();
        bs1.setShopName ("A1");
        bs.getBookList ().remove (3);
        System.out.println (bs);
        System.out.println (bs1);

    }
}
