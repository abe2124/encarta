<?php 
include('connection.php');
$update_query = "update technology set info_id='".$_POST['info_id']."',
                                                        tecinformation = '".$_POST['idher']."',
														emp_id = '".$_POST['name']."'
				                                       where info_id='".$_POST['info_id']."'";
				
				if(mysql_query($update_query)) {
					echo '<p style="color:green">Update Success!<p>';
					header("refresh:1; url=updatetechnopage.php");
				}
				else {
					die(mysql_error());
				}
?>