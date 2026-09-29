package vecka0;

public class exercise {
    /*Skapa ett program som använder tre tal
Programmet beräknar och skriver ut summan samt medelvärdet av de tre talen.
*/
    static void main(String[] args) {
        int first = 5;
        int second = 8;
        int third = 14;

        int sum = first + second + third;
        int median = sum/3;
        System.out.println(" the sum is: " +sum);
        System.out.println("the main is;" +median);
     /*
Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
Rektangelns sidor ska läsas in.*/

        int h = 3;
        int b = 5;

        int area = h * b;
        int circ = h*2 + b*2;
        System.out.println(area);
        System.out.println(circ);




    }


}
