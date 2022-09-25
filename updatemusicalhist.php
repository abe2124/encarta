<?php 
include('connection.php');
$update_query = "update musicalinformation set info_id='".$_POST['info_id']."',
                                                        musinformation = '".$_POST['idher']."',
														emp_id = '".$_POST['name']."'
				                                       where info_id='".$_POST['info_id']."'";
				
				if(mysql_query($update_query)) {
					echo '<p style="color:green">Update Success!<p>';
					header("refresh:1; url=updatemusicalhistpage.php");
				}
				else {
					die(mysql_error());
				}
?>