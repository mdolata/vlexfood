<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Opinia</title>
</head>
<body>
    <form:form action="opinionConfirm" modelAttribute="opinion" method="GET">
        Nick: <form:input path="name"/>
        <br>
        Opinia, wskazowki: <br>
        <form:textarea path="description" rows="5" cols="50"/>
        <br>
        <input type="submit" value="Wyslij" />
    </form:form>
</body>
</html>