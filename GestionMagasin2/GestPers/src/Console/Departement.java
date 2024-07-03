package Console;

public enum Departement {
   // Définition des constantes de l'énumération avec leur nom complet
   Compta("Comptabilité"),
   HR("Ressources Humaines"),
   Prod("Production"),
   SEC("Sécurité");

   // Variable d'instance pour stocker le nom complet du département
   private String deptNom;

   // Constructeur privé pour initialiser le nom du département
   private Departement(String param3) {
      this.deptNom = param3;
   }

   // Méthode publique pour obtenir le nom du département
   public String getDeptNom() {
      return this.deptNom;
   }

   // Méthode synthétique générée par le compilateur pour obtenir toutes les valeurs de l'énumération
   // Cette méthode n'est généralement pas visible dans le code source
   // $FF: synthetic method
   private static Departement[] $values() {
      return new Departement[]{Compta, HR, Prod, SEC};
   }
}
