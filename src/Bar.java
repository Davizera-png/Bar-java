import java.util.Scanner;
import java.util.Locale;
public class Bar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
        int cev, esp, ref;
        char sexo;
        double tcev, tesp, tref, ing, cons, pagar, couv;

        System.out.println("Sexo: ");
        sexo = sc.next().charAt(0);

        System.out.println("Quantidade de cervejas: ");
        cev = sc.nextInt();

        System.out.println("Quantidade de refrigerantes: ");
        ref = sc.nextInt();

        System.out.println("quantidade de espetinhos");
        esp = sc.nextInt();

	}

}
