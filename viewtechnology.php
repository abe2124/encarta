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
		<a href="officer_page.php" > Home </a>
		<a href="" class="active">View Technological Information </a>
		<a href="logout.php" style="float: right;">Log out</a>
	</div> 
	<div id="content"> 
	<table border="1">
	<?php
include ('connection.php');
					
						//Emp_id	first_name	father_name	sex	Departement	phone_no	Date of Registration
						$view_comment = "select * from technology";
					        $view = mysql_query($view_comment);
						if (!$view){echo mysql_error();}
						
						if (mysql_num_rows($view) >0){
						      echo "<tr bgcolor=#7FFFD4>
						        
											<th>Id </th>
											<th>Information</th>
											<th>Information Recorder</th>
										
																	
											
									</tr>";
					$row = 1;
					$all = array();
					$url = "";
					
					while($comment = mysql_fetch_array($view)){
					echo "<tr>
							<td valign = 'top'>"
								.$comment['info_id'].
								
							"</td><td valign = 'top'>"
								.$comment['tecinformation'].
								
							"</td><td valign = 'top'>"
								.$comment['emp_id'].
								
							
							"</td>
							<td>
								
							</td>
							</tr>";
							  
								}
						}
						else {
							echo "no Information is found";
						}

								
									
					
					?>
					</table>
	</div> 
	
		
</body>
</html>