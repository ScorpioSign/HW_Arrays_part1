import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        //Пройдитесь по первому целочисленному массиву
        // и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        int [] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        }
    }

