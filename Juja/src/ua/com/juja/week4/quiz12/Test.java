package ua.com.juja.week4.quiz12;

public class Test {
    public static void main(String[] args) {
        Parent parent = new Child();

        //не скомпілюється
       // Child child = new Parent();

        Child child = new Child();
        Parent parent1 = child;
        func(child);

        //Child child1 = (Child) new Parent();
        Parent parent2 = new Parent();
        Child child2 = (Child) parent;
        func((Child) parent);

        //ChildA childA = (ChildA) new ChildB();


        Object object = new ChildB();
        //ChildA childA = (ChildA) object; //java.lang.ClassCastException:
    }

    private static void func (Child child){}
}
