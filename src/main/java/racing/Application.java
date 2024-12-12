package racing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final String EMOJI = "\uD83C\uDFCE\uFE0F";
        final String load = "-";


        Scanner scanner = new Scanner(System.in);

        System.out.print("레이스에 참가할 자동차들의 이름을 쉼표(,)로 구분하여 입력하세요. \n");
        String cars = scanner.nextLine();  //ho,yo,ni
        String carS1 = cars.substring(0, cars.indexOf(',')); //0,2   ho
        String carS2 = cars.substring(cars.indexOf(',') + 1,cars.indexOf(',',cars.indexOf(',') + 1));//3,
        String carS3 = cars.substring(carS1.length()+1+carS2.length()+1);

        System.out.println("cars = " + cars);
        System.out.println("carS1 = " + carS1);
        System.out.println("carS2 = " + carS2);
        System.out.println("carS3 = " + carS3);

        List<Car> carList = new ArrayList<>(List.of(new Car(carS1),new Car(carS2),new Car(carS3)));

        System.out.println(carList);
        System.out.print("몇 회 실행할까요?");
        int count = scanner.nextInt();

        String carStatus = "";

        for (Car car : carList) {
            String emojiCar = car.toString().concat(" " + EMOJI);
            for (int i = 0; i < count; i++) {
                if (car.goStop() == "go") {
                    if (carStatus.contains(EMOJI)) {
                        carStatus = carStatus.concat(load);
                    } else carStatus = emojiCar.concat(load);
                } else carStatus = carStatus;

//            if (carStatus.contains(load.repeat(4))) {
//                carStatus = carStatus.concat("\uD83C\uDFC1");
//                System.out.println("(" + (i + 1) + ")");
//                System.out.println(carStatus);
//
//                System.out.println("🏆우승자는 " + car1 + "!");
//                break;
//            }
                System.out.println("(" + (i + 1) + ")");
                System.out.println(carStatus);

            }
        }



    }


}
