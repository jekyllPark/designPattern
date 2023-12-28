package com.jekyllpark.designpattern.behavioral.iterator.example.e1;

import java.util.Iterator;

public class BookShelfService {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("셜록 홈즈"));
        bookShelf.appendBook(new Book("지킬앤하이드"));
        bookShelf.appendBook(new Book("장발장"));
        bookShelf.appendBook(new Book("모리아티"));

        System.out.println("current bookShelf's size :" + bookShelf.getLength());

        Iterator iterator = bookShelf.createIterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
