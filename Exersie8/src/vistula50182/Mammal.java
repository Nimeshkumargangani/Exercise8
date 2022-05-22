package vistula50182;

public class Mammal extends Animal implements AnimalMove,AnimalName {

    private String orderNimesh50182;

    public Mammal(){
        super();
        orderNimesh50182 = "NN";
    }

    public Mammal(String nameNimesh50182, int ageNimesh50182 , int weightNimesh50182, String orderNimesh50182){
        super(nameNimesh50182, ageNimesh50182, weightNimesh50182);
        this.orderNimesh50182 = orderNimesh50182;
    }

    public Mammal(int ageNimesh50182 , String orderNimesh50182){
        super(ageNimesh50182);
        this.orderNimesh50182 = orderNimesh50182;
    }

    @Override
    public void moveNimesh50182() {
        System.out.println("Mammal is moving ");
    }

    public void drinkMilkNimesh50182(){
        System.out.println("Gulp gulp");
    }


    @Override
    public void getVoiceNimesh50182() {
        System.out.println("Mammal is making sounds");
    }

    @Override
    public void eatNimesh50182(String FoodName) {
        System.out.println("Mammal is eating: " + FoodName);
    }

    public String getOrderNimesh50182() {
        return orderNimesh50182;
    }

    public void setOrderNimesh50182(String orderNimesh50182) {
        this.orderNimesh50182 = orderNimesh50182;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "orderNimesh50182='" + orderNimesh50182 + '\'' +
                '}';
    }
}