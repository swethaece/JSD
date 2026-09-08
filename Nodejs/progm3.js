//callback : asynchronous : server never waits other process and running in background
var fs=require("fs")
fs.readFile("test.txt",(err,res)=>{

    if(err)
    {
        console.log("Error:"+err.toString())
    }
    else{
        console.log(res.toString())
    }
})
console.log("program end")