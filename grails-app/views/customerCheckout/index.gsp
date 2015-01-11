<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Pizza Store</title>

    <blueprint:resources/>
    <link href="${resource(dir: 'css', file: 'app.css')}" type="text/css" rel="stylesheet">
    <r:require modules="bootstrap"/>
    <g:javascript library='jquery' />


</head>
<body>
<div id="myDiv">
    <sec:ifNotLoggedIn>
        <g:link controller="login" action="auth">Login</g:link>
    </sec:ifNotLoggedIn>
    <sec:ifAllGranted roles="ROLE_USER">
        <sec:username /> (<g:link controller="logout">sign out</g:link>)
        <g:link class="create" controller="product" action="list">Browse Pizza</g:link>
    </sec:ifAllGranted>
</div>
<g:javascript>
    $( "#myDiv" ).css( "border", "3px solid red" );
</g:javascript>
<section class="container">
    <!-- Section 3 -->
    <section class="bottomcontainer">

        <h4>Checkout</h4>
        <div>
            <h4>Title</h4>

            <p>Description</p>

            <p>Price</p>
        </div>
    </section>
</section>
</body>
</html>

