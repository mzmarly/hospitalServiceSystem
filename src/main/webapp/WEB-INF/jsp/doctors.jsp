<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hospital Service</title>
</head>
<body>

    <div>

         <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Hospital Service</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="/home">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="/doctors">Doctors</a>
      </li>
    <li class="nav-item active">
    <a class="nav-link" href="/visits/1">Visits</a>
    </li>
    <li class="nav-item active">
    <a class="nav-link" href="/diagnosis/1">Diagnosis</a>
    </li>
    <li class="nav-item active">
    <a class="nav-link" href="/users/1">My account</a>
    </li>
        <li class="nav-item active">
    <a class="nav-link" href="/logout">Logout</a>
    </li>
    </ul>
  </div>
</nav>

    </div>

    <h1>Doctors</h1>
        <div align="center">
                <table class="table">
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Specialization</th>
                        <th><th>
                    </tr>
                    <c:forEach items="${listofdoctors}" var="doctor">
                        <tr>
                            <td>${doctor.id}</td>
                            <td>${doctor.firstName} ${doctor.lastName}</td>
                            <td>${doctor.email}</td>
                            <td>${doctor.specialization}</td>
                            <td><a class="btn btn-primary" href="/doctor/1/setvisit" role="button">Set up visit!</a><td>
                        </tr>
                    </c:forEach>
                </table>
            </div>

</body>
</html>
