import React from 'react'
import Swetha from './Swetha'

function App() {
  var mymarks=[100,99,100,95,100]
  return (
    <div>
      <h1>Welcome To React View Project</h1>
      <p align="justify">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quisquam iste labore perferendis illo voluptas molestiae vel, ex doloremque, sint quaerat ipsum? Praesentium veniam quas fugit explicabo facere molestias vero porro.</p>
      <br></br><br></br>
      <p align="justify">lorem ipsum dolor sit amet consectetur adipisicing elit. Quisquam iste labore perferendis illo voluptas molestiae vel, ex doloremque, sint quaerat ipsum? Praesentium veniam quas fugit explicabo facere molestias vero porro.</p>
      <Swetha  name="Swetha" age="26" marks={mymarks}/>
    </div>
  )
}

export default App