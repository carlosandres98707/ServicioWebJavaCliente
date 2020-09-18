<%-- 
    Document   : Prisma Triangular
    Created on : 11-ago-2020, 18:19:56
    Author     : carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prisma Triangular</title>
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
        <h1>Volumen Prisma Triangular</h1>
        <div>
           <form action="caltriangulo" method="post">
               <label>Base:</label>
               <input type="number" name="base" class="b" placeholder="cm2" required="true"><br><br>
               <label>Altura:</label>
               <input type="number" name="altura" class="b" placeholder="cm2" required="true"><br><br>
               <label>Altura Cuerpo:</label>
               <input type="number" name="alturacuerpo" class="b" placeholder="cm2" required="true"><br><br>
               <input type="submit" name="envio" value="Calcular" class="button3">
            
        </form> 
        </div>
    </center>
    </body>
</html>
