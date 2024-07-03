package Console;

public enum Sexe {
   // Définition des constantes enum avec leur étiquette respective
   HOMME("Garçon"),
   FEMME("Fille");

   // Attribut privé pour stocker l'étiquette associée à chaque constante enum
   private final String label;

   // Constructeur privé de l'enum Sexe
   private Sexe(String label) {
      this.label = label;  // Initialisation de l'étiquette lors de la création de chaque constante
   }

   // Méthode pour obtenir l'étiquette associée à la constante enum
   public String getLabel() {
      return this.label;
   }

   // Méthode synthétique pour obtenir un tableau contenant toutes les constantes enum
   // Cette méthode est générée par le compilateur et est utilisée en interne
   private static Sexe[] $values() {
      return new Sexe[]{HOMME, FEMME};  // Retourne un tableau contenant toutes les constantes enum de Sexe
   }
}