<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Student</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #eef2f3;
            margin: 0;
            padding: 20px;
        }

        .container {
            width: 400px;
            margin: 80px auto;
            padding: 25px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin: 10px 0 5px;
        }

        input[type="number"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            border: 1px solid #aaa;
            border-radius: 4px;
        }

        .btn {
            background-color: #e74c3c;
            color: white;
            padding: 10px;
            width: 100%;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .btn:hover {
            background-color: #c0392b;
        }

        .message {
            margin-top: 15px;
            text-align: center;
            color: green;
            font-weight: bold;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Delete Student</h2>
    <form action="DeleteStudentServlet" method="post">
        <label for="studentID">Enter Student ID to Delete:</label>
        <input type="number" name="studentID" id="studentID" required />

        <input type="submit" value="Delete Student" class="btn" />
    </form>

    <div class="message">
        <%
            String message = (String) request.getAttribute("message");
            if (message != null) {
                out.print(message);
            }
        %>
    </div>
    
    
</div>
<div style="display: flex; justify-content: center; align-items: center; ">
  <a href="index.jsp" style="display:inline-block; padding:10px 20px; background-color:#007bff; color:white; text-decoration:none; border-radius:5px; font-size:16px; font-weight:bold;">Back to Home</a>
</div>

</body>
</html>
