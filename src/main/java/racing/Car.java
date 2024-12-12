package racing;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Car {
    private String name;
    private int 이동거리;


    public Car(String name) {

        this.name = name;

    }

    public Car( String name,int 이동거리) {
        if(name.length() >10){
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 10글자 미만입니다.");
        }this.name = name;

        this.이동거리 = 이동거리;

    }

    int goStop(){

            int randomNum = new Random().nextInt(6)+1;
            if(!(randomNum==1||randomNum==2)){
                이동거리+=1;

            }
                return 이동거리;

    }

    public String getName() {
        return name;
    }

    public int get이동거리() {
        return 이동거리;
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
