//ini merupakan basic contoh untuk ternary operator
//ternary operator ialah sambungan kepada if else untuk memendekkan code
//didalam code ini akan check string dimana a iaitu variable kepada fikri sama dengan ahmad atau tidak
//selepas tanda ? akan berlaku string iaitu true or false
//jika true, sistem akan print betul
//jika salah sistem akan print salah
// tanda colon iaitu =: digunakan untuk membezakan true or false
//output coding ini ialah salah

/* 
public class TernaryIfElse {
    public static void main(String[] args){
        String a = "fikri";
        String result = (a=="ahmad")? "betul" : "salah";
        System.out.println(result);
    }
    
}
    */


//ini merupakan contoh selanjutnya untuk ternary operator untuk melihat semua kebarangkali selain guna switch
//output coding ini ialah gemok


public class TernaryIfElse{
    public static void main(String[] args){
        int weight = 97 ;
       

        String result = (weight == 60 )?  "kurus" : 
                        (weight == 70 )?  "kurus" : 
                        (weight == 80 )?  "kurus" : 
                        (weight >= 90 )?  "gemok" : "obes";

        System.out.println(result);

    }
}
