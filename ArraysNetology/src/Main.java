import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {100, 200, 300};
        int[] finalPrices = new int[3];
        int checkout = 0;

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " руб/шт");
        }
        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String temp = sc.nextLine();
            if (temp.equals("end")) {
                break;
            }

            String[] parts = temp.split(" ");
            int product = Integer.parseInt(parts[0]) - 1;
            int price = Integer.parseInt(parts[1]);

            finalPrices[product] += price;
        }


        System.out.println("Ваша корзина:");
        for (int i = 0; i < products.length; i++) {
            checkout += finalPrices[i] * prices[i];
            if (finalPrices[i] == 0) {
                continue;
            }
            System.out.println(
                    products[i] + " " + finalPrices[i]
                            + " шт " + prices[i] + " руб/шт "
                            + (finalPrices[i] * prices[i]) + " руб в сумме");
        }
        System.out.println("Итого " + checkout + " руб");
    }
}