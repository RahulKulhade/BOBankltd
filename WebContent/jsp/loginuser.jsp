<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.servletContext.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../css/common.css">
<link rel="stylesheet" type="text/css" href="../css/login.css">
<title>Login | BOB Bank</title>

</head>
<body>
	<div class="MainContainer">
		<div class="HeaderContainer">
			<jsp:include page="../includes/header.inc.jsp" />
			<div class="MenuContainer">
				<jsp:include page="../includes/visitorMenu.inc.jsp" />
			</div>
			<jsp:include page="../includes/message.inc.jsp" />
		</div>
		<form
			action="<%=pageContext.getServletContext().getContextPath()%>/LoginServlet"
			method="POST">
			<div class="SignIn">
				<h2>Login to your Account</h2>
				<h4>We are happy to see you return! Please log in to continue.</h4>
				<table>
					<tr>
						<td><span>User name</span><br>
						<input id="username" onChange="setBorderColor(this)"
							onkeyup="setBorderColor(this)" name="userid" type="text"
							maxlength="30" required>
							<div style="height: 20px; font-size: 13px;">
								<span name="usernameError" style="color: red;"></span>
							</div></td>
					</tr>
					<tr>
						<td><span>Password</span><br>
						<input id="password" onkeypress="submit_me(this,event)"
							onkeyup="setBorderColor(this)" name="password" type="password"
							maxlength="30" required>
							<div style="height: 20px; font-size: 13px;">
								<span name="passwordError" style="color: red;"></span>
							</div></td>
					<!-- </tr>
					<tr>
						<td><input type="radio" name="user" id="admin" value="A"> <label
							for="A" >Admin</label> <input type="radio" name="user"
							id="customer"  value="C"> <label for="C">Customer</label>
							</td>
					</tr> -->
				</table>

				<input type="checkbox" name="remember-me" value="Remember me"
					style="width: 15px;" />Remember me<br>
				<br> <input type="submit" name="login-now" value="login"
					style="border-radius: 25px; width: 150px; height: 35px; background-image: url('../images/login-icon.png');" /><br>&nbsp;
				<input type="hidden" name="pov" value="login" />
				<hr>
			</div>
		</form>
		<div class="LoginImageContainer">
			<div class="LoginImage"></div>
		</div>
		<br>


		<br />
		<br />
		<br />
		<br />
		<br />

		<div id="message"></div>
	</div>

	<div class="Footer">
		<jsp:include page="../includes/footer.inc.jsp" />&nbsp;
	</div>
</body>
</html>
