package App.Lesson.Classes;

public class ClassConstructor {
    int modelYear;
    String modelName;

    public ClassConstructor(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        ClassConstructor myCar = new ClassConstructor(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
