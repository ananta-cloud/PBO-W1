import java.util.Scanner;

public class testString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        //1. jumlah panjang string
        System.out.println(A.length()+B.length());
        //2. komparasi bahwa var A lebih besar dari var B
        if (A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        //3. Kapitalisasi huruf pertama
        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capA + " " + capB);
    }
}