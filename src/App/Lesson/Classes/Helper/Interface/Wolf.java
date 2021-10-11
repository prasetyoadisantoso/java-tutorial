package App.Lesson.Classes.Helper.Interface;

public class Wolf implements Animal, Carnivora{
    public void animalSound() {
        System.out.println("The wolf says: auuuu woof woof");
    }

    public void canEatMeat() {
        System.out.println("The wolf can eat meat : Nom Nom");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}
