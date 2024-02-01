import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Java7FilterApples {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red")
        );

        // TEST
        printApples("초록사과 : ",filterGreenApples(inventory));
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
        System.out.println("===================");
    }

    // 초록사과만 뽑아낸다
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();

        for(Apple apple: inventory) {
            if(GREEN.equals(apple.getColor())){
                result.add(apple);
            }
        }

        return result;
    }

    // 150그램 이상 사과만 뽑아낸다.
    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
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