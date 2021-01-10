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

        <h1>Visits</h1>
        <div align="center">
        <table class="table">
        <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Adress</th>
        </tr>
        <c:forEach items="${listofvisits}" var="visit" >
            <tr>
            <td>${visit.id}</td>
            <td>${visit.dateOfVisit}</td>
            <td>${visit.adress}</td>
            </tr>
        </c:forEach>
        </table>
        </div>

        </body>
        </html>
