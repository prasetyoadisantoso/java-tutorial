package App.Lesson.Classes;

import Package.InputManagement;

public class MainClasses {
    public static void main(String[] args) {

        System.out.println("=> Class Object = 'class-object' ");
        System.out.println("=> Class Attributes = 'class-attribute' ");
        System.out.println("=> Class Method = 'class-method' ");
        System.out.println("=> Class Constructor = 'class-constructor' ");
        System.out.println("=> Class Modifier = 'class-modifier' ");
        System.out.println("=> Class Encapsulation = 'class-encapsulation' ");
        System.out.println("=> Class Package = 'class-package' ");
        System.out.println("=> Class Inheritance = 'class-inheritance' ");
        System.out.println("=> Class Polymorphisme = 'class-polymorphisme' ");
        System.out.println("=> Class InnerClasses = 'class-innerclasses' ");
        System.out.print("Select sub-lesson > ");
        String input = InputManagement.StandardInput();

        switch (input) {
            case "class-object":
                ClassObject.main(null);
                break;
            case "class-attribute":
                ClassAttribute.main(null);
                break;
            case "class-method":
                ClassMethod.main(null);
                break;
            case "class-constructor":
                ClassConstructor.main(null);
                break;
            case "class-modifier":
                ClassModifier.main(null);
                break;
            case "class-encapsulation":
                ClassEncapsulation.main(null);
                break;
            case "class-package":
                ClassPackage.main(null);
                break;
            case "class-inheritance":
                ClassInheritance.main(null);
                break;
            case "class-polymorphisme":
                ClassPolymorphisme.main(null);
                break;
            case "class-innerclasses":
                ClassInnerclasses.main(null);
                break;
            default:
                MainClasses.main(null);
                break;
        }

    }


}
