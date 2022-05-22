package vistula50182;

abstract class Animal implements AnimalMove ,AnimalName{
    private String nameNimesh50182;
    private int ageNimesh50182;
    private int weightNimesh50182;

    public Animal(){
        ageNimesh50182 = weightNimesh50182 = 10;
        nameNimesh50182 = "NN";
    }

    public Animal(String nameNimesh50182, int ageNimesh50182, int weightNimesh50182){
        this.nameNimesh50182 = nameNimesh50182;
        this.ageNimesh50182 = ageNimesh50182;
        this.weightNimesh50182 = weightNimesh50182;
    }

    public Animal(int ageNimesh50182){
        this.ageNimesh50182 = ageNimesh50182;
    }

    public abstract void eatNimesh50182(String FoodName);

    public abstract void moveNimesh50182();

    public abstract void getVoiceNimesh50182();

    public String getNameNimesh50182() {
        return nameNimesh50182;
    }

    public void setNameNimesh50182(String nameNimesh50182) {
        this.nameNimesh50182 = nameNimesh50182;
    }

    public int getAgeNimesh50182() {
        return ageNimesh50182;
    }

    public void setAgeNimesh50182(int ageNimesh50182) {
        this.ageNimesh50182 = ageNimesh50182;
    }

    public int getWeightNimesh50182() {
        return weightNimesh50182;
    }

    public void setWeightNimesh50182(int weightNimesh50182) {
        this.weightNimesh50182 = weightNimesh50182;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nameNimesh50182='" + nameNimesh50182 + '\'' +
                '}';
    }
}