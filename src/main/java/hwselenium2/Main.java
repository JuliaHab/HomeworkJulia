package hwselenium2;

public class Main {
    public static void main(String[] args) {

        BlueWhale edward = new BlueWhale("Edward",5,"Edward");

        edward.canEat();
        edward.Age();
        edward.canHumans();
        edward.haveSkeleton();

        Carnivores alien = new Carnivores("Tiger","Savannah", 10);

        alien.Age();
        alien.canEat();
        alien.canHumans();
        alien.haveSkeleton();

        Herbivores elephant = new Herbivores("Elephant",1);

        elephant.Age();
        elephant.canEat();
        elephant.canHumans();
        elephant.haveSkeleton();

        Lion simba = new Lion("Simba","Zoo",5,"Lionion");

        simba.Age();
        simba.canEat();
        simba.haveSkeleton();
        simba.canHumans();

        Primates monkey = new Primates("Orangutan","Peter", 3);

        monkey.Age();
        monkey.canEat();
        monkey.canHumans();
        monkey.haveSkeleton();

        Rodents squirrel = new Rodents("Pocemon",5);

        squirrel.canEat();
        squirrel.canHumans();
        squirrel.Age();
        squirrel.haveSkeleton();

        Seals django = new Seals("Elizabet",80);

        django.canEat();
        django.Age();
        django.canHumans();
        django.haveSkeleton();

        Whales msWhite = new Whales("Smith", 20);

        msWhite.Age();
        msWhite.canEat();
        msWhite.canHumans();
        msWhite.haveSkeleton();

        Wolf akella = new Wolf("Wolf","Forest",8,"Akella");

        akella.Age();
        akella.canEat();
        akella.canHumans();
        akella.haveSkeleton();

    }
}
