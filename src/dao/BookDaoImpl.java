package dao;

import config.DBConect;
import model.Book;
import model.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by mrgnu on 28/04/2017.
 */
public class BookDaoImpl implements BookDAO {

    @Override
    public ArrayList<Book> findAllBook() {

        ArrayList<Book> books = new ArrayList<Book>();

        String sql = "select * from book";

        Connection connection = DBConect.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

                Book book = new Book(
                                    resultSet.getInt("id"),
                                    resultSet.getInt("category_id"),
                                    resultSet.getString("book_title"),
                                    null,
                                    resultSet.getString("publisher_name"));
                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }

    @Override
    public ArrayList<Book> findAllBookByCategory(String id) {

        ArrayList<Book> books = new ArrayList<Book>();

        String sql = "select * from book WHERE category_id = " + id;
        Connection connection = DBConect.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

                Book book = new Book(
                        resultSet.getInt("id"),
                        resultSet.getInt("category_id"),
                        resultSet.getString("book_title"),
                        null,
                        resultSet.getString("publisher_name"));
                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }

    @Override
    public ArrayList<Book> searchBookByKeyWord(String keyWord) {
        return null;
    }

    @Override
    public void insert(Book book) {

    }

    @Override
    public void update(Book book) {

    }

    @Override
    public void delete(int bookId) {

    }

    @Override
    public ArrayList<Category> findAllCategory() {
        ArrayList<Category> categories = new ArrayList<Category>();

        String sql = "select * from category";

        Connection connection = DBConect.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

                Category category = new Category(resultSet.getInt("id"), resultSet.getString("category_description"));
                categories.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return categories;
    }
}
