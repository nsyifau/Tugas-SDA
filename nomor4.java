import java.util.ArrayList;

public class nomor4 {
    public static void main(String[] args) {
    //String[] nama = {"Y","I","F","A"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("Y");
    nama.add("I");
    nama.add("F");
    nama.add("A");

    //Soal no 4
    //Tentukan hasil yang muncul ketika dilakukan perintah berikut ini:
    //indexOf(a), indexOf(c), indexOf(q)

    System.out.print(nama.indexOf("a"));
    System.out.print(nama.indexOf("c"));
    System.out.print(nama.indexOf("q"));
    }
}