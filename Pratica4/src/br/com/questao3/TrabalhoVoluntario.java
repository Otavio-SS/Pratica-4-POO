package br.com.questao3;

public class TrabalhoVoluntario extends Projeto{
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String tipoTrabalho, int curacaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = curacaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    @Override
    public boolean validaProjeto() {
        if (duracaoTrabalho > 2){
            return true;
        }else
        return false;
    }

    @Override
    public String imprimeProjeto() {
        return ("Nome: "
                +getNomeProjeto()+" Descrição: "
                +getDescricao()+" Data de início: "
                +getDataInicio()+" Data de fim: "
                +getDataFim()+" Descrição do alimento: "
                +getTipoTrabalho()+" Quantidade: "
                +getDuracaoTrabalho());
    }

}
