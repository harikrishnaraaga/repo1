<?php
  $servername = "localhost:3307";
  $username = "root";
  $password = "";
  $conn = mysqli_connect($servername, $username, $password);

  if (!$conn) {
      die("Connection failed: " . mysqli_connect_error());
  }
  //echo "Connected successfully";
  if(!mysqli_select_db($conn, 'reg'))
  {
	  echo 'Database not selected';
  }
  $Firstname = $_POST['firstname'];
  $Lastname = $_POST['lastname'];
  $Email = $_POST['email'];
  $Password = $_POST['password'];
  
  $sql = "INSERT INTO user (firstname,lastname,email,password) VALUES ('$Firstname','$Lastname','$Email','$Password')";
  
  if(!mysqli_query($conn,$sql))
  {
	  echo 'Not Inserted';
  }
  else
  {
	  echo 'Inserted';
  }
  header("refresh:2; url=home.html");
?>