package Console;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Magasin {
   static Map<String, Produit> produits; // Déclaration de la map de produits

   public Magasin() {
      produits = new HashMap(); // Initialisation de la map de produits dans le constructeur
   }

   // Méthode pour ajouter des produits prédéfinis dans le magasin
   public void AjouterProduit() {
      produits.put("Id_1", new Produit("HP", "Elitebook 850 G7"));
      produits.put("Id_2", new Produit("HP", "Elitebook 830 G7 X360"));
      produits.put("Id_3", new Produit("Dell", "Inspiron 15 3000"));
      produits.put("Id_4", new Produit("Dell", "XPS 13"));
      produits.put("Id_5", new Produit("Dell", "XPS 15"));
      produits.put("Id_6", new Produit("Lenovo", "Thinkpad E15 G2"));
      produits.put("Id_7", new Produit("Lenovo", "IdeaPad 3 14IIL05 81WD00B2MH"));
   }

   // Méthode pour afficher la liste des produits du magasin
   public void listeMap() {
      System.out.println("le magasin est composé de " + produits.size() + " articles"); // Affiche le nombre d'articles dans le magasin
      Iterator var1 = produits.entrySet().iterator();

      while(var1.hasNext()) {
         Entry iterable = (Entry)var1.next();
         PrintStream var10000 = System.out;
         String var10001 = String.valueOf(iterable.getKey());
         var10000.println(var10001 + " --- " + String.valueOf(iterable.getValue())); // Affiche chaque clé et valeur de la map
      }
   }

   // Méthode pour obtenir un produit à partir de son nom
   public Produit getProduit(String nom) {
      return produits.containsKey(nom) ? (Produit)produits.get(nom) : null; // Retourne le produit correspondant au nom ou null s'il n'existe pas
   }

   // Méthode pour vérifier si le magasin est vide
   public boolean isEmpty() {
      return produits.isEmpty(); // Retourne true si la map de produits est vide, sinon false
   }
}
