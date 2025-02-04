//ini merupakan basic coding untuk while loop
//output ialah 5 kerana i kite declare sebagai 5 untuk increment
/*logiknya ialah jika i lebih atau kurang dari 5,sile print inrement nombor 0 sampai 5
sedangkan i ialah 5.so output ialah 5*/

/* 
public class WhileLoop{
    public static void main(String[] args){
   int i = 5;
   while (i <= 5){
    System.out.println(i);
    i++;
   }
    }
}
 */

 //ini merupakan contoh kedua untuk print out in second secara decrement
 //logik coding ini ialah: jika i lebih dari kosong sedangkan variable i ialah 20,
 //sile print nombor dari kosong secara menurunn

 /* 
 public class WhileLoop{
    public static void main(String[] args){
        int i = 20;

        System.out.println("System countdown start now!");

        while (i>=0){
            System.out.println("Masa tinggal: " +i + "sahaja lagi");
            i--;
        }
        System.out.println("Finish");
    }
 }
*/


public class WhileLoop{
    public static void main(String[] args){
        int i = 1;
        int sum = 0;

        while(i<=10){
            sum +=i ;
            i++;
        }
            System.out.println("the total is: " +sum);
    }
}