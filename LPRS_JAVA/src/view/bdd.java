package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class bdd {

	public static void main(String[] args) {
		
		// On stock dans des variables l'URL de connexion à la base de données avec les identiﬁants 
		 String url="jdbc:mysql://localhost/gest?serverTimezone=UTC"; 
         String user="root"; 
         String password=""; 
         // Test pour vériﬁer si nous arrivons à nous connecter
         try { 
        	 // On créé une variable cnx de type Connection
        	 // cnx contiendra la connextion à la base de données
                 Connection cnx = DriverManager.getConnection(url, user, password); 
                 System.out.println("Etat de la connexion :"); 
		// Forme ternaire du if. Si la condition à échoué alors on aﬃche « fermé » sinon on aﬃche « ouverte »

                 System.out.println(cnx.isClosed()?"fermée":"ouverte"); 
                 
         }
         // Si on arrive pas à se connetcer on attrape l'erreur pour l'aﬃcher ensuite
         catch (SQLException e) { 
                 System.out.println("Une erreur est survenue lors de la connexion à la base de données"); 
                 e.printStackTrace(); 
         } 

	}

}
