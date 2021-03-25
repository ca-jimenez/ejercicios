public class Main {

    private static <T> void showArr(T[] arr) {

        for(Object x: arr)
        {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        int arrLength = 5;

        Persona[] people = new Persona[arrLength];
        Celular[] phones = new Celular[arrLength];

        String[] names = {"Maria", "Pablo", "Pedro", "Martina", "Marcos"};
        int[] dni = {1234, 432, 676888655, 98987, 33};
        int[] numbers = {2424252, 25565788, 8976755, 958538, 13845};

        for (int i = 0; i < arrLength; i++) {

            people[i] = new Persona(names[i], dni[i]);
            phones[i] = new Celular(names[i], numbers[i]);
        }

        SortUtil.ordenar(people);
        SortUtil.ordenar(phones);

        showArr(people);
        System.out.println("-----------");
        showArr(phones);
    }
}
