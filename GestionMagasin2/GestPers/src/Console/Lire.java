package Console;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lire {
   private Scanner clavier; // Scanner pour la saisie au clavier

   public Lire() {
      this.clavier = new Scanner(System.in); // Initialise le Scanner avec l'entrée standard
   }

   // Méthode pour saisir du texte avec gestion des exceptions
   protected String SaiseTexte(String libelle) {
      String texte = null;
      System.out.print(libelle); // Affiche le libellé de saisie
      boolean loop = false;

      while (!loop) {
         try {
            texte = this.clavier.nextLine(); // Saisie du texte
            if (texte != null && !texte.isBlank()) { // Vérifie si la saisie n'est pas vide
               loop = true; // Sort de la boucle si la saisie est valide
            } else {
               System.out.println("Aucune valeur introduite !"); // Message en cas de saisie vide
            }
         } catch (NoSuchElementException var5) {
            System.out.println("Erreur, Aucune ligne n'a été trouvée"); // Exception si aucune ligne trouvée
         } catch (IllegalStateException var6) {
            System.out.println("Erreur, le Scanner est fermé"); // Exception si le Scanner est fermé
         }
      }

      return texte; // Retourne le texte saisi
   }

   // Méthode pour saisir un entier avec gestion des exceptions
   protected int saisieInt() {
      boolean valid = false;
      int intValue = 0;

      while (!valid) {
         try {
            String strtValue = this.clavier.nextLine(); // Saisie de la valeur sous forme de chaîne
            intValue = Integer.parseInt(strtValue); // Conversion en entier
            valid = true; // Sort de la boucle si la conversion est réussie
         } catch (NumberFormatException var5) {
            System.out.println("Erreur veuillez saisir un nombre entier !"); // Exception si la conversion échoue
         } catch (NoSuchElementException var6) {
            System.out.println("Saisir un entier, aucune donnée trouvée !"); // Exception si aucune donnée trouvée
         } catch (IllegalStateException var7) {
            System.out.println("Saisir un entier, aucune saisie possible !"); // Exception si aucune saisie possible
         }
      }

      return intValue; // Retourne l'entier saisi
   }

   // Méthode privée pour vider le scanner en cas de problèmes récurrents
   private void vider() {
      try {
         this.clavier.nextLine(); // Vide le scanner en lisant la ligne suivante
      } catch (NoSuchElementException var2) {
         this.vider(); // Appel récursif pour vider en cas d'erreur
         System.out.println("if no line was found "); // Message en cas d'absence de ligne trouvée
      } catch (IllegalStateException var3) {
         this.vider(); // Appel récursif pour vider en cas d'erreur
         System.out.println("if this scanner is closed"); // Message si le scanner est fermé
      }
   }
}
