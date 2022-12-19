import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        // В конце строки запятую ставить не надо.
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");


        }
        System.out.println();

        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.print(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
            System.out.println();


            String[] arr3 = {"cat", "dog", "pig" };
            for (int i = 0; i < arr3.length; i++) {
                if (i == arr3.length - 1) {
                    System.out.print(arr3[i]);
                    break;
                }
                System.out.print(arr3[i] + ", ");


            }
        }
    }

