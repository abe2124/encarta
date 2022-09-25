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
.Button {
	background-color: black;
	color: white;
	border: none;
	font-weight: bold;
	padding: 8px;
	cursor: pointer;
}
.Button:hover { 
	background-color: #ffffff; 
	border: 1px solid black;
	color: black;
}
fieldset {
	line-height: 2.0;
	margin-bottom: 20px;
}
#upload {
	width: 100%;
	border: 1px solid black;
	padding: 10px;
	border-radius: 10px;
	margin:15px auto;
	background: #f4ffff;
}
</style> 
</head> 

<body> 
	<div id="nav">
		<a href="officer_page.php" > Home </a>
		<a href="logout.php" style="float: right;">Log out</a>
	</div> 
	<div id="content"> 
		<div id="upload">
							
				<h3 style="text-align:center">Ethio encarta mobile based system </h3>
				<h4 style="text-align:center"> Uplod Information About Ethiopia Natural Heritage</h4>
				<form action="uploadnaturalhritage.php" method="POST" ">
	                                        <p id="demo" style="color:red"></p>	
          Information ID*: 
              <input type="varcha(30)" name="iname"> 		
  
            Information:
             <textarea required name="idher" cols="51" rows="21"  ></textarea>
  										
								
			Information recorderId*: 
			<input type="varcha(15)" name="name"> 
                                    
                                    

					<input type="submit" class ="Button" value="Register" name="submit"> 
					</form>
					<?php
						include('connection.php');
						
					
						
						if(isset($_POST['submit'])) {
					$Idhr=$_POST['iname'];
						$Id=$_POST['idher'];
						$name=$_POST['name'];
									
												

						
							if(!empty($Id)&&!empty($Idhr) && !empty($name) ){
							
									$Uplodt= "insert into   heritage (info_id,herinformation,emp_id)
									values ('".$Idhr."','".$Id."','".$name."')";
									$Uplodt = mysql_query($Uplodt);
							
							
								if($Uplodt) {
									echo 'Success';
								}
								else {
									die(mysql_error());
								}
							}
							else {
								echo '<p style="color:red">All required fields must be filled </p>';
							}
							}
						
					?>
				
		</div>

	</div> 
	
		
</body>
</html>
