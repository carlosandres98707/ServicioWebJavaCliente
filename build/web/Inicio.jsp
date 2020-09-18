<%-- 
    Document   : Inicio
    Created on : 11-ago-2020, 16:23:11
    Author     : carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <style type="text/css">
            body{
                background-image: url(imagenes/fondo.jpg);
            }
            h1{
                color: white;
                font-family: verdana;
                font-size: 50px;

            }
            h2{
                color: white;
                font-family: cursive;
                font-size: 40px;
            }

            h2:hover{
                color: lightblue;
                cursor: pointer;
            }

            table{
                text-align: center;

            }
            p{
                color: white;
                font-size: 25px;
            }
        </style>
    </head>
    <body>
    <center>

        <h1>¡Bienvenido!</h1>
        <b> <p>Escoje una opcion para calcular:</p></b> 
        <table cellspacing="100" >
            <tr>
                <td><a href="Pitagoras.jsp"><h2>Teorema de Pitagoras</h2> </a></td>
                <td><a href="Prismas.jsp"> <h2>Volumen de Prismas</h2></a></td>
            </tr>
           

        </table>

    </center>
</body>
</html>
