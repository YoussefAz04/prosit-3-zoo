public class ZooManagement {

    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Belvedere", "Tunis");
        Animal lion = new Animal("Felides", "Simba", 5, true);
        Animal elephant = new Animal("Elephantides", "Dumbo", 10, true);
        Animal perroquet = new Animal("Psittacides", "Coco", 2, false);

        System.out.println("Ajout Simba : " + myZoo.addAnimal(lion));
        System.out.println("Ajout Dumbo : " + myZoo.addAnimal(elephant));
        System.out.println("Ajout Coco : " + myZoo.addAnimal(perroquet));
        myZoo.displayAnimals();

        Animal copie = new Animal("Felides", "Simba", 5, true);
        Animal absent = new Animal("Felides", "Tigrou", 4, true);
        System.out.println("Indice de Simba : " + myZoo.searchAnimal(lion));
        System.out.println("Indice de la copie : " + myZoo.searchAnimal(copie));
        System.out.println("Indice de Tigrou absent : " + myZoo.searchAnimal(absent));
        System.out.println("Ajout du doublon : " + myZoo.addAnimal(copie));

        System.out.println("Suppression de Dumbo : " + myZoo.removeAnimal(elephant));
        myZoo.displayAnimals();
        System.out.println("Deuxieme suppression : " + myZoo.removeAnimal(elephant));

        Zoo autreZoo = new Zoo("Friguia", "Bouficha");
        autreZoo.addAnimal(absent);
        Zoo resultat = Zoo.comparerZoo(myZoo, autreZoo);
        System.out.println("Zoo le plus peuple : " + resultat.name);

        Zoo zooTest = new Zoo("Test", "Tunis");
        for (int i = 1; i <= 26; i++) {
            Animal a = new Animal("Felides", "Lion" + i, 3, true);
            System.out.println("Ajout " + i + " : " + zooTest.addAnimal(a));
        }
        System.out.println("Zoo plein : " + zooTest.isZooFull());
        myZoo.displayZoo();
    }
}
