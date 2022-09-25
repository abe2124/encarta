
<html >
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<title>Untitled Document</title>
</head>           
<body>	  
	<?php
require('DB name.php');
		if(isset($_POST['ch'])){
			$pold=$_POST['ol'];
			$pnew=$_POST['ne'];
		    $pneww=$_POST['pcon'];
			if($pnew == $pneww){
				$a = mysql_query("select * from  user where password='$pold'");
				while($x = mysql_fetch_array($a)){
					$dbp = $x[6];
					if($dbp != $pold){
						
				
					echo '<script>alert("የተሳሳተ የይለፍ ቃል")</script>';
						
					}
					else{
						$qq = mysql_query("update  user set password = 
						'$pnew' where password = '$pold' and account_type = 'Store Head'");
						if($qq){
						
							echo '<script>alert("በትክክል ተቀይሯል")</script>';
						}
					}
					
				}
		
					
				
			}
			else{
			
				echo '<script>alert("የይለፍ ቃል አይዛመድም")</script>';
			}
		}
?>


	  <center><h3>የይለፍ ቃሉን ለመቀየር ቅጹን ይሙሉ</h3></center>
	  <table width="688" height="250" bgcolor="#CCCCCC">
	  </br>
<form action="Change Password for headamar.php" method="post" enctype="multipart/form-data"> 
    <tr>
    <td>አሁን ያለዎት የይለፍ ቃል ያስገቡ:</td>
    <td><input type="text" size="23"maxlength="8" name="ol"></td>
    </tr>
  <tr>
    <td>አዲሱን የይለፍ ቃልዎን ያስገቡ:</td>
    <td><input type="text" size="23" maxlength="8" name="ne"></td>
    </tr>
    <tr>
   <td>አዲሱን የይለፍ ቃልህን በድጋሚ አስገባ:</td>
   <td><input type="text" size="23"maxlength="8" name="pcon"></td>    
   </tr>   
  <tr>
    <td> <input type="submit" value="የሚስጥር ቁልፍ ይቀይሩ"name="ch" id="bt"></td>
	<td><input type="reset" value="ሰርዝ" Reset="res" id="bt" /></td>
  </tr>
    </form>
	</table>
   </body>
 </html> 