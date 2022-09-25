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
	left:2%;
	
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
		<a href="officer_page.php" > Home </a>
		<a href="register_student.php" >Register a new student</a>
		<a href="" class="active">Update</a>
		<a href="logout.php" style="float: right;">Log out</a>
	</div> 
	<div id="content"> 
		<h3 style="text-align:center"> You can update the following students by changing the input fields! </h3>
		<?php 
			include ('connection.php');
			$select_query = "select stud_id,fullname,grade,age,sex,address,kebele,houseno,phone from students"; 
			
			$select_result = mysql_query($select_query);
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
					
			while($row = mysql_fetch_row($select_result)) {
				echo "<tr><form action=update_student.php method=post>";
				echo "<td><input type=text value='".$row[0]."' name=stud_id size=3> </td>";
				echo "<td><input type=text value='".$row[1]."' name=fullname> </td>";
				echo "<td><input type=text value='".$row[2]."' name=grade> </td>";
				echo "<td><input type=text value='".$row[3]."' name=age size=2> </td>";
				echo "<td><input type=text value='".$row[4]."' name=sex size=2> </td>";
				echo "<td><input type=text value='".$row[5]."' name=address> </td>";
				echo "<td><input type=text value='".$row[6]."' name=kebele> </td>";
				echo "<td><input type=text value='".$row[7]."' name=houseno> </td>";
				echo "<td><input type=text value='".$row[8]."' name=phone> </td>";
				echo "<td><input type=submit value=Update> </td></form></tr>";
			}
			echo '</table>';
			
			
														
		?>
	
	</div> 
	
		
</body>
</html>
