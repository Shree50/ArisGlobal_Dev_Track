<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Output Page</title>
<style>
Body {
  font-family: Calibri, Helvetica, sans-serif;
  background-color: pink;
}
button { 
       background-color: #4CAF50; 
       width: 100%;
        color: orange; 
        padding: 15px; 
        margin: 10px 0px; 
        border: none; 
        cursor: pointer; 
         } 
 form { 
        border: 3px solid #f1f1f1; 
    } 
 input[type=text], input[type=number1] { 
        width: 100%; 
        margin: 8px 0;
        padding: 12px 20px; 
        display: inline-block; 
        border: 2px solid green; 
        box-sizing: border-box; 
    }
 button:hover { 
        opacity: 0.7; 
    } 
  .cancelbtn { 
        width: auto; 
        padding: 10px 18px;
        margin: 10px 5px;
    } 
      
   
 .container { 
        padding: 25px; 
        background-color: lightblue;
    } 
</style> 
</head>
<body>
<h1>Addition Output</h1>
<table>
 <tr>
  <th>Number 1 :</th>
  <th><%=request.getAttribute("number1") %></th>
 </tr>
  <th>Number 2 :</th>
  <th><%=request.getAttribute("number2") %></th>
 </tr>
 
   <th>Result :</th>
  <th>
  <% 
  
  String no1=request.getAttribute("number1").toString();
  String no2=request.getAttribute("number2").toString();
  out.println(Integer.parseInt(no1)+Integer.parseInt(no2));
  
  %></th>
 </tr>
</table>

</body>
</html>