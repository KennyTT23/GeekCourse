public class HomeWork2 {

    public static void main(String[] args) {
       changeZero();
       stepArray();
       multiplyByTwo();
       squareMass();
        System.out.println();
       showMinMax();
        System.out.println();
        int[] array = {4, 10, 6, 3, 4, 1};
        System.out.println(showMeTheBalance(array));
        int[] array1 = {3, 5, 7, 9, 8};
        moveIndex(array1, 2);
    }

    //task 1...
    public static void changeZero(){

        int[] mass = {1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
                mass[i] = 1;
            }else {
                mass[i] = 0;
            }
        }
    }

    //task 2...
    public static void stepArray(){
        int a = 0;
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a +=3;
        }
    }

    //task 3...
    public static void multiplyByTwo(){

        int[] multyArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < multyArr.length; i++) {

            if (multyArr[i] < 6) {
                multyArr[i] *= 2;
            }
        }
    }

    //task 4...
    public static void squareMass(){

        int[][] doubleArray = new int [5][5];

        for (int i = 0; i <doubleArray.length ; i++) {
                doubleArray[i][i] = 1;
                doubleArray[i][doubleArray.length - 1 - i] = 1;
        }
        printMatrix(doubleArray);
    }

    static void printMatrix(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    //task 5...
    public static void showMinMax(){
        int[] array = {3, 7, 1, 9, 43, 6, 8};

        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }else if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    //task 6...
    public static boolean showMeTheBalance (int[] array) {
//
        int left = array[0];
        int right = array[array.length - 1];

        int begin = 1;
        int end = array.length - 2;
        while(begin <= end) {
            if(right < left){
                right += array[end];
            end--;
            }else{//left < right
                left += array[begin];
                begin++;
            }
        }return left == right;
    }

    //task 7...

    static void moveIndex(int[] array, int n) {

        int temporary = array[0];
        int mark = 0;
        boolean odd = false;
        int arrLength = array.length;

        if (n % 2 == 0 && array.length % 2 == 0) {
            odd = true;
        }

        for (int i = 0; i < array.length; i++) {
            int position = reassignNumber(arrLength, mark + n);
            int newIndex = array[position];
            array[position] = temporary;
            if (odd && i % 2 != 0) {
                mark = position + 1;
                temporary = array[mark];
            } else {
                mark = position;
                temporary = newIndex;
            }
        }
        printArray(array);
    }

    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

        public static int reassignNumber(int arrLength, int number){
            if (number < 0) {
                while (number <= 0) {
                    number += arrLength;
                }
            } else {
                while (number >= arrLength) {
                    number -= arrLength;
                }
            }
            return number;
        }
    }




