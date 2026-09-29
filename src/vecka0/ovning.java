package vecka0;

public class ovning {
   /*
    Jämför två tal. Om det första är större än det andra skriv ut ”Första talet är störst”, samt ”Andra talet är störst” om det är tvärt om
*/
   static void main(String[] args) {
       int first = 5;
       int second = 7;
       if (first > second){
           System.out.println("första är större än det andra");

   }
       if (second > first);{
           System.out.println("Andra talet är störst");
       }
       /*Jämför två tal. Om det första är jämt delbart med det andra skriv ut ”Jämt delbart”, annars skriv ut ”Inte jämt delbart”
       */
       if (first % second == 0){
           System.out.println("jämt delbart");

       }
       else {
           System.out.println("inte jämt delbart");
       }
}
}
