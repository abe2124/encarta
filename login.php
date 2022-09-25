<?php session_start(); ?>
<!DOCTYPE html> 
<html> 
<head>
<META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE">
<title> Login page </title> 
<style> 
body { 
	background-color: #FAFAFA;
	font-family: Verdan, Tahoma, Arial, sans-serif;
	font-size: 18px;
	overflow: auto;
}
h1,h2,h3 {
	text-align: center; 
	padding-left:5%;
	color:#000000;
}

#wrapper {
	margin: 0 auto;
	max-midth: 1020px; 
	width: 98%; 
	background-color: #FBFBEF;
	border: 1px solid #878E63;
	border-radius: 4px; 
	box-shadow: 0 0 10px 0px #5882FA;
}
img {
	 text-align:center;
	 max-width:90%;
	 height: auto; 
	 width: auto;
}
#hmm {
	width: 100%; 
	height: auto; 
	background-color: #2A0A29;
	overflow: hidden;
	text-align:right;

}
.hmm-text {
	text-align: right;
	font-size: 13px;
	padding-right: 10px;
	padding-left: 16px;
	color: #000000;
}
header {
	color: #2A0A29;
	text-align: center;
}

nav ul {
	list-style-type: none; 
	margin:0;

	overflow: hidden;
}
nav ul li {
	float: left; 
	border: 1px solid #878E63;
	width: 19%;
}
nav ul li a {
	background: #F1F0D1;
	display: block;
	padding: 5% 12%; 
	font-weight: bold; 
	font-size: 18px;
	color: #000000;
	text-decoration: none; 
	text-align: center;
}
nav ul li a:hover,a.active {
	background-color: #878E63;
	color: #0101DF;
}
footer { 
	font-size: 16px;
	background-color: #2A0A29;
	width:100%;
	overflow: hidden;
	color: #F1F0D1;
	text-align: center;
}
.left-col {
	width:50%;
	float: left;
	margin: 2% 0 1% 2%; 
        border-right: 2px solid black;
}
.left-col img {
	width: 50%;
        margin-left:14%;
}
.sidebar { 
	width: 40%; 
	float: right;
	margin: 4% 3% 1% 0; 
	text-align: center;
}
.login { 
	border: 2px solid #878E63;
	color: #000000;
	text-align: left;
        width: 50%;
        padding: 0 0 7% 5%;
	line-height: 1.8;
        border-radius: 9px;
}
#loginButton {
	background-color: #F1F0D1;
	color: #000000;
	font-weight: bold;
	border: 1px solid #878E63;
	padding: 8px;
	cursor: pointer;
}
#loginButton:hover { 
	background-color: #878E63; 
	color: #0101DF;
}

</style>  
</head>
 
<body> 
	<div id="wrapper"> 
		<div id="hmm"> 
			
		<div id="hmm"> 
			
			<p class="hmm-text" size='40'>
				Ethio Encarta
			</p>
			
			
		</div>
			
		</div>
		<header> 
			<h1> Ethiopia information </h1>
		</header>
		<nav> 
			<ul> 
				<li><a href="home.html">Home</a></li> 
			</ul>
		</nav> 
		
		<section class="left-col"> 
			<h3>Ethio-Encarta!</h3>
			<p style="text-align:center;"> Please fill in your username and password to manage the encarta system </p>	
			<img src="photos/key_lock-animated.GIF" alt="login_image" >	
		</section>
		<aside class="sidebar"> 
			<div class="login">
				<form action="login.php" method="POST"> 
					<h3> Login </h3>
					Username: <br> 
					<input type="text" name="username"> 
					<br> 
					Password: <br> 
					<input type="password" name="password"> <br> 
					<p><input id="loginButton" type="submit" value="Login"></p> 
					<?php 
						
						include('connection.php');
						if(isset($_POST['username']) && isset($_POST['password'])) {
						$un=$_POST['username'];
						$aa=mysql_query("select * from users where username='$un'");
						while($row=mysql_fetch_array($aa)){
						if($row['status']=="blocked")
						{
						echo'<script>alert("your account is blocked")</script>';
						}
						else{
							$username = $_POST['username'];
							$password = md5($_POST['password']);
							if(!empty($username) && !empty($password)) {
								$query = "select * from users where username = '".$username."' and password = '".$password."'";
								$query_result = mysql_query($query);
								$count = mysql_num_rows($query_result); 
								if($count == 0) {
									echo '<p style="color:red; font-size:14px;">username and password is not correct!</p>';
								}
								else {
									$username = mysql_result($query_result,0,'username');
									$_SESSION['username'] = $username; 
									$role = mysql_result($query_result,0,'role');
									$lowercase = strtolower($role);
									if($lowercase == 'admin') {
										header('Location: admin_page.php');
									}
									else if($lowercase == 'officer') {
										header('Location: officer_page.php');
									}
									else if($lowercase == 'teacher') {
										header('Location: teacher_page.php');
									}
								}
							}
							else {
							echo '<p style="color:red; font-size:14px;">username and password must be filled!</p>';
						}
						
						
						}
						}
						}
						
					?>
				</form>
			</div>
		</aside> 
		<footer> 
			Ethio-Encarta<br> 
			<b> +251-11-681-16-11 </b> <br>
			<b> +251-11-681-01-12 </b> <br>
			Addis Ababa, <br> 
			Ethiopia </br> 
			ethioinfo@ethionet.et
				
		</footer> 
	<center><p style="color:#878E63;">&copy; All rights reserved.</p></center>
</body>
</html>

