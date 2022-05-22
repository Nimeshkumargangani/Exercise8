package vistula50182;


import java.util.Scanner;

public class Person {


    Scanner sr = new Scanner(System.in);
    String surnameGangani50182, firstNameNimesh50182, street50182, city50182;
    int zipCode50182;

    void InitiShahze(){
        System.out.println("Please enter your Name: ");
        firstNameNimesh50182 = sr.nextLine();
        System.out.println("Please enter your Surname: ");
        surnameGangani50182 = sr.nextLine();
        System.out.println("Please enter your Street name: ");
        street50182 = sr.nextLine();
        System.out.println("Please enter your City: ");
        city50182 = sr.nextLine();
        System.out.println("Please enter your Zip Code: ");
        zipCode50182 = sr.nextInt();
    }

    void printData(){
        System.out.println("Name: "+ firstNameNimesh50182);
        System.out.println("Surname: "+ surnameGangani50182);
        System.out.println("Street Name: "+ street50182);
        System.out.println("City: "+ city50182);
        System.out.println("Zip Code: "+ zipCode50182);
    }

}


class Staff extends vistula50182.Person implements Salary{
    String education , Position;
    void InitiShahze1(){
        InitiShahze();
        System.out.println("Enter your Education: ");
        education = sr.nextLine();
        System.out.println("Enter your Position");
        Position = sr.nextLine();
    }

    void Print1(){
        printData();
        System.out.println("Education: " + education);
        System.out.println("Position: "+ Position);
    }


    @Override
    public void salaryToPayGangani50182(int hoursGangani50182, int RateGangani50182) {

    }

    @Override
    public int salaryForOvertime(int extrahoursGangani50182, int rateGangani50182) {
        return Salary.super.salaryForOvertime(extrahoursGangani50182, rateGangani50182);
    }
}

interface Salary{
    void salaryToPayGangani50182(int hoursGangani50182, int RateGangani50182);



    default int salaryForOvertime(int extrahoursGangani50182, int rateGangani50182){
        int salaryOverTime=extrahoursGangani50182 * rateGangani50182;
        return salaryOverTime;

    }

    static double bonusCheckGangani50182(int yearsOfExpirience){
        double bonusGangani50182=0;
        if (yearsOfExpirience>3) bonusGangani50182=100;
        else bonusGangani50182=0;
        return bonusGangani50182;
    };


}


class main {
    public static void main(String[] args) {
        Staff employee = new Staff();
        employee.InitiShahze1();
        employee.Print1();
        employee.salaryToPayGangani50182(5,9);
        Salary.bonusCheckGangani50182(7);
    }
}