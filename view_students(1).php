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
		<a href="teacher_page.php" > Home </a>
		<a href="" class="active">View Registered Students</a>
		<a href="logout.php" style="float: right;">Log out</a>
	</div> 
	<div id="content"> 
		
		<?php 
			include('connection.php');
			$query = "select stud_id,fullname,grade,age,sex,address,kebele,houseno,phone from students";
			$result = mysql_query($query);
				if(mysql_num_rows($result) > 0 ) {
				echo '<h3 style="text-align: center;"> The following '.mysql_num_rows($result).' student(s) are currently registered </h3>';
				echo '<table>
				<tr> 
					<th>Student_ID</th>
					<th>Full Name </th> 
					<th>Grade</th>
					<th>Age</th> 
					<th>Sex</th> 
					<th>Address</th>
					<th>Kebele</th>
					<th>House No.</th>
					<th>Phone</th>
				</tr>';
					
				while($row = mysql_fetch_array($result)) {
					echo "<tr> <td>$row[0]</td><td>$row[1]</td><td>$row[2]</td><td>$row[3]</td><td>$row[4]</td><td>$row[5]</td><td>$row[6]</td><td>$row[7]</td><td>$row[8]</td></tr>";
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
