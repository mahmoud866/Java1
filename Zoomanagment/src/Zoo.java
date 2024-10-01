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
            if (currentAnimal.name.equals(animal.name) &&
                    currentAnimal.family.equals(animal.family) &&
                    currentAnimal.age == animal.age &&
                    currentAnimal.isMammal == animal.isMammal) {
                return i; // Retourner l'indice de l'animal trouvé
            }
        }
        return -1; // Retourner -1 si l'animal n'est pas trouvé
    }

    // Ajouter un animal en vérifiant qu'il n'existe pas déjà et que la capacité n'est pas dépassée
    public boolean addAnimal(Animal animal) {
        if (animalCount >= nbrCages) {
            System.out.println("Capacité maximale du zoo atteinte.");
            return false; // Ne pas dépasser le nombre maximal d'animaux
        }

        // Utiliser la méthode searchAnimal pour vérifier si l'animal existe déjà
        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal est déjà présent dans le zoo.");
            return false; // Ne pas ajouter un animal qui est déjà présent
        }

        // Ajouter l'animal si toutes les conditions sont respectées
        animals[animalCount] = animal;
        animalCount++;
        return true; // Ajout réussi
    }

    // Supprimer un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("L'animal n'a pas été trouvé dans le zoo.");
            return false;
        }

        // Décaler les animaux pour combler le trou
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }

    // Afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
    }
    public String getName() {
        return name;
    }

    // Afficher les animaux du zoo
    private void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            Animal animal = animals[i];
            System.out.println("Animal " + (i + 1) + ": " + animal.name + " (Famille: " + animal.family + ", Âge: " + animal.age + ")");
        }
    }
    public boolean isZooFull() {
        return animalCount >= nbrCages; // Vérifie si le nombre d'animaux est égal ou supérieur au nombre de cages
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1; // z1 a plus d'animaux
        } else if (z1.animalCount < z2.animalCount) {
            return z2; // z2 a plus d'animaux
        } else {
            return z1; // Les deux zoos ont le même nombre d'animaux, retourner z1 par défaut
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


