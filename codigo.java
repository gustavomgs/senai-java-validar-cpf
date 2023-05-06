import java.util.Scanner;

class ValidaRCPF {
  
    public static boolean validarCPF(String cpf) {
      
        if (cpf.length() != 11) {
            return false;
        }
        
        int[] numeros = new int[11];
        
        for (int i = 0; i < 11; i++) {
            numeros[i] = Integer.parseInt(cpf.substring(i, i + 1));
            System.out.printf("%d \n", numeros[i]);
        }
        
        return true;
    }

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o CPF a ser validado: ");
        String cpf = teclado.nextLine();

        if (validarCPF(cpf)) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }
    }  
}
