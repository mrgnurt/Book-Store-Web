package controller;

import dao.BookDAO;
import dao.BookDaoImpl;
import model.Book;
import model.Category;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by mrgnu on 28/04/2017.
 */
@WebServlet("/books")
public class BookController extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        BookDAO bookDAO = new BookDaoImpl();
        ArrayList<Category> categories = bookDAO.findAllCategory();
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("categories", categories);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String base = "/jsp/";
        String url = base + "home.jsp";
        String action = req.getParameter("action");

        if (action != null){

            if (action.equals("allbook")){

                findAllBook();
            }
            else if (action.equals("category")){

                String id = req.getParameter("categoryId");
                findAllBookByCategory(id);
            }
        }

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(url);
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    private void findAllBook(){

        BookDAO bookDAO = new BookDaoImpl();
        ArrayList<Book> books = bookDAO.findAllBook();
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("allbook", books);
    }

    private void findAllBookByCategory(String id){
        BookDAO bookDAO = new BookDaoImpl();
        ArrayList<Book> books = bookDAO.findAllBookByCategory(id);
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("allbook", books);

    }

}
