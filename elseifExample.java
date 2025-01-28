//ini merupakan contuh coding untuk ifelse
//dimana logik coding ialah=c lebih atau sama dengan 20 atau
//c kurang dari 20 iaitu 19
//output untu coding ini ialah "ahmad dh besar"


public class elseifExample {
    public static void main(String[] args){
        String a = "ahmad",  b = "amin";
        int c = 20 , d = 21;

        System.out.println(a + " berumur " + d +" tahun");
        System.out.println(b+ " berumur " + c + " tahun");

        if(c >=20){
            System.out.println("Ahmad dh besar");
        } 
        else if(c < 20){
            System.out.println("Ahmad masih kecil");
        }
        else{
            System.out.println("ahmad masih bayi");
        }

    }
    
}
