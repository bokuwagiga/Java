public class Main {
    public static void main(String[] args) {
        // ვქმნით ახალ ობიექტს Dog
        Dog myDog = new Dog("ჯეკა", 5, "სახლი", "ლაბრადორი");
        // ვპრინტავთ ობიექტის მახასიათებლებს
        myDog.makeSound();
        myDog.playWith();
        System.out.println("ცხოველის სახელია: "+myDog.getName());
        System.out.println("ცხოველის ასაკია: "+myDog.getAge());
        System.out.println("ცხოველის საცხოვრებელი გარემოა: "+myDog.getHabitat());
        System.out.println("ცხოველის ტიპია: "+ myDog.getType());
        System.out.println("ძაღლის ჯიშია: "+myDog.getBreed());

        // ვქმნით ახალ ობიექტს Parrot
        Parrot myParrot = new Parrot("კოკო", 2, "ჯუნგლები", "აფრიკული ნაცრისფერი");
        // ვპრინტავთ ობიექტის მახასიათებლებს
        myParrot.makeSound();
        myParrot.playWith();
        myParrot.fly();
        System.out.println("ცხოველის სახელია: "+myParrot.getName());
        System.out.println("ცხოველის ასაკია: "+myParrot.getAge());
        System.out.println("ცხოველის საცხოვრებელი გარემოა: "+myParrot.getHabitat());
        System.out.println("ცხოველის ტიპია: "+ myParrot.getType());
        System.out.println("თუთიყუშის სახეობაა: "+ myParrot.getSpecies());


        // ვქმნით ახალ ცარიელ ობიექტ Dog-ს
        Dog newDog = new Dog(null,0,null,null);
        // ცარიელ ობიექტს ვანიჭებთ მახასიათებლებს
        newDog.setName("ბობი");
        newDog.setAge(4);
        newDog.setHabitat("სახლი");
        newDog.setBreed("ბიგლი");

        // ვქმნით ახალ ცარიელ ობიექტ Parrot-ს
        Parrot newParrot = new Parrot(null,0,null,null);
        // ცარიელ ობიექტს ვანიჭებთ მახასიათებლებს
        newParrot.setName("ჩაკი");
        newParrot.setAge(1);
        newParrot.setHabitat("მინდორი");
        newParrot.setSpecies("ტალღოვანი");

    }
}
