package App.Lesson.Classes.Helper.Interface;

public class Default {
    public static void Pig() {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }

    public static void Wolf() {
        Wolf myWolf = new Wolf();
        myWolf.animalSound();
        myWolf.canEatMeat();
        myWolf.sleep();
    }
}
