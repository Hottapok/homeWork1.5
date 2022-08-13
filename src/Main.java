public class Main {
    public static void main(String[] args) {
        //task1
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double[] array2 = {1.57, 7.654, 9.986};
        boolean[] array3 = {true, false};

        //task2
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (i == array2.length - 1) {
                System.out.println(array2[i]);
            } else {
                System.out.print(array2[i] + ",");
            }
        }
        for (int i = 0; i < array3.length; i++) {
            if (i == array3.length - 1) {
                System.out.println(array3[i]);
            } else {
                System.out.print(array3[i] + ",");
            }
        }
        System.out.println();
        //task3
        for (int i = array.length-1;i>=0;i--){
            if (i==0){
                System.out.println(array[i]);
            }else System.out.print(array[i]+",");
        }
        for (int i= array2.length-1;i>=0;i--){
            if(i==0){
                System.out.println(array2[i]);
            }else System.out.print(array2[i]+",");
        }
        for (int i=array3.length-1;i>=0;i--){
            if (i==0){
                System.out.println(array3[i]);
            }else System.out.print(array3[i]+",");
        }
        System.out.println();
        //task4
        for (int i=0;i< array.length;i++){
            if (array[i]%2!=0){
                System.out.print((array[i]+1)+" ");
            } else System.out.printf(array[i]+" ");
        }
    }
}