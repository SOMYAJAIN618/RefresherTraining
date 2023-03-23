
class Parent {
    void Print(){
        System.out.println("This is the parent class");}
}
class child1 extends Parent {
    void Print() {System.out.println("This is the child class 1"); }
}
class child2 extends Parent {
    void Print() {System.out.println("This is the child class 2");}
}
class RuntimePoly {
    public static void main(String[] args)
    {   Parent p;
        p = new child1();
        p.Print();

        p = new child2();
        p.Print();
    }
}

