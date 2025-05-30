<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Hostel Management System</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f2f2f2; /* Light gray background */
            color: #000; /* Black text */
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            height: 100vh;
            justify-content: center;
            align-items: center;
        }

        h1 {
            font-size: 2.5em;
            margin-bottom: 40px;
            color: #333;
        }

        .button-container {
            display: flex;
            flex-wrap: wrap;
            gap: 20px;
            justify-content: center;
        }

        a.button {
            text-decoration: none;
            background-color: #000; /* Black button */
            color: white;
            padding: 15px 30px;
            border-radius: 10px;
            font-size: 1.1em;
            transition: background-color 0.3s ease, transform 0.3s ease;
            box-shadow: 2px 2px 10px rgba(0,0,0,0.1);
        }

        a.button:hover {
            background-color: #333;
            transform: scale(1.05);
        }
    </style>
</head>
<body>
    <h1>Hostel Management System</h1>
    <div class="button-container">
        <a href="studentadd.jsp" class="button">Add Student</a>
        <a href="studentupdate.jsp" class="button">Update Student</a>
        <a href="studentdelete.jsp" class="button">Delete Student</a>
        <a href="studentdisplay.jsp" class="button">View All Students</a>
        <a href="report_form.jsp" class="button">Generate Report</a>
    </div>
</body>
</html>
