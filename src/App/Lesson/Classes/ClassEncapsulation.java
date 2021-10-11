package App.Lesson.Classes;

import App.Lesson.Classes.Helper.ClassGetterSetter;

public class ClassEncapsulation {
    public static void main(String[] args) {
        ClassGetterSetter myObj = new ClassGetterSetter();
        myObj.setName("Prasetyo");
        System.out.println(myObj.getName());
    }
}
