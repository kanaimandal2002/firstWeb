<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div align="center">
    <h1>User Login</h1>
    <form action="LoginServlet" method="post">
        <table>
            <tr><td>Username:</td><td><input type="text" name="txtName"></td></tr>
            <tr><td>Password:</td><td><input type="password" name="txtPwd"></td></tr>
            <tr><td colspan="2" align="center"><input type="submit" value="Login"></td></tr>
        </table>
    </form>
</div>
</body>
</html>

