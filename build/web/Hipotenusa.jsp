<%-- 
    Document   : Hipotenusa
    Created on : 11-ago-2020, 2:53:45
    Author     : carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hipotenusa</title>
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
        <h1>Hallar Hipotenusa</h1>
        <div>
           <form action="calhipotenusa" method="post">
               <label>Cateto A:</label>
               <input type="number" name="catetoa" class="b" placeholder="Ingresa el valor" required="true"><br><br>
               <label>Cateto B:</label>
               <input type="number" name="catetob" class="b" placeholder="Ingresa el valor" required="true"><br><br>
               <input type="submit" name="envio" value="Calcular" class="button3">
            
        </form> 
        </div>
    </center>
        
    </body>
</html>
