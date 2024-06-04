import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> toDoList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String caseSelection;

        while (true) {
            // Создаем меню, которое будет повторно выводиться
            System.out.println("Выберите операцию: \n" +
                    "0. Выход из программы\n" +
                    "1. Добавить дело\n" +
                    "2. Показать дела\n" +
                    "3. Удалить дело по номеру\n" +
                    "4. Удалить дело по названию\n" +
                    "5. Удалить задачи по ключевому слову");
            String choice = sc.nextLine();
            System.out.println("Ваш выбор: " + choice + "\n");
            // Меняем тип данных на инт, чтобы было проще передвигаться по кейсам
            int choiceInt = Integer.parseInt(choice);

            // В конце работы каждого кейса выводим список дел
            switch (choiceInt) {
                case 0:
                    showTasks(toDoList);
                    return;
                // Добавление дела
                case 1:
                    System.out.print("Введите название задачи: ");
                    caseSelection = sc.nextLine();
                    if (toDoList.contains(caseSelection)) {
                        System.out.println("У Вас уже есть такое дело!");
                        break;
                    }
                    toDoList.add(caseSelection);
                    System.out.println("Добавлено!\n");
                    showTasks(toDoList);
                    break;
                // Выводим список дел
                case 2:
                    showTasks(toDoList);
                    break;
                case 3:
                    if (isEmpty(toDoList)) {
                        break;
                    }
                    System.out.print("Введите номер для удаления: ");
                    caseSelection = sc.nextLine();
                    choiceInt = Integer.parseInt(caseSelection);
                    if (choiceInt > toDoList.size()) {
                        System.out.println("У Вас нет задачи под номером " + choiceInt + "\n");
                        break;
                    }
                    if (choiceInt < 1){
                        System.out.println("Номер задачи не может меньше 1\n");
                        break;
                    }
                    // Удаляем дела из списка по индексу
                    // Элементы начинаются с 0, поэтому отнимаем единицу, чтобы не выйти за пределы
                    toDoList.remove(choiceInt - 1);
                    System.out.println("Удалено!\n");
                    showTasks(toDoList);
                    break;
                case 4:
                    if (isEmpty(toDoList)) {
                        break;
                    }
                    System.out.print("Введите задачу для удаления: ");
                    caseSelection = sc.nextLine();
                    // Исключаем то, что пользователь может удалить несуществующее дело
                    if (!toDoList.contains(caseSelection)) {
                        System.out.println("У Вас нет задачи под названием: " + caseSelection + "\n");
                        break;
                    }
                    toDoList.remove(caseSelection);
                    System.out.println("Удалено!\n");
                    showTasks(toDoList);
                    break;
                case 5:
                    if (isEmpty(toDoList)) {
                        break;
                    }
                    System.out.println("Введите ключевое слово: ");
                    caseSelection = sc.nextLine();
                    String keyword = caseSelection;
                    // Удаляем все дела, которые содержат ключевое слово "keyword",
                    // без использования fori foreach
                    toDoList.removeIf(task -> task.contains(keyword));
                    System.out.println("Задачи, содержащие ключевое слово " + caseSelection + ", были удалены.\n");
                    showTasks(toDoList);
                default:
                    System.out.println("Введен неправильный номер операции!");
            }
        }
    }

    // Метод для вывода всех записаных дел
    public static void showTasks(List<String> listTemp) {
        int counter = 1;
        if (listTemp.isEmpty()) {
            System.out.println("У Вас нет задач!\n");
        } else {
            for (String thing : listTemp) {
                System.out.println(counter + ". " + thing);
                counter++;
            }
            System.out.println();
        }
    }

    // Метод для проверки пустой ли список
    public static boolean isEmpty(List<String> listTemp) {
        if (listTemp.isEmpty()) {
            System.out.println("У Вас нет задач для удаления!\n");
            return true;
        }
        return false;
    }
}