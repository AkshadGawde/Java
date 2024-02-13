package Exp_4;

class Bird {
    private String name;
    private int age;

    Bird() {
        System.out.println("A bird is created.");
    }

    Bird(String birdName) {
        name = birdName;
        System.out.println("A bird named " + name + " is created.");
    }

    Bird(String birdName, int birdAge) {
        name = birdName;
        age = birdAge;
        System.out.println("A bird named " + name + " with age " + age + " is created.");
    }

    public String getName() {
        return name;
    }
}
