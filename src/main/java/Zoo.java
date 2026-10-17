public class Zoo {

    final int nbrCages = 25;
    Animal[] animals = new Animal[nbrCages];
    String name;
    String city;
    int nbrAnimals = 0;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public boolean addAnimal(Animal animal) {

        if (animal == null || animal.name == null) {
            return false;
        }
        if (nbrAnimals >= animals.length) {
            return false;
        }
        if (searchAnimal(animal) != -1) {
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
    public void displayAnimals() {

        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(Animal animal) {

        if (animal == null || animal.name == null) {
            return -1;
        }

        for (int i = 0; i < nbrAnimals; i++) {

            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }

        return -1;
    }
    public boolean removeAnimal(Animal animal) {

        int index = searchAnimal(animal);

        if (index == -1) {
            return false;
        }

        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        nbrAnimals--;
        animals[nbrAnimals] = null;

        return true;
    }

    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo zoo1, Zoo zoo2) {
        if (zoo1.nbrAnimals >= zoo2.nbrAnimals) {
            return zoo1;
        }
        return zoo2;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo : " + name
                + ", ville : " + city
                + ", nombre de cages : " + nbrCages;
    }
}