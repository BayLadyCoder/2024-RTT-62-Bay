<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>

<section class="title-section">
    <div class="container">
        <div class="row pt-5 pb-5">
            <h1 class="text-center">
                Log In
            </h1>
        </div>
    </div>
</section>


<section>
    <div class="container pt-3 d-flex align-items-center flex-column">
        <c:if test="${param['error'] eq ''}">
            <div class="alert alert-danger d-inline w-40" role="alert">Invalid Email or Password</div>
        </c:if>
        <div class="row pt-3 justify-content-center">
            <div class="col-auto justify-content-center">
                <form class="card" style="width: 500px;" action="/account/loginProcessingUrl" method="post"
                      enctype="multipart/form-data">
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    <div class="card-body p-3">
                        <input type="hidden" name="id" value="${form.id}"/>
                        <div>
                            <label for="emailId" class="col-form-label">Email</label>
                            <input type="text" id="emailId" name="username"
                                   class="form-control <c:if test="${bindingResult.hasFieldErrors('email')}">is-invalid</c:if>"
                                   value="${form.email}">
                            <c:if test="${bindingResult.hasFieldErrors('email')}">
                                <c:forEach items="${bindingResult.getFieldErrors('email')}" var="error">
                                    <div class="text-danger">${error.defaultMessage}</div>
                                </c:forEach>
                            </c:if>
                        </div>
                        <div>
                            <label for="passwordId" class="col-form-label">Password</label>
                            <input type="password" id="passwordId" name="password"
                                   class="form-control <c:if test="${bindingResult.hasFieldErrors('password')}">is-invalid</c:if>"
                                   value="${form.password}">
                            <c:if test="${bindingResult.hasFieldErrors('password')}">
                                <c:forEach items="${bindingResult.getFieldErrors('password')}" var="error">
                                    <div class="text-danger">${error.defaultMessage}</div>
                                </c:forEach>
                            </c:if>
                        </div>
                        <div class="mt-5">
                            <button type="submit" class="btn btn-success w-100">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>


<jsp:include page="../include/footer.jsp"/>