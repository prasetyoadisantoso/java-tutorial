package App.Lesson.Classes.Helper;

public class Student extends ClassAbstract{
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }

    //from class Student itself
    public void play(){
        System.out.println("Playing all day long");
    }
}
