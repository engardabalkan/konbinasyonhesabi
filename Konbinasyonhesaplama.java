import java.util.Scanner;
public class Konbinasyonhesaplama {
    public static void main(String[] args) {

        int c, n, r,k=1,l=1,m=1,b;
        Scanner inp = new Scanner(System.in);
        System.out.println("C(n,r) formulü: n! / (r! * (n-r)!)'dir.");
        System.out.println("C(n,r) olacak şekilde lütfen n,r sayılarını giriniz:");
        System.out.print("n:");
        n=inp.nextInt();
        System.out.print("r:");
        r=inp.nextInt();
        b=n-r;
        for (int i=1;i<=n;i++){
            k=k*i;
        }
        System.out.println("n!:"+k);
        for (int j=1;j<=r;j++){
            l=l*j;
        }
        System.out.println("r!:"+l);
        for (int y=1;y<=b;y++){
            m=m*y;
        }
        System.out.println("(n-r)!:"+m);

        c=k/(l*m);
        System.out.println("C(n,r):"+c);

    }
}