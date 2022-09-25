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
		<a href="uplodeinformation.php" >Upload Information</a>

		<a href="" class="active">Update</a>
		<a href="logout.php" style="float: right;">Log out</a>
	</div> 
	<div id="content"> 
		<h3 style="text-align:center"> You can update the following sport by changing the input fields! </h3>
		<?php 
			include ('connection.php');
			$select_query = "select info_id, spoinformation,emp_id from sport"; 
			
			$select_result = mysql_query($select_query);
		echo '<table>
		<tr> 
					<th>Information Id </th> 
					<th>Information</th>
					<th>Information RecorderId </th> 
			
				</tr>';
			while($row = mysql_fetch_row($select_result)) {
				echo "<tr><form action=updatesport.php method=post>";
			  echo "<td><input type=text value='".$row[0]."' name=info_id size=3> </td>";
            echo"<td> <textarea name='idher'   cols='91' rows='21'>";
		
			echo"'".$row[1]."'
			</textarea></td>";
				echo "<td><input type=text value='".$row[2]."' name=name> </td>";

				echo "<td><input type=submit value=Update> </td></form></tr>";
			}
			echo '</table>';
			
			
														
		?>
	
	</div> 
	
		
</body>
