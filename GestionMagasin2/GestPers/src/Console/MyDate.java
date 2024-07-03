package Console;

// Définition de la classe MyDate
public class MyDate {
   // Déclaration des variables membres privées pour jour, mois et année
   private int jour;
   private int mois;
   private int annee;

   // Constructeur de la classe MyDate
   public MyDate(int jour, int mois, int annee) {
      // Initialisation des variables membres avec les valeurs passées en paramètres
      this.jour = jour;
      this.mois = mois;
      this.annee = annee;
   }

   // Méthode pour récupérer le jour
   public int getJour() {
      return this.jour;
   }

   // Méthode pour récupérer le mois
   public int getMois() {
      return this.mois;
   }

   // Méthode pour récupérer l'année
   public int getAnnee() {
      return this.annee;
   }
}