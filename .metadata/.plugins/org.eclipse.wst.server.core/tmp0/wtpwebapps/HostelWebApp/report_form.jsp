<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>Generate Report</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 30px;
        }
        label {
            font-weight: bold;
        }
        select, input[type="text"], input[type="date"] {
            padding: 5px;
            margin: 10px 0 20px 0;
            width: 250px;
        }
        input[type="submit"] {
            padding: 8px 16px;
            background-color: #28a745;
            color: white;
            border: none;
            cursor: pointer;
            font-weight: bold;
        }
        input[type="submit"]:hover {
            background-color: #218838;
        }
        .hidden {
            display: none;
        }
    </style>
    <script>
        function toggleFields() {
            const reportType = document.getElementById("reportType").value;
            document.getElementById("roomFields").classList.add("hidden");
            document.getElementById("dateFields").classList.add("hidden");

            if (reportType === "roomNumber") {
                document.getElementById("roomFields").classList.remove("hidden");
            } else if (reportType === "admissionDate") {
                document.getElementById("dateFields").classList.remove("hidden");
            }
        }
    </script>
</head>
<body>
    <h2>Generate Student Report</h2>
    <form action="report" method="get">
        <label for="reportType">Select Report Type:</label><br>
        <select name="reportType" id="reportType" onchange="toggleFields()" required>
            <option value="">--Select--</option>
            <option value="pendingFees">Students with Pending Fees</option>
            <option value="roomNumber">Students by Room Number</option>
            <option value="admissionDate">Students by Admission Date Range</option>
        </select><br>

        <div id="roomFields" class="hidden">
            <label for="roomNumber">Room Number:</label><br>
            <input type="text" name="roomNumber" id="roomNumber"><br>
        </div>

        <div id="dateFields" class="hidden">
            <label for="startDate">Start Date:</label><br>
            <input type="date" name="startDate" id="startDate"><br>

            <label for="endDate">End Date:</label><br>
            <input type="date" name="endDate" id="endDate"><br>
        </div>

        <input type="submit" value="Generate Report">
    </form>
</body>
</html>
