<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dodaj nowe zamowienie</title>
</head>
<body>
<form:form action="newOrderConfirm" method="GET">

        Nick <input type="text" name="name"/>
        <br>
        Tresc zamowienia: <input type="text" name="orderDescription"/>
        <br>
        <input type="submit" value="Wyslij" />
    </form:form>
</body>
</html>