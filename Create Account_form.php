
<html>
<head>
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
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Add New User</title>
</head>

<body>
				 <?php
				 $result="";
				require('DB name.php');
				if ($SERVER["REQUEST_METHOD"] ="POST"){
				if (isset($_POST['sub'])){
					
				$name = $_FILES['ph']['name'];
				$type=$_FILES['ph']['type'];
													
				$cname=str_replace(" ","_",$name);
				$tmp_name=$_FILES['ph']['tmp_name'];
				$target_path="profilePics/";
				$target_path=$target_path.basename($cname);
				if(move_uploaded_file($_FILES['ph']['tmp_name'],
				$target_path)){
				
				$fname = $_POST['fname'];
				$fname=preg_replace('#[^A-Za-a]#i','', $fname);
				$faname = $_POST['faname'];
				$faname=preg_replace('#[^A-Za-a]#i','', $faname); 
				
			         $sex=$_POST['sex'];
				
				$photo = $target_path;
				$uname = $_POST['uname'];
			    $id = $_POST['id'];
				$pass = md5($_POST['pass']);
				$pass1 =md5($_POST['pass1']);
				$Aid = $_POST['Aid'];
				$account_type = $_POST['acc'];
				$phone = $_POST['phone'];
				$status='unblocked';
					
		$qqq = mysql_query("select Epm_Id from Employees where Epm_Id='$id'");
	if(mysql_num_rows($qqq)<=0){
	echo '<script>alert("You are not the member of the inventory of the organization")</script>';
						
								}
	else{	
$sql = "insert into user(Aid,user_id,first_name,
father_name,Gender,Photo,account_type,user_name,
password,phone_no,status)
values('$Aid','$id','$fname','$faname','$sex','$photo',
'$account_type','$uname','$pass','$phone',
'$status')";
if(!$fname){
$result="type character for first name";
}else if(!$faname){
$result="type character for father name";
}else if(!$phone){
$result="inter number for phone";
}
	else{
		if(empty($Aid)){
$result="The Armin Id not fill";
				}
	if(empty($fname)){
$result="First name is empty";
				}
else if(empty($id)){
$result="Id is empty";
					}
else if(empty($uname)){
$result="User name is empty";
								}
else if(empty($pass)){
$result="Pass word is empty";
								}											

else if(empty($phone)){
$result="Phone number is empty";
				}
else if($pass != $pass1){
$result='<script>alert("password miss match")</script>';
	}													
else {
$run = mysql_query($sql);
 if ($run){
echo '<script>alert("User successfully Created")</script>';
				}
 else{
echo mysql_error().'<script>alert("something wrong")</script>';
 }
 }
}  
}
}
}
}
?>

<center><h2>Fill the form below to create new users</h2></center>
</br>
<table width="688" height="600" bgcolor="#CCCCCC">
<meta charset="UTF-8">
<form action="Create Account.php" method="post" onsubmit='return formValidation()' enctype="multipart/form-data">
   <tr>
    <td width="332">AID:</td>
    <td width="513"><input type="text" size="23" maxlength="15"name="Aid" /></td>
  </tr>
  <tr>
    <td width="332">First name : </td>
    <td width="513"><input type="text" size="23" maxlength="15"name="fname"id="firstname" placeholder='First Name' /></td>
  </tr>
  <tr>
    <td>Father name : </td>
    <td><input type="text" size="23"maxlength="15"  name="faname" id="lastname" placeholder='Last Name'/></td>
  </tr>
  
  <tr>
    <td>Gender:</td>
<td><input type="radio" name="sex" value="male" />Male
<input type="radio" name="sex" value="female" />Female</td>
  </tr>
  
  <tr>
    <td>Photo : </td>
    <td><input type="file" name="ph" type="image/*"size="23" /></td>
  </tr>
   
  <tr>
    <td>Id number : </td>
    <td><input type="text" size="23" maxlength="7" name="id" /></td>
  </tr>
  <tr>
    <td>User name : </td>
    <td><input type="text" size="23" maxlength="15"name="uname"id="username" placeholder='user Name' /></td>
  </tr>
  <tr>
    <td>Password : </td>
    <td><input type="password"  name="pass" maxlength="8" size="23" id="password" placeholder='Password her'/></td>
  </tr>
  <tr>
    <td>Comfirm Password : </td>
    <td><input type="password" maxlength="8" size="23" name="pass1" id="cpassword" placeholder='Confirem Password her'/></td>
  </tr>
  <tr>
    <td>Account type : </td>
    <td><select name="acc" style="width:195px;">
	    <option>admin</option>
		<option>stock clerk</option>
		<option>Store Head</option>
	
		<option>Stock Keeper</option>
		<option>staff member</option></select></td>
  </tr>
  <tr>
    <td>Phone no : </td>
<td><input type="text" name="phone" maxlength="10" size="23"required pattern="[0-9]{10}" title"Please Enter Only numbers between 10 to 12 for Mobile No"/></td>

  </tr>
    <tr>
    <td>Status : </td>
    <td><select name="status" style="width:195px;">
	    <option>unblocked</option>
		<option>blocked</option>
		</select></td>
  </tr>
  <tr>
    <td ><input type="submit" value="Register"  id="bt"name="sub" Onclick="return check(this.form)/></td>
     <td><input type="button" value="Cancel" name="cancel" id="bt" /></td>
	<td><input type="reset" value="Reset" Reset="res" id="bt" /></td>
  </tr>
  </form>
</table>
<?php echo $result?>
</body>
</html>
