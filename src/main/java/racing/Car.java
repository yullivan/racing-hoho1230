package racing;

import java.util.Objects;

public class Car {
    String name;
    int 이동거리;

    public Car(String name, int 이동거리) {
        if(name.length()>10){
            throw new IllegalArgumentException("자동차 이름은 10자를 초과할 수 없습니다.");
        }
        this.name=name;
        this.이동거리=이동거리;
    }

    public String getName() {
        return name;
    }

    public int get이동거리() {
        return 이동거리;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return 이동거리 == car.이동거리 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, 이동거리);
    }
}
