function validate()
{
	var uname=document.valform.uname.value;
	var pword=document.valform.pword.value; 
if(uname==null || uname=="")
{
	alert("invalid username");
	return false;
}
if (pword.length < 8) {
    alert("Your password needs a minimum of eight characters")
    return false;
}
if (pword.search(/[a-z]/) == -1) {
    alert("Your password needs a lower case letter")
    return false;
}
if (pword.search(/[A-Z]/) == -1) {
    alert("Your password needs an uppser case letter")
    return false;
}
if (pword.search(/[0-9]/) == -1) {
    alert("Your password needs a number")
    return false;
}
}
function email(){
var mail=document.valform.mail.value;  
	var atposition=mail.indexOf("@");  
	var dotposition=mail.lastIndexOf("."); 
if(atposition<1 || dotposition<atposition+2 || dotposition+2>=mail.length)
{  
  alert("Please enter a valid e-mail address");  
  return false; 
  }
}