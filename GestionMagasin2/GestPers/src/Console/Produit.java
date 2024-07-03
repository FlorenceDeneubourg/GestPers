package Console;

public class Produit {
   // Attributs privés de la classe Produit
   private String nom;
   private String description;

   // Constructeur de la classe Produit
   public Produit(String nom, String description) {
      this.nom = nom;            // Initialisation du nom du produit
      this.description = description;  // Initialisation de la description du produit
   }

   // Méthode pour obtenir le nom du produit
   public String getNom() {
      return this.nom;
   }

   // Méthode pour définir le nom du produit
   public void setNom(String nom) {
      this.nom = nom;
   }

   // Méthode pour obtenir la description du produit
   public String getDescription() {
      return this.description;
   }

   // Méthode pour définir la description du produit
   public void setDescription(String description) {
      this.description = description;
   }

   // Méthode toString pour afficher les informations du produit
   @Override
   public String toString() {
      return "Produit [nom = " + this.nom + ", description = " + this.description + " ]\n\t";
   }
}