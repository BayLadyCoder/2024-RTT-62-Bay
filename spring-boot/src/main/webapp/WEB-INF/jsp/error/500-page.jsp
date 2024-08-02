<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<jsp:include page="../include/header.jsp"/>

<section class="title-section">
    <div class="container">
        <div class="row pt-5 pb-5">
            <h1 class="text-center">
                500 Error Page
            </h1>
        </div>
    </div>
</section>


<sec:authorize access="hasAuthority('ADMIN')">
    <div class="m-5">
        <c:if test="${not empty requestUrl}">
            <h3></h3>
            <p><span class="fw-bold">Request URL: </span>${requestUrl}</p>
        </c:if>
        <c:if test="${not empty message}">
            <p><span class="fw-bold">Error Message: </span>${message}</p>
        </c:if>
        <c:if test="${not empty stackTrace}">
            <p><span class="fw-bold">Stack Trace: </span>${stackTrace}</p>
        </c:if>
        <c:if test="${not empty rootCause}">
            <p><span class="fw-bold">Root Cause: </span>${rootCause}</p>
        </c:if>
        <c:if test="${not empty rootTrace}">
            <p><span class="fw-bold">Root Trace: </span>${rootTrace}</p>
        </c:if>
    </div>

</sec:authorize>


<jsp:include page="../include/footer.jsp"/>