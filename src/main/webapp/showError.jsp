<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
    <script src="webjars/bootstrap/5.0.0-beta1/js/bootstrap.min.js"></script>
    <link rel='stylesheet' href='webjars/bootstrap/5.0.0-beta1/css/bootstrap.min.css'>
</head>
<body>
<div class="container">
    <div class="card">
        <div class="card-body">
            <h5 class="card-title">Error</h5>
            <div class="card-text">
                <p>The following went wrong:</p>
                <p>${requestScope.error}</p>
            </div>
        </div>
        <div class="card-footer">
            <a href="index.jsp" class="btn btn-dark">back</a>
        </div>
    </div>
</div>
</body>
</html>