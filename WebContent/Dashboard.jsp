<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Dashboard</title>

<jsp:include page="AllCss.jsp"></jsp:include>
</head>
<body>

	<jsp:include page="SideBar.jsp"></jsp:include>
	<jsp:include page="Header.jsp"></jsp:include>
	
	
	<div class="content-wrap">
		<div class="main">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-8 p-r-0 title-margin-right">
						<div class="page-header">
							<div class="page-title">
								<h1>
									Hello, <span>Welcome Here</span>
								</h1>
							</div>
						</div>
					</div>
					<!-- /# column -->
					<div class="col-lg-4 p-l-0 title-margin-left">
						<div class="page-header">
							<div class="page-title">
								<ol class="breadcrumb">
									<li class="breadcrumb-item"><a href="#">Dashboard</a></li>
									<li class="breadcrumb-item active">Home</li>
								</ol>
							</div>
						</div>
					</div>
					<!-- /# column -->
				</div>
				<!-- /# row -->
				<section id="main-content">
				<div class="row">
					<div class="col-lg-3">
						<div class="card">
							<div class="stat-widget-one">
								<div class="stat-icon dib">
									<i class="ti-money color-success border-success"></i>
								</div>
								<div class="stat-content dib">
									<div class="stat-text">Total Profit</div>
									<div class="stat-digit">1,012</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-3">
						<div class="card">
							<div class="stat-widget-one">
								<div class="stat-icon dib">
									<i class="ti-user color-primary border-primary"></i>
								</div>
								<div class="stat-content dib">
									<div class="stat-text">New Customer</div>
									<div class="stat-digit">961</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-3">
						<div class="card">
							<div class="stat-widget-one">
								<div class="stat-icon dib">
									<i class="ti-layout-grid2 color-pink border-pink"></i>
								</div>
								<div class="stat-content dib">
									<div class="stat-text">Active Projects</div>
									<div class="stat-digit">770</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-3">
						<div class="card">
							<div class="stat-widget-one">
								<div class="stat-icon dib">
									<i class="ti-link color-danger border-danger"></i>
								</div>
								<div class="stat-content dib">
									<div class="stat-text">Referral</div>
									<div class="stat-digit">2,781</div>
								</div>
							</div>
						</div>
					</div>
				</div>
  
 
 
 
 
 
 
				<div class="row">
					<div class="col-lg-12">
						<div class="footer">
							<p>
								2018 © Admin Board. - <a href="#">example.com</a>
							</p>
						</div>
					</div>
				</div>
				</section>
			</div>
		</div>
	</div>
<jsp:include page="AllJs.jsp"></jsp:include>
	</body>
</html>