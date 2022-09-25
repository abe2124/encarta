<?php 
include ('connection.php');
$Idhr=$_POST['info_id'];

$delete_query = "delete from ethiohistory where info_id = '".$Idhr."'";

if(mysql_query($delete_query)) {
	echo '<p style="color:green">Delete success!</p>';
	
	header("Refresh:1; url=deleteethiohistpage.php");
}

?>