import java.util.ArrayList;

public class nomor5 {
    public static void main(String[] args) {
    //String[] nama = {"Y","I","F","A"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("Y");
    nama.add("I");
    nama.add("F");
    nama.add("A");

    System.out.println("ArrayList sebelum remove:");
    for(String var: nama){
        System.out.println(var);
    }

    //Soal nomor 5
    //Tentukan hasil yang muncul ketika dilakukan perintah berikut ini:
    //remove(0), remove(3), remove(2)

    nama.remove(0);
    nama.remove(3);
    nama.remove(2);
    System.out.println("ArrayList setelah remove:");
        for(String var2: nama){
                System.out.println(var2);
           }
    }    

    
}
