import java.util.Scanner;
class Zoomanagement {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Zoo 1", "Tunis");
        Zoo zoo2 = new Zoo("Zoo 2", "Ariana");

        // Créer des animaux
        Animal animal1 = new Animal("Lion", "Leo", 3, true);
        Animal animal2 = new Animal("Tigre", "Sher Khan", 4, true);
        Animal animal3 = new Animal("Ours", "Baloo", 6, true);

        // Ajouter des animaux dans les zoos
        zoo1.addAnimal(animal1);
        zoo1.addAnimal(animal2);


        zoo2.addAnimal(animal3);

        // Comparer les deux zoos
        Zoo zooAvecLePlusDAnimaux = Zoo.comparerZoo(zoo1, zoo2);

        // Utilisation du getter pour accéder au nom
        System.out.println("Le zoo avec le plus d'animaux est : " + zooAvecLePlusDAnimaux.getName());
        zoo1.searchAnimal(animal1);
    }
}
