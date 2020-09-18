<%-- 
    Document   : Pitagoras
    Created on : 11-ago-2020, 16:53:54
    Author     : carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teorema  de Pitagoras</title>
        <style type="text/css">

            body{
                background-image: url(imagenes/fondo.jpg);
            }
            h1{
                color: white;
                font-style: oblique;
                font-family: calibri;
                font-size: 50px;

            }

            p{
                color: white;
                font-size: 25px;
            }
            .button   {
                background-color: #4CAF50; /* Green */
                border: none;
                color: white;
                padding: 16px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                transition-duration: 0.4s;
                cursor: pointer;
            }

            .button1 {
                background-color: white; 
                color: black; 
                border: 2px solid #4CAF50;
            }

            .button1:hover {
                background-color: #4CAF50;
                color: white;
            }

            .button2 {
                background-color: white; 
                color: black; 
                border: 2px solid #008CBA;
            }

            .button2:hover {
                background-color: #008CBA;
                color: white;
            }

            .button3 {
                background-color: white; 
                color: black; 
                border: 2px solid #f44336;
            }

            .button3:hover {
                background-color: #f44336;
                color: white;
            }
            div{
                margin-top: 20px;
            }
        </style>
    </head>
    <body>
    <center>
        <h1>Teorema  de Pitagoras</h1>
        <p>Escoje una operacion:</p>

        <div>
            <a href="Hipotenusa.jsp"><button type="button" class="button button1">Hipotenusa</button> </a>
            <a href="CatetoA.jsp"><button type="button" class="button button3">Cateto A</button> </a>
            <a href="CatetoB.jsp"><button type="button" class="button button2">Cateto B</button> </a>



        </div>

        <div>
            <video src="videos/Teorema de pitagoras.mp4" controls="true" poster="imagenes/teorema.PNG"></video>
        </div>
    </center>

</body>
</html>
