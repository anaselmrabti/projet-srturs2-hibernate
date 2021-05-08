<%-- 
    Document   : insert
    Created on : Apr 25, 2021, 10:17:37 AM
    Author     : anase
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert</title>
        <style type="text/css">
            body{
                text-align: center;
            }
            table{
                border-collapse: collapse;
                margin: 0 auto;
            }
            th,td{padding: 10px;}
            input{padding: 10px;}
            tfoot{text-align: center;}
        </style>
    </head>
    <body>
        <h1 align="center">Ajouter un nv compte</h1>
        <s:if test="sm != null">
            <font color="green">
            <s:property value="sm" />
            </font>
        </s:if>
        <s:if test="em != null">
            <font color="red">
            <s:property value="em" />
            </font>
        </s:if>   
        <s:form method="post" action="addCompte">
            <s:textfield name="compte.codeClient" label="Code compte" />
            <s:textfield name="compte.dateCreation" label="Date de creation" />
            <s:textfield name="compte.solde" label="Solde" />
            <s:submit value="Ajouter"/>

        </s:form>
            <a href="consulterCompte.html">Consulter un compte via son Num</a>
    </body>
</html>
