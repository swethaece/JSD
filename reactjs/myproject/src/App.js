import React from 'react'
import axios from 'axios'
import { useState } from 'react'
function App() {
  const[city,setCity]=useState("salem")
  const[result,setResult]=useState(null);
  const cityFun=(Event)=>{
    setCity(Event.target.value)
  }
  const show=()=>{
    const apiurl=`https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=0e894eed4bde14d0fd5cfc651beacab6`
    axios.get(apiurl).then((response)=>{
      setResult(response.data)
      console.log(result)

    })
    //console.log(apiurl)
  }
  return (
    <div>
      <h1><center>Weather Report all over world</center></h1>
      <h1><center>By using entering city name</center></h1>
      <h2><center>Developed by G.P.Swetha B.E.</center></h2>
      <hr size="2"  color="grey"></hr>
      <input type="text" value={city} onChange={(e)=>cityFun(e)} name="city" placeholder='Enter city Name'></input>
      <input type="button" value="Find Weather Report" onClick={show}></input>
      <hr size="2" color="grey"></hr>
    </div>
  )
}

export default App

/*import React from 'react'
export default function App(props) {
  return (
    <div>
      <h1>JSON with array Handling and also check null </h1>
       <h2>rollnumber: {props.data.rno}</h2>
      <h2>name: {props.data.sname}</h2>
      <h2>mark 1:{props.data.mark[0]}</h2>
      <h2>mark 2:{props.data.mark[1]}</h2>
      <h2>mark 3:{props.data.mark[2]}</h2>
      <h2>Result:{(props.data.marks[0]>34 && props.data.marks[1]>34 && props.data.mark[2]>34)?"Pass" : "Fail"}</h2>
    </div>
  )
}
*/
/*import React from 'react'

export default function App(props) {
  var arr=[]
  for(var k in props.data)
  {
    arr.push(k)
  }
  return (
    <div>
      <h1>Props using JSON data</h1>
      <h2>Student rollnumber :{props.data.rno}</h2>
      <h2>Student name: {props.data.sname}</h2>
      <h2>Student mark: {props.data.mark}</h2>
      <h2>Student Result: {props.data.result}</h2>
      <h2>Student Eligible to study: {props.data.iseligible?"eligible":"not eligible"}</h2>

      <h2>---------------------------------------------------------------------------------</h2>
      {arr.map((v)=><h2>{v} : &gt;{props.data[v]} </h2>)}
      <h2>---------------------------------------------------------------------------------</h2>
      {arr.map((v)=><h2>{v}---&gt; {(props.data[v]===true && "Eligible")
      ||( props.data[v]===false && "Not Eligible") || props.data[v]}</h2>)}
        
    </div>
  )
}
*/
/*import React from 'react'

export default function App(props) {
  return (
    <div>
      <h1>Props using Array</h1> 
      Test first Mar:k:{props.data[0]}
      <br></br>
      {props.data.map((item,index)=><><br></br>marks :{index+1} = {item}</>)}
    </div>
  )
}
*/
/*import React from 'react'

function App(props) {
  return (
    <div>
      <h1>props: properties</h1>
      <h2>share data from one component to another component</h2>
      <h2>Yor Name:{props.data}</h2>
    </div>
  )
}
export default App;*/
/*import React from 'react'
 function App() {
  var stud={
    sno:1001,
    sname:'swetha',
    mark:{
      tamil:99,
      english:99,
      maths:100,
      science:100,
      social:100
    },
    rank:1,
   result:"pass"
  }
  return (
    <div>
      <h1>JSON</h1>
      <h2>student number:{stud.sno}</h2>
      <h2>student name:{stud.sname}</h2>
      <h2>student tamil mark:{stud.mark["tamil"]}</h2>
      <h2>student english mark:{stud.mark["english"]}</h2>
      <h2>student maths mark:{stud.mark["maths"]}</h2>
      <h2>student science mark:{stud.mark["science"]}</h2>
      <h2>student social mark:{stud.mark["social"]}</h2>
      <h2>student rank:{stud.rank}</h2>
      <h2>student.result:{stud.result}</h2>
    </div>
  )
}
export default App;*/
/*import React from 'react'
 function App() {
  var arr=[11,22,33,44,55,100,77,88,99,153,122,-99];
  var big=arr[0];
  var small=arr[0];
  return (
    <div>
      <h1>Array Demo</h1>
      {arr.map((item)=>item)}
      <br></br>
      {arr.map((item)=><> {item} </>)}
      {arr.map((item)=><><br></br>{item}</>)}

      <ol type="A">
        {arr.map((v)=><li>{v}</li>)}
      </ol>

      <div style={{display:"none"}}>
        {arr.map((v)=><>{big<v && <>{big=v}</>}</>)}
        {arr.map((v)=><>{small>v && <>{small=v}</>}</>)}
      </div>

      <h1>Biggest Number: {big}</h1>
      <h1>Smallest Number: {small}</h1>
    </div>

  )
}
export default App;*/
/*import React from 'react'

function App() {
  var arr=[11,22,33,44,55,66];
  return (
    <div>
      <h1>ARRAY DEMO</h1>
      <h2>array value index : 0 : {arr[0]}</h2>
      <h2>array value index : 1 : {arr[1]}</h2>
      <h2>array value index : 2 : {arr[2]}</h2>
      <h2>array value index : 3 : {arr[3]}</h2>
      <h2>array value index : 4 : {arr[4]}</h2>
      <h2>array value index : 5 : {arr[5]}</h2>
    </div>
  )
}
export default App;*/
/*import React from 'react'

function App(){
  var avg=85;
  var res="fail";
  return (
    <div>
      <h1>NESTED IF CONDITION:</h1>
      <h2> Your Grade is {(res==="pass" && ((avg>=85 && "Outstanding") || 
                          (avg>=75 && "Excellent") || (avg>=65 && "Very good") ||
                          (avg>=55 && "Good") || "Fair"))|| "No Grade" }</h2>
    </div>
  )
}
export default App;*/
/*import React from 'react'

function App(){
  var avg=85;
  return (
    <div>w
      <h1>Grade System:</h1>
      <h2> Your Grade is {((avg>=85 && "Outstanding") || 
                          (avg>=75 && "Excellent") || (avg>=65 && "Very good") ||
                          (avg>=55 && "Good")) || "Fair" }</h2>
    </div>
  )
}
export default App;*/
/*import React from 'react'

function App() {
  var n=12;
  return (
    <div>
      <h1>3.If else If Statement or Else If Ladder</h1>
      <h2>The  Given Number {n} is: {(n>0 && "Positive") || (n<0 && "Negative") || "Zero"}</h2>
    </div>
  )
}
export default App;*/
/*import React from 'react'
function App(){
  var n=2028;
  return(
    <div>
      <h1>Given Year is Leap or Not:</h1>
      <h2>Number: {n}</h2>
      <h2>The Given year is  {( n%4===0 && "Leap") || "Not Leap"}</h2>
    </div>
  )
}
export default App;*/
/*import React from 'react'
function App(){
  var n=50;
  return(
    <div>
      <h1>Given Number is Even Or Odd:</h1>
      <h2>Number: {n}</h2>
      <h2>The Given Number is: {( n%2===0 && "Even") || "Odd"}</h2>
    </div>
  )
}
export default App;*/
/*import React from 'react'
function App(){
  var n1=50;
  var n2=30;
  return(
    <div>
      <h1>Greatest Among Two Numbers:</h1>
      <h2>Number one: {n1}</h2>
      <h2>Number Two: {n2}</h2>
      <h2>The Greatest Number is: {( n1>n2 && n1) || n2}</h2>
    </div>
  )
}
export default App;*/
//Title : IF ELSE control statements
/*import React from 'react'
function App(){
  var mark=50;
  return(
    <div>
      <h1>Mark: {mark}</h1>
      <h2>2.IF Else Statement Results:</h2>
      <h2>{(mark>34 && "PASS") || "FAIL"}</h2>
    </div>
  )
}
export default App;*/
/*import React from 'react'
function App(){
  var mark=80;
  return(
    <div>
      <h1>Mark: {mark}</h1>
      <h2>1.Simple IF Statement Results:</h2>
      <h2>{mark>34 && "PASS"}</h2>
      <h2>{mark<=34 && "FAIL"}</h2>
    </div>
  )
}
export default App;*/
//Title: Images Display
/*import './App.css'
import React from 'react'
import myimg from './images/lotus.jpg'
function App() {
  return (
    <div align="center">
      <img src={myimg} width="90%" alt="not found"></img>
    </div>
  )
}
export default App;
// TITLE: REACT EXPRESS
/*var App=()=>{
  var a=10
  var b=20
  var c=30
  return(
    <>
    <h1>Addition of Two Numbers</h1>
    <h2>A value:{a}</h2>
    <h2>B value:{b}</h2>
    <h2>C value:{c}</h2>
    <h2>Total value:{a+b+c}</h2>
    </>
  )
}
export default App;*/
/*import React from "react";
class App extends React.Component{
  render(){
    return(
      <>
      <h1>Welcome to class Components</h1>
      <h1>Welcome to class Components</h1>
      <h1>Welcome to class Components</h1>
      </>
    )
  }
}
export default App;*/
/* function App()
 {  
return(
    <>
    <h1>Welcome to react js</h1>
     <h2>Welcome To React js</h2>
     <h3>Welcome to react js</h3>
    </>
  )
 }
export default App;*/
/*import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;*/
