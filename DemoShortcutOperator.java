public class DemoShortcutOperator {
    public static void main(String[] args) {
        int a = 2;
        int hasil;
        System.out.println("\nPROGRAM DEMO SHORTCUT OPERATOR");
        System.out.println("------------------------------\n");
        System.out.println("Nilai awal a = " + a);
        System.out.println("\nShortcut Operator a += 3 " + "menghasilkan = " + a);
        System.out.println("\nShortcut Operator a *= 3 " + "mengahsilkan = " + a);
        System.out.println("\nNilai variabel  a sebelum " + "PostIncremental = " + a);
        hasil = 3 * (a++);
        System.out.println("Hasil PostIncremental 3*(a++) = + hasil" + a);
        System.out.println("Nilai variabel a setelah " + "PostIncremental = " + a);
        System.out.println("\nNilai variabel a sebelum " + "PreIncremental = " + a);
        hasil = 3 * (++a);
        System.out.println("Hasil PreIncremental 3*(++a)= " + hasil);
        System.out.println("Nilai variabel a setelah " + "PreIncremental = " + a);
        System.out.println("\nNilai variabel a sebelum " + "Postdecrementa = " + a);
        hasil = 3 * (a--);
        System.out.println("Hasil Postdecremental 3*(a--)= " + hasil);
        System.out.println("Hasil Postdecremental 3*(a--)Postdecremental = " + a);
        System.out.println("\nNilai variabel a sebelum " + "Predecremental = " + a);
        hasil = 3 * (a--);
        System.out.println("Hasil Postdecremental 3*(a--)= " + hasil);
        System.out.println("Nilai variabel a setelah Predecremental = " + a);
    }

}
