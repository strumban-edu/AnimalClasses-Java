public class Animal {
    public int age;
    public String gender;
    public Boolean mammal;
    public Boolean mate;

    public static void main(String [] args) {
        Animal myAnimal = new Animal();
        myAnimal.age = 14;
        myAnimal.gender = "male";
        myAnimal.mammal = false;
        myAnimal.mate = false;

        Fish myFish = new Fish();
        myFish.age = 2;
        myFish.gender = "male";
        myFish.mammal = false;
        myFish.mate = true;

        Zebra myZebra = new Zebra();
        myZebra.age = 20;
        myZebra.gender = "female";
        myZebra.mammal = true;
        myZebra.mate = true;
        myZebra.is_wild = true;

        System.out.println("Animal age, gender: " + myAnimal.age + " " + myAnimal.gender);
        System.out.println("Zebra age, gender: " + myZebra.age + " " + myZebra.gender);
        System.out.println("Fish age, gender: " + myFish.age + " " + myFish.gender);
        System.out.println();

        System.out.println("Animal is mammal: " + myAnimal.isMammal(myAnimal));
        System.out.println("Zebra is mammal: " + myAnimal.isMammal(myZebra));
        System.out.println("Fish is mammal: " + myAnimal.isMammal(myFish));
        System.out.println();

        System.out.println("Animal has mate: " + myAnimal.mate(myAnimal));
        System.out.println("Zebra has mate: " + myAnimal.mate(myZebra));
        System.out.println("Fish has mate: " + myAnimal.mate(myFish));
        System.out.println();

        myZebra.run(myZebra);
    };

    public Boolean isMammal(Animal animalVar) {
        return animalVar.mammal;
    }

    public Boolean mate(Animal animalVar) {
        return animalVar.mate;
    }
}

class Fish extends Animal {
    private double sizeInFeet;
    
    private Boolean canEat(Fish fishVar1, Fish fishVar2) {
        return fishVar1.sizeInFeet > fishVar2.sizeInFeet;
    }
}

class Zebra extends Animal {
    public Boolean is_wild;

    public void run(Zebra zebra) {
        if (zebra.is_wild) {
            System.out.println("I run! I feel the wind through my mane!");
        } else {
            System.out.println("I do not run.");
        }
    }
}
