import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task10();
    }

    public static void firstTask()  {
        //Найти сумму и произведение элементов одномерного числового массива.
        int[] arr = new int[20];
        int sum = 0;
        int oper = 1;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 40 + 20);
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            oper *= arr[i];
        }

        System.out.println(sum);
        System.out.println(oper);
    }

    public static void secondTask() {
        //Найти сумму положительных элементов массива.
        int sum = 0;
        int[] array = new int[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100) ;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println("Сумма положительных чисел = " + sum);
    }

    public static void threeTask() {
        /* Какая сумма элементов массива больше: с первого до элемента с номером К или от элемента с номером
         К+1 до последнего? */

        int[] array = new int[20];
        int sum1 = 0;
        int sum2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число K :");
        int k = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }


        for (int i = 0; i <= k; i++) {
            sum1 += i;
        }

        for (int i = k + 1; i < array.length; i++) {
            sum2 += array[i];
        }

        if (sum1 > sum2){
            System.out.println("Сумма чисел до числа K больше. Сумма чисел = " + sum1);
        } else if (sum1 < sum2) {
            System.out.println("Сумма чисел после числа K больше. Сумма чисел = " + sum2);
        } else {
            System.out.println("Числа ровны");
        }
    }

    public static void fourthTask() {
        //Найти номер и значение первого положительного элемента массива.
        int[] array = new int[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 400 - 200);
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                System.out.println(array[i]);
                break;
            }
        }
    }

    public static void fifthTask(){
        //Найти максимальный элемент численного массива.
        int[] array = new int[50];
        int maxValue = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 600 + 66);
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);
    }


    public static void sixthTask() {
        //В массиве чисел найти два максимальных элемента.
        int[] array = new int[35];
        int maxValue1 = 0;
        int maxValue2 = 0;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue1) {
                maxValue1 = array[i];
                maxIndex =i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue2 && i != maxIndex) {
                maxValue2 = array[i];
            }
        }
        System.out.println(maxValue1);
        System.out.println(maxValue2);
    }


    public static void seventhTask() {
        /* x
           xx
           xxx
           xxxx */
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print ("x");
            }
            System.out.println(" ");
        }
    }

    public static void task8() {
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("x");
            }
            System.out.println(" ");
        }
    }

    public static void task9(){
        int patients = 0;
        int healthy = 0;
        double summTempAllPatients = 0;
        double numberOfPatients = 0;


        double[][] array = new double[10][10];
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.random() * 4.9 + 35.0;
            }
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] >= 36.9) {
                    patients++;
                }
            }
        }

        //
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] >= 36.6 && array[i][j] <= 36.9) {
                    healthy++;
                }
            }
        }

        // сложение всех значений температур
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summTempAllPatients += array[i][j];
            }
        }

        //колличество пациентов


        System.out.println("Всего больных = " + patients);
        System.out.println("Всего здоровых = " + healthy);
        System.out.println("Средняя температура = " + (summTempAllPatients / (array.length * array.length)));
    }
    
    public static void task10() {
        //
        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 5 + 5);
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == j){
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}