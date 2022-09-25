<!DOCTYPE html> 

<html> 
<head>
<title> </title> 
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
	color:#878E63;
}

#wrapper {
	margin: 0 auto;
	max-midth: 1020px; 
	width: 98%; 
	background-color: #FEFBE8;
	border: 1px solid #2A0A29;
	border-radius: 4px; 
	box-shadow: 0 0 10px 0px #888888;
}
img {
	 text-align:center;
	 max-width:100%;
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
	color: #F1F0D1;
}
header {
	color: #878E63;
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
	color: #2A0A29;
	text-decoration: none; 
	text-align: center;
}
nav ul li a:hover,a.active {
	background-color: #2A0A29;
	color: #F1F0D1;
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
}
.sidebar { 
	width: 40%; 
	float: right;
	margin: 4% 3% 1% 0; 
	text-align: center;
}
.section { 
	display: block;
	width: 29%; 
	float: left; 
	margin: 2%; 
	text-align: center;
}
.section img { 
	opacity: 0.5;
}
.section img:hover { 
	opacity: 1.0;
}
.clearfix {
	clear: both;
} 


#hmm img {
	width: 29px;
	margin-right:1%;
	height: 29px;
	position:relative;
}
/*-----Media-----*/
@media screen and (max-width:600px) {
	nav ul li {
		float:none;
		width: 80%;
		margin: auto;
	}
	body {
		font-size: 14px;
	}
	
	nav ul li a {
		font-size: 15px;
	}
	footer {
		font-size: 15px;
	}
}
</style>  
</head>
 
<body> 
	<div id="wrapper"> 
				<div id="hmm"> 
			
			<p class="hmm-text" size='40'>
				Ethio Encarta
			</p>
			
			
		</div>
			
			
		</div>
		<header> 
			<h1>Ethio-encarta </h1>
		</header>
		<nav> 
			<ul> 
				<li><a href="home.html">Home</a></li> 
	            <li><a href="about.php">About us</a></li>
	            <li><a href="login.php">Log in</a></li>	
				<li><a class="active"href="contact.php">Contact us</a></li>
			
			</ul>
		</nav> 
		
		<section class="left-col"> 
			<p style="text-indent:50px;line-height:1.8;"><b style="color: #878E63;"><center><font face="Times New Roman" color="black" size="4">	
Ethiopia tourism office Address
&nbsp;&nbsp;Tel: +251116815440<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;or   +251116813251<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Fax- 0116812065<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Po.Box: 445<br><br>
 
Tourism office E-Mail Address: Tourism@tru.et<br><br>
 

 
Ethiopia, Addis Abeba , P.O.Box 445<br><br>
     Addis Abeba </p> 
			
		</section>
		<aside class="sidebar"> 
			<div class="image">
				<img src = "photos/ethiopia.jpg" alt="banner">  
			</div>
		</aside> 
		<div class="clearfix"> </div>
			
		<footer> 
				Mobile Based Ethio-encarta system<br> 
				<b> +251-11-681-11-11 </b> <br>
				<b> +251-11-681-11-12 </b> <br>
Ethiopia, Addis Abeba , P.O.Box 445<br><br>
     Addis Abeba
				Tourism@tru.et
	
				
		
		</footer> 
	<center><p style="color:#878E63;">&copy; All rights reserved.</p></center>
</body>
</html>
