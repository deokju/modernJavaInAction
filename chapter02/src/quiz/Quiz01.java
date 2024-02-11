package quiz;

import domain.Apple;
import domain.Color;

import java.util.Arrays;
import java.util.List;

public class Quiz01 {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED));

        prettyPrintApple(inventory, new AppleSciencePrinter());
    }

    public static void prettyPrintApple(List<Apple> inventory, ApplePrinter app) {
        for(Apple apple: inventory) {
            String output = app.print(apple);
            System.out.println(String.format("[%s]에 대한 평가는-> %s",apple, output));
        }
    }

    static class AppleSciencePrinter implements ApplePrinter {

        @Override
        public String print(Apple apple) {
            if(apple.getWeight() > 150) {
                return "뉴턴이 처음 보았던 사과 무게랑 비슷";
            }else{
                return "이런사과만 있었다면 중력을 발견 못했을것이다.";
            }
        }
    }
}
