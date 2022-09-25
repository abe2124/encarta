<?php 
include ('connection.php');
$userid = $_POST['user_id'];

$delete_query = "delete from users where user_id = '".$userid."'";

if(mysql_query($delete_query)) {
	echo '<p style="color:green">Delete success!</p>';
	
	header("Refresh:1; url=delete_user_page.php");
}

?>