/**
 * Задание
 * Пусть дан произвольный список целых чисел.
 * 1) Найти максимальное значение
 * 2) Найти минимальное значение
 * 3) Найти среднее значение
 * 4) Нужно удалить из него чётные числа
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class z1 {
    public static List<Integer> listGen(int length, int min, int max){
        Random rnd = new Random();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            integerList.add(rnd.nextInt((max - min) + 1) + min);
        }
        return integerList;
    }

    public static int getMin(List<Integer> integerList){
        int min = integerList.get(0);
        for (int i = 1; i < integerList.size(); i++) {
            if (integerList.get(i) < min) {
                min = integerList.get(i);
            }
        }
        return min;
    }
    public static int getMax(List<Integer> integerList){
        int max = integerList.get(0);
        for (int i = 1; i < integerList.size(); i++) {
            if (integerList.get(i) > max) {
                max = integerList.get(i);
            }
        }
        return max;
    }
    public static double averageList(List<Integer> integerList){
        double sum = 0;
        for (Integer integer : integerList) {
            sum += integer;
        }
        return sum / integerList.size();
    }

    public static void removeEvenValue(List<Integer> integerList){
        for (int i = integerList.size()-1; i >= 0; i--) {
            if (integerList.get(i) % 2 == 0){
                integerList.remove(i);
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> integerList = listGen(5,0,99);
        System.out.println("Исходный список" + integerList);
        System.out.println("Минимальный элемент списка: " + getMin(integerList));
        System.out.println("Максимальный элемент списка: " + getMax(integerList));
        System.out.println("Среднее значение: " + averageList(integerList));
        removeEvenValue(integerList);
        System.out.println("Список без чётных элементов" + integerList);
    }
}