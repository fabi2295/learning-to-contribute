import java.util.Scanner;
 
public class CPF {
 
        private static Scanner ler;
 
        public static void main(String[] args) {
                int[] numero = new int[12];
                int soma1 = 0, soma2 = 0,resto1 = 0, resto2 = 0,i;
                ler = new Scanner(System.in);
 
                System.out.println("Digite se CPF(só os números)");
                String CPF = ler.next();
 
                for (i = 0; i < 11; i++) {
                        numero[i] = Integer.parseInt((String) CPF.substring(i, i + 1));
                }
 
                for (i = 1; i <= 9; i++) {
                        soma1 = soma1 + (numero[i] * (11 - i));
                }
               
                if (soma1 % 11 <= 1) {
                        resto1 = 0;
                } else {
                        resto1 = 11 - (soma1 % 11);
                }
 
                for (i = 1; i <= 10; i++) {
                        soma2 = soma2 + (numero[i] * (12 - i));
                }
 
               
                if (soma2 % 2 <= 1) {
                        resto2 = 0;
                } else {
                        resto2  = 11 - (soma2%11);
                }
 
                if (resto1 == numero[10] && resto2 == numero[11]) {
                        System.out.println("CPF valido : " + CPF);
 
                } else {
                        System.out.println("Cresto1 = 0, resto2 = 0,iPF invalido : " + CPF);
                }
        }
}
