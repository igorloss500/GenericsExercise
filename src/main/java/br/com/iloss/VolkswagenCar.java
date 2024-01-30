package br.com.iloss;

public class VolkswagenCar extends Car {

    @Override
    public void getModel() {
        System.out.println("Volks");
    }

    public VolkswagenCar(int horsePower, String fuelSource, String color) {
        super(horsePower, fuelSource, color);
    }

}
