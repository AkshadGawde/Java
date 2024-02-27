package Exp_5;

public class Emp {
    public String name;
    public int emp_id;
    public String category;
    public double basic_pay;
    public double hra;
    public double da;
    public double net_pay;
    public double PF;
    public double gross_pay;
    public double income_tax;
    public double allowance;

    public Emp(String name, int emp_id, String category, double basic_pay, double hra, double da) {
        this.name = name;
        this.emp_id = emp_id;
        this.category = category;
        this.basic_pay = basic_pay;
        this.hra = hra;
        this.da = da;
    }

    public void calculateNetPay() {
        gross_pay = basic_pay + hra + da;
        PF = 0.1 * basic_pay;
        allowance = 0.2 * basic_pay;
        income_tax = 0.15 * gross_pay;
        net_pay = gross_pay - (PF + income_tax);
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Category: " + category);
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Pay: " + gross_pay);
        System.out.println("PF: " + PF);
        System.out.println("Allowance: " + allowance);
        System.out.println("Income Tax: " + income_tax);
        System.out.println("Net Pay: " + net_pay);
    }
}
