var exp=require("express")
var app=new exp()
var usr,pwd;
//get method api

app.get("/testfun",(request,response)=>{

    usr=request.query.un;
    pwd=request.query.pw;

    //response.send("<h1>Welcome To Express JS</h1>")
    response.write("<h1>user name:"+usr+"</h1>");
    response.write("<h1>password:"+pwd+"</h1>");
    if(usr==="admin" && pwd==="admin@123")
    {
        response.write("<font color='green' size='7'>Valid user</font>");
    }
    else
    {
         response.write("<font color='red' size='7'>INValid user!!</font>");
    }
    response.end()

}).listen(8991)

console.log("port listening at 8991.....")