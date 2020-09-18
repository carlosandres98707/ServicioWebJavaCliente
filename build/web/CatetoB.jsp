<%-- 
    Document   : CatetoB
    Created on : 11-ago-2020, 17:44:35
    Author     : carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cateto B</title>
        <style type="text/css">
               body{
                background-image: url(imagenes/fondo.jpg);
            }
            h1{
                color: white;
                font-family: sans-serif;
                font-size: 50px;

            }
            
            label{
                
                font-family: arial black;
                color: white;
                font-size: 25px;
            }
            .b{
                height: 25px;
                width: 200px;
                font-size: 24px;
                    
            }
            
            .button3{
                border-radius: 12px;
                width: 200px;
                height: 50px;
                background-color: white; 
                color: black; 
                border: 2px solid #21FBF3;
                font-size: 25px;
            }
            .button3:hover{
                background-color: #21FBCF;
                color: white;
                cursor: pointer;
            }
            
            
        </style>
    </head>
    <body>
           <center>
        <h1>Hallar Cateto A</h1>
        <div>
           <form action="calcatetob" method="post">
               <label>Hipotenusa:</label>
               <input type="number" name="hipotenusa" class="b" placeholder="Ingresa el valor" required="true"><br><br>
               <label>Cateto A:</label>
               <input type="number" name="catetoa" class="b" placeholder="Ingresa el valor" required="true"><br><br>
               <input type="submit" name="envio" value="Calcular" class="button3">
            
        </form> 
        </div>
    </center>
    </body>
</html>
