package Console;

public class FixedLenght {
   // Méthode pour ajuster la longueur d'une chaîne de caractères
   protected static String setFixedLength(String source, int longueur) {
      // Ajoute des espaces à la chaîne jusqu'à ce qu'elle atteigne la longueur souhaitée
      while (source.length() < longueur) {
         char espace = ' ';
         source = source + espace;
      }

      return source; // Retourne la chaîne de caractères avec la longueur ajustée
   }
}
