import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java7FilterApple {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED));

        printApples("자바7 초록사과", filterGreenApples_java7_bad(inventory));
        printApples("자바7 사과 색깔[초록]", filterGreenApples_java7_byColor(inventory, Color.GREEN));
        printApples("자바7 사과 색깔[빨강]", filterGreenApples_java7_byColor(inventory, Color.RED));
        printApples("자바7 사과 무게[120]", filterGreenApples_java7_byWeight(inventory, 120));

    }

    public static List<Apple> filterGreenApples_java7_bad(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory) {
            if(Color.GREEN == apple.getColor()) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterGreenApples_java7_byColor(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory) {
            if(color == apple.getColor()) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterGreenApples_java7_byWeight(List<Apple> inventory, final int WEIGHT) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory) {
            if(WEIGHT < apple.getWeight()) {
                result.add(apple);
            }
        }
        return result;
    }


    enum Color {
        RED,
        GREEN
    }

    public static class Apple {

        private int weight = 0;
        private Color color;

        public Apple(int weight, Color color) {
            this.weight = weight;
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        @SuppressWarnings("boxing")
        @Override
        public String toString() {
            return String.format("Apple{color=%s, weight=%d}", color, weight);
        }

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
}