import java.util.Scanner;

public class main {

    public void Main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print ("n = ");
        int n = in.nextInt();  
        int a1[] = new int[n];       
        in.close();
        Sequence A1 = new Sequence();
        A1.input(a1);
        A1.removedouble(a1);
    }

}