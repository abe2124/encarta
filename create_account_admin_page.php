<?php session_start();
if(!isset($_SESSION['username'])){
header('Location: login.php');
}
 ?>
<!DOCTYPE html> 

<html> 
<head>
<META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE">
<title> </title> 
<style> 
body { 
	background: #f4f6ff;
	overflow: auto;
	font-family: Verdan, Tahoma, Arial, sans-serif;
	font-size: 18px;
	
}
#nav { 
	width: 98%;
	background-color: black;
	height: 2%;
	color: white;
	overflow:hidden;
	padding: 1%;
}
#nav a {
	text-decoration:none; 
	color: white;
	padding-right:15px;
}
#nav a:hover {
	color: red;
	
}
#nav a.active { 
	color:chocolate;
}
#content { 
	width: 98%; 
	height: auto;
}

#content {
	width:99.8%;
	height: 550px;
	border: 1px solid black;
}
.section { 
	
	width:45%; 
	float: left; 
	margin: 2%;
	pading:0;
	text-align: left;
}
.section form p input,select{
	position: absolute; 
	right: 26%;
	
	padding:0;
}
select { 
	width: 173px;
}

</style> 
</head> 

<body> 
	<div id="nav">
			<a href="admin_page.php" > Home </a>
		<a class="active"href="create_account_admin_page.php" >Create a new account</a>
		<a href="view_account_page.php" >View user account</a>
		<a href="unblock_user_form.php" >Activate Account</a>
		<a href="block_user_form.php" >Deactivate Account</a>
		<a href="CPfhf.php" >Change Password</a>
		<a href="logout.php" style="float: right;">Log out</a>
	</div> 
	
	<div id="content"> 
		<p style="text-align:center"> Please fill the following form to create a new user </p>
		<div class="section">
			<img src="photos/ceratacc.jpg" alt="account_create" style="width:50%;height:70%;position:relative;left:30%;">
		</div>
		<div class="section">
			<form action="<?php echo $_SERVER['SCRIPT_NAME']; ?>" method="post" onsubmit="return checkPassword()">
				<p>First name*: <input type="text" name="firstname"> </p>
				<p>Last name*: <input type="text" name="lastname"> </p> 
				<p>Address*: <input type="text" name="address"> </p>
				<p>Phone*: <input type="text" name="phone" id="phoneno"> </p>
				<p id="phoneerror" style="color:red"></p>
				<p> Username*: <input type="text" name="username" > </p>
				<p> Password*: <input type="password" name="password" id="password"> </p>
				<p> Re-password*: <input type="password" name="repassword" id="repassword"> </p>

				</p> 
				<p> Role*: <select name="role">
						<option value="admin">Administrator</option> 
						<option value="officer">Record Officer</option> 
					     </select>
						 	 </p>
							 
						<p>Status : 
   <select name="status" style="width:195px;">
	    <option>unblocked</option>
		<option>blocked</option>
		</select>
  </p>
				<input type="submit" name="submit" value="Register">
				<input type="Reset" name="Clear" onclick="document.getElementById('error').innerHTML = '';
															document.getElementById('javascripterror').innerHTML = '';
															document.getElementById('phoneerror').innerHTML = '';">
				<p id="javascripterror" style="color:red"></p>
			 <?php
				 $result="";
					include('connection.php');
					if(isset($_POST['submit'])) {
						if(!empty($_POST['firstname']) && !empty($_POST['lastname']) && !empty($_POST['address']) && !empty($_POST['phone']) &&  
							!empty($_POST['username']) && !empty($_POST['password']) && !empty($_POST['repassword']) && !empty($_POST['role']) && !empty($_POST['status'])) {
							$firstname = $_POST['firstname'];
							$lastname = $_POST['lastname'];
							$address = $_POST['address'];
							$phone = $_POST['phone'];
							$username = $_POST['username'];
							$password = md5($_POST['password']);
							$repassword = md5($_POST['repassword']);
							$role = $_POST['role'];
							$status='unblocked';
							$query = "insert into users (username,password,role,status) values ('".$username."','".$password."','".$role."','".$status."')";
							$result = mysql_query($query);
							$query2 = "insert into employees (first_name,last_name,address,phone,user_id) values ('".$firstname."','".$lastname."','".$address."','".$phone."', (select user_id from users where username = '".$username."'))";
							if($result && mysql_query($query2)) {
								echo '<p id="error" style="color:green">Successfully Registered a new user! </p>';
							}
						} 
						else {
							echo '<p id="error" style="color:red">All fields are required and must be filled! </p>';
						}
					}
				?>
			</form>
		</div>
	</div> 
	<script type="text/javascript"> 
		function checkPassword() {
			var phone = document.getElementById('phoneno').value;
			var password = document.getElementById('password').value; 
			var repassword = document.getElementById('repassword').value; 
			if(isNaN(phone)) {
				document.getElementById('phoneerror').innerHTML = 'Phone must be a number';
				return false; 
			}
			if(password == repassword ) {
				return true;
			}
			else {
				document.getElementById('javascripterror').innerHTML = "Passwords do not match!";
				return false;
			}
		}
			 
	</script> 
	</style> 
