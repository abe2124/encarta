<?php 
include('connection.php');
$update_query = "update students set stud_id = '".$_POST['stud_id']."',
														fullname = '".$_POST['fullname']."',
														grade = '".$_POST['grade']."',
														age = '".$_POST['age']."',
														sex = '".$_POST['sex']."',
														address = '".$_POST['address']."',
														kebele = '".$_POST['kebele']."',
														houseno = '".$_POST['houseno']."',
														phone = '".$_POST['phone']."' where stud_id='".$_POST['stud_id']."'";
				
				if(mysql_query($update_query)) {
					echo '<p style="color:green">Update Success!<p>';
					header("refresh:1; url=update_students_page.php");
				}
				else {
					die(mysql_error());
				}
?>