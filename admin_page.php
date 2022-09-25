<?php session_start();
if(!isset($_SESSION['username'])){
header('Location: login.php');
}
 ?>
<!DOCTYPE html> 
<html> 
<head>
<META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE">
<title> Admin page </title> 
<style> 
body { 
	background: #f4f6ff;
	font-family: Verdan, Tahoma, Arial, sans-serif;
	font-size: 18px;
	
}
#nav { 
	width: 98%;
	background-color: black;
	height: 2%;
	color: white;
	overflow:hidden;
	padding: 1%;
}
#nav a {
	text-decoration:none; 
	color: white;
	padding-right:15px;
}
#nav a:hover {
	color: red;
	
}
#nav a.active { 
	color:chocolate;
}
#content { 
	width: 98%; 
	height: auto;
}
img {
	display: block;
	width: 30%;
	height: auto; 
	margin: auto;
}

</style> 
</head> 

<body> 
	<div id="nav">
		<a href="admin_page.php" class="active"> Home </a>
		<a href="create_account_admin_page.php" >Create a new account</a>
		<a href="view_account_page.php" >View user account</a>
		<a href="block_user_form.php" >Activate Account</a>
		<a href="block_user_form.php" >Deactivate Account</a>
	<a href="CPfhf.php" >Change Password</a>
		<a href="logout.php" style="float: right;">Log out</a>
	</div> 
	<div id="content"> 
		<?php 
			if(isset($_SESSION['username'])) {
				echo '<h2 style="text-align:center"> Hello '.$_SESSION['username'].'</h2>';
			}
			else {
				echo '<h2 style="text-align:center"> You must be logged in to access this page </h2>';
			}
		?>
		<img src="photos/admin.jpg" alt="admin_image" >
		<p style="text-align:center"> Use the navigation on the top of this page to access the portal. </p>
	</div> 
	
		
</body>
</html>
