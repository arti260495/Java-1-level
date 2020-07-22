public class HomeWork {
    public static void main(String[] args) {

        // Упражнение 1
        exercise1();
        // Упражнение 2
        exercise2();
        // Упражнение 3
        exercise3();
        // Упражнение 4
        exercise4();
        // Упражнение 5
        exercise5();
        // Упражнение 6
        int[] arr = {1, 1, 1, 2, 1};
        System.out.println(exercise6(arr));
        System.out.println("===============================");
        // Упражнение 7
        int[] arr1 = {1, 2, 3, 4};
        exercise7(arr1, -2);


    }

    public static void exercise1() {
        int[] array = new int[10];
        array[0] = 0;
        array[1] = 0;
        array[2] = 1;
        array[3] = 0;
        array[4] = 1;
        array[5] = 0;
        array[6] = 1;
        array[7] = 0;
        array[8] = 1;
        array[9] = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) array[i] = 1;
            else array[i] = 0;
            System.out.println(array[i]);
        }
        System.out.println("===============================");
    }

    public static void exercise2() {
        int arr[] = new int[8];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a += 3;
            System.out.println(arr[i]);
        }
        System.out.println("===============================");
    }

    public static void exercise3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.println(arr[i]);
        }
        System.out.println("===============================");
    }

    public static void exercise4() {
        int[][] arr = new int[10][10];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i][a] = 1;
            a++;
        }
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("===============================");
    }

    public static void exercise5() {
        int arr[] = {4, 5, 7, 3, 6, 9, 0, 0, 14, 18};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("===============================");
    }

    public static boolean exercise6(int arr[]) {
        int leftSum = 0;
        int rightSum = 0;
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            for (int j = arr.length - 1; j > i; j--) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) check = true;
            rightSum = 0;
        }
        return check;


    }

    public static void exercise7(int arr[], int n) {

        if (n > 0) {
            for (int i = n; i > 0 ; i--) {
                int buff = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = buff;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        }

        if (n < 0) {
            for (int i = 0; i > n ; i--) {
                int buff = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = buff;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        }
    }


}
