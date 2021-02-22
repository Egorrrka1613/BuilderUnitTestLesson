public class Sorted {

    public static void main(String[] args) {
        /*
        int massiv[] = {1, 1, 1, 1, 1};

        int result[] = sortBubble(massiv);

        printMass(result);
        */

    }

    public static int[] sortBubble(int[] array) {
        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                    isSorted = false;
                }
            }
        }
        return array;
    }

/*    public static void printMass(int mass[]) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + ", ");
        }

        System.out.println("Сортировка завершена");
    }*/
}
