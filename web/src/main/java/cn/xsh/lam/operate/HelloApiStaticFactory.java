package cn.xsh.lam.operate;

import cn.xsh.lam.entity.Car;

public class HelloApiStaticFactory {

    //工厂方法
    public static Car newInstance(String number, String colour) {
        return new Car(number, colour);
    }

}
