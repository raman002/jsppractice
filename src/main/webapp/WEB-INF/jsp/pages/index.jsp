<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="../imports.jsp"%>
<html lang="en">
<head>
<title>${title}</title>
</head>
<body>

	<div>
		<!-- Navbar -->
		<nav class="navbar navbar-light bg-white custom-shadow-sm">
			<span class="navbar-brand mb-0 text-muted">${navbarTitle}</span>
		</nav>
	</div>

	<div
		class="border container m-top-md w-25 login-container-h form-control">

		<div class="mt-5">
			<div class="form-group">
				<input id="username" type="text" class="form-control" placeholder="Username" />
			</div>
			<div class="form-group">
				<input id="password" type="password" class="form-control" placeholder="Password" />
			</div>
			<div class="form-group mt-5">
				<button type="button" class="btn btn-info btn-block" onclick="doLogin()">Login</button>


				<c:if test="${showSignUpButton}">
					<div class="form-group mt-5">
						<button type="button" class="btn btn-info btn-block">Sign
							Up</button>
					</div>
				</c:if>
			</div>
		</div>
	</div>

</body>
</html>