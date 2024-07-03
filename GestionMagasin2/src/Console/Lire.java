package Console;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lire {
   private Scanner clavier;

   public Lire() {
      this.clavier = new Scanner(System.in);
   }

   protected String SaiseTexte(String libelle) {
      String texte = null;
      System.out.print(libelle);
      boolean loop = false;

      while(!loop) {
         try {
            texte = this.clavier.nextLine();
            if (texte != null && !texte.isBlank()) {
               loop = true;
            } else {
               System.out.println("Aucune valeur introduite !");
            }
         } catch (NoSuchElementException var5) {
            System.out.println("Erreur, Aucune ligne n'a été trouvée");
         } catch (IllegalStateException var6) {
            System.out.println("Erreur, le Scanner est fermé");
         }
      }

      return texte;
   }

   protected int saisieInt() {
      boolean valid = false;
      int intValue = 0;

      while(!valid) {
         try {
            String strtValue = this.clavier.nextLine();
            intValue = Integer.parseInt(strtValue);
            valid = true;
         } catch (NumberFormatException var5) {
            System.out.println("Erreur veuillez saisir un nombre entier !");
         } catch (NoSuchElementException var6) {
            System.out.println("Saisir un entier, aucune donnée trouvée !");
         } catch (IllegalStateException var7) {
            System.out.println("Saisir un entier, aucune saisie possible !");
         }
      }

      return intValue;
   }

   private void vider() {
      try {
         this.clavier.nextLine();
      } catch (NoSuchElementException var2) {
         this.vider();
         System.out.println("if no line was found ");
      } catch (IllegalStateException var3) {
         this.vider();
         System.out.println("if this scanner is closed");
      }

   }
}