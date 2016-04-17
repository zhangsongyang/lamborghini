package cn.xsh.lam.operate;

import cn.xsh.lam.entity.Car;

public class HelloApiInstanceFactory {

    public Car newInstance(String number, String colour) {
        return new Car(number, colour);
    }

}
