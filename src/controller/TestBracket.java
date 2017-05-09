package controller;

import model.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mrgnu on 09/05/2017.
 */
@WebServlet("/test")
public class TestBracket extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] books = {"trung", "tu", "tung"};
        req.setAttribute("books", books);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("test.jsp");
        requestDispatcher.forward(req, resp);
    }
}
