public class Main {
    public static void main(String[] args) {
        //task_1
        /*int i = 500;
        for (; i <= 650; i = i + 10) {
            System.out.println(i);*/

            // Використання оператора циклу while Task 1.2
            /*System.out.println("Використання циклу while:");
            int i = 500;
            while (i <= 650) {
                System.out.print(i + " ");
                i += 10;
            }
            System.out.println();*/

            // Використання оператора циклу do-while Task 1.3
            /*System.out.println("Використання циклу do-while:");
            int i = 500;
            do {
                System.out.print(i + " ");
                i += 10;
            } while (i <= 650);
            System.out.println();
        }*/

        //task_2
        int a = 2;
        while (true) {
            int b = 2 * a - 1;
            if (b >= 5000) {
                break;
            }
            System.out.println("вивід у консоль усіх значень менше 5000 послідовності 2а-1: " + b);
            a++;
        }
        //taks_3
        int num = 10;
        double delNum = 1;
        for (; delNum <= num; delNum++) {
            double b = num / delNum;
            if (b % 1 == 0) {
                System.out.println("Дільники числа 10: " + b);
            }
        }
        //task_4
        /* int numF = 10, numS = 1;
        for (int j = 1; j <= numF; j++) {
            numS = numS*j;
            System.out.println(numF + "!: " + numS);
        } */
        // task_4.1
        int numF = 10, numS = 1, j = 1;
        while ( j <= numF){
            numS = numS*j;
            j++;
            System.out.println(numF + "!: " + numS);
        }
        //task_5
        int numberC = 0;
        for (int hours = 0; hours < 24; hours++) {
            for (int minutes = 0; minutes <60; minutes++){
                if (hours / 10 == minutes % 10 && hours % 10 == minutes / 10){
                    System.out.println("Симетричні комбінації: " + hours +":" + minutes);
                    numberC++;
                }
            }
        }
        System.out.println("К-сть: " + numberC);
    }
}
