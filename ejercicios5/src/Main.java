import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        Integer[] numbersShort = new Integer[100];
        for (int i = 0; i < numbersShort.length; i++){
            numbersShort[i] = ThreadLocalRandom.current().nextInt(1, 800);
        }

        Comparator<Integer> intComparatorAsc = (a, b) -> a - b;

        Integer[] numbersLong = new Integer[100000];
        for (int i = 0; i < numbersLong.length; i++){
            numbersLong[i] = ThreadLocalRandom.current().nextInt(1, 800000);
        }

        Comparator<Integer> intComparatorDesc = (a, b) -> b - a;

        String[] names = {"Maria", "Marcos", "Sebastian", "Pablo", "Martin", "Carla", "Gabriela", "Juana", "Martina", "Agustina", "Pedro", "Augusto"};

        Comparator<String> stringComparator = (a, b) -> a.compareToIgnoreCase(b);

        //QuickSortSorterImple quick = new QuickSortSorterImple();
        //quick.sort(numbers, intComparator);

        //HeapSortSorterImple heap = new HeapSortSorterImple();
        //heap.sort(numbers, intComparator);

        //BubbleSortSorterImple bubble = new BubbleSortSorterImple();
        //bubble.sort(numbers, intComparator);

        try {

            Sorter sorter =  (Sorter) MiFactory.getInstance("sorter");

            sorter.sort(numbersShort, intComparatorAsc);
            showArr(numbersShort);

            sorter.sort(names, stringComparator);
            showArr(names);

            Timer timer = new Timer();
            timer.start();

            sorter.sort(numbersLong, intComparatorDesc);

            timer.stop();

            showArr(numbersLong);
            System.out.println("Elapsed time: " + timer.elapsedTime());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void showArr(Object[] arr) {

        for (Object x : arr) {
            System.out.println(x);
        }
    }
}
