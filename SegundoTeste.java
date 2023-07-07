import java.util.Scanner;

public class SegundoTeste {

    public static void main(String[] args)
        {

            Scanner texto = new Scanner(System.in);
            String nome;
            int idade;
            String formacao;
            String cargodemoday;

            System.out.println("Meu Segundo pgm em Java! Uhhuu!");

            System.out.println("Entre com seu nome:");
                  nome = texto.nextLine();
            System.out.println("Bem vindo(a)" + nome);

            System.out.println("Entre com sua idade:");
            idade = texto.nextInt();
		texto.nextLine();
            System.out.println("A idade digitada foi:" + idade);

            System.out.println("Entre com sua formação:");
                  formacao = texto.nextLine();
            System.out.println("Um grande proficional" + formacao);

            System.out.println("Entre com seu cargo no Demoday:");
                  cargodemoday = texto.nextLine();
            System.out.println("parabéms pelo seu cargo de" + cargodemoday);


        }
}