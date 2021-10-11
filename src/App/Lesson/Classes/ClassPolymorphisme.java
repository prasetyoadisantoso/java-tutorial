package App.Lesson.Classes;

import App.Lesson.Classes.Helper.Animal;
import App.Lesson.Classes.Helper.Dog;
import App.Lesson.Classes.Helper.Pig;

public class ClassPolymorphisme {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
