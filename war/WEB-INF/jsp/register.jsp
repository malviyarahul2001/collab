<%@ include file="/WEB-INF/jsp/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Simple CSS for HTML forms.">

<title>Forms &ndash; Pure</title>

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

	<div class="pure-g-r" id="layout" align="center">
		<a href="#menu" id="menuLink" class="pure-menu-link"> <span></span>
		</a>

	</div>
	<div class="header" align="center">

		<h2>Create a Collab account</h2>

	</div>

	<div class="content" align="center">

		<form class="pure-form pure-form-aligned">
			<fieldset>
				<legend> </legend>

				<div class="pure-control-group">
					<label for="name">Username</label> <input id="name" type="text"
						placeholder="Username">
				</div>

				<div class="pure-control-group">
					<label for="password">Password</label> <input id="password"
						type="password" placeholder="Password">
				</div>

				<div class="pure-control-group">
					<label for="tableNum">Table Number</label> <input id="tableNum"
						type="text" placeholder="TableNumber">
				</div>

				<div class="pure-control-group">
					<label for="cellnumber">Cell Number</label> <input id="cellnumber"
						type="text" placeholder="CellNumber">
				</div>

				<button type="submit" class="pure-button pure-button-primary">Register</button>
	</fieldset>
	</form>

	</div>
</body>
</html>
