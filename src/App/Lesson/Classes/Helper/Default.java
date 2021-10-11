package App.Lesson.Classes.Helper;

public class Default {
    public static void InnerClasses() {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }

    public static void PrivateInnerClasses(){
        PrivateClass myPrivate = new PrivateClass();

        // Inner classes cannot instanciate because InnerClass class is private
        // PrivateClass.InnerClass myInner = myOuter.new InnerClass();

        System.out.println("Cannot instanciate because Innerclass is private class");
    }

    public static void StaticInnerClasses(){
        // Instanciate static InnerClass class
        StaticClass.InnerClass myStatic = new StaticClass.InnerClass();

        // Instanciate all Class
        StaticClass myInner = new StaticClass();

        System.out.println( myInner.x + myStatic.y);
    }

    public static void AccessInnerClasses(){
        AccessClass myOuter = new AccessClass();
        AccessClass.InnerClass myInner = myOuter.new InnerClass();

        System.out.println(myInner.myInnerMethod());
    }
}
