package transport;

public class Main {
    public static void main(String[] args) {


        Car lada = new Car("Lada", "Granta", 1.7f, "Yellow", 2015, "Russia", "Sedan", "a555aВ111", 4, "Manual", new Car.Key(false, false));
        Car audi = new Car("Audi", "A8 L TDI quattro", 3.0f, "Black", 2020, "Germany", "Sedan", "е113ве21", 4, "Auto", new Car.Key(true, true));
        Car bmw = new Car("BMW", "Z8", 3.0f, "Black", 2021, "Germany", "Sedan", "е1113ве21", 4, "Auto", new Car.Key(false, true));
        Car kia = new Car("KIA", "Sportage", 2.4f, "Red", 2018, "South Korea", "Sedan", "е113ве21", 4, "Manual", null);
        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "Orange", -2016, "South Korea", "Sedan", "е113ве21", 4, "Manual",new Car.Key(true, true));


        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());

        Car testCar = new Car("Test", "Prototype", 0.1f, "Blue", 1999, "Unknown", "Sedan", "х111хх10", 4, "Auto", null);
        System.out.println("\n" + testCar.toString());

        testCar.setEngineVolume(0);
        testCar.setColor(null);
        testCar.setSpeedStepChanger("   ");
        System.out.println(testCar.toString());
        hyundai.changeRubberType();
        hyundai.changeRubberType();
    }
}