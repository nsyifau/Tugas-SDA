import java.util.ArrayList;

public class nomor6 {
    public static void main(String[] args) {
    //String[] nama = {"Y","I","F","A"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("Y");
    nama.add("I");
    nama.add("F");
    nama.add("A");

    //Soal no 6
    //Tentukan hasil yang muncul ketika dilakukan perintah berikut ini:
    //add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(-3,j)

    nama.add(0,"e");
    System.out.println("Elemen setelah menambahkan string e " + nama);

    nama.add(2,"f");
    System.out.println("Elemen setelah menambahkan string f " + nama);

    nama.add(3,"g");
    System.out.println("Elemen setelah menambahkan string g " + nama);

    nama.add(4,"h");
    System.out.println("Elemen setelah menambahkan string h " + nama);

    nama.add(6,"h");
    System.out.println("Elemen setelah menambahkan string h " + nama);

    nama.add(-3,"j");
    System.out.println("Elemen setelah menambahkan string j " + nama);

        
    }
    
}
