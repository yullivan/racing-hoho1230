package racing;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static java.lang.System.load;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTests {

    @Test
    void 랜덤값_테스트() {
        //given
        int randomNum = new Random().nextInt(6)+1;
        //then
        System.out.println(randomNum);
    }

    @Test
    void 차_생성에러() {
        assertThatThrownBy(()->new Car("우리집자동차는열자가넘어요")).isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    void loadTest() {
        Car car1=new Car("hoyoen");
        Car car2=new Car("hoyo");
        Car car3=new Car("hoen");

        car1.goStop();
        car2.goStop();
        car3.goStop();
        Application.printResult(car1);
        Application.printResult(car2);
        Application.printResult(car3);


    }


}
