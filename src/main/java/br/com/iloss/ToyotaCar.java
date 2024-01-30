package br.com.iloss;

public class ToyotaCar extends Car {

    @Override
    public void getModel() {
        System.out.println("Toyota");
    }

    public ToyotaCar(int horsePower, String fuelSource, String color) {
        super(horsePower, fuelSource, color);
    }

}
