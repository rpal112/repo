<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
</head>
<body>

<fieldset>
    <legend>Federated Search</legend>
    <form action="/" method="post" target="_new">
        <div class="container">
            <input type="text" name="query"></div>
        <div class="button">
            <br>
            <input type="submit" value="Search">
        </div>
    </form>
</fieldset>
<table id="table">
<c:forEach items="${absoluteModels}" var="item">

    <tr>
    <img alt="" src="${item.poster}" style="margin-right: 10px; float: none; width: 270px; height: 400px;"/></a>
      </tr>

    <tr>
   <p> <span style="font-size: 16px;"><strong>Title: </strong>: <span style="font-size:14px;">${item.title}</span></span></p>
    </tr>

        <span style="font-size: 16px;"><strong>Genre</strong>: <span
                style="font-size:14px;">${item.genre}</span></span></p>

    <span style="font-size: 16px;"><strong>IMDB Rating: ${item.imdbRating}</strong></span></p>

    <span style="font-size: 16px;"><strong>Awards: </strong>: <span style="font-size:14px;">${item.awards}</span></span></p>

    <span style="font-size: 16px;"><strong>Actors: </strong>: <span style="font-size:14px;">${item.actors}</span></span></p>

    <span style="font-size: 16px;"><strong>Year: </strong>: <span style="font-size:14px;">${item.year}</span></span></p>

    <span style="font-size: 16px;"><strong>Country: </strong>: <span
            style="font-size:14px;">${item.country}</span></span></p>

    <span style="font-size: 16px;"><strong>Plot: </strong>: <span
            style="font-size:14px;">${item.plot}</span></span></p>


</c:forEach>
</table>
</body>
</html>