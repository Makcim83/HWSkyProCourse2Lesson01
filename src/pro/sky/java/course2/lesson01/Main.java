package pro.sky.java.course2.lesson01;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 1.7f, "Yellow", 2015, "Russia");
        Car audi = new Car("Audi", "A8 L TDI quattro", 3.0f, "Black", 2020, "Germany");
        Car bmw = new Car("BMW", "Z8", 3.0f, "Black", 2021, "Germany");
        Car kia = new Car("KIA", "Sportage", 2.4f, "Red", 2018, "South Korea");
        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "Orange", 2016, "South Korea");

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());

        Car testCar = new Car("Test", "Prototype", 0.1f, "Blue", 2023, "Unknown");
        System.out.println("\n"+testCar.toString());

        testCar.setBrand(null);
        testCar.setModel(null);
        testCar.setEngineVolume(0);
        testCar.setColor(null);
        testCar.setYear(0);
        testCar.setCountry(null);
        System.out.println(testCar.toString());
    }
}