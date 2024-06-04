import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Deque<String> queueOfClients = new LinkedList<>();
        queueOfClients.addAll(firstClients);

        while (!queueOfClients.isEmpty()) {

            String nameOfClient = queueOfClients.poll();
            System.out.println(nameOfClient + " сделала новый маникюр");

            if (Math.random() < 0.5) {
                queueOfClients.offer("a friend of " + nameOfClient);
            }
        }
    }
}