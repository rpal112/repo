<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: radu
  Date: 5/29/2014
  Time: 10:41 PM
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Results</title>
</head>
<body>
<h1 style="text-align: center;">Results about ${query}</h1>
<c:forEach items="${absoluteModels}" var="item">

        <img src="${item.poster}" target="_self">
            <img src="${item.poster}" style="margin-right: 10px; float: left; width: 270px; height: 400px;"/></a>



    <div style="margin-left: 120px;">
        <span style="font-family: georgia, serif; font-size: 16px;"><strong>Genre</strong>: <span
                style="font-size:14px;">${item.genre}</span></span>

        <p style="margin-left: 120px;">


        <p style="margin-left: 120px;">
            <span style="font-family: georgia, serif; font-size: 16px;"><strong>IMDB Rating: ${item.imdbRating}</strong></span>
        </p>

        <p style="margin-left: 120px;">
            <span style="font-family: georgia, serif; font-size: 16px;"><strong>Awards: </strong>: <span
                    style="font-size:14px;">${item.awards}</span></span></p>

        <p style="margin-left: 120px;">
            <span style="font-family: georgia, serif; font-size: 16px;"><strong>Actors: </strong>: <span
                    style="font-size:14px;">${item.actors}</span></span></p>

        <p style="margin-left: 120px;">
            <span style="font-family: georgia, serif; font-size: 16px;"><strong>Year: </strong>: <span
                    style="font-size:14px;">${item.year}</span></span></p>

        <p style="margin-left: 120px;">
            <span style="font-family: georgia, serif; font-size: 16px;"><strong>Country: </strong>: <span
                    style="font-size:14px;">${item.country}</span></span></p>

        <p> &nbsp; &nbsp; &nbsp; </p>

        <p>  &nbsp; &nbsp; &nbsp;</p>

        <p> &nbsp; &nbsp; &nbsp; </p>

        <p>  &nbsp; &nbsp; &nbsp;</p>
    </div>
</c:forEach>
</body>
</html>
