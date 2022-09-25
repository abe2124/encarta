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
	width: 40%;
	height: auto; 
	margin: auto;
}
table {
	position: relative; 
	width:74%;
	left:13%;
}
table,th,td {
	border-collapse:collapse;
	border: 1px solid #ddd;;
}
th,td {
	
    padding: 8px;
}
th {
	 padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
}
tr:nth-child(even) {
	background-color: #f2f2f2;
}
tr:hover {
	background-color: #ddd;
}
</style> 
</head> 

<body> 
	<div id="nav">
		<a href="admin_page.php" > Home </a>
		<a href="create_account_admin_page.php" >Create a new account</a>
		<a href="view_account_page.php" >View user account</a>
		<a href="block_user_form.php" >Activate Account</a>
		<a href="block_user_form.php" >Deactivate Account</a>
		<a href="CPfhf.php"class="active" >Change Password</a>
		<a href="logout.php" style="float: right;">Log out</a>
	</div> 
	<div id="content"> 
<?php
include('connection.php');
		if(isset($_POST['ch'])){
			$pold=md5($_POST['ol']);
			$pnew=$_POST['ne'];
		    $pneww=$_POST['pcon'];
			if($pnew == $pneww){
				$a = mysql_query("select * from  users where password='$pold'");
				while($x = mysql_fetch_array($a)){
					$dbp = $x[2];

					if($dbp != $pold){
						
					echo "wrong password";
										
					}
					else{
						$new=md5($pnew);
					$qq = mysql_query("update  users set password = 
						'$new' where password = '$pold' and role = 'admin'");
						
						
						if($qq){
							echo "changed";
						}
					}
					
				}
		
					
				
			}
			else{
				echo "password not match";
			}
		}
?>


	  <center><h3>Fill the form to Change The Password</h3></center>
	  </br>
	  <table width="600" height="250" bgcolor="#CCCCCC">
	  <meta charset="UTF-8">
<form action="CPfhf.php" method="post" enctype="multipart/form-data"> 
    <tr>
    <td>Enter your existing password:</td>
    <td><input type="text" size="23"maxlength="8" name="ol"></td>
    </tr>
  <tr>
    <td>Enter your new password:</td>
    <td><input type="text" size="23" maxlength="8" name="ne"></td>
    </tr>
    <tr>
   <td>Re-enter your new password:</td>
   <td><input type="text" size="23"maxlength="8" name="pcon"></td>    
   </tr>   
  <tr>
    <td> <input type="submit" value="Chenge Password"name="ch" id="bt"></td>
	<td><input type="reset" value="Reset" Reset="res" id="bt" /></td>
  </tr>
    </form>
	</table>
   </body>
 </html> 