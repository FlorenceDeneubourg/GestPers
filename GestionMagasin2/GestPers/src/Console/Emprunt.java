package Console;

public class Emprunt {
   // Variables d'instance pour stocker l'emprunteur, le matériel emprunté et le nombre d'articles empruntés
   protected Personnel emprunteur;
   protected Produit materiel;
   protected int nombre;

   // Constructeur pour initialiser les variables d'instance
   public Emprunt(Personnel emprunteur, Produit materiel, int nombre) {
      this.setEmprunteur(emprunteur); // Appel de la méthode setEmprunteur pour initialiser l'emprunteur
      this.materiel = materiel; // Initialisation du matériel emprunté
      this.nombre = nombre; // Initialisation du nombre d'articles empruntés
   }

   // Méthode pour obtenir l'emprunteur
   public Personnel getEmprunteur() {
      return this.emprunteur;
   }

   // Méthode pour définir l'emprunteur
   public void setEmprunteur(Personnel emprunteur) {
      this.emprunteur = emprunteur;
   }

   // Méthode pour convertir l'objet Emprunt en une chaîne de caractères
   public String toString() {
      int var10000 = this.nombre;
      return var10000 + " " + this.materiel.toString() + " emprunté par " + String.valueOf(this.getEmprunteur());
   }

   // Méthode pour obtenir le matériel emprunté
   public Produit getMateriel() {
      return this.materiel;
   }

   // Méthode pour obtenir une description de l'article emprunté
   public String getArticle() {
      String var10000 = this.materiel.getNom();
      return var10000 + "  " + this.materiel.getDescription();
   }

   // Méthode pour obtenir le nombre d'articles empruntés
   public int getNombre() {
      return this.nombre;
   }
}
