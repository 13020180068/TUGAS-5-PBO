import java.util.Scanner;

public class bilbul {
    public static void main(String[] args) {

        // membuat array buah-buahan
        String[] bil = new String[5];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for( int i = 0; i < bil.length; i++ ){
            System.out.print("bil ke-" + i + ": ");
            bil[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        // menampilkan semua isi array
        for( String b : bil ){
            System.out.println(b);
        }

    }
}

