public class tarefa {
    String descricao;
    boolean concluida;
    String prioridade;  // NOVO

    public tarefa(String descricao){ // construtor
        this.descricao = descricao;
        this.concluida = false;
        this.prioridade = "Baixa"; // VALOR PADRAO
    }


}
