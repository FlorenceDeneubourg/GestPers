package Console;

// Définition de la classe Personnel qui hérite de Individu
public class Personnel extends Individu {
   // Variables membres privées de la classe Personnel
   private Departement departement; // Référence vers le département auquel le personnel appartient
   private int IdPersonnel; // Identifiant unique du personnel
   private static int id = 1; // Variable statique pour générer des identifiants uniques
   private String email; // Adresse email du personnel
   private boolean actif = true; // Indicateur d'activité du personnel, par défaut actif

   // Constructeur de la classe Personnel
   public Personnel(String nom, String prenom, Sexe sexe, MyDate dateNaissance, String email, Departement dept) {
      // Appel au constructeur de la classe parent Individu avec les informations de base
      super(nom, prenom, sexe, dateNaissance);
      
      // Initialisation des variables membres avec les valeurs passées en paramètres
      this.departement = dept;
      this.IdPersonnel = id++; // Attribution d'un identifiant unique en incrémentant la variable statique id
      this.email = email;
   }

   // Méthode toString pour obtenir une représentation textuelle de l'objet
   @Override
   public String toString() {
      // Construction de la chaîne de caractères représentant l'objet Personnel
      return " Id : " + this.getIdPersonnel() + " " + super.toString() + " Email : " + this.getEmail() + " Département : " + this.getDepartement();
   }

   // Méthode pour récupérer l'identifiant du personnel
   public int getIdPersonnel() {
      return this.IdPersonnel;
   }

   // Méthode pour récupérer le nom du département du personnel
   public String getDepartement() {
      return this.departement.getDeptNom();
   }

   // Méthode pour récupérer l'email du personnel
   public String getEmail() {
      return this.email;
   }

   // Méthode pour définir l'email du personnel
   public void setEmail(String email) {
      this.email = email;
   }

   // Méthode pour vérifier l'état d'activité du personnel
   public boolean isActif() {
      return this.actif;
   }

   // Méthode pour définir l'état d'activité du personnel
   public void setActif(boolean actif) {
      this.actif = actif;
   }
}