package application;

public abstract class Automaton {

   public abstract boolean accept(String w);
   
   public boolean test(String w) {
    ///  header(w); 
      boolean result = accept(w);
    //  System.out.printf("  %s", (result ? "Accept" : "Reject"));
    //  System.out.println(); System.out.println();
      return result;
   }
   void test(String[] args, String[] def) {
      if (args.length==0) args = def;
      for (String w: args) test(w);
   }
   
   static void header(String w) {
      for (int j=0; j<w.length(); j++) 
          System.out.printf("%5s", w.charAt(j));
      System.out.println();
   }
}