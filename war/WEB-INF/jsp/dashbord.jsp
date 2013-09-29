<%@ include file="/WEB-INF/jsp/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>This is dashboard.jsp </title>
<style>
h1 {
    color: #FF8000;
}

.error {
    color: #ff0000;
}

.errorblock {
    color: #000;
    background-color: #ffEEEE;
    border: 3px solid #ff0000;
    padding: 8px;
    margin: 16px;
}
</style>

<link rel="stylesheet"
    href="http://yui.yahooapis.com/pure/0.3.0/pure-min.css">

<link rel="stylesheet"
    href="/combo/1.6.3?/css/main.css&/css/rainbow/baby-blue.css">


<script src="http://use.typekit.net/gis6vng.js"></script>
<script>
    try {
        Typekit.load();
    } catch (e) {
    }
</script>


</head>
<body>
    
    <div align="center" class="pure-form pure-form-aligned">
        
    <form:form method="post" commandName="dashboard">
  <table align="center" width="70%" bgcolor="#D8BFD8" border="0" cellspacing="0" cellpadding="5">    
    <c:if test="${model.query !=null}">
    <c:forEach items="${model.query}" var="prod">
    <tr>
        <td align="right" width="50%">
             <c:out value="${prod.id}"/>&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;
        </td>
     </tr> 
    </c:forEach>
    </c:if>
    <c:if test="${empty model.query}">
    <tr>
        <td align="center" width="100%" style="color: #0000FF; font-size: 20pt">
            <b> Sorry !!! No Queries Received !!!</b>
        </td>
    </tr>    
    </c:if>
    <br>
    <br>
    <tr>
        <td width="100%" colspan=2 align="center" style="color: #008080; font-size: 18pt">
            <a href="login.htm">Logout</a>
        </td>
    </tr>
  </table>

</form:form>
    </div>
    <a href="<c:url value="hello.htm"/>">Home</a>
</body>