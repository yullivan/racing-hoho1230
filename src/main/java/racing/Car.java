package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Car {
    private String name;

    public Car(String name) {
        if(name.length() >10){
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 10글자 미만입니다.");
        }this.name = name;
    }

    String Game(Integer count){

        int randomNum = new Random().nextInt(6)+1;
        if(randomNum==1||randomNum==2){
            return "stop";
        }else return "go";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
