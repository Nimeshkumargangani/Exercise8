package vistula50182;

public class BlowFish extends Fish implements AnimalBehavior, AnimalMove{
    private int diameterNimesh50182;

    BlowFish(){
        super();
        diameterNimesh50182 =10;
    }

    public BlowFish(String nameNimesh50182String , int ageNimesh50182 , int weightNimesh50182, String scaleColorNimesh50182, int diameterNimesh50182){
        super(nameNimesh50182String,ageNimesh50182,weightNimesh50182,scaleColorNimesh50182);
        this.diameterNimesh50182 = diameterNimesh50182;

    }

    @Override
    public void moveNimesh50182() {
        System.out.println("Blowfish is swimming");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZ");
    }

    public BlowFish(int ageNimesh50182, String scaleColorNimesh50182, int diameterNimesh50182){
        super(ageNimesh50182, scaleColorNimesh50182);
        this.diameterNimesh50182 = diameterNimesh50182;
    }

    public void swimNimesh50182(){
        System.out.println("The BlowFish is swimming upstream");
    }

    @Override
    public void eatNimesh50182(String FoodName) {
        System.out.println("The BlowFish is eating: "+ FoodName);
    }

    @Override
    public void getVoiceNimesh50182() {
        System.out.println("The blowfish is howling");
    }

    public int getDiameterNimesh50182() {
        return diameterNimesh50182;
    }

    public void setDiameterNimesh50182(int diameterNimesh50182) {
        this.diameterNimesh50182 = diameterNimesh50182;
    }

    @Override
    public String toString() {
        return "BlowFish{" +
                "diameterNimesh50182=" + diameterNimesh50182 +
                '}';
    }
}