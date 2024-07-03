package Console;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControleSaisie {
   // Définition des motifs regex pour les différents types de validations
   private static final String EMAIL_PATTERN = "^[\\w_+&*-]+(?:\\.[\\w_+&*-]+)*@(?:[\\w-]+\\.)+[\\w]{2,7}$";
   private static Pattern patternEmail = Pattern.compile(EMAIL_PATTERN);
   
   private static final String NAME_PATTERN = "^([ \\u00c0-\\u01ffa-zA-Z'\\-])+$";
   private static Pattern patternNom = Pattern.compile(NAME_PATTERN);
   
   private static final String DATE_PATTERN = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/((19|2[0-9])[0-9]{2})$";
   private static Pattern patternDate = Pattern.compile(DATE_PATTERN);
   
   private static final String DEPT_PATTERN = "^([1-4]{1})$";
   private static Pattern patternDept = Pattern.compile(DEPT_PATTERN);

   // Méthode pour valider un nom selon un motif et une taille maximale
   public static boolean valideNom(String text, int taille) {
      String nullString = null;
      String vide = new String();
      boolean estNull = text.equals(nullString); // Vérifie si le texte est null
      boolean estVide = text.equals(vide); // Vérifie si le texte est vide
      
      // Si le texte n'est ni null ni vide
      if (!estNull && !estVide) {
         Matcher matcher = patternNom.matcher(text); // Applique le motif regex pour les noms
         // Vérifie si le texte correspond au motif et sa longueur est inférieure ou égale à la taille spécifiée
         if (matcher.matches() && text.length() <= taille) {
            return true;
         } else {
            System.out.println("Valeur hors contraintes !");
            return false;
         }
      } else {
         System.out.println("Valeur null ou vide !");
         return false;
      }
   }

   // Méthode pour valider si le nom de fichier est valide
   public static boolean valideNomFichier(String file) {
      File fichier = new File(file);
      boolean isValid = true;

      try {
         // Essaie de créer un nouveau fichier et de le supprimer immédiatement après
         if (fichier.createNewFile()) {
            fichier.delete();
         }
      } catch (IOException var4) {
         isValid = false; // Si une exception est levée, le fichier n'est pas valide
      }

      return isValid;
   }

   // Méthode pour valider une adresse email
   public static boolean valideEmail(String hex) {
      Matcher matcher = patternEmail.matcher(hex);
      return matcher.matches(); // Retourne vrai si l'email correspond au motif
   }

   // Méthode pour valider une réponse oui/non (o/n)
   protected static boolean oui_non(String result) {
      return result.trim().equals("o") || result.trim().equals("n");
   }

   // Méthode pour valider une réponse un/deux (1/2)
   protected static boolean un_deux(String result) {
      return result.trim().equals("1") || result.trim().equals("2");
   }

   // Méthode pour valider une date
   public static boolean valideDate(String hex) {
      Matcher matcher = patternDate.matcher(hex);
      return matcher.matches(); // Retourne vrai si la date correspond au motif
   }

   // Méthode pour valider un département
   public static boolean valideDept(String hex) {
      Matcher matcher = patternDept.matcher(hex);
      return matcher.matches(); // Retourne vrai si le département correspond au motif
   }
}
