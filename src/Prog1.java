import java.util.Scanner;
public class Prog1 {

    public static  void main(String[] args){
        String pl;
        int op;
        Scanner dd = new Scanner(System.in);
        System.out.print("Escreva uma Palavra: ");
        pl = dd.nextLine();



        for (;;) {
            System.out.println("______________________________________");
            System.out.println("1 - Transformar a palavra para maiúscula\n" +
                    "\n" +
                    "2 - Mostrar a palavra ao contrário\n" +
                    "\n" +
                    "3 - Imprimir a palavra sem as vogais\n" +
                    "\n" +
                    "4 - Criptografar a palavra\n" +
                    "\n" +
                    "5 - Sair");
            System.out.println("-------------------------------------------");
            System.out.println("Informe uma opção: ");
            op = dd.nextInt();
            if (op == 5)
                System.exit(0);

            switch (op) {
                case 1:
                    System.out.println("__________________________________________");
                    System.out.println("Palavra Maiúscula: "+PalavraMaiuscula(pl));


                    break;
                case 2:
                    Contrario(pl);
                    break;
                case 3:
                    System.out.println("__________________________________________");
                    System.out.println("Palavra sem Vogais: "+ Semvogal(pl));
                    break;
                case 4:
                    System.out.println("__________________________________________");
                    System.out.print("Palavra Criptografada: ");
                    Criptografia(pl);
                    break;

            }
        }
    }

    public static  String PalavraMaiuscula(String palavra){

        String aa = palavra.toUpperCase();

        return aa;
    }
    public static  void  Contrario(String contra){
        String pala="";
        char pp[] = contra.toCharArray();
        for (int i = pp.length -1; i >=0 ; i--) {
            pala+= pp[i];

        }
        System.out.println("__________________________________________");
        System.out.println("Palavra ao Contrário: "+pala);
    }

    public static  String Semvogal(String SemVog){
        char sm[] = SemVog.toCharArray();
        String pl="";

        for (int i = 0; i < sm.length; i++) {
            if (sm[i]!='a'&&sm[i]!='e'&&sm[i]!='i'&&sm[i]!='o'&&sm[i]!='u'){

                pl+=sm[i];
            }
        }
        return pl;
    }

    public static void Criptografia(String pl ) {

        char aa[] = pl.toCharArray();

        for (int i = 0; i < pl.length();i++) {

            if (aa[i] >= 97 || aa[i]<=122){
                aa[i]++;

            }

        }

        System.out.println(aa);

    }

}


