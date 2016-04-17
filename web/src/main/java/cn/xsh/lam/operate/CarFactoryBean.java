package cn.xsh.lam.operate;

import cn.xsh.lam.entity.Car;
import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {

    private String num;

    public void setNum(String num) {
        this.num = num;
    }

    //返回bean对象
    @Override
    public Car getObject() throws Exception {
        return new Car(num, "block");
    }

    //返回bean类型
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}
