package hw12;

public class App {
    public static void main(String[] args) {
    Dogs dog1 = new Dogs("Funtik",8.5,5);
    Cats cat1 = new Cats("Knopka","white",2005);

    dog1.getName();
    cat1.getName();

    ActionAnimal[] animals = {dog1,cat1}; // при содании массива берем интерфейс
    for (ActionAnimal animal: animals){
        System.out.println(animal.HumanAge()); // обязательно через sout, т.к. в классах мы возвращали число, но не прописали sout
        animal.getVoice();
        }

    }
}
