package week02;

public class PetZoo {
    static void main(String[] args) {
        Object petName;
        Pet dog = new Pet((String) (petName = "Fido"));
        Pet cat = new Pet((String) (petName = "dodo"));

      // dog.printName();
       //cat.printName();

        String dogName = dog.getName();
        String catName = cat.getName();
     for (int i=0; i<2; i++){
         System.out.println(dogName);
         System.out.println(catName);
     }
    }
        }