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
		<a href="unblock_user_form.php" >Activate Account</a>
		<a href="block_user_form.php" class="active" >Deactivate Account</a>
		<a href="CPfhf.php" >Change Password</a>
		<a href="logout.php" style="float: right;">Log out</a>
	</div> 
	<div id="content"> 
	
<?php
							$result="";
						include('connection.php');
							if ($_SERVER['REQUEST_METHOD'] == "POST"){
								if (isset($_POST['block'])){
									$block= $_POST['idn']; 
									
									if(empty ($block)){
									$result="pleace inter id";
								
									}
									
									else {
									$block= "update users set status = 'blocked' where user_id = '$block'";
									$run_query = mysql_query($block);
										if (!$run_query){
										echo mysql_error()."bloked";
										}
									else{
									$result='<script>alert("successfully blocked")</script>';
										}
									}
								}
								
								
								
							}
						?>
						<center><h3>Type Id to block user</h3></center>
<table width="688" height="200" bgcolor="#CCCCCC">
<meta charset="UTF-8">
<form action="block_user_form.php" method="post">
  <tr>
    <td>Id</td>
    <td><input type="text"  size="23" name="idn" /></td>
  </tr>
  <tr>
    <td height="95"><input type="submit"  name="block" value="Block"id="bt" /></td>
      <td><input type="reset" value="Reset" Reset="res" id="bt" /></td>  
	<td><?php echo $result;?></td>
  </tr>
  </form>
</table>
</body>
</html>
