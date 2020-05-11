import java.util.Scanner;
import java.util.Locale;
public class Bar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
        int cev, esp, ref;
        char sexo;
        double tcev, tesp, tref, ing, cons, pagar, couv;

        System.out.printf("Sexo: ");
        sexo = sc.next().charAt(0);

        System.out.printf("Quantidade de cervejas: ");
        cev = sc.nextInt();

        System.out.printf("Quantidade de refrigerantes: ");
        ref = sc.nextInt();

        System.out.printf("quantidade de espetinhos: ");
        esp = sc.nextInt();
        
        couv = 0.00;
        ing = 0.00;
        tcev = cev * 5;
        tesp = esp * 7;
        tref = ref * 3;
        if (sexo == 'f' || sexo == 'F') {
            ing = ing + 8.00;
        } else {
            if (sexo == 'm' || sexo == 'M') {
                ing = ing + 10.00;
            }
        }
        cons = tcev + tesp + tref;
        if (cons < 30) {
            couv = couv + 4.00;
        }

        pagar = cons + ing + couv;
        System.out.println("RELATÓRIO:");
        System.out.println();
        System.out.printf("Consumo = R$ %.2f%n", cons);
        if (cons > 30.00) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", couv);
        }
        System.out.printf("Ingresso = R$ %.2f%n", ing);
        System.out.println();
        System.out.printf("TOTAL A PAGAR = R$ %.2f", pagar);


	}

}
