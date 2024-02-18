package ООП.Lection3.Ex000;

public class Program {
    public static void main(String[] args) {

        Foo foo1 = new Foo() {
            @Override
            public void m() {
                System.out.println("m");                
            }
            @Override
            public void n() {
                System.out.println("n");                
            }
        };
        
        Foo foo2 = new Foo() {
            @Override
            public void m() {
                System.out.println(">>>>m");                
            }
            @Override
            public void n() {
                System.out.println(">>>>n");                
            }
        };

        foo1.m();
        foo1.n();
        foo2.m();
        foo2.n();
    }
    
}
