<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Strona startowa</title>
</head>
<body>
${message}
Witaj na stronie Mateusza!
<br>
Mozesz zamowic zdrowy obiad do pracy <a href="/food">tutaj</a>
<br>
<a href="/opinion">Tutaj</a> mozesz napisac cos milego o tej stronie :)

<br><br>
<c:choose>
    <c:when test="${not empty opinions}">
        Dodane opinie:
        <br>
        <c:forEach items="${opinions}" var="opinion">
            ${opinion.name}: ${opinion.dateIns}<br>
            ${opinion.description}<br><br>
        </c:forEach>
    </c:when>
    <c:otherwise>
            Nie dodano jeszcze zadnej opini o tej stronie <br>
            Badz pierwszy! Dodaj opinie <a href="/opinion">tutaj</a>
     </c:otherwise>
</c:choose>
</body>
</html>