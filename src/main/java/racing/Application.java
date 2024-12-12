package racing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final String EMOJI ="\uD83C\uDFCE\uFE0F";
        final String load ="-";


        Scanner scanner = new Scanner(System.in);

           System.out.print("레이스에 참가할 자동차들의 이름을 쉼표(,)로 구분하여 입력하세요. ");
           Car car1 = new Car(scanner.nextLine());
            System.out.print("몇 회 실행할까요?");
            int count =scanner.nextInt();
           String emojiCar = car1.toString().concat(" "+EMOJI);
           String carStatus="";

        for (int i = 0; i < count; i++) {
            if(car1.goStop()=="go"){
                if(carStatus.contains(EMOJI)){
                    carStatus=carStatus.concat(load);
                }else carStatus= emojiCar.concat(load);
            }else carStatus=carStatus;

            if(carStatus.contains(load.repeat(4))){
                carStatus=carStatus.concat("\uD83C\uDFC1");
                System.out.println("("+(i+1)+")");
                System.out.println(carStatus);

                System.out.println("🏆우승자는 "+car1+"!");
                break;
            }
            System.out.println("("+(i+1)+")");
            System.out.println(carStatus);

        }




    }


}
