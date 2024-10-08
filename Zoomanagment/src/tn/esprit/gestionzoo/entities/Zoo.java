public class Zoo {
    private final int nbrCages = 25; // Constante, un zoo peut avoir 25 cages maximum
    private Animal[] animals;
    private String name;
    private String city;
    private int animalCount; // Suivre le nombre d'animaux

    public Zoo(String name, String city) {
        this.animals = new Animal[nbrCages]; // Capacité maximale basée sur le nombre de cages
        this.name = name;
        this.city = city;
        this.animalCount = 0; // Initialisation à zéro
    }

    // Méthode searchAnimal mise à jour (elle compare tous les attributs d'un animal)
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            Animal currentAnimal = animals[i];
            if (currentAnimal.getName().equals(animal.getName()) &&
                    currentAnimal.getFamily().equals(animal.getFamily()) &&
                    currentAnimal.getage() == animal.getage() &&
                    currentAnimal.isMammal() == animal.isMammal()) {
                return i;
            }
        }
        return -1;
    }


    public boolean addAnimal(Animal animal) {

        if (isZooFull()) {
            System.out.println("Capacité maximale du zoo atteinte.");
            return false;
        }


        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal est déjà présent dans le zoo.");
            return false;
        }


        animals[animalCount] = animal;
        animalCount++;
        return true;
    }


    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("L'animal n'a pas été trouvé dans le zoo.");
            return false;
        }


        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }


    public void displayZoo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
    }
    public String getName() {
        return name;
    }


    private void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            Animal animal = animals[i];
            System.out.println("Animal " + (i + 1) + ": " + animal.getName() + " (Famille: " + animal.getFamily() + ", Âge: " + animal.getage() + ")");
        }
    }
    public boolean isZooFull() {
        return animalCount >= nbrCages; // Vérifie si le nombre d'animaux est égal ou supérieur au nombre de cages
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z1.animalCount < z2.animalCount) {
            return z2;
        } else {
            return z1;
        }
    }


    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}


