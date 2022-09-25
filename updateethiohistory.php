<?php 
include('connection.php');
$update_query = "update ethiohistory set info_id='".$_POST['info_id']."',
                                                        envinformation = '".$_POST['idher']."',
														emp_id = '".$_POST['name']."'
				                                       where info_id='".$_POST['info_id']."'";
				
				if(mysql_query($update_query)) {
					echo '<p style="color:green">Update Success!<p>';
					header("refresh:1; url=updateethiohistorypage.php");
				}
				else {
					die(mysql_error());
				}
?>