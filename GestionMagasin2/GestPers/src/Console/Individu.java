package Console;

public class Individu {
   private String nom;
   private String prenom;
   private Sexe sexe;
   private MyDate dateNaissance;

   // Constructeur de la classe Individu
   public Individu(String nom, String prenom, Sexe sexe, MyDate dateNaissance) {
      this.nom = nom;
      this.prenom = prenom;
      this.sexe = sexe;
      this.dateNaissance = dateNaissance;
   }

   // Méthode pour obtenir le nom
   public String getNom() {
      return this.nom;
   }

   // Méthode pour définir le nom
   public void setNom(String nom) {
      this.nom = nom;
   }

   // Méthode pour obtenir le prénom
   public String getPrenom() {
      return this.prenom;
   }

   // Méthode pour définir le prénom
   public void setPrenom(String prenom) {
      this.prenom = prenom;
   }

   // Méthode pour obtenir le sexe
   public String getSexe() {
      return this.sexe.getLabel();
   }

   // Méthode pour définir le sexe
   public void setSexe(Sexe sexe) {
      this.sexe = sexe;
   }

   // Méthode pour obtenir la date de naissance
   public MyDate getDateNaissance() {
      return this.dateNaissance;
   }

   // Méthode pour définir la date de naissance
   public void setDateNaissance(MyDate dateNaissance) {
      this.dateNaissance = dateNaissance;
   }

   // Méthode pour obtenir la date de naissance formatée
   public String getDateddMMyyyy() {
      return String.format("%d-%d-%d", this.dateNaissance.getJour(), this.dateNaissance.getMois(), this.dateNaissance.getAnnee());
   }

   // Méthode pour obtenir la représentation sous forme de chaîne de caractères
   public String toString() {
      return String.format("%s %s sexe : %s date de naissance : %d-%d-%d.", this.nom, this.prenom, this.getSexe(), this.dateNaissance.getJour(), this.dateNaissance.getMois(), this.dateNaissance.getAnnee());
   }
}
