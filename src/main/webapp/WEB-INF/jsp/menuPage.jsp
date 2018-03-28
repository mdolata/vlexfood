<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <title>Dzisiejsze zamowienie</title>
</head>
<body>
${message}
Dzisiaj zamawiamy w ${restaurant.name}
<br>
Koszt dowozu: ${restaurant.deliveryCost}
<br>
Link: ${restaurant.url}
<br><br>
<c:choose>
    <c:when test="${restaurant.name != 'BRAK'}">
        Dodaj swoje zamowienie <a href="food/newOrder">tutaj</a>

        <br><br>
        Juz zamowione: <br>
        <c:forEach items="${orders}" var="order">
            Imie = ${order.key}, zamowienie = ${order.value}<br>
        </c:forEach>
    </c:when>
    <c:otherwise>
        Nie wybrano jeszcze dzisiejszej restauracji.<br>
        Zadzwon do dzialu programistow by popedzic te leniwe swinie.
    </c:otherwise>
</c:choose>
</body>
</html>