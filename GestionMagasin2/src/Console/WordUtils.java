package Console;

public class WordUtils {
   private static String capitalize(String value) {
      String var10000 = value.substring(0, 1).toUpperCase();
      String outvalue = var10000 + value.substring(1).toLowerCase();
      return outvalue;
   }

   private static String minimize(String value) {
      String outvalue = value.toLowerCase();
      return outvalue;
   }

   protected static String mettreEnMajscule(String inputString) {
      String outString;
      String[] partString;
      String[] var3;
      int var4;
      int var5;
      String part;
      if (inputString.indexOf("'") > 0) {
         outString = "";
         partString = inputString.split("'");
         var3 = partString;
         var4 = partString.length;

         for(var5 = 0; var5 < var4; ++var5) {
            part = var3[var5];
            System.out.println("avec ' " + part);
            outString = outString + "'" + capitalize(part);
         }

         return outString.substring(1);
      } else if (inputString.indexOf("-") > 0) {
         outString = "";
         partString = inputString.split("-");
         var3 = partString;
         var4 = partString.length;

         for(var5 = 0; var5 < var4; ++var5) {
            part = var3[var5];
            System.out.println("avec - " + part);
            outString = outString + "-" + capitalize(part);
         }

         return outString.substring(1);
      } else if (inputString.indexOf(" ") <= 0) {
         return capitalize(inputString);
      } else {
         outString = "";
         partString = inputString.split(" ");
         var3 = partString;
         var4 = partString.length;

         for(var5 = 0; var5 < var4; ++var5) {
            part = var3[var5];
            System.out.println("avec ' ' " + part);
            outString = outString + " " + capitalize(part);
         }

         return outString.substring(1);
      }
   }

   protected static String mettreEnMinusculeMail(String inputString) {
      String outString = "";
      String[] partString = inputString.split("@");
      String[] var3 = partString;
      int var4 = partString.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String part = var3[var5];
         outString = outString + "@" + minimize(part);
      }

      return outString.substring(1);
   }
}