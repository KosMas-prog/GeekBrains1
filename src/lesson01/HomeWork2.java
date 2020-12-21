package lesson01;

public class HomeWork2 {
    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
            System.out.print(arr[i]);
        }

        System.out.println();
        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], пройти по нему циклом,
        // и числа, меньшие 6, умножить на 2;
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] arr4 = new int[9][9];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                }
                if ((i + j) == (arr4.length - 1)) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        //5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] arr5 = {1, 5, 3, 2, 11};
        //int max = arr[0];
        //for(int i=0; i < arr5.length; i++){
        int max = 0;
        for (int n : arr5) {
            if (n > max) {
                max = n;
            }
        }
        checkBalance(arr5);
        System.out.print(max);

        System.out.println();
        //6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен
        // вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
        // checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят;
    }
    private static void checkBalance(int[] arr){
        int sum = 0, sum2 = 0;
        boolean a = false;
        for(int i=0; i<arr.length; i++) {
            sum = arr[i] + sum; //общая сумма в итоге
        }
        for(int i=0; i<arr.length; i++) {
            sum2 = arr[i] + sum2;
            System.out.print(arr[i]+", ");
                if(sum ==sum2*2){
                    a= true;
                    System.out.print("|| ");
                }
            }
        System.out.println(a);
        }

    //7. *Написать метод, которому на вход подается одномерный массив и число n (может быть положительным
// или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
// Нельзя пользоваться вспомогательными массивами.

    /*private static void trackRaser(int[] arr, int a){
        arr[arr.length-a]=arr[0];
        for(int i=0; i<arr.length; i++){
            arr[i]= arr[i+a];
            if()
        }*/
    }

