<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Category" %><%--
  Created by IntelliJ IDEA.
  User: mrgnu
  Date: 28/04/2017
  Time: 4:26 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <div style="border: #79ff45 solid 2px; padding: 5px; width: 20%; float:left;">

        <li>
            <ul><a href="?action=allbook">Home</a></ul>
            <ul><a href="?action=allbook">AllBook</a></ul>
            <ul><a href="">Categoty</a></ul>
            <ul>
                <%

                    ArrayList<Category> categories = (ArrayList<Category>) application.getAttribute("categories");
                    for (int i=0; i < categories.size(); i++){

                        Category category = categories.get(i);%>
                        <li>
                            <a class="label"href="?action=category&categoryId=<%=category.getId()%>">
                                <span class="label" style="margin-left:30px;"><%=category.getCategoryDescription()%>
                                </span>
                            </a>

                        </li>
                    <%}
                %>

            </ul>
            <ul><a href="">Contact</a></ul>
        </li>
    </div>

