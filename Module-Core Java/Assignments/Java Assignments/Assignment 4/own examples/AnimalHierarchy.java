
class Animal {

    String name, species;
    int age;

    public Animal() {
        this.name = "Not Given";
        this.species = "Not Given";
        this.age = 00;
    }

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSpecies(String species) {
        this.species = species;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    String getSpecies() {
        return this.species;
    }

    int getAge() {
        return this.age;
    }

    void display() {
        System.out.println("Animal NAme: " + this.name);
        System.out.println("Species: " + this.species);
        System.out.println("Age: " + this.age);
    }
}

class Dog extends Animal {

    String breed;
    boolean isVaccinated;

    public Dog() {
        super();
        this.breed = "Not Given";
        this.isVaccinated = false;
    }

    public Dog(String breed, boolean isVaccinated, String name, String species, int age) {
        super(name, species, age);
        this.breed = breed;
        this.isVaccinated = isVaccinated;
    }

    void setBreed(String breed) {
        this.breed = breed;
    }

    void setIsVaccinated(boolean vaccinated) {
        this.isVaccinated = vaccinated;
    }

    String getBreed() {
        return this.breed;
    }

    boolean getIsVaccinated() {
        return this.isVaccinated;
    }

    void display() {
        super.display();
        System.out.println("Breed: " + breed);
        System.out.println("Vaccinated: " + isVaccinated);
    }
}

class Cat extends Animal {

    double clawLength;
    boolean isIndoor;

    public Cat() {
        super();
        this.clawLength = 00;
        this.isIndoor = false;
    }

    public Cat(double clawLength, boolean isIndoor, String name, String species, int age) {
        super(name, species, age);
        this.clawLength = clawLength;
        this.isIndoor = isIndoor;
    }

    void setClawLength(double clawLength) {
        this.clawLength = clawLength;
    }

    void setIsIndoor(boolean isIndoor) {
        this.isIndoor = isIndoor;
    }

    double getClawLength() {
        return this.clawLength;
    }

    boolean getIsIndoor() {
        return this.isIndoor;
    }

    void display() {
        super.display();
        System.out.println("Claw-length: " + clawLength);
        System.out.println("Indoor? : " + isIndoor);
    }
}

class Bird extends Animal {

    double wingSpan;
    boolean canFly;

    public Bird() {
        super();
        this.wingSpan = 00;
        this.canFly = false;
    }

    public Bird(double wingSpan, boolean canFly, String name, String species, int age) {
        super(name, species, age);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    double setWingSpan() {
        return this.wingSpan;
    }

    boolean setCanFly() {
        return this.canFly;
    }

    void display(){
        super.display();
        System.out.println("Wings Span: "+wingSpan);
        System.out.println("Can Fly? : "+canFly);
    }
}

public class AnimalHierarchy {

    public static void main(String[] args) {
        Dog d = new Dog("abc",true,"Tuppy","pqr",3);
        d.display();

        System.out.println("");

        Cat c = new Cat(1.2,false,"Mony","xyz",2);

        System.out.println("");

        Bird b = new Bird(2.3,true,"Beast","lmn",3);

    }
}
