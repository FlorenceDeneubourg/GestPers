package Console;

import java.util.ArrayList;
import java.util.Iterator;

public class AffichagePers {
   
   // Méthode pour afficher la liste de tout le personnel
   protected void AffichageListe(ArrayList<Personnel> Person) {
      // Vérifie si la liste est vide
      if (Person.isEmpty()) {
         System.out.println("Affichage impossible, pas de personnel !");
      } else {
         // Affiche les en-têtes du tableau
         System.out.println("+-----------------------+-------------------+--------------------+--------+--------------+-------------------------+");
         System.out.println("| Département           | Prénom            | Nom                | Sexe   | Naissance    | Email                   |");
         System.out.println("+-----------------------+-------------------+--------------------+--------+--------------+-------------------------+");
         
         // Utilise StringBuilder pour construire la chaîne de caractères
         StringBuilder sb = new StringBuilder();
         
         // Utilise un itérateur pour parcourir la liste du personnel
         Iterator<Personnel> iterator = Person.iterator();

         while (iterator.hasNext()) {
            Personnel Pers = iterator.next();
            // Vérifie si le membre du personnel est actif
            if (Pers.isActif()) {
               // Ajoute les informations formatées au StringBuilder
               sb.append(" ");
               sb.append(FixedLenght.setFixedLength(Pers.getDepartement(), 25));
               sb.append(FixedLenght.setFixedLength(Pers.getPrenom(), 20));
               sb.append(FixedLenght.setFixedLength(Pers.getNom(), 20));
               sb.append(FixedLenght.setFixedLength(Pers.getSexe(), 10));
               sb.append(FixedLenght.setFixedLength(Pers.getDateddMMyyyy(), 15));
               sb.append(FixedLenght.setFixedLength(Pers.getEmail(), 25));
               sb.append("\n");
            }
         }
         // Affiche la chaîne de caractères construite
         System.out.println(sb.toString());
      }
   }

   // Méthode pour afficher les informations d'une seule personne
   protected void AffichageUnePersonne(Personnel pers) {
      // Vérifie si l'objet Personnel est null
      if (pers == null) {
         System.out.println("Affichage impossible, pas de personnel !");
      } else {
         // Affiche les en-têtes du tableau
         System.out.println("+-----------------------+-------------------+--------------------+--------+--------------+-------------------------+");
         System.out.println("| Département           | Prénom            | Nom                | Sexe   | Naissance    | Email                   |");
         System.out.println("+-----------------------+-------------------+--------------------+--------+--------------+-------------------------+");
         
         // Utilise StringBuilder pour construire la chaîne de caractères
         StringBuilder sb = new StringBuilder();
         
         // Ajoute les informations formatées au StringBuilder
         sb.append(" ");
         sb.append(FixedLenght.setFixedLength(pers.getDepartement(), 25));
         sb.append(FixedLenght.setFixedLength(pers.getPrenom(), 20));
         sb.append(FixedLenght.setFixedLength(pers.getNom(), 20));
         sb.append(FixedLenght.setFixedLength(pers.getSexe(), 10));
         sb.append(FixedLenght.setFixedLength(pers.getDateddMMyyyy(), 15));
         sb.append(FixedLenght.setFixedLength(pers.getEmail(), 25));
         sb.append("\n");
         
         // Affiche la chaîne de caractères construite
         System.out.println(sb.toString());
      }
   }
}
