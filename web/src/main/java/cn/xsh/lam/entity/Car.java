package cn.xsh.lam.entity;


public class Car {

    private String number;

    private String colour;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Car() {
    }

    public Car(String number, String colour) {
        this.number = number;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
