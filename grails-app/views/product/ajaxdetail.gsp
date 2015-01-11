<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
    <g:render template="productCard" collection="${products}" var="product"/>
        <ul>
            <h1>Return value from ajaxdetail</h1>
            <g:each in="${tags}" var="tag">
                <li>${tag.name}</li>
            </g:each>
        </ul>
</body>
</html>