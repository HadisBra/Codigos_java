/*Faça um programa no qual o usuário digite uma palavra e logo em seguida apresente um menu da seguinte forma:

1 - Transformar a palavra para maiúscula

2 - Mostrar a palavra ao contrário

3 - Imprimir a palavra sem as vogais

4 - Criptografar a palavra

5 - Sair



Cada uma das opções acima deverá ser feita por um método diferente.

A criptografia a ser usada é trocar o caracter pelo seu subsequente na tabela ascii.

Ao executar um método o programa deverá reapresentar o menu.*/

import java.util.Scanner;

public class Atividade {

    public static void main(String[] args) {
        int op;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe uma Palavra: ");
        String pal = ler.nextLine();

        for (; ; ) {

            System.out.println("Menu\n" +
                    "1 - Transformar a palavra para maiúscula\n" +
                    "\n" +
                    "2 - Mostrar a palavra ao contrário\n" +
                    "\n" +
                    "3 - Imprimir a palavra sem as vogais\n" +
                    "\n" +
                    "4 - Criptografar a palavra\n" +
                    "\n" +
                    "5 - Sair\n" +
                    "___________________________________________\n" +
                    "Informe uma Opção: ");
            op = new Scanner(System.in).nextInt();
            if (op == 5) {
                System.exit(0);
            }

            switch (op) {
                case 1:
                    System.out.println("Palavra Maiuscula: ");
                    Maiuscula(pal);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Palavra Ao contraio: "+Contrario(pal));
                    break;
                case 3:
                    System.out.println("Palavra sem as vogais: "+Senvogal(pal));
                    break;
                case 4:
                    System.out.println("Palavra Criptografada: ");
                    Criptografia(pal);
                    System.out.println("");

                    break;


            }

        }
    }
    public static void Maiuscula( String pa) {
        char i[] =  pa.toUpperCase().toCharArray();

        for (int j = 0; j < i.length; j++) {
            System.out.print(i[j]);

        }

    }

    public static  String Contrario(String pa){
        String inver= "";
        for (int i = pa.length() - 1;  0<= i ; i--) {
            inver += pa.charAt(i);
        }
        return inver;
    }
    public static  String Senvogal(String sv){
        String sem = "";
        for (int i = 0; i <sv.length(); i++) {
            if (sv.charAt(i) != 'a' && sv.charAt(i) !='e'&& sv.charAt(i) !='i'&& sv.charAt(i) !='o'&& sv.charAt(i) !='u')

                sem += sv.charAt(i);
        }
        return sem;
    }

    public static void Criptografia(String crip){
        char cript[] = crip.toUpperCase().toCharArray();
        for (int i =cript.length ; i >= 0 ; i++) {



        }
    }


}
