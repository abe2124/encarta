<?php 
include ('connection.php');
$Idhr=$_POST['name'];

$delete_query = "delete from technology where info_id = '".$Idhr."'";

if(mysql_query($delete_query)) {
	echo '<p style="color:green">Delete success!</p>';
	
	header("Refresh:1; url=deletetechnopage.php");
}

?>