package vistula50182;

public class Bird extends Animal implements AnimalMove,AnimalBehavior{
    private String featherColorNimesh50182;



    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    public Bird(){
        super();
        featherColorNimesh50182 ="NN";


    }

    public Bird (String Nimesh50182, int ageNimesh50182, int weightNimesh50182, String featherColorNimesh50182){
        super(Nimesh50182, ageNimesh50182, weightNimesh50182);
        this.featherColorNimesh50182 = featherColorNimesh50182;
    }

    public Bird(int ageNimesh50182 , String featherColorNimesh50182){
        super(ageNimesh50182);
        this.featherColorNimesh50182 = featherColorNimesh50182;
    }

    public void takingFlightNimesh50182(){
        System.out.println("Flap flap");
    }



    @Override
    public void getVoiceNimesh50182() {
        System.out.println("Bird is making sounds");
    }

    @Override
    public void eatNimesh50182(String FoodName) {
        System.out.println("Bird is eating: " + FoodName);
    }

    @Override
    public void moveNimesh50182() {
        System.out.println("Bird moves");
    }

    public String getFeatherColorNimesh50182() {
        return featherColorNimesh50182;
    }



    public void setFeatherColorNimesh50182(String featherColorNimesh50182) {
        this.featherColorNimesh50182 = featherColorNimesh50182;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColorNimesh50182='" + featherColorNimesh50182 + '\'' +
                '}';
    }
}