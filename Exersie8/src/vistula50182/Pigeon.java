package vistula50182;

public class Pigeon extends Bird implements AnimalMove, AnimalBehavior{
    private String speciesNimesh50182;

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void moveNimesh50182() {
        System.out.println("Pigeon is flying");
    }

    Pigeon(){
        super();
        speciesNimesh50182 ="NN";
    }

    public Pigeon(String nameNimesh50182, int ageNimesh50182, int weightNimesh50182, String featherColorNimesh50182, String speciesNimesh50182){
        super(nameNimesh50182, ageNimesh50182, weightNimesh50182,featherColorNimesh50182);
        this.speciesNimesh50182 = speciesNimesh50182;
    }

    public Pigeon(int ageNimesh50182, String featherColorNimesh50182, String speciesNimesh50182){
        super(ageNimesh50182, featherColorNimesh50182);
        this.speciesNimesh50182 = speciesNimesh50182;
    }

    public void peckingWoodNimesh50182(){
        System.out.println("The Pigeon is pecking wood");
    }

    @Override
    public void getVoiceNimesh50182() {
        System.out.println("The Pigeon chirps");
    }

    @Override
    public void eatNimesh50182(String FoodName) {
        System.out.println("The Pigeon is eating: "+ FoodName);
    }

    public String getSpeciesNimesh50182() {
        return speciesNimesh50182;
    }

    public void setSpeciesNimesh50182(String speciesNimesh50182) {
        this.speciesNimesh50182 = speciesNimesh50182;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "speciesNimesh50182='" + speciesNimesh50182 + '\'' +
                '}';
    }
}
