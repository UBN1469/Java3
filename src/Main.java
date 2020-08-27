/* Практическое задание
        1.	Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        2.	Написать метод, который преобразует массив в ArrayList;
        3.	Задача:
        a.	Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        b.	Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        c.	Для хранения фруктов внутри коробки можно использовать ArrayList;
        d.	Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        e.	Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
        f.	Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
        g.	Не забываем про метод добавления фрукта в коробку

 */


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //1.
        String [] strings = {"a", "b","c","d","i","f"};
        Integer [] integers = {1,2,3,4,5};
        //changeA(strings,0,1);
        // changeA(integers,0,1);
        chengeB(integers,0,1);

        //2.
        System.out.println("Задание 2");
        //ArrToArraylist(integers);
        System.out.println(ArrToArraylist(integers));

        //3.
        Box<Apple> box1 = new Box<>();


    }
    public static void changeA (Object [] Arr, int a, int b){
        System.out.println("Исходный массив: " + Arrays.toString(Arr));
        Object sb = Arr[a];
        Arr[a] = Arr [b];
        Arr[b] = sb;
        System.out.println("Массив с заменеными элементами: "+ Arrays.toString(Arr));

    }
    public static <T> void chengeB (T [] Arr2, int a, int b){
        System.out.println("Исходный массив: " + Arrays.toString(Arr2));
        T sf = Arr2[a];
        Arr2[a] = Arr2[b];
        Arr2[b] = sf;
        System.out.println("Способ с обобщениями:  "+Arrays.toString(Arr2));
    }

    public static <T> ArrayList <T> ArrToArraylist(T[] tArr){
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(tArr));
        return arrayList;
    }
}

