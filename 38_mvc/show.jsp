<%@ page import="java.util.ArrayList,models.Student"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" >
</head>
<body>
        <h1>All Student Records</h1>

    <hr>

    <% 
        ArrayList<Student> students = (ArrayList)request.getAttribute("records");
    %>

        <div class="container">
            <div class="row justify-content-center">
                <div class="col-8 p-4 mt-5 border-primary rounded bg-primary-subtle">
                        <table class="table table-primary">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>College</th>
            <th>Age</th>
            <th>Marks</th>
        </tr>

        <% for(Student student: students){ %>
                <tr>
                    <td><%= student.getStudentId() %></td>
                    <td><%= student.getStudentName() %></td>
                    <td><%= student.getStudentCollege() %></td>
                    <td><%= student.getStudentAge() %></td>
                    <td><%= student.getStudentMarks() %></td>
                </tr>
        <% } %>
    </table>
                </div>
            </div>
        </div>

    <%--
    <table align="center" border="1" width="50%">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>College</th>
            <th>Age</th>
            <th>Marks</th>
        </tr>

        <% for(Student student: students){ %>
                <tr>
                    <td><%= student.getStudentId() %></td>
                    <td><%= student.getStudentName() %></td>
                    <td><%= student.getStudentCollege() %></td>
                    <td><%= student.getStudentAge() %></td>
                    <td><%= student.getStudentMarks() %></td>
                </tr>
        <% } %>
    </table>
    --%>
</body>
</html>