import React from 'react'

function Swetha(Props) {
  return (
    <div>
      <h1>To create  React components</h1>
      <h1>To create  React components</h1>
      <h1>To create  React components</h1>
      <h2>Candidate Name: {Props.name}</h2>
      <h2>Candidate Age: {Props.age}</h2>
      <table border="3" align="center"><tr><th>subjects</th><th>marks</th></tr>
        {Props.marks.map((item,index)=><tr><td>Subjects: {index + 1}</td><td>{item}</td></tr>)}
      </table>
    </div>
  )
}

export default Swetha