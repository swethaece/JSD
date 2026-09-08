const http=require("http")
http.createServer(function(requestAnimationFrame,res){

    res.end("<h1>Welcome to Node Js</h1>");
}).listen(9887)
console.log("port listening at 9887........")