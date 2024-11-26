// Classe GerenciadorDeTarefas
public class GerenciadorDeTarefas {
    public static void main(String[] args) {
        // Criando algumas tarefas
        Tarefa tarefa1 = new Tarefa("paysandu", "AYOUUU", 1); // Prioridade 1 (mais alta)
        Tarefa tarefa2 = new Tarefa("ana claudia", "Teruaki", 3); // Prioridade 3 (baixa)
        Tarefa tarefa3 = new Tarefa("Abraão", "Me devendo uma casquinha", 2); // Prioridade 2 (média)

        // Exibindo as tarefas
        System.out.println("Tarefa 1:");
        tarefa1.exibirTarefa();
        System.out.println("\nTarefa 2:");
        tarefa2.exibirTarefa();
        System.out.println("\nTarefa 3:");
        tarefa3.exibirTarefa();
    }
}