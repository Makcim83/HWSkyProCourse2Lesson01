package transport;

import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String speedStepChanger;
    private final String typeOfFrame;
    private String numberRegistration;
    private final int numPassengerSeats;
    private boolean rubberTypeIsWinter;

    public Car(String brand,
               String model,
               float engineVolume,
               String color,
               int year,
               String country,
               String typeOfFrame,
               String numberRegistration,
               int numPassengerSeats,
               String speedStepChanger)
    {
        this.brand = validationString(brand);
        this.model = validationString(brand);
        this.year = checkYear(year);
        this.country = validationString(country);
        this.typeOfFrame = validationString(typeOfFrame);
        this.numPassengerSeats = numPassengerSeats;
        setEngineVolume(engineVolume);
        setColor(color);
        setSpeedStepChanger(speedStepChanger);
        setRubberTypeIsWinter(rubberTypeIsWinter);
        setNumberRegistration(numberRegistration);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTypeOfFrame() {
        return typeOfFrame;
    }

    public int getNumPassengerSeats() {
        return numPassengerSeats;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = checkEngineVolume(engineVolume);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validationString(color);
    }

    public String getSpeedStepChanger() {
        return speedStepChanger;
    }

    public void setSpeedStepChanger(String speedStepChanger) {
        this.speedStepChanger = validationString(speedStepChanger);
    }

    public boolean isRubberTypeIsWinter() {
        return rubberTypeIsWinter;
    }

    public void setRubberTypeIsWinter(boolean rubberTypeIsWinter) {
        this.rubberTypeIsWinter = rubberTypeIsWinter;
    }

    public String getNumberRegistration() {
        return numberRegistration;
    }

    public void setNumberRegistration(String number) {
        this.numberRegistration = validationString(numberIsValid(number));
    }

    @Override
    public String toString() {
        return "марка: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + engineVolume +
                ", цвет кузова: " + color +
                ", год выпуска: " + year +
                ", страна-производитель: " + country +
                ", коробка передач: " + speedStepChanger +
                ", тип кузова: " + typeOfFrame +
                ", регистрационный номер: " + numberRegistration +
                ", количество мест: " + numPassengerSeats +
                ", установленная резина: " + (rubberTypeIsWinter == true ? "Зимняя" : "Летняя");
    }

    private String validationString(String s) {
        return s == null || s.isBlank() || s.isEmpty() ? "Default" : s;
    }

    private int checkYear(int year) {
        return year <= 0 ? 2000 : year;
    }

    private float checkEngineVolume(float engineVolume) {
        return engineVolume <= 0 ? 1.5f : engineVolume;
    }

    private String numberIsValid(String sn) {
        return (Pattern.matches("^[aАвВеЕкКм-оМ-Ор-уР-У]\\d{3}[aАвВеЕкКм-оМ-Ор-уР-У]{2}\\d{2,3}$", sn)) ? sn : "Номер не определен";
    }
}
