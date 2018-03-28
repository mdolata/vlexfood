<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello world</title>
</head>
<body>
    <form:form action="restaurantConfirm" modelAttribute="restaurant" method="GET">
        Nazwa restauracji: <form:input path="name"/>
        <br>
        Koszt dowozu: <form:input path="deliveryCost"/>
        <br>
        Link: <form:input path="url"/>
        <br>
        Token: <input type="text" name="token"/>
        <br>
        <input type="submit" value="Wyslij" />
    </form:form>
</body>
</html>