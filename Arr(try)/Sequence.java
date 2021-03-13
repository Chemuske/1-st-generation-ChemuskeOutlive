//import java.util.Collection;
import java.util.Scanner;
import java.util.Arrays;

public class Sequence /*implements CollectionSeq*/ {

    public void input (int[] a){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            System.out.print("N[" + i + "] = ");
            a[i]=in.nextInt();
        }
        in.close();
    }

    public void print (int[]a, int z){
        System.out.print("Print: " + '\n' + "N[] = ");
        for (int i = 0; i < z; i++)
            System.out.print("N[" + i + "] = " + a[i] + " ");
    }

    public void removedouble (int[]a){
        int z = a.length;
        for (int i = 0; i < a.length - 1; i++)
            for (int j = i + 1; j <a.length; j++)
            if (a[i] == a[j]){
                z = a[i];
                a[i]=a[j];
                z--;
            }
        sort(a, z);
    }

    public void sort (int[]a , int z){
        Arrays.sort(a, 0, z);
        /*for(int i = a.length-1 ; i > 0 ; i--)
            for(int j = 0 ; j < i ; j++)
               if( a[j] > a[j+1] ){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                } */
        print(a, z);
    }
}