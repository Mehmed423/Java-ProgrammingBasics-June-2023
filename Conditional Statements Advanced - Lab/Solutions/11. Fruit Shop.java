import java.util.Scanner;
public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String week = scanner.nextLine();
        String fruit = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        if (week.equals("banana")) {
            if (fruit.equals("Monday")) {
                price = 2.50;
            } else if (fruit.equals("Tuesday")) {
                price = 2.50;
            } else if (fruit.equals("Wednesday")) {
                price = 2.50;
            } else if (fruit.equals("Thursday")) {
                price = 2.50;
            } else if (fruit.equals("Friday")) {
                price = 2.50;
            } else if (fruit.equals("Saturday")) {
                price = 2.70;
            } else if (fruit.equals("Sunday")) {
                price = 2.70;
            }
        } else if (week.equals("apple")) {
            if (fruit.equals("Monday")) {
                price = 1.20;
            } else if (fruit.equals("Tuesday")) {
                price = 1.20;
            } else if (fruit.equals("Wednesday")) {
                price = 1.20;
            } else if (fruit.equals("Thursday")) {
                price = 1.20;
            } else if (fruit.equals("Friday")) {
                price = 1.20;
            } else if (fruit.equals("Saturday")) {
                price = 1.25;
            } else if (fruit.equals("Sunday")) {
                price = 1.25;
            }
        }else if (week.equals("orange")) {
            if (fruit.equals("Monday")) {
                price = 0.85;
            } else if (fruit.equals("Tuesday")) {
                price = 0.85;
            } else if (fruit.equals("Wednesday")) {
                price = 0.85;
            } else if (fruit.equals("Thursday")) {
                price = 0.85;
            } else if (fruit.equals("Friday")) {
                price = 0.85;
            } else if (fruit.equals("Saturday")) {
                price = 0.90;
            } else if (fruit.equals("Sunday")) {
                price = 0.90;
            }
        }else if (week.equals("grapefruit")) {
            if (fruit.equals("Monday")) {
                price = 1.45;
            } else if (fruit.equals("Tuesday")) {
                price = 1.45;
            } else if (fruit.equals("Wednesday")) {
                price = 1.45;
            } else if (fruit.equals("Thursday")) {
                price = 1.45;
            } else if (fruit.equals("Friday")) {
                price = 1.45;
            } else if (fruit.equals("Saturday")) {
                price = 1.60;
            } else if (fruit.equals("Sunday")) {
                price = 1.60;
            }
        } else if (week.equals("kiwi")) {
            if (fruit.equals("Monday")) {
                price = 2.70;
            } else if (fruit.equals("Tuesday")) {
                price = 2.70;
            } else if (fruit.equals("Wednesday")) {
                price = 2.70;
            } else if (fruit.equals("Thursday")) {
                price = 2.70;
            } else if (fruit.equals("Friday")) {
                price = 2.70;
            } else if (fruit.equals("Saturday")) {
                price = 3.00;
            } else if (fruit.equals("Sunday")) {
                price = 3.00;
            }
        }else if (week.equals("pineapple")) {
            if (fruit.equals("Monday")) {
                price = 5.50;
            } else if (fruit.equals("Tuesday")) {
                price = 5.50;
            } else if (fruit.equals("Wednesday")) {
                price = 5.50;
            } else if (fruit.equals("Thursday")) {
                price = 5.50;
            } else if (fruit.equals("Friday")) {
                price = 5.50;
            } else if (fruit.equals("Saturday")) {
                price = 5.60;
            } else if (fruit.equals("Sunday")) {
                price = 5.60;
            }
        }else if (week.equals("grapes")) {
            if (fruit.equals("Monday")) {
                price = 3.85;
            } else if (fruit.equals("Tuesday")) {
                price = 3.85;
            } else if (fruit.equals("Wednesday")) {
                price = 3.85;
            } else if (fruit.equals("Thursday")) {
                price = 3.85;
            } else if (fruit.equals("Friday")) {
                price = 3.85;
            } else if (fruit.equals("Saturday")) {
                price = 4.20;
            } else if (fruit.equals("Sunday")) {
                price = 4.20;
            }
        }


        double total = price * quantity;
        System.out.printf("%.2f",total);
    }
}
