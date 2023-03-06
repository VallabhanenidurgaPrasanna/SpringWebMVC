
<!doctype html>
<html lang="en">
<%@page isELIgnored="false" %>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<div class="container mt-5">
		<h1 class="text-center">User Registration Form</h1>
		<form action="Adduser" method="post">
			<div class="form-group">
				<label for="exampleInputEmail1">username</label>
				<input type ="text" class="form-control"
					placeholder="Enter user name" name="username">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">email</label>
				<input type ="email" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email" name="email">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">password</label>
				<input type ="password" class="form-control"
					id="exampleInputPassword1" placeholder="Password" name="password">
			</div>
			 
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>