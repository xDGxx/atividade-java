import java.util.Scanner;

public class SomaMedia {

    public static void main(String[] args)
        {

            Scanner nota = new Scanner(System.in);


            System.out.println("Vamos somar sua media!");

            float notaA, notaB, notaC, notaD, media;

            System.out.println("Entre com sua nota:");
            notaA = nota.nextFloat();



            System.out.println("Entre com sua nota:");
            notaB = nota.nextFloat();



            System.out.println("Entre com sua nota:");
            notaC = nota.nextFloat();


            System.out.println("Entre com sua nota:");
            notaD = nota.nextFloat();


               media = (notaA + notaB + notaC + notaD)/4; 
            if(media<=6){
            System.out.println("Você esta reprovado");
            }
            else{
            System.out.println("Você esta aprovado");
            }

            System.out.printf("A media digitada foi: %.2f", media)
        }
}