package Console;

public class InputData {
   private static Lire saisie = new Lire(); // Instance de la classe Lire pour la saisie

   // Méthode pour saisir le nom ou le prénom avec validation de la longueur maximale
   protected static String inputNomPrenom(String libelle, int tailleNom) {
      boolean arret = false; // Booléen pour contrôler la boucle

      String result;
      for(result = null; !arret; arret = false) { // Boucle de saisie jusqu'à ce que la saisie soit valide
         if (libelle.equals("nom")) {
            result = saisie.SaiseTexte("Veuillez introduire le nom : "); // Saisie du nom
         } else {
            result = saisie.SaiseTexte("Veuillez introduire le prénom : "); // Saisie du prénom
         }

         if (ControleSaisie.valideNom(result, tailleNom)) { // Validation du nom ou prénom saisi
            return result; // Retourne le résultat si valide
         }

         System.out.print("Erreur de saisie !  "); // Message en cas de saisie invalide
      }

      return result; // Retourne le résultat
   }

   // Méthode pour saisir une adresse e-mail avec validation
   protected static String inputEmail() {
      boolean arret = false; // Booléen pour contrôler la boucle

      String email;
      for(email = null; !arret; arret = false) { // Boucle de saisie jusqu'à ce que l'e-mail soit valide
         email = saisie.SaiseTexte("Veuillez introduire l'adresse mail : "); // Saisie de l'adresse e-mail
         if (ControleSaisie.valideEmail(email)) { // Validation de l'adresse e-mail
            return email; // Retourne l'e-mail si valide
         }

         System.out.print("Saisie non valide !  "); // Message en cas de saisie invalide
      }

      return email; // Retourne l'e-mail
   }

   // Méthode pour saisir un nom de fichier avec validation du chemin
   protected static String inputNomFichier() {
      boolean arret = false; // Booléen pour contrôler la boucle

      String result;
      for(result = null; !arret; arret = false) { // Boucle de saisie jusqu'à ce que le nom de fichier soit valide
         result = saisie.SaiseTexte(" "); // Saisie du nom de fichier
         if (ControleSaisie.valideNomFichier("./Fichier/" + result)) { // Validation du nom de fichier avec chemin
            return "./Fichier/" + result; // Retourne le chemin complet si valide
         }

         System.out.print("Saisie non valide !  "); // Message en cas de saisie invalide
      }

      return "./Fichier/" + result; // Retourne le chemin complet du fichier
   }

   // Méthode pour confirmer une suppression avec validation de la réponse
   protected static boolean suppression() {
      boolean arret = false; // Booléen pour contrôler la boucle
      boolean result = false; // Résultat de la confirmation de suppression

      while(!arret) { // Boucle de saisie jusqu'à ce que la réponse soit valide
         String texte = saisie.SaiseTexte("Voulez-vous valider la suppression ? o/n "); // Saisie de la confirmation
         if (ControleSaisie.oui_non(texte)) { // Validation de la réponse (oui ou non)
            result = true; // Confirme la suppression
            arret = true; // Termine la boucle
         } else {
            System.out.print("Erreur de saisie !  "); // Message en cas de réponse invalide
         }
      }

      return result; // Retourne true si la suppression est confirmée, sinon false
   }

   // Méthode pour saisir le sexe avec validation du choix
   protected static String inputSexe() {
      boolean arret = false; // Booléen pour contrôler la boucle
      String texte = ""; // Texte pour le choix du sexe

      while(!arret) { // Boucle de saisie jusqu'à ce que le choix soit valide
         texte = saisie.SaiseTexte("Veuillez introduire 1. pour une FEMME ou 2. pour un HOMME : "); // Saisie du choix
         if (ControleSaisie.un_deux(texte)) { // Validation du choix (1 pour femme, 2 pour homme)
            arret = true; // Termine la boucle
         } else {
            System.out.print("Erreur de saisie !  "); // Message en cas de choix invalide
         }
      }

      return texte; // Retourne le choix (1 ou 2)
   }

   // Méthode pour saisir le département avec validation du choix
   protected static String InputDepartement() {
      boolean arret = false; // Booléen pour contrôler la boucle
      String texte = ""; // Texte pour le choix du département

      while(!arret) { // Boucle de saisie jusqu'à ce que le choix soit valide
         System.out.println("Département : ");
         System.out.println("Pour la comptabilité, \t\t\ttapez 1 ");
         System.out.println("Pour les ressources humaines, \ttapez 2 ");
         System.out.println("Pour la production, \t\t\ttapez 3");
         System.out.println("Pour la sécurité, \t\t\t\ttapez 4");
         texte = saisie.SaiseTexte("Veuillez introduire votre choix : "); // Saisie du choix du département
         if (ControleSaisie.valideDept(texte)) { // Validation du choix du département
            arret = true; // Termine la boucle
         } else {
            System.out.print("Erreur de saisie !  "); // Message en cas de choix invalide
         }
      }

      return texte; // Retourne le choix du département (1, 2, 3 ou 4)
   }

   // Méthode pour saisir la date de naissance avec validation
   public static String inputDateNaissance() {
      boolean arret = false; // Booléen pour contrôler la boucle

      String date;
      for(date = null; !arret; arret = false) { // Boucle de saisie jusqu'à ce que la date soit valide
         date = saisie.SaiseTexte("Veuillez introduire la date de naissance : (jj/mm/aaaa)"); // Saisie de la date de naissance
         if (ControleSaisie.valideDate(date)) { // Validation de la date de naissance
            return date; // Retourne la date si valide
         }

         System.out.print("Saisie non valide !  "); // Message en cas de saisie invalide
      }

      return date; // Retourne la date de naissance
   }
}
