
public class Parrot extends Animal implements Pet, Bird {
    private String species;

    public Parrot(String name, int age, String habitat, String species) {
        super(name, age, AnimalType.BIRD, habitat);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void makeSound() {
        System.out.println("კვა კვა!");
    }

    @Override
    public void playWith() {
        System.out.println(getName() + " თამაშობს თავის პატრონთან!");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " დაფრინავს წრეებზე!");
    }
}
