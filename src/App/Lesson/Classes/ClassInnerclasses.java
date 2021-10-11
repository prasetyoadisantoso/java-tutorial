package App.Lesson.Classes;

import App.Lesson.Classes.Helper.Default;

public class ClassInnerclasses {
    public static void main(String[] args) {
        System.out.println("|--- Default Inner Classes ---|");
        Default.InnerClasses();

        System.out.println("|--- Private Inner Classes ---|");
        Default.PrivateInnerClasses();

        System.out.println("|--- Static Inner Classes ---|");
        Default.StaticInnerClasses();

        System.out.println("|--- Access Inner Classes ---|");
        Default.AccessInnerClasses();
    }
}
