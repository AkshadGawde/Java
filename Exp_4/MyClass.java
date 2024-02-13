package Exp_4;

class MyClass {

    public void myMethod(int num) {
        System.out.println("Public method: " + num);
    }

    private void myMethod(String str) {
        System.out.println("Private method: " + str);
    }

    protected void myMethod(double value) {
        System.out.println("Protected method: " + value);
    }

    void myMethod(boolean flag) {
        System.out.println("Default (package-private) method: " + flag);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.myMethod(10);
        obj.myMethod("Hello Akshad");
        obj.myMethod(3.14);
        obj.myMethod(true);
    }
}
