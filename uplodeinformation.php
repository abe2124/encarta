<?php session_start();
if(!isset($_SESSION['username'])){
header('Location: login.php');
}
 ?>
<!DOCTYPE html> 

<html> 
<head>
<title> </title> 
<style> 
body { 
	background: #f4f6ff;
	overflow: auto;
	font-family: Verdan, Tahoma, Arial, sans-serif;
	font-size: 18px;
	
}
#nav { 
	width: 98%;
	background-color: black;
	height: 5%;
	color: white;
	overflow:visible;
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
	width: 40%;
	height: auto; 
	margin: auto;
}
body{
background-color: #ffffff;
font-family:Snell Roundhand, cursive;
}
#menu{
float:bottom;
margin-left:0%;
padding-right:37%;
background: #ffffff;

}
#menuall{
float:left;
margin-left:0%;
padding-right:35%;
background: #ffffff;

}
#container{
background: #ffffff;
margin-left:0%;
padding-right:15%;
height:auto;

}
#containt{
background:  #ffffff;
margin-left:20%;
height:auto;
padding-right:6%;
padding-bottom:10%;

}
#login{
float:left;
margin-left:0%;
padding-right:2%;
}
#footer{
background-color:#ffffff;
font-family:Arial, Helvetica, sans-serif;
}
#vertical{
margin-top:1%;
			float:left;
			width:5%;
}
#c{
	float:left;
margin-left:6.5%;
}

.dropdown {
    position: relative;
    display: inline-block
	
}
/* Dropdown Content (Hidden by Default) */

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #0099FF;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
}

/* Links inside the dropdown */
.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

/* Change color of dropdown links on hover */
.dropdown-content a:hover {
	background-color:#f1f1f1;
	}
/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {
    display: block;
}
</style> 
</head> 

<body> 
	<div id="nav">
   <div class="dropdown">
<link rel="stylesheet" href="style.css">
<a href="officer_page.php" class="active"style="height:32px;line-height:32px;"><img src="Im/ss.jpg" width="30" height="30" alt=""/>Home</a>
<div class="dropdown-content">
</div>
</div>
   <div class="dropdown">
<link rel="stylesheet" href="style.css">
<a href="#" style="height:32px;line-height:32px;"><img src="Im/ss.jpg" width="30" height="30" alt=""/>History</a>
<div class="dropdown-content">
	<a href="uploadhistory.php" >Ethiopia History </a>
		<a href="uploadpopulartalks.php" >popular talks </a>
</div>
</div>
   
   <div class="dropdown">
<link rel="stylesheet" href="style.css">
 <a href="#"style="height:32px;line-height:32px;"><img src="Im/ss.jpg" width="30" height="30" alt=""/>People and Sociality</a>
<div class="dropdown-content">
        <a href="uploadfaumspeople.php" >Famous People </a>
		<a href="uploadculture.php" > Cultures </a>
		<a href="uploadlaws.php" >Governments and laws </a>
		<a href="uploadagriculture.php" >Agriculture </a>
</div>
</div>
   <div class="dropdown">
<link rel="stylesheet" href="style.css">
 <a href="#"style="height:32px;line-height:32px;"><img src="Im/ss.jpg" width="30" height="30" alt=""/>Music and Cultural Games</a>
<div class="dropdown-content">
		<a href="uploadjokes.php" >Ethiopian Jokes and Fictions </a>
		<a href="uploadmusicalhistory.php"> Ethiopia Musical History </a>
		<a href="uploadmusicalinstrument.php" >Musical Instrument </a>
		<a href="uploadsport.php" >Sports </a>
</div>
</div>
    <div class="dropdown">
<link rel="stylesheet" href="style.css">
 <a href="#"style="height:32px;line-height:32px;"><img src="Im/ss.jpg" width="30" height="30" alt=""/>Science and Nature</a>
<div class="dropdown-content">
		<a href="uploadtechno.php" >Technology</a>
		<a href="uploadeducation.php" >Education </a>
		<a href="uploadenvaroment.php" > Environments </a>
</div>
</div>
    <div class="dropdown">
<link rel="stylesheet" href="style.css">
 <a href="#"style="height:32px;line-height:32px;"><img src="Im/ss.jpg" width="30" height="30" alt=""/>Heritage</a>
<div class="dropdown-content">
        <a href="uploadnaturalhritage.php" >Natural Heritage </a>
		<a href="uploadhumanmadhertige.php" >Human Mad Heritage </a>
</div>
</div>
<a href="logout.php" style="float: right;">Log out</a>
	</div> 
	<div id="content"> 
		<?php 
			if(isset($_SESSION['username'])){
				echo '<h2 style="text-align:center"> Hello '.$_SESSION['username']. '</h2>';
			}
			else {
				echo '<h2 style="text-align:center">You must be logged in!</h2>';
			}?>

		<p style="text-align:center"> Use the navigation on the top of this page to access the page. </p>
	</div> 
	
		
</body>
</html>