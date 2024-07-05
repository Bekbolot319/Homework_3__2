import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();

        // Считываем первые 5 строк и сохраняем в список A
        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }

        // Отображаем список A
        System.out.println("Список A: " + listA);

        // Считываем еще 5 строк и сохраняем в список B
        System.out.println("Введите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }

        // Отображаем список B
        System.out.println("Список B: " + listB);

        // Объединяем списки A и B в новый список C
        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        // Отображаем список C
        System.out.println("Список C: " + listC);

        // Сортируем список C по длине слов
        listC.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // Отображаем отсортированный список C
        System.out.println("Отсортированный список C: " + listC);
    }
}