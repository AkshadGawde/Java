package Exp_5;

import Exp_5.Emp;

public class Emppay {
    public static void main(String[] args) {
        Emp e = new Emp("John Doe", 101, "Manager", 50000, 20000, 15000);
        e.calculateNetPay();
        e.printDetails();
    }
}
