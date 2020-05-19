package ru.geekbrains.J2.L2.hometask;


//1. Есть строка вида: "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0"; (другими словами матрица 4x4)
// 10 3 1 2
// 2 3 2 2
// 5 6 7 1
// 300 3 1 0
//
// Написать метод, на вход которого подаётся такая строка, метод должен преобразовать строку в двумерный массив
// типа String[][];
//
//2. Преобразовать все элементы массива в числа типа int, просуммировать, поделить полученную сумму на 2,
// и вернуть результат;
//
//3. Ваши методы должны бросить исключения в случаях: Если размер матрицы, полученной из строки, не равен 4x4;
//Если в одной из ячеек полученной матрицы не число; (например символ или слово)
//
//4. В методе main необходимо вызвать полученные методы, обработать возможные исключения и вывести результат расчета.
//
//5*. Написать собственные классы исключений для каждого из случаев


public class Main {
    public static void main(String[] args){
        String inputString = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";

        String[][] stringArray;
        int[][] intArray;

        stringArray = parseString(inputString);
        printArray(stringArray);

        intArray = changeArray(stringArray);

    }

    public static String[][] parseString(String inputString) {
        String[] subArray1;
        String[] subArray2;

        subArray1 = inputString.split("\n");

        int n = subArray1.length;

        String[][] resultArray = new String[n][n];

        for (int i = 0; i < subArray1.length; i++) {
//            System.out.println(subArray1[i]);
            subArray2 = subArray1[i].split(" ");
            for (int j = 0; j < subArray2.length; j++) {
//                System.out.println(subArray2[j]);
                resultArray[i][j] = subArray2[j];
            }
        }

        return resultArray;
    }


    public static void printArray(String[][] incomeArray){
        for (int i = 0; i < incomeArray.length; i++){
            for(int j = 0; j < incomeArray.length; j++){
                System.out.print(incomeArray[i][j] + " ");
            }
            System.out.println(" ");
        }
    }


    public static int[][] changeArray(String[][] incomeArray){
        int n = incomeArray.length;
        int[][] resultArray = new int[n][n];

        for (int i = 0; i < incomeArray.length; i++){
            for(int j = 0; j < incomeArray.length; j++){

                resultArray[i][j] = 1;
            }
        }

        return resultArray;
    }

}
