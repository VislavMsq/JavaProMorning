package lesson4.calc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ARR {
    public static void main(String[] args) {
//        Random random = new Random();   // рандомный метод
//        int[] array = new int[random.nextInt(22)];     // массив аполняем рандомными числами в диапозоне 22
//        getArr(array);
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(array);
//        }
        int[] array = {1, 2, 6, 5, 9, 8, 4, 7};
        int[] array2 = {1, 2, 6, 5, 11, 9, 8, 4, 7};
        System.out.println(Arrays.toString(getArr(array)));
        System.out.println(Arrays.toString(getArr(array2)));
    }

    public static int[] getArr(int[] arr) {
        int n;
        if (arr.length % 2 == 0) {
            n = arr.length / 2;
        } else {
            n = arr.length / 2 + 1;
        }
        int[] result = new int[n];
        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < result.length; i++) {
            if (left == right) {
               result[i] = arr[left];
            } else {
                result[i] = arr[left] + arr[right];
                left++;
                right--;
            }
        }


//       int[] newArr = new int[arr.length / 2];
//       int[] newArr = new int[arr.length / 2 + 1];
/*
1 2 6 5 9 8 4 7 --> [1+7, 2+4, 6+8, 5+9]
1 2 6 5 11 9 8 4 7 --> [1+7, 2+4, 6+8, 5+9, 11]
 */
        return result;
    }


}
