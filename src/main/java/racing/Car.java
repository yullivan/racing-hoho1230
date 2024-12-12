package racing;

import java.util.Objects;
import java.util.Random;

public class Car {
    private String name;


    public Car(String name) {
        if(name.length() >10){
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 10글자 미만입니다.");
        }
        this.name = name;

    }
    String goStop(){
            int randomNum = new Random().nextInt(6)+1;
            if(!(randomNum==1||randomNum==2)){
                return "go";
            }
                return  "stop";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
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
