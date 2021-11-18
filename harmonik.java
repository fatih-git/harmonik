import java.util.Scanner;

/**
 * @author fatih-git
 */

public class harmonik {

    public static void main(String[] args) {

        double n, sonuc=0;
        Scanner input=new Scanner(System.in);

        n=input.nextDouble();

        if(n==0){
            System.out.println("Tanımsızdır!");
        }
        else{

            for(double i=1; i<=n; i++){
                sonuc+=(1/i);
            }

            System.out.println(n+" sayısının harmonik serisi= "+sonuc);

        }

    }

}
