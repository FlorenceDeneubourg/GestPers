package Console;

public enum Sexe {
   HOMME("Garçon"),
   FEMME("Fille");

   private final String label;

   private Sexe(String param3) {
      this.label = param3;
   }

   public String getLabel() {
      return this.label;
   }

   // $FF: synthetic method
   private static Sexe[] $values() {
      return new Sexe[]{HOMME, FEMME};
   }
}