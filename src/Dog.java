public class Dog extends Animal implements Pet {
    private String breed;

    public Dog(String name, int age, String habitat, String breed) {
        super(name, age, AnimalType.MAMMAL, habitat);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("ვაფ!");
    }

    @Override
    public void playWith() {
        System.out.println(getName() + " თამაშობს ბურთის მოტანას!");
    }
}
