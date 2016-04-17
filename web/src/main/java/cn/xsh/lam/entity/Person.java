package cn.xsh.lam.entity;

import org.springframework.stereotype.Component;

@Component
public class Person {


    private String username;

    private String address;

    private Car car;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", car=" + car +
                '}';
    }
}
