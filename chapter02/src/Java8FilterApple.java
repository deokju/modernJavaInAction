import domain.Apple;
import domain.Color;
import logic.AppleGreenColorPredicate;
import logic.ApplePredicate;
import utils.Print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static domain.Color.RED;

public class Java8FilterApple {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, RED));

        //인터페이스를 구현한다.
        Print.print("자바8 [초록] AppleGreenColorPredicate ",  filterApples(inventory, new AppleGreenColorPredicate()));

        //익명클래스로 인터페이스를 구현
        Print.print("자바8 [빨강] 익명클래스 ",  filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return RED == apple.getColor();
            }
        }));

        Print.print("자바8 [초록] 람다", filterApples(inventory, (Apple a)-> a.getColor() == Color.GREEN)  );
        Print.print("자바8 [150>] 람다", filterApples(inventory, (Apple a)-> a.getWeight() > 150)  );
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        ArrayList<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }

        return result;
    }

}