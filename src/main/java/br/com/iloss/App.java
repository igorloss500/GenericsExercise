package br.com.iloss;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Car> listaCarros = new ArrayList<>();

        Car civicCar = new Civic(1000,"50","azul");
        Car toyotaCar = new ToyotaCar(500,"70","rosa");
        Car volkswagenCar = new VolkswagenCar(300,"80","amarelo");

        listaCarros.add(civicCar);
        listaCarros.add(toyotaCar);
        listaCarros.add(volkswagenCar);

        imprimirCarros(listaCarros);


    }

    public static void imprimirCarros(List<? extends Car> lista){
        for ( Car car: lista){
            car.getModel();
        }
    }
}
