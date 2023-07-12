function clearErrors(){

    errors = document.getElementsByClassName('formerror');
        for(let item of errors)
        {
            item.innerHTML = "";
        }


}
function seterror(id,error){
        element=document.getElementById(id);
        element.getElementsByClassName('formerror')[0].innerHTML=error;

}
//clear errors

function validation(){
    var returnval=true;
    clearErrors();
    // if validation false retun the value false
    var name=document.forms["myform"]["fname"].value;
    console.log(name);
    if(name.length<5){
        seterror("name","*Length of name is too short");
        returnval=false;
    }
    // /email validation
    var email=document.forms["myform"]["email"].value;
    if(email.length>40){
        seterror("email","*Email length is too long")
        returnval=false;
    }
    //phone number validation
    var phone=document.forms["myform"]["phone"].value;
    if(phone.length!=10){
        seterror("phone","*Invalid phone number")
        returnval=false;
        
    }
    //password validation
        var password=document.forms["myform"]["fpass"].value;
        if(password.length<8){
            seterror("password","*Invalid password");
            returnval=false;
        }
   // confirm password validation
   var confirmPassword=document.forms["myform"]["cpass"].value;
        if(confirmPassword!=password){
            seterror("confirmPassword","*password doesn't match");
            returnval=false;
        }

    return returnval;
    
}