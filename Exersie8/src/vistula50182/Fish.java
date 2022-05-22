package vistula50182;

public class Fish extends Animal implements AnimalBehavior,AnimalMove{
    private String scaleColorNimesh50182;

    public Fish(){
        super();
        scaleColorNimesh50182 = "NN";
    }

    public Fish(String nameNimesh50182, int ageNimesh50182 , int weightNimesh50182, String scaleColorNimesh50182){
        super(nameNimesh50182, ageNimesh50182, weightNimesh50182);
        this.scaleColorNimesh50182 = scaleColorNimesh50182;
    }

    public Fish(int ageNimesh50182 , String scaleColorNimesh50182){
        super(ageNimesh50182);
        this.scaleColorNimesh50182 = scaleColorNimesh50182;
    }

    public void drinkWaterNimesh50182(){
        System.out.println("Gulp gulp");
    }

    @Override
    public void getVoiceNimesh50182() {
        System.out.println("Fish is making sounds");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void moveNimesh50182() {
        System.out.println("Fish is swimming");
    }

    @Override
    public void eatNimesh50182(String FoodName) {
        System.out.println("Fish is eating: "+ FoodName);
    }

    public String getScaleColorNimesh50182() {
        return scaleColorNimesh50182;
    }

    public void setScaleColorNimesh50182(String scaleColorNimesh50182) {
        this.scaleColorNimesh50182 = scaleColorNimesh50182;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "scaleColorNimesh50182='" + scaleColorNimesh50182 + '\'' +
                '}';
    }
}