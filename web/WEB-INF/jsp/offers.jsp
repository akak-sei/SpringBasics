<%--
  Created by IntelliJ IDEA.
  User: akak
  Date: 2/16/2016
  Time: 8:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach var="row" items="${offers}">
    <p>
    Username ${row.username}<br/>
    Text ${row.text}<br/>
    </p>
</c:forEach>

</body>
</html>

