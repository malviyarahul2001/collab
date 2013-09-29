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
    
    <div align="center" class="pure-form pure-form-aligned">
    
       ${message} 		

    </div>
    
</body>