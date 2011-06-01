<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Chose a file of norwegian zip codes to upload</h1>
	<form method="post" action="postnrUpload" enctype="multipart/form-data">
		<input type="text" name="name" /> <input type="file" name="file" /> <input
			type="submit" />
	</form>

</body>
</html>