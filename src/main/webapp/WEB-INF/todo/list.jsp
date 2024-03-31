<%--
  Created by IntelliJ IDEA.
  User: hjyun
  Date: 2024-03-29
  Time: 오후 4:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- JSTL 사용을 위한 태크 추가 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>List Page</h1>
    <form action="/todo/register" method="get">
        <button type="submit">Move to Register</button>
    </form>
<%-------------------------------------------------------%>
    Print List code<br>
    ${list}<br>
<%-------------------------------------------------------%>
    <br>Print specific List<br>
    ${list[0].tno} --- ${list[0].tittle}<br>
<%-------------------------------------------------------%>
    <br>JSTL c:forEach<br>
    <ul>
        <c:forEach var="dto" items="${list}">
            <li>${dto}</li>
        </c:forEach>
    </ul>
<%-------------------------------------------------------%>
    <br>JSTL c:forEach begin/end<br>
    <ul>
        <c:forEach var="num" begin="1" end="10">
            <li>${num}</li>
        </c:forEach>
    </ul>
<%-------------------------------------------------------%>
    <br>JSTL c:if<br>
    <c:if test="${list.size() % 2 == 0}">
        짝수
    </c:if>
    <c:if test="${list.size() % 2 != 0}">
        홀수
    </c:if>
<%-------------------------------------------------------%>
    <br>JSTL c:choose<br>
    <c:choose>
        <c:when test="${list.size() % 2 == 0}">
            짝수
        </c:when>
        <c:otherwise>
            홀수
        </c:otherwise>
    </c:choose>
<%-------------------------------------------------------%>
    <br>JSTL c:set<br>
    <c:set var="target" value="5"></c:set>

    <ul>
        <c:forEach var="num" begin="1" end="10">
            <c:if test="${num == target}">
                num is target
            </c:if>
            <c:if test="${num != target}">
                <li>${num}</li>
            </c:if>
        </c:forEach>
    </ul>

</body>
</html>
