public class Main {
    public static void main(String[] args) {
        //task 1
        int array[] = new int[50];
        for (int i = 1, j = 0; i <=99; i = i + 2, j++) {
            array[j] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        //task 2
        int array1[]=new int[20];
        for(int i = 0; i < 20;i++) {
            array1[i] = (int) (Math.random() * 10);
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        for(int i=1; i<array1.length; i+=2){
            array1[i]=0;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println();

        //task 3
        int arrayF[]=new int[5];
        int arrayS[]=new int[5];
        int arrayT[]=new int[5];
        double middleF=0, middleS=0, middleT=0;
        for (int i = 0; i < 5; i++) {
            arrayF[i]=(int)(Math.random()*6);
            middleF=middleF+arrayF[i];
            System.out.print(arrayF[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            arrayS[i]=(int)(Math.random()*6);
            middleS=middleS+arrayS[i];
            System.out.print(arrayS[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            arrayT[i]=(int)(Math.random()*6);
            middleT=middleT+arrayT[i];
            System.out.print(arrayT[i]+" ");
        }
        System.out.println();
        System.out.println(middleF=middleF/5);
        System.out.println(middleS=middleS/5);
        System.out.println(middleT=middleT/5);
        double maxN=middleF;
        if(middleS>maxN){
            maxN=middleS;
        }
        if(middleT>maxN){
            maxN=middleT;
        }
        else{
            System.out.println("Всі значення рівні");
        }
        System.out.println("Найбільше середнє:"+maxN);

        //task 4
        int first[]=new int[10];
        int second[]=new int[10];
        int third[]=new int[10];
        for (int i = 0; i < 10; i++) {
            first[i]=(int)(Math.random()*11);
            System.out.print(first[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            second[i]=(int)(Math.random()*11);
            System.out.print(second[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < 10 ; i++) {
            third[i]=first[i]+second[i];
            System.out.print(third[i]+" ");
        }System.out.println();

        //task 5
        int array2[]=new int[15];
        int number = 0;
        for (int i = 0; i < 15; i++) {
            array2[i]=(int)(Math.random()*11);
            System.out.print(array2[i]+" ");
        }System.out.println();
        for (int i = 0; i <15 ; i++) {
            if(array2[i]%2==0){
                number++;
            }
        }
        System.out.println("К-сть парних елементів:" + number);
        System.out.println(" ");

        //task 6
        int[][]array3= new int[15][];
        int[]stovp={5,5,5,5,8,8,8,8,3,3,3,3,9,9,9};
        for(int i = 0;i < array3.length;i++){
            array3[i]=new int[stovp[i]];
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j]=(int)(Math.random()*16);
                System.out.print(array3[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}