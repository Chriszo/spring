<%-- 
    Document   : welcome
    Created on : May 30, 2016, 8:21:49 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"/>
        <title>Products</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Products</h1>
                    <p>All the available products in our store</p>
                </div>
            </div>
        </section>
        
        <section class="container">
            <div class="row">
                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                    <div class="thumbnail">
                        <div class="caption">
                            <h3>${product.name}</h3>
                            <p>${product.description}</p>
                            <p>${product.unitPrice} USD</p>
                            <p>Available ${product.unitsInStock} units in stock.</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        
    </body>
</html>
