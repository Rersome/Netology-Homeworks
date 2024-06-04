import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<Address, Integer> costPerAddress = new HashMap<>();
        Set<String> uniqueCountry = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        String country;
        String city;
        String tempWeight;
        int weight = 0;
        int currentCost = 0;
        int costForAll = 0;


        Address astana = new Address ("Казахстан", "Астана");
        Address tokyo = new Address ("Япония", "Токио");
        Address kazan = new Address("Россия", "Казань");
        Address moscow = new Address("Россия", "Москва");
        Address vladivostok = new Address("Россия", "Владивосток");

        costPerAddress.put(kazan, 200);
        costPerAddress.put(moscow, 500);
        costPerAddress.put(vladivostok, 1200);
        costPerAddress.put(tokyo, 2500);
        costPerAddress.put(astana, 1400);

        while (true) {
            Address tempAddress;
            System.out.print("Заполнение нового заказа.\n" +
                    "Введите страну: ");
            country = sc.nextLine();
            if (country.equals("end")) {
                break;
            }
            System.out.print("Введите город: ");
            city = sc.nextLine();
            System.out.print("Введите вес (кг): ");
            tempWeight = sc.nextLine();
            weight = Integer.parseInt(tempWeight);
            tempAddress = new Address(country, city);


            if (!costPerAddress.containsKey(tempAddress)) {
                System.out.println("Доставки по этому адресу нет\n");
            } else {
                uniqueCountry.add(country);
                currentCost = costPerAddress.get(tempAddress) * weight;
                costForAll += currentCost;
                System.out.println("Стоимость доставки составит: " + currentCost +
                        "\nОбщая стоимость всех доставок: " + costForAll +
                        "\nСтраны в которые были оформлены доставки: " + uniqueCountry + "\n");
            }
        }
    }
}