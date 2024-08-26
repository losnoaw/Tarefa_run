import java.util.Scanner;

public class tarefa {
        public static void main(String[] args) {
        // Criando um Scanner para ler a entrada
        Scanner scanner = new Scanner(System.in);

        // Lendo um valor numérico do tipo primitivo int
        System.out.print("Digite um número inteiro: ");
        int numeroPrimitivo = scanner.nextInt();

        // Convertendo o tipo primitivo para o tipo Wrapper Integer
        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);

        // Imprimindo os valores para verificar o casting
        System.out.println("Valor do tipo primitivo: " + numeroPrimitivo);
        System.out.println("Valor do tipo Wrapper: " + numeroWrapper);

        scanner.close();
    }
}
