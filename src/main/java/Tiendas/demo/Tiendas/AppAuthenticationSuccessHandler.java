/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tiendas.demo.Tiendas;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;


public class AppAuthenticationSuccessHandler {
    protected void handle(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException{
    } 
}
