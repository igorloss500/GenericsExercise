package br.com.iloss;

public class Civic extends Car{
    @Override
    public void getModel() {
        System.out.println("Civic");
    }

    public Civic(int horsePower, String fuelSource, String color) {
        super(horsePower,
                fuelSource,
                color);
    }

}
