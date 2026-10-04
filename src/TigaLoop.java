import java.util.Scanner;

public class TigaLoop    {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        System.out.print("for      : ");
        for (int a = 1; a <= n; a++) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.print("while    : ");
        int b = 1;
        while (b <= n) {
            System.out.print(b + " ");
            b++;
        }
        System.out.println();


        System.out.print("do-while : ");
        int c = 1;
        do {
            System.out.print(c + " ");
            c++;
        } while (c <= n);
        System.out.println();

    }
}

/*
 * ===== HASIL DUA KALI JALAN =====
 *
 * Jalankan pertama, n = 5:
 *   Batas deret (n) : 5
 *
 *   ===== SATU DERET, TIGA LOOP =====
 *   for      : 1 2 3 4 5
 *   while    : 1 2 3 4 5
 *   do-while : 1 2 3 4 5
 *
 *   i <  n berputar : 4 kali
 *   i <= n berputar : 5 kali
 *   Disaring : 1 3 5 7
 *   Sampai println  : 4 kali
 *
 * Jalankan kedua, n = 0:
 *   Batas deret (n) : 0
 *
 *   ===== SATU DERET, TIGA LOOP =====
 *   for      :
 *   while    :
 *   do-while : 1
 *
 *   i <  n berputar : 0 kali
 *   i <= n berputar : 0 kali
 *   Disaring : 1 3 5 7
 *   Sampai println  : 4 kali
 *
 * Kesimpulan: do-while mengecek kondisinya sesudah badan loop dijalankan,
 * jadi badannya pasti jalan minimal sekali.
 *
 * ===== KENAPA LOOP TIDAK BERHENTI DI i = 8 =====
 * Di badan loop, continue ditulis SEBELUM break. Saat i = 8 (genap), continue
 * langsung melompat ke iterasi berikutnya, sehingga baris "if (i > 7) break;"
 * tidak pernah dijangkau. Pengecekan break baru terjadi di i = 9 (ganjil),
 * dan di situlah loop berhenti.
 */