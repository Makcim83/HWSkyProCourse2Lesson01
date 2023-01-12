package pro.sky.java.course2.lesson01;

public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, float engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null ) this.brand = "default";
        else this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null ) this.model = "default";
        else this.model = model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) this.engineVolume = 1.5f;
        else this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) this.color = "White";
        else this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) this.year = 2000;
        else this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null ) this.country = "default";
        else this.country = country;
    }

    @Override
    public String toString() {
        return "марка: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + engineVolume +
                ", цвет кузова: " + color +
                ", год выпуска: " + year +
                ", страна-производитель: " + country;
    }
}
