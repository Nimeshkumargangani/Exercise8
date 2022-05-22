package vistula50182;

public class Dog extends Mammal implements AnimalBehavior,AnimalMove{
    private String breedNimesh50182;

    Dog(){
        super();
        breedNimesh50182 = "NN";
    }

    public Dog(String nameNimesh50182 , int ageNimesh50182,int weightNimesh50182,String rzadNimesh50182, String breedNimesh50182){
        super(nameNimesh50182,ageNimesh50182,weightNimesh50182,rzadNimesh50182);
        this.breedNimesh50182 = breedNimesh50182;
    }

    public Dog(int ageNimesh50182, String rzadNimesh50182, String breedNimesh50182){
        super(ageNimesh50182,rzadNimesh50182);
        this.breedNimesh50182 = breedNimesh50182;
    }

    public void sportNimesh50182(){
        System.out.println("The dog is retrieving.");
    }

    public void drinkMilkNimesh50182() {
        System.out.println("The dog is drinking milk.");
    }

    @Override
    public void getVoiceNimesh50182() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void eatNimesh50182(String FoodName) {
        System.out.println("The dog is eating: "+ FoodName);
    }

    @Override
    public void sleep() {
        System.out.println("ZZZ");
    }

    @Override
    public void moveNimesh50182() {
        System.out.println("Dog is running");
    }

    public String getBreedNimesh50182() {
        return breedNimesh50182;
    }

    public void setBreedNimesh50182(String breedNimesh50182) {
        this.breedNimesh50182 = breedNimesh50182;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breedNimesh50182='" + breedNimesh50182 + '\'' +
                '}';
    }
}