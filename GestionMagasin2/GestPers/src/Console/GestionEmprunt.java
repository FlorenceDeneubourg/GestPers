package Console;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class GestionEmprunt {
   // Variable statique pour la saisie des entrées utilisateur
   private static Lire saisie = new Lire();

   // Méthode statique pour gérer le magasin
   static void Magasin(Magasin mag) {
      mag.AjouterProduit(); // Ajoute des produits au magasin
      mag.listeMap(); // Affiche la liste des produits du magasin
   }

   // Méthode protégée pour gérer les emprunts
   protected void Emprunt(Magasin mag, ArrayList<Personnel> Person, ArrayList<Emprunt> pret) {
      // Vérifie si la liste du personnel est vide
      if (Person.isEmpty()) {
         System.out.println("Emprunt impossible, pas de personnel !");
      // Vérifie si le magasin est vide
      } else if (mag.isEmpty()) {
         System.out.println("Emprunt impossible, magasin est vide !");
      } else {
         // Ajoute des emprunts à la liste des prêts
         pret.add(new Emprunt(Person.get(0), mag.getProduit("Id_1"), 1));
         pret.add(new Emprunt(Person.get(1), mag.getProduit("Id_3"), 1));
         pret.add(new Emprunt(Person.get(2), mag.getProduit("Id_4"), 1));
         pret.add(new Emprunt(Person.get(3), mag.getProduit("Id_6"), 1));
         pret.add(new Emprunt(Person.get(6), mag.getProduit("Id_7"), 1));
         
         // Itère sur la liste des emprunts et les affiche
         Iterator var4 = pret.iterator();
         while (var4.hasNext()) {
            Emprunt emprunt = (Emprunt) var4.next();
            PrintStream var10000 = System.out;
            String var10001 = String.valueOf(emprunt.getEmprunteur());
            var10000.println(var10001 + "\t" + String.valueOf(emprunt.getMateriel()));
         }
      }
   }

   // Méthode protégée pour gérer le retour des emprunts
   protected void RetourEmprunt(ArrayList<Emprunt> pret) {
      // Vérifie si la liste des emprunts est vide
      if (pret.isEmpty()) {
         System.out.println("Aucun emprunt disponible !");
      } else {
         System.out.println("liste des emprunts");
         int i = 1;

         // Itère sur la liste des emprunts et les affiche avec un numéro
         for (Iterator var3 = pret.iterator(); var3.hasNext(); ++i) {
            Emprunt emprunt = (Emprunt) var3.next();
            System.out.println("N° " + i + " " + emprunt.getEmprunteur().getNom() + "\t" + emprunt.getArticle());
         }

         // Demande à l'utilisateur d'introduire le numéro d'emprunt à annuler
         System.out.println("Introduire le numéro d'emprunt à annuler : ");
         int nuEmprunt = saisie.saisieInt();
         
         // Vérifie si le numéro d'emprunt est valide et supprime l'emprunt correspondant
         if (nuEmprunt > 0 && nuEmprunt <= i - 1) {
            pret.remove(nuEmprunt - 1);
         } else {
            System.out.println("Le numéro d'emprunt indiqué n'existe pas !");
         }

         int y = 1;

         // Affiche la liste mise à jour des emprunts
         for (Iterator var5 = pret.iterator(); var5.hasNext(); ++y) {
            Emprunt emprunt = (Emprunt) var5.next();
            System.out.println("N° " + y + " " + emprunt.getEmprunteur().getNom() + "\t" + emprunt.getArticle());
         }
      }
   }
}
