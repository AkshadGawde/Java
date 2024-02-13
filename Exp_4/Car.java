package Exp_4;

public class Car {
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    public String getCompanyName() {
        return company_name;
    }

    public void setCompanyName(String companyName) {
        this.company_name = companyName;
    }

    public String getModelName() {
        return model_name;
    }

    public void setModelName(String modelName) {
        this.model_name = modelName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public Car(String company_name, String model_name, int year, double mileage) {
        this.company_name = company_name;
        this.model_name = model_name;
        this.year = year;
        this.mileage = mileage;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2021, 25.5);

        System.out.println("Company Name: " + myCar.getCompanyName());
        System.out.println("Model Name: " + myCar.getModelName());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Mileage: " + myCar.getMileage());

        myCar.setCompanyName("Honda");
        myCar.setModelName("Civic");
        myCar.setYear(2022);

        System.out.println("\nUpdated Details:");
        System.out.println("Company Name: " + myCar.getCompanyName());
        System.out.println("Model Name: " + myCar.getModelName());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Mileage: " + myCar.getMileage());
    }
}
