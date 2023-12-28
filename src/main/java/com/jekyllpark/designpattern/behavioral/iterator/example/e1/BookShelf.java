package com.jekyllpark.designpattern.behavioral.iterator.example.e1;

import java.util.Iterator;

public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookShelf(int size) {
        books = new Book[size];
    }

    public Book getBook(int index) {
        return books[index];
    }

    public int getLength() {
        return last;
    }

    public void appendBook(Book book) {
        System.out.println("try append a book [" + book.getName() + "]");
        if (last < books.length) {
            System.out.println("appending a book is completed");
            this.books[last] = book;
            last++;
        } else {
            System.out.println("the bookShelf is full!");
        }
    }

    @Override
    public Iterator createIterator() {
        return new BookShelfIterator(this);
    }
}
