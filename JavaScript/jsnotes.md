Difference between var,let and const:
------------------------------------

var& let ---------> we can change the value
const    ---------> we can't change the value

var: ----------> global scope
let & const ----> local scope

InnerHtml:
----------

Purpose: do not hide html form element

Syntax:
------
    document.getElementById("id).innerHTML=youroutput0


Nested loop
===========
    for(var i=1;i<=5;i++)
    {
        for(var j=1;j<=5;j++)
        {
            document.write(" "+i+j);
        }
        document.write("<br>");
    }

    output:
        11 12 13 14 15
        21 22 23 24 25
        31 32 33 34 35
        41 42 43 44 45
        51 52 53 54 55

Normal Function
---------------

    function functionname()
    {
        -------------------
    }


ARROW FUNCTION:
---------------

var/let/const functionname=()=>
{
    -------------
}
ex:
    var disc=()=>{

    }

 Arrow Functon With Parameters/ With Arguments:
----------------------------------------------

ex:
var disc=(a,b,c)=>{    //inside function data will pass like a,b,c
    tot=a+b+c;
    alert(tot);
}
