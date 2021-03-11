import java.util.Scanner;

public class helloworld {

    public static void zv(Integer n,Integer ymax,Integer st,Integer kst,Integer en,Integer kzv,Integer kstl,Integer kstlEn) {
        kstlEn = kstl;
        kzv = kst;
        for (Integer i = st; i > 0; i--) {
            for (Integer j = (ymax - 1) / 2 - kstl; j > 0; j--) {
                System.out.print(" ");
            }
            for (Integer z = kst; z > 0; z--) {
                    System.out.print("*");
                }
            kst -= 2;
            kstl--;
            System.out.print("\n");
        }
        kst = kzv + 2;
        en++;
        st++;
        kstl = kstlEn + 1;
        if (en < n) {
            zv(n, ymax, st, kst, en, kzv, kstl, kstlEn);
        }
    }
    public static void main(String[] args) {
        Integer n, ymax, st = 1, kst = 1, en = 0, kzv = 0, kstl = 0, kstlEn = 0;
        System.out.print("n = ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if (n == 1){
            System.out.print("*");
            System.exit(1);
        }
        if (n == 1){
            System.exit(0);
        }
        ymax = 2 * n - 1;
        zv(n, ymax, st, kst, en, kzv, kstl, kstlEn);
    }
}