import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8FilterApples {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red")
        );

        // TEST
        printApples("초록사과_java7 : ",   filterGreenApples_java7(inventory));  //java7
        printApples("무거운사과_java7 : ",filterHeavyApples_java7(inventory)); //java7

        printApples("초록사과_java8 : ",    filterApples_java8(inventory, Java8FilterApples::isGreenApple)); //java8
        printApples("무거운사과_java8 : ",filterApples_java8(inventory, Java8FilterApples::isHeavyApple)); //java8

        printApples("초록사과_java8_lambda : ",    filterApples_java8(inventory, (Apple a) -> GREEN.equals(a.getColor()) ) ); //java8
        printApples("무거운사과_java8_lambda: ",filterApples_java8(inventory,   (Apple a) -> a.getWeight() > MIN_WEIGHT)); //java8
    }

    private static void printApples(String title, List<Apple> apples) {
        System.out.println("===================");
        System.out.print(title);
        for(Apple apple: apples) {
            System.out.print("[ ");
            System.out.print(apple);
            System.out.print(" ]");
        }
        System.out.println("");

    }

    public static boolean isGreenApple(Apple apple) {
        return apple.getColor().equals(GREEN);
    }
    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }

    public static List<Apple> filterApples_java8(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }


    // 초록사과만 뽑아낸다 - java7
    public static List<Apple> filterGreenApples_java7(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();

        for(Apple apple: inventory) {
            if(GREEN.equals(apple.getColor())){
                result.add(apple);
            }
        }

        return result;
    }

    // 150그램 이상 사과만 뽑아낸다. - java7
    public static List<Apple> filterHeavyApples_java7(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();

        for(Apple apple: inventory) {
            if(apple.getWeight() > MIN_WEIGHT){
                result.add(apple);
            }
        }

        return result;
    }


    public static  final  String GREEN = "green";
    public static  final  int MIN_WEIGHT = 150;

    public static class Apple {

        private int weight = 0;
        private String color = "";

        public Apple(int weight, String color) {
            this.weight = weight;
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @SuppressWarnings("boxing")
        @Override
        public String toString() {
            return String.format("Apple{color='%s', weight=%d}", color, weight);
        }

    }
}