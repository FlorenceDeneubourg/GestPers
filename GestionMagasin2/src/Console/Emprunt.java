package Console;

public class Emprunt {
   protected Personnel emprunteur;
   protected Produit materiel;
   protected int nombre;

   public Emprunt(Personnel emprunteur, Produit materiel, int nombre) {
      this.setEmprunteur(emprunteur);
      this.materiel = materiel;
      this.nombre = nombre;
   }

   public Personnel getEmprunteur() {
      return this.emprunteur;
   }

   public void setEmprunteur(Personnel emprunteur) {
      this.emprunteur = emprunteur;
   }

   public String toString() {
      int var10000 = this.nombre;
      return var10000 + " " + this.materiel.toString() + " emprunté par " + String.valueOf(this.getEmprunteur());
   }

   public Produit getMateriel() {
      return this.materiel;
   }

   public String getArticle() {
      String var10000 = this.materiel.getNom();
      return var10000 + "  " + this.materiel.getDescription();
   }

   public int getNombre() {
      return this.nombre;
   }
}