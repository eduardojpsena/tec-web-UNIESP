<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<nav class="navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top ">
	
	<div class="container-fluid">
		
		<div class="navbar-wrapper">
			<a class="navbar-brand" href="javascript:;">Dashboard</a>
		</div>
		
		<button class="navbar-toggler" type="button" data-toggle="collapse"
				aria-controls="navigation-index" aria-expanded="false"
				aria-label="Toggle navigation">
			<span class="sr-only">Toggle navigation</span> 
			<span class="navbar-toggler-icon icon-bar"></span> 
			<span class="navbar-toggler-icon icon-bar"></span> 
			<span class="navbar-toggler-icon icon-bar"></span>
		</button>
		
		<div class="collapse navbar-collapse justify-content-end">
			
			<ul class="navbar-nav">
				<li class="nav-item dropdown">
					<a class="nav-link"	href="javascript:;" id="navbarDropdownProfile"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						<i class="material-icons">person</i>
						<p class="d-lg-none d-md-block">Account</p>
					</a>
					<div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownProfile">
						<a class="dropdown-item" href="${pageContext.request.contextPath}/logoutServlet">
							Log out
						</a>
					</div>
				</li>
			</ul>
			
		</div>
	</div>
</nav>