package vecka2;

public class Fruit {

    private String color;

    //definition av en konstruktor
    //public klassNamn() {
    //}
    public Fruit() {
        color = "red";
    }

    public Fruit(String myColor) {
        color = myColor;
    }

    //Metod som inte returnerar något (bara gör saker)
    //public void metodNamn() {
    //}
    public void print() {
        System.out.println("Fruktens färg är: " +color);
    }


}