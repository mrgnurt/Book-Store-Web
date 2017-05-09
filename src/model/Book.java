package model;

import java.util.ArrayList;

/**
 * Created by mrgnu on 28/04/2017.
 */
public class Book {

    private int id;
    private int categoryId;
    private String bookTitle;
    private ArrayList<Author> authors;
    private String publisherName;

    public Book(int id, int categoryId, String bookTitle, ArrayList<Author> authors, String publisherName) {
        this.id = id;
        this.categoryId = categoryId;
        this.bookTitle = bookTitle;
        this.authors = authors;
        this.publisherName = publisherName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}
