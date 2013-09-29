<%@ include file="/WEB-INF/jsp/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title><fmt:message key="appTitle" /></title>
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
<script type="text/javascript">
    var submitted = 0;

    function formvalidation() {
        
        var form = document.getElementById('loginForm');
        form.submit();
        /*
        var userName = document.getElementById('username').value;
        var password = document.getElementById('password').value;
        
        if ((userName == null || userName == "")
                && (password == null || password == "")) {
            alert("Please enter the username and password !!!");
            return false;
        } else if (userName == null || userName == "") {
            alert("Please enter the username !!!");
            return false;
        } else if (password == null || password == "") {
            alert("Please enter the password !!!");
            return false;
        }
        else
        {
            
        }
        */
    }
</script>

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
    <h1 align="center">
        <fmt:message key="application.heading" />
    </h1>
    
    <div align="center" class="pure-form pure-form-aligned">
		
    <form:form id="loginForm" method="post" commandName="login">
        <table width="50%" align="center" border="0" cellspacing="0" cellpadding="5">
            <tr>
                <td align="center" style="color: #0000FF; font-size: 20pt"><b>
                    <fmt:message key="login.heading" /></b>
                </td>
            </tr>
            <tr>
                <td>
                    <table align="center" width="100%">
                        <tr>
                            <td width="60%" align="right"><b> 
                                <form:label path="username">Username <font color="red">(*)</font>: </form:label></b>
                                <form:input id="username" path="username" /></td>
                            <td width="40%" align="left"><form:errors path="username" cssClass="error" /></td>
                        </tr>
                        <tr>
                            <td width="60%" align="right"><b> <form:label path="password">Password <font color="red">(*)</font>: </form:label></b>
                            <form:password id="password" path="password" /></td>
                            <td align="left" width="40%"><form:errors path="password" cssClass="error" /></td>
                        </tr>
                    </table>
                </td>
            </tr>

            <tr width="100%">
                <td align="center" width="100%">
                    <a href='#' onclick="formvalidation()">Sign-In</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="<c:url value="register.htm"/>">Create new account</a>
                <td>
            </tr>
        </table>
        <br>
    </form:form>
    </div>
    <a href="<c:url value="hello.htm"/>">Home</a>
</body>