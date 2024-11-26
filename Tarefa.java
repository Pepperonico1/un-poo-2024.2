public class Tarefa {

    private String nome;      // Corrigido para 'String' com "S" maiúsculo
    private String descricao; // Corrigido para 'String' com "S" maiúsculo
    private int prioridade;

    // Construtor
    public Tarefa(String nome, String descricao, int prioridade) {
        this.nome = nome;
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPrioridade() { // Corrigido para 'getPrioridade' em vez de 'prioridade'
        return prioridade;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    // Método para exibir tarefa
    public void exibirTarefa() { // Corrigido para 'exibirTarefa' com "e" minúsculo
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prioridade: " + prioridade);
    }
}