<meta charset="UTF-8">
<SCRIPT language=Javascript>
      <!--
      function isNumberKey(evt)
      {
         var charCode = (evt.which) ? evt.which : event.keyCode
         if (charCode > 31 && (charCode < 48 || charCode > 57))
            return false;

         return true;
      }
      //-->
   </SCRIPT>
    <script language="javascript">
  function check()
  {
   if(document.getElementById("Email").value =="")
   {
    alert('first fill Email text field !!'); 
    document.getElementById("Email").focus();
    return false;
   }
   if(document.getElementById("firstname").value =="")
   {
    alert('first fill firstname text field !!');
    document.getElementById("firstname").focus();
    return false;
   }
      if(document.getElementById("lastname").value =="")
   {
    alert('first fill last name text field !!');
    document.getElementById("lastname").focus();
    return false;
   }
      if(document.getElementById("city").value =="")
   {
    alert('first fill city text field!!');
    document.getElementById("city").focus();
    return false;
   }
      if(document.getElementById("phone").value =="")
   {
    alert('first fill phone text field !!');
    document.getElementById("phone").focus();
    return false;
   }
     if(document.getElementById("office").value =="")
   {
    alert('first fill office no text field !!');
    document.getElementById("office").focus();
    return false;
   }
      if(document.getElementById("username").value =="")
   {
    alert('first fill username text field !!');
    document.getElementById("username").focus();
    return false;
   }
      if(document.getElementById("password").value =="")
   {
    alert('first fill password text field !!');
    document.getElementById("password").focus();
    return false;
   }
   
  }
 </script>
  <script type='text/javascript'>
function formValidation(){
//assign the fields
        var Email = document.getElementById('Email');
		var firstname=document.getElementById('firstname');
	var lastname= document.getElementById('lastname');
	var city = document.getElementById('city');
	var phone = document.getElementById('phone');
		var office = document.getElementById('office');
	var username = document.getElementById('username');
	var password = document.getElementById('password');

if(isAlphabet(firstname, "please enter Your First name in letters only")){
if(lengthRestriction(firstname, 3, 30,"for your First name")){
if(isAlphabet(lastname, "please enter Your Last name in letters only")){
if(lengthRestriction(lastname, 3, 30,"for your Last name")){
if(emailValidator(Email,"check your E-mail format")){

if(isAlphanumeric(password,"Please Enter Correct Password")){
if(lengthRestriction(password, 3, 8,"for your Password")){
if(isAlphanumeric(username,"Please Enter Correct Password")){
if(lengthRestriction(username, 3, 25,"for your username")){
if(isNumeric(phone, "please enter Number only For Mobile Phone")){
if(lengthRestriction(phone, 10, 15,"for your Phone number")){
	if(isNumeric(office, "please enter Number only For office no")){
}}}
}}}
	}
	}}
	}}}
	
return false;
		
}	
function isAlphabet(elem, helperMsg){
	var alphaExp = /^[a-zA-Z]+$/;
	if(elem.value.match(alphaExp)){
		return true;
	}else{
		alert(helperMsg);
		elem.focus();
		return false;
	}
}

function emailValidator(elem, helperMsg){
	var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
	if(elem.value.match(emailExp)){
		return true;
	}else{
		alert(helperMsg);
		elem.focus();
		return false;
	}
}
function isNumeric(elem, helperMsg){
	var numericExpression = /^[0-9]+$/;
	if(elem.value.match(numericExpression)){
		return true;
	}else{
		alert(helperMsg);
		elem.focus();
		return false;
	}
}
function lengthRestriction(elem, min, max, helperMsg){
	var uInput = elem.value;
	if(uInput.length >= min && uInput.length <= max){
		return true;
	}else{
		alert("Please enter between " +min+ " and " +max+ " characters" +helperMsg);
		elem.focus();
		return false;
	}
}
function isAlphanumeric(elem, helperMsg){
	var alphaExp = /^[0-9a-zA-Z]+$/;
	if(elem.value.match(alphaExp)){
		return true;
	}else{
		alert(helperMsg);
		elem.focus();
		return false;
	}
}
function isAlphabet(elem, helperMsg){
	var alphaExp = /^[a-zA-Z]+$/;
	if(elem.value.match(alphaExp)){
		return true;
	}else{
		alert(helperMsg);
		elem.focus();
		return false;
	}
}
</script>
</body>
</html>
