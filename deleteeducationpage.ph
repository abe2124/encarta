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
	
	left:5%;
	
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

table tr td input {
	background:none;
	border:none;
}
table tr td input[type="submit"] {
	color:red;
	cursor: pointer;
	font-weight: bold;
}


</style> 
</head> 
<?php session_start() ?>
<body> 
	<div id="nav">
		<a href="admin_page.php" > Home </a>
		<a href="create_account_admin_page.php" >Create a new account</a>
		<a href="view_account_page.php">View user account</a>
		<a href="" class="active">Delete users</a>
		<a href="logout.php" style="float: right;">Log out</a>
	</div> 
	<div id="content"> 
		
		<?php 
			include ('connection.php');
						$select_query = "select info_id, cultureinformation,emp_id from culture"; 
			
			$select_result = mysql_query($select_query);
			if(mysql_num_rows($select_result) > 0) {
				echo '<h3 style="text-align:center"> You can delete any of the following users! </h3>';
	echo '<table>
				<tr> 
					<th>Information Id </th> 
					<th>Information</th>
					<th>Emp Id </th> 
			
				</tr>';
					
				while($row = mysql_fetch_row($select_result)) {
					echo '<tr><form action="deleteculture.php" method="post" onsubmit="return confirmDelete()">';
		        echo "<td><input type=text value='".$row[0]."' name=info_id size=3 readonly> </td>";
				echo "<td><input type=text value='".$row[1]."' name=idher rreadonly> </td>";
				echo "<td><input type=text value='".$row[2]."' name=name readonly> </td>";
					echo "<td><input type=submit value=Delete> </td></form></tr>";
				}
				echo '</table>';
			} else {
				echo '<p>There are no users currently registered in the system!</p>';
			}
			
														
		?>
		<script type="text/javascript">
			function confirmDelete() {
				var confirmation = confirm("Are you sure you want to delete this user?");
				if (confirmation == true ) {
					return true;
				}
				else {
					return false;
				}
			}
		</script>
	</div> 
</body>
</html>
