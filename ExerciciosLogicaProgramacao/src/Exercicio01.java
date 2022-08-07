import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] tarefasMaisImportantes = new String[5];
		for(int i = 0; i < tarefasMaisImportantes.length; i++) {
			System.out.println("Digite a " + i + " tarefa mais importante do seu dia");
			tarefasMaisImportantes[i] = scanner.nextLine();
			
			
		}
		
		System.out.println("Suas tarefas são: ");
		for(int i = 0; i < tarefasMaisImportantes.length; i++) {
			System.out.println(i + ":" + tarefasMaisImportantes[i]);
		}
		
		scanner.close();
	}

}
