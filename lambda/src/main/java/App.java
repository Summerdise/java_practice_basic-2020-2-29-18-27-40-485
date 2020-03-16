import java.util.function.Consumer;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        String printContent = "ThoughtWorks";
        printPlus(printContent, c -> System.out.println("*" + c + "*"));
        printPlusByConsumer(printContent, c -> System.out.println("*" + c + "*"));
        int number = 3;
        square(number, num -> num * num);
        squareByFunction(number, num -> num * num);
    }

    public static void printPlus(String string, PrintPlus plus) {
        plus.print(string);
    }

    public static void printPlusByConsumer(String string, Consumer<String> con) {
        con.accept(string);
    }

    public static void square(int num, Square square) {
        square.calculate(num);
        System.out.println(num);
    }

    public static void squareByFunction(int num, Function<Integer, Integer> fun) {
        fun.apply(num);
        System.out.println(num);
    }
}
