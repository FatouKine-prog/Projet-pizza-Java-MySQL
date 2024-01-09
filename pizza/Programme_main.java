package pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Programme_main {

	public static void main(String[] args) {

      		

				// Information d'acc�s � la base de donn�es

				String url = "jdbc:mysql://localhost/pizzadb?characterEncoding=latin1&useConfigs=maxPerformance";

				String login = "root";
				String passwd = "";

				Connection cn = null;
				Statement st = null;
				ResultSet rs = null;

				// connection to MySQL

			
				
				//COMPOSER
         		ArrayList<Composer> listcomposer = new ArrayList<Composer>();

				try {

					// Etape 1 : Chargement du driver
					Class.forName("com.mysql.jdbc.Driver");

					// Etape 2 : r�cup�ration de la connexion
					cn = DriverManager.getConnection(url, login, passwd);

					// Etape 3 : Cr�ation d'un statement
					st = cn.createStatement();

					
					String sql = "SELECT * FROM  Composer";
				

					// Etape 4 : ex�cution requ�te
					rs = st.executeQuery(sql);

					// Si r�cup donn�es alors �tapes 5 (parcours Resultset)
					//System.out.println(rs);  pour voir si la classe fonctionne

					//composer
					int NROPIZZ= 0;
					String CODEINGR= null;
					String QTECOMP= null;
				
				//	System.out.println("VOICI LA LISTE DES COMPOSANTS DU PIZZA");

					while (rs.next()) {
						
						//composer
						NROPIZZ = rs.getInt(1);
						//System.out.println(NROPIZZ);
						CODEINGR = rs.getString(2);
					    //System.out.println(CODEINGR);
						QTECOMP = rs.getString(3);
					    //System.out.println(QTECOMP);
						
						Composer c1 = new Composer(NROPIZZ, CODEINGR, QTECOMP);
					//	System.out.println(c1);
						
						listcomposer.add(c1);
						
						
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				
			//	System.out.println("********************************************************************");

				
					
				
				//Ingredients
				ArrayList<Ingredient> listingredient = new ArrayList<Ingredient>();

				try {

					// Etape 1 : Chargement du driver
					Class.forName("com.mysql.jdbc.Driver");

					// Etape 2 : r�cup�ration de la connexion
					cn = DriverManager.getConnection(url, login, passwd);

					// Etape 3 : Cr�ation d'un statement
					st = cn.createStatement();

					
					String sql = "SELECT * FROM  Ingredient";
				

					// Etape 4 : ex�cution requ�te
					rs = st.executeQuery(sql);

					// Si r�cup donn�es alors �tapes 5 (parcours Resultset)
				//	System.out.println(rs);  pour voir si la classe fonctionne
				
					//ingredient
					String CODEINGR= null;
					String NOMINGR= null;
					String UNITEINGR= null;
					
				//	System.out.println("VOICI LA LISTE DES INGREDIENTS DE PIZZA:");
					
					
					while (rs.next()) {
						
						//ingredient
						CODEINGR = rs.getString(1);
						//System.out.println(CODEINGR);
						NOMINGR = rs.getString(2);
						//System.out.println(NOMINGR);
						UNITEINGR = rs.getString(3);
						//System.out.println(UNITEINGR);
						
						
						Ingredient i1 = new Ingredient(CODEINGR, NOMINGR, UNITEINGR);
						//System.out.println(i1);

						listingredient.add(i1);
						
						
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
						
			//	System.out.println("********************************************************************");

				
				
				//PIZZA
				ArrayList<Pizza> listpizza = new ArrayList<Pizza>();

				try {

					// Etape 1 : Chargement du driver
					Class.forName("com.mysql.jdbc.Driver");

					// Etape 2 : r�cup�ration de la connexion
					cn = DriverManager.getConnection(url, login, passwd);

					// Etape 3 : Cr�ation d'un statement
					st = cn.createStatement();

					
					String sql = "SELECT * FROM  Pizza";
				

					// Etape 4 : ex�cution requ�te
					rs = st.executeQuery(sql);

					// Si r�cup donn�es alors �tapes 5 (parcours Resultset)
					//System.out.println(rs); pour voir si la classe fonctionne
				
					 //pizza
					int NROPIZZ= 0;
					String DESIGNPIZZ= null;
					double TARIFPIZZ= 0;
					
					System.out.println("VOICI LA LISTE DES PIZZAS:");
					
					while (rs.next()) {
						//pizza
						NROPIZZ = rs.getInt(1);
						//System.out.println(NROPIZZ);
						DESIGNPIZZ = rs.getString(2);
						//System.out.println(DESIGNPIZZ);
						TARIFPIZZ = rs.getDouble(3);
						//System.out.println(TARIFPIZZ);
											
						Pizza p1 = new Pizza(NROPIZZ, DESIGNPIZZ, TARIFPIZZ);
					//	System.out.println(p1);

						listpizza.add(p1);
				
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
	          
				//AFFICHAGE RESULTAT

				 afficherResultat(listpizza, listcomposer, listingredient);
  
	}				
				
	
				private static void afficherResultat(ArrayList<Pizza> listpizza, ArrayList<Composer> listcomposer, ArrayList<Ingredient> listingredient) {
			        for (Pizza pizza : listpizza) {
			            System.out.println("Le pizza " + pizza.getDESIGNPIZZ() +
			                    " coûte " + pizza.getTARIFPIZZ() + " euros et a pour ingrédients:");

			            for (Composer composer : listcomposer) {
			                if (composer.getNROPIZZ() == pizza.getNROPIZZ()) {
			                    Ingredient ingredient = getIngredientById(composer.getCODEINGR(), listingredient);
			                    if (ingredient != null) {
			                        System.out.println("  - " + ingredient.getNOMINGR() +
			                                " en quantité " + composer.getQTECOMP() + ingredient.getUNITEINGR());
			                    }
			                }
			            }

			            System.out.println("--------------------------------------------------------------------");
			        }
			    }

			    private static Ingredient getIngredientById(String codeIngr, ArrayList<Ingredient> listingredient) {
			        for (Ingredient ingredient : listingredient) {
			            if (ingredient.getCODEINGR().equals(codeIngr)) {
			                return ingredient;
			            }
			        }
			        return null;
			    
			} // fin de la fonction main

}// fin de la class programme_main
