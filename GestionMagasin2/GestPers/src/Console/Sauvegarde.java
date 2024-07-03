package Console;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Sauvegarde {

   // Méthode pour effectuer la sauvegarde des données dans un fichier texte
   protected void Sauvegarde(ArrayList<Personnel> Person, ArrayList<Emprunt> pret) {
      // Demande à l'utilisateur de saisir le nom du fichier de sauvegarde avec extension .txt
      System.out.println("Introduire le nom du fichier extension .txt ! ");
      String fichier = InputData.inputNomFichier();  // Supposons qu'il s'agit d'une méthode pour récupérer le nom du fichier

      try {
         // Création d'un BufferedWriter pour écrire dans le fichier
         BufferedWriter bufWriter = new BufferedWriter(new FileWriter(new File(fichier), true));

         try {
            // Récupération de la date et heure actuelles
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
            String formattedDate = sdf.format(date);

            // Écriture de la date de la sauvegarde dans le fichier
            bufWriter.newLine();
            bufWriter.write("DTG de la sauvegarde : " + formattedDate);
            bufWriter.newLine();

            // Écriture d'une ligne de séparation dans le fichier
            bufWriter.write("+---------------------------+-------------------+--------------------+----------+--------------+--------------------------+");
            bufWriter.newLine();
            bufWriter.write("| Département               | Prénom            | Nom                |   Sexe   | Naissance    |  Email                   |");
            bufWriter.newLine();
            bufWriter.write("+---------------------------+-------------------+--------------------+----------+--------------+--------------------------+");
            bufWriter.newLine();

            // Construction des lignes de données pour chaque personnel dans la liste
            StringBuilder sb = new StringBuilder();
            Iterator<Personnel> iteratorPerson = Person.iterator();

            while(iteratorPerson.hasNext()) {
               Personnel Pers = iteratorPerson.next();
               sb.append(" ");
               sb.append(FixedLenght.setFixedLength(Pers.getDepartement(), 25));  // Supposons que FixedLenght.setFixedLength() est une méthode pour formater la longueur fixe des chaînes
               sb.append(FixedLenght.setFixedLength(Pers.getPrenom(), 20));
               sb.append(FixedLenght.setFixedLength(Pers.getNom(), 20));
               sb.append(FixedLenght.setFixedLength(Pers.getSexe(), 10));
               sb.append(FixedLenght.setFixedLength(Pers.getDateddMMyyyy(), 15));
               sb.append(FixedLenght.setFixedLength(Pers.getEmail(), 25));
               sb.append("\n");
            }

// Écriture des données du personnel dans le fichier
            bufWriter.write(sb.toString());
            bufWriter.newLine();
            bufWriter.newLine();

            // Écriture d'une ligne de séparation pour les données d'emprunt
            bufWriter.write("+------+-------------------------+----------------------------------------+");
            bufWriter.newLine();
            bufWriter.write("| N°   | Nom - Prénom            | Matèriel                               |");
            bufWriter.newLine();
            bufWriter.write("+------+-------------------------+----------------------------------------+");
            bufWriter.newLine();

            // Construction des lignes de données pour chaque emprunt dans la liste
            StringBuilder sb1 = new StringBuilder();
            int i = 1;
            Iterator<Emprunt> iteratorEmprunt = pret.iterator();

            while(iteratorEmprunt.hasNext()) {
               Emprunt emprunt = iteratorEmprunt.next();
               sb1.append(" ");
               sb1.append(FixedLenght.setFixedLength(String.valueOf(i), 8));
               sb1.append(FixedLenght.setFixedLength(emprunt.getEmprunteur().getNom() + " " + emprunt.getEmprunteur().getPrenom(), 26));
               sb1.append(FixedLenght.setFixedLength(emprunt.getArticle(), 30));
               sb1.append("\n");
               i++;
            }

            // Écriture des données d'emprunt dans le fichier
            bufWriter.write(sb1.toString());
         } catch (Throwable var14) {
            // Fermeture du BufferedWriter en cas d'exception
            try {
               bufWriter.close();
            } catch (Throwable var13) {
               var14.addSuppressed(var13);
            }

            throw var14;
         }

         // Fermeture du BufferedWriter après avoir écrit toutes les données avec succès
         bufWriter.close();
      } catch (IOException var15) {
         // Gestion des erreurs d'entrée/sortie en cas de problème lors de l'écriture dans le fichier
         System.err.println("Une erreur est survenue : " + var15.getMessage());
      }
   }
}