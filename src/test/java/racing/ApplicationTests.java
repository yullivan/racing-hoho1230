package racing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.*;

class ApplicationTests {

    @Test
    void 차생성테스트() {
        Car car1 = new Car("이름", 4);

        assertThat(car1.getName()).isEqualTo("이름");
        assertThat(car1.get이동거리()).isEqualTo(4);
    }

    @Test
    void 차생성오류테스트() {

        assertThatThrownBy(()->new Car("엄청이름이 긴 자동차가 지나갑니다", 10)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void cartolistTest() {
        Car car1 = new Car("c1", 1);
        Car car2 = new Car("c2", 2);
        Car car3 = new Car("c3", 3);

        List<Car> carList = Application.carToList(car1,car2,car3);
        assertThat(carList).isEqualTo(List.of(new Car("c1",1),new Car("c2",2),new Car("c3",3)));
    }

    @Test
    void randomTest() {
        Car car = new Car("car", 3);
        int count=car.goCount(car.get이동거리());
       //assertThat(count).isEqualTo(3);//랜덤이기떄문에 성공하거나 안하거나
    }

    @Test
    void 우승자추출테스트() {
        List<Car> carList=new ArrayList<>(List.of(new Car("c1",1)
                ,new Car("c2",2)
                ,new Car("c3",3)));
        assertThat(Car.winner(carList)).isEqualTo(new ArrayList<>(List.of(new Car("c3",3))));
    }

    @Test
    void 카운트만큼길만들기() {
        Car car = new Car("car", 3);
        List<Car> carList=new ArrayList<>(List.of(new Car("c1",1)
                ,new Car("c2",2)
                ,new Car("c3",3)));

        assertThat(Application.makeLoad(car)).isEqualTo(car.getName()+"---");
        for (Car car1 : carList) {
            System.out.println(Application.makeLoad(car1));
        }



    }
}



