package transport;

import java.util.PrimitiveIterator;
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
    private Key key;

    public static class Key {
        private final boolean remoteKeyStartAvailable;
        private final boolean keyLessAccess;

        public Key(boolean remoteKeyStartAvailable, boolean keyLessAccess) {
            this.remoteKeyStartAvailable = remoteKeyStartAvailable;
            this.keyLessAccess = keyLessAccess;
        }

        public boolean isRemoteKeyStartAvailable() {
            return remoteKeyStartAvailable;
        }

        public boolean isKeyLessAccess() {
            return keyLessAccess;
        }

        @Override
        public String toString() {
            return ((remoteKeyStartAvailable ? "С удаленным запуском " : "Без удаленного запуска ") +
                    (keyLessAccess ? ", с допуском без ключа " : ", нет функции допуска без ключа"));
        }
    }

    public Car(String brand,
               String model,
               float engineVolume,
               String color,
               int year,
               String country,
               String typeOfFrame,
               String numberRegistration,
               int numPassengerSeats,
               String speedStepChanger,
               Key key) {
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
        setKey(key);
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

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
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
                ", установленная резина: " + (rubberTypeIsWinter == true ? "Зимняя" : "Летняя") +
                ", " + key;
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

    public void changeRubberType() {
        this.setRubberTypeIsWinter(!this.rubberTypeIsWinter);
        System.out.print("Произведена замена резины на " + this.brand + " - установлена резина для сезона ");
        System.out.println(this.rubberTypeIsWinter == true ? "зима" : "лето");
    }
}
