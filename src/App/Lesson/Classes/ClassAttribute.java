package App.Lesson.Classes;

public class ClassAttribute {

    private String word = "default";
    private int numb = 0;
    final int constan = 15;

    public static void main(String[] args) {
        System.out.println("Classes Attribute");
        System.out.println("Get attribute : word = " + ClassAttribute.getAttribute());
        System.out.println("Modify attribute : numb = " + ClassAttribute.modifyAttribute());
        System.out.println("Cant't modify attribute : numb = " + ClassAttribute.cantModifyAttribute());
        ClassAttribute.multiInstantiation();
    }

    static ClassObject ObjectValue() {
        return new ClassObject();
    }

    static String getAttribute() {
        ClassAttribute myObj = new ClassAttribute();
        return myObj.word;
    }

    static int modifyAttribute() {
        ClassAttribute myObj = new ClassAttribute();
        myObj.numb = 10;
        return myObj.numb;
    }

    static int cantModifyAttribute() {
        ClassAttribute myObj = new ClassAttribute();
        // This will be error because final
        // myObj.constan = 10;
        return myObj.constan;
    }

    static void multiInstantiation(){
        ClassAttribute myObj1 = new ClassAttribute();
        ClassAttribute myObj2 = new ClassAttribute();
        System.out.println(myObj1.constan);
        myObj2.ObjectValue().main(null);
    }


}
