<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Top 5 Vaccine-Preventable Viruses</title>
    <style>
        table {
            color: black;
            font-family: Helvetica, Arial, sans-serif;
            width: 640px;
            border-collapse: collapse;
            border-spacing: 0;
        }

        td, th {
            border: 1px solid #CCC;
            height: 30px;
        }

        th{
            background: #1E90FF ;
            font-weight: bold;
            color: white;
        }

        td{
            text-align: left;
        }

        tbody tr:nth-child(even) {
            background-color: #00BFFF;
        }

        tbody tr:nth-child(odd) {
            background-color: #B0E0E6;
        }
    </style>
</head>
<body>

<h2>Top 5 Vaccine-Preventable Viruses</h2>

<table>
    <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Symptoms</th>
        <th>Duration</th>
        <th>Mortality Rate</th>
    </tr>
    <c:forEach var = "listitem" items = "${viruslist}">
        <tr>
            <td>${listitem.name}</td>
            <td>${listitem.description}</td>
            <td>${listitem.symptoms}</td>
            <td>${listitem.duration}</td>
            <td>${listitem.mortalityrate}</td>
            <td></td>
        </tr>
    </c:forEach>
</table>
<h3>Created by Marc Rodriguez</h3>
</body>
</html>
