
	<?php

	$mysqli = new mysqli("localhost", "root", "", "encarta");
	if (mysqli_connect_errno()) {
		printf("Connect failed: %s\n", mysqli_connect_error());
		exit();
	}		
	$mysqli->query("SET NAMES 'utf8'");
	
		$sql="SELECT * FROM envaroment";
		$result=$mysqli->query($sql);

		if(mysqli_num_rows($result)>0){
			while($row=mysqli_fetch_array($result)){
				$output[]=$row; 
			}	
		}
		else{
			echo"ERROR:No record found!";
		}
	print(json_encode($output)); 
	$mysqli->close();	

?>

		
	