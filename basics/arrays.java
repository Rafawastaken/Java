package basics;
import java.util.Scanner;;

public class arrays {
    public static void main(String[] args) {
        // Array de strings
        String nomes[] = new String[4];

        nomes[0] = "Joao";
        nomes[1] = "Rafael";
        nomes[2] = "Ferreira";
        nomes[3] = "Pimenta";


        String[] cidades = {"Porto", "Braga", "Lisboa", "Algarve"};
        System.out.println(cidades[0]);

        int[] impares = {1, 3, 5, 7, 9};

        for(int i = 0; i < impares.length; i++){
            System.out.println(impares[i]);            
        }

        System.out.println("------------------------------");

        String[] alunos = {"joao", "pedro", "sara", "luisa"};
        int[] notas = {12, 15, 10, 7};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name_lookup = scanner.next();

        for (int i = 0; i < alunos.length; i++) {
            if(name_lookup.equals(alunos[i])){
                System.out.println("Nota: " + notas[i]);
            }
        }

        scanner.close();
    }
    
}
