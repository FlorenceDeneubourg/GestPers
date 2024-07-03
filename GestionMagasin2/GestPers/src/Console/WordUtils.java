package Console;

public class WordUtils {
   
   // Méthode privée pour capitaliser la première lettre et mettre le reste en minuscules
   private static String capitalize(String value) {
      String firstLetter = value.substring(0, 1).toUpperCase();  // Capitalise la première lettre
      String restOfString = value.substring(1).toLowerCase();   // Met le reste en minuscules
      return firstLetter + restOfString;  // Retourne la chaîne capitalisée
   }

   // Méthode privée pour mettre toute la chaîne en minuscules
   private static String minimize(String value) {
      return value.toLowerCase();  // Retourne la chaîne en minuscules
   }

   // Méthode protégée pour mettre en majuscule les parties d'une chaîne en fonction des délimiteurs spécifiques
   protected static String mettreEnMajscule(String inputString) {
      String outString;
      String[] partString;

      // Vérifie s'il y a un apostrophe (')
      if (inputString.indexOf("'") > 0) {
         outString = "";
         partString = inputString.split("'");
         
         for(String part : partString) {
            outString = outString + "'" + capitalize(part);  // Capitalise chaque partie séparée par un apostrophe
         }
      return outString.substring(1);  // Retourne la chaîne sans le premier apostrophe ajouté en trop
      } 
      // Vérifie s'il y a un tiret (-)
      else if (inputString.indexOf("-") > 0) {
         outString = "";
         partString = inputString.split("-");
         
         for(String part : partString) {
            outString = outString + "-" + capitalize(part);  // Capitalise chaque partie séparée par un tiret
         }

         return outString.substring(1);  // Retourne la chaîne sans le premier tiret ajouté en trop
      } 
      // Vérifie s'il y a un espace ( )
      else if (inputString.indexOf(" ") > 0) {
         outString = "";
         partString = inputString.split(" ");
         
         for(String part : partString) {
            outString = outString + " " + capitalize(part);  // Capitalise chaque partie séparée par un espace
         }

         return outString.substring(1);  // Retourne la chaîne sans le premier espace ajouté en trop
      } 
      // Si aucun des délimiteurs spécifiques n'est trouvé, capitalise simplement la chaîne entière
      else {
         return capitalize(inputString);  // Capitalise toute la chaîne
      }
   }

   // Méthode protégée pour mettre en minuscule la partie avant le '@' d'une adresse email
   protected static String mettreEnMinusculeMail(String inputString) {
      String outString = "";
      String[] partString = inputString.split("@");  // Sépare la chaîne à partir du caractère '@'
      
      for(String part : partString) {
         outString = outString + "@" + minimize(part);  // Met en minuscule chaque partie séparée par '@'
      }

      return outString.substring(1);  // Retourne la chaîne sans le premier '@' ajouté en trop
   }
}