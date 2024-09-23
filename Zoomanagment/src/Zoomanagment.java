import java.util.Scanner;
class Zoomanagement
{

    public static void main(String[] args)
    {

        Animal lion = new Animal("lion", "simba", 5, true);
        Zoo myZoo = new Zoo("my zoo", "Ariana", 25);

        //myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
    }


}