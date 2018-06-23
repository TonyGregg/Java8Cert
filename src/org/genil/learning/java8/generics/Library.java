package org.genil.learning.java8.generics;

import java.util.List;

/**
 * Created by anton on 6/22/2018 5:09 PM
 **/
public class Library <T> {
    public Library(List<T> items) {
        this.items = items;
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public Library() {

    }

    List<T> items;


    public static void main(String[] args) {
        // Demo

        CD cd = new CD(1,250,"tv-ma");
        Book book = new Book("Joshua Block",500);

        Library<CD> cdLibrary = new Library<>();
        cdLibrary.addItem(cd);

        Library<Book> bookLibrary = new Library<>();
        bookLibrary.addItem(book);




    }
}

class CD {
    int isHd;
    long size;
    String rated;

    public CD(int isHd, long size, String rated) {
        this.isHd = isHd;
        this.size = size;
        this.rated = rated;
    }
}

class Book {
    String authorName;
    int numberOfPages;

    public Book(String authorName, int numberOfPages) {
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
    }
}

