<%-- 
    Document   : index
    Created on : 26 avr. 2021, 15:53:51
    Author     : Etudiant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            #mainMenu {
                margin:10px;
                width:900px;
                font-family: sans-serif;
            }
            #mainMenu li {
                display:block;
                width:120px;
                float:left;
                margin-left:2px;
                border:1px solid #000;
            }

            #mainMenu a {
                display:block;
                padding:3px;
                text-decoration:none;
                background-color:#fff;
                color:#009;
            }

            #mainMenu a:hover {
                background-color:#009;
                color:#fff;
            }
        </style>
    </head>
    <body>
            <header>
                <h1 align="center">Index</h1>
            </header>
        <main>
            <nav>
                <ul id="mainMenu">
                    <li><a href="index.html">Home</a></li>
                    <li><a href="ajouterClient.html">Ajouter client</a></li>
                    <li><a href="afficherClients.html">Afficher les clients</a></li>
                    <li><a href="consulterClient.html">Consulter un client</a></li>
                    <li><a href="ajouterCompte.html">Ajouter un compte</a></li>
                    <li><a href="consulterCompte.html">Consulter un compte</a></li>
                    <li><a href="ajouterOperation.html">Ajouter une opération (retrait)</a></li>
                    <li><a href="#">Ajouter une opération (dépôt)</a></li>
                </ul>
            </nav>
        </main>
        
    </body>
</html>

