<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Opinia</title>
</head>
<body>
    <form:form action="opinionConfirm" method="GET">

        Nick <input type="text" name="name"/>
        <br>
        Opinie, wskazowki: <br>
        <textarea name="opinion" rows="5" cols="50">Twoja opinia sie dla nas liczy.</textarea>
        <br>
        <input type="submit" value="Wyslij" />
    </form:form>
</body>
</html>