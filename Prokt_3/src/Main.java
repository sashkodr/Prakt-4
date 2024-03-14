public class Main {
    public static void main(String[] args) {
        //task 1
        int n = 51;
        if (n > 100) {
            System.out.println("Число " + n + " не міститься на проміжку [50;100]");
        } else if (n < 50) {
            System.out.println("Число " + n + " не міститься на проміжку [50;100]");
        } else {
            System.out.println("Число " + n + " міститься на проміжку [50;100]");
        }
//task 2
        int a = 192;
        int num1 = a/100;
        int numS = a/10;
        int num2 = numS%10;
        int num3 = a%10;
        if (num1 > num2){
            System.out.println("найбільша цифра заданого цілого тризначного числа: " + num1);
        }else if (num2 > num3){
            System.out.println("найбільша цифра заданого цілого тризначного числа: " + num2);
        }else {
            System.out.println("найбільша цифра заданого цілого тризначного числа: " + num3);
        }
        //task 3
        int floorC = 8; // Поточний поверх
        int floorW = 6; // Бажаний поверх

        if (floorW > 9) {
            System.out.println("Вказано неправильний поверх!");
        } else if (floorW == 2) {
            if (floorC < 2) {
                System.out.println("Ви піднялись на 3 поверх");
            } else {
                System.out.println("Ви спустились на 1 поверх");
            }
        } else {
            if (floorC > floorW) {
                System.out.println("Ви спустились на " + floorW + " поверх");
            } else if (floorC < floorW) {
                System.out.println("Ви піднялись на " + floorW + " поверх");
            }
        }
        //task 4
        String choice = "Yes";
        switch (choice.toLowerCase()) {
            case "так":
            case "ок":
            case "yes":
            case "y":
            case "+":
            case "ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "ні":
            case "no":
            case "n":
            case "-":
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println("Невідома команда.");
                break;
        }
    }
}


