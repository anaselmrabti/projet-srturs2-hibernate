<%-- 
    Document   : index
    Created on : Apr 24, 2021, 1:16:59 AM
    Author     : anase
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Page</title>
        <style type="text/css">
            table{
                border-collapse: collapse;
                margin: 0 auto;
            }
            th,td{padding: 10px;}
            tfoot{text-align: center;}
        </style>
    </head>
    <body>
        <h1 align="center">List des client</h1>
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
        <table border="1">
            <thead>
                <tr>
                    <th>Code client</th>
                    <th>Nom client</th>
                    <th>Adresse client</th>
                </tr>
            </thead>
            <tbody>
                <s:iterator value="clientList">
                    <tr>
                        <td><s:property value="codeClient"/></td>
                        <td><s:property value="nomClient"/></td>
                        <td><s:property value="adresseClient"/></td>
                    </tr>
                </s:iterator>
            </tbody>
            <tfoot>
                <tr>
                    <td colspan="3"><a href="ajouterClient.html">Ajouter un nv client</a>
                        <br/>
                        <a href="consulterClient.html">Consulter un client via son code</a>
                    </td>
                </tr>

            </tfoot>
        </table>
    </body>
</html>
