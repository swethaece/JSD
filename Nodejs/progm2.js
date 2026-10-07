//callback:synchronous:server waits for other process to complete their execution line by line.
var fs=require("fs")
var data=fs.readFileSync("test.txt")
console.log("answer : "+data.toString())
console.log("program end")