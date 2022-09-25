
<html >
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<title>Untitled Document</title>
</head>           
<body>	  
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
						'$neww' where password = '$pold' and role = 'admin'");
						
						
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
<form action="Change Password for head.php" method="post" enctype="multipart/form-data"> 
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