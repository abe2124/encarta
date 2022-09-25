<?php session_start();
if(!isset($_SESSION['username'])){
header('Location: login.php');
}
 ?>
<!DOCTYPE html> 

<html> 
<head>
<META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE">
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
		<a href="" class="active">View user account</a>
		<a href="block_user_form.php" >Activate Account</a>
		<a href="block_user_form.php" >Deactivate Account</a>
		<a href="CPfhf.php" >Change Password</a>
		<a href="logout.php" style="float: right;">Log out</a>
	</div> 
	<div id="content"> 
		
		<?php 
			include('connection.php');
			$query = "select users.user_id,employees.first_name,employees.last_name,users.username,users.password,users.role ,users.status from users inner join employees on users.user_id = employees.user_id";
			$result = mysql_query($query);
				if(mysql_num_rows($result) > 0 ) {
				echo '<h3 style="text-align: center;"> The following '.mysql_num_rows($result).' user(s) are currently registered </h3>';
				echo '<table>
				<tr> 
					<th>User ID</th>
					<th>First Name </th> 
					<th>Last Name</th>
					<th>User Name</th> 
					<th>Password</th>					
					<th>Role</th>
					<th>Status</th>
				</tr>';
					
				while($row = mysql_fetch_array($result)) {
					echo "<tr> <td>$row[0]</td><td>$row[1]</td><td>$row[2]</td><td>$row[3]</td><td>".$row[4].
					"</td><td>$row[5]</td><td>$row[6]</td></tr>";
					}
			echo '</table>';
			}
			else {
				echo 'No users currently registered on the system';
			}
			
		?>
	</div> 
	
		
</body>
</html>
