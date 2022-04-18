public class Inheritance {
    public static void main(String[] args) {
        A a = new A();
        A bAsA = new B();
        B b = new B();
        System.out.print("a.static_f() -> ");
        a.static_f();
        System.out.print("a.f() -> ");
        a.f();
        System.out.print("bAsA.static_f() -> ");
        bAsA.static_f();
        System.out.print("bAsA.f() -> ");
        bAsA.f();
        System.out.print("b.static_f() -> ");
        b.static_f();
        System.out.print("b.f() -> ");
        b.f();
    }
}


class A {
    static void static_f() {
        System.out.println("Hello from A!");
    }
    void f() {
        System.out.println("Hello from A!");
    }
}


class B extends A {
    static void static_f() {
        System.out.println("Hello from B!");
    }
    void f() {
        System.out.println("Hello from B!");
    }
}
