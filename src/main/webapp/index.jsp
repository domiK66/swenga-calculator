<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Calculator</title>
    <script src="webjars/bootstrap/5.0.0-beta1/js/bootstrap.min.js"></script>
    <link rel='stylesheet' href='webjars/bootstrap/5.0.0-beta1/css/bootstrap.min.css'>
</head>
<body>
<div class="container">
    <h1><%= "THE Calculator" %>
    </h1>
    <br/>

    <form action="./calc" method="post">
        <div class="mb-3">
            <label for="arg1" class="form-label">Number 1</label>
            <input type="text" class="form-control" id="arg1" name="arg1" >
        </div>
        <div class="mb-3">
            <label for="arg2" class="form-label">Number 2</label>
            <input type="text" class="form-control" id="arg2" name="arg2" >
        </div>
        <button class="btn btn-primary" type="submit">Add</button>
    </form>
</div>
</body>
</html>