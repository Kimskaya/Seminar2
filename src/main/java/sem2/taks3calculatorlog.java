package sem2;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class taks3calculatorlog {
    private static Logger logger = Logg.log(taks3calculatorlog.class.getName());
    public static void main(String[] args) {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int number1 = scanner3.nextInt();
        System.out.println("Выберите оператор: +, -, /, * ");
        int operator = scanner3.next().charAt(0);
        System.out.println("Введите второе число ");
        int number2 = scanner3.nextInt();
        int result;
        if (operator == '+'){
                result = number1 + number2;
                logger.log(Level.INFO, "Результат  равен " + result, StandardCharsets.UTF_8);
                System.out.println(number1 + " + " + number2 + " = " + result);
            }
            if (operator == '-'){
                result = number1 - number2;

                logger.log(Level.INFO, "Результат  равен " + result);
                System.out.println(number1 + " - " + number2 + " = " + result);
            }
            if (operator == '*'){
                result = number1 * number2;
                logger.log(Level.INFO, "Результат  равен " + result);
                System.out.println(number1 + " * " + number2 + " = " + result);
            }
            if (operator == '/'){
                result = number1 / number2;
                logger.log(Level.INFO, "Результат  равен " + result);
                System.out.println(number1 + " / " + number2 + " = " + result);
            }
            if (operator != '-' && operator !='+' && operator != '/' && operator != '*') {
            System.out.println("Вы ввели не коректный оператор ");
            }
        scanner3.close();
        }
    }

