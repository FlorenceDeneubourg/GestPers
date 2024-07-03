package Console;

public enum Departement {
   Compta("Comptabilité"),
   HR("Ressources Humaines"),
   Prod("Production"),
   SEC("Sécurité");

   private String deptNom;

   private Departement(String param3) {
      this.deptNom = param3;
   }

   public String getDeptNom() {
      return this.deptNom;
   }

   // $FF: synthetic method
   private static Departement[] $values() {
      return new Departement[]{Compta, HR, Prod, SEC};
   }
}