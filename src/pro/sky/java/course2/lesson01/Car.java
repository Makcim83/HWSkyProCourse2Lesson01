package pro.sky.java.course2.lesson01;

public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, float engineVolume, String color, int year, String country) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setColor(color);
        setYear(year);
        setCountry(country);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = checkNull(brand);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = checkNull(model);
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        }
        else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = checkNull(color);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            this.year = 2000;
        }
        else {
            this.year = year;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = checkNull(country);
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

    private String checkNull(String s){
        if (s == null) {
            return "Default";
        } else {
            return s;
        }
    }
}
