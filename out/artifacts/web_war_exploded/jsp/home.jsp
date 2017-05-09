<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Book" %><%--
  Created by IntelliJ IDEA.
  User: mrgnu
  Date: 28/04/2017
  Time: 4:25 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Store</title>
</head>
<body>


    <jsp:include page="header.jsp" flush="true"></jsp:include><br>

    <jsp:include page="leftColumn.jsp" flush="true"></jsp:include>


    <table style="float: right; border: solid 1px red; width: 70%">
        <tr>
            <th>ten</th>
            <th>the loai</th>
            <th>nxb</th>
        </tr>

        <%
            ArrayList<Book> books = (ArrayList<Book>)application.getAttribute("allbook");
            for (int i=0; i<books.size(); i++){

                Book book = books.get(i);
        %>
                <tr>
                    <th><%= book.getBookTitle()%></th>
                    <th><%= book.getCategoryId()%></th>
                    <th><%= book.getPublisherName()%></th>
                </tr>

        <%
            }
        %>
</body>
</html>
