<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="/assets/css/global.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <img src="../../../assets/img/classic.png" style="width: 100px; padding-left: 10px;"/>

        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse flex-grow-0" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link text-center" aria-current="page" href="/">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-center" href="/search">Find Products</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-center" href="/employee/search">Find Employees</a>
                </li>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-center" href="/employee/create">Create Employee</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-center" href="/customer/create">Create Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-center" href="/account/create-account">Create Account</a>
                </li>
                <sec:authorize access="!isAuthenticated()">
                    <li class="nav-item mx-2">
                        <a class="nav-link text-center btn btn-success fw-bold text-white"
                           href="/account/loginPageUrl">Log
                            In</a>
                    </li>
                </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                    <sec:authorize access="hasAuthority('ADMIN')">
                        <li class="nav-item mx-2">
                            <a class="nav-link text-center btn btn-success fw-bold text-white"
                               href="/admin/dashboard">Admin Dashboard</a>
                        </li>
                    </sec:authorize>
                    <li class="nav-item">
                        <span class="nav-link text-info"><sec:authentication property="name"/></span>
                    </li>
                    <form class="nav-item" action="/account/logout" method="post">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        <input class="nav-link btn btn-secondary fw-bold text-white" type="submit" value="Log Out"/>
                    </form>
                </sec:authorize>

            </ul>
        </div>
    </div>
</nav>