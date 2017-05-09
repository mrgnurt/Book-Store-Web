package dao;

import model.Book;
import model.Category;

import java.util.ArrayList;

/**
 * Created by mrgnu on 28/04/2017.
 */
public interface BookDAO {

    public ArrayList<Book> findAllBook();

    public ArrayList<Book> findAllBookByCategory(String id);

    public ArrayList<Book> searchBookByKeyWord(String keyWord);

    public void insert(Book book);

    public void update(Book book);

    public void delete(int bookId);

    public ArrayList<Category> findAllCategory();
}
