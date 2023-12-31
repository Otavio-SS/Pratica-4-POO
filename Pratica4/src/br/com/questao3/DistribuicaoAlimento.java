package br.com.questao3;

public class DistribuicaoAlimento extends Projeto{
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    @Override
    public boolean validaProjeto() {
        if (getDataFim().equals("")){
            return true;
        }else
        return false;
    }
    public String imprimeProjeto (){
        return ("Nome: "
                +getNomeProjeto()+" Descrição: "
                +getDescricao()+" Data de início: "
                +getDataInicio()+" Data de fim: "
                +getDataFim()+" Descrição do alimento: "
                +getDescAlimento()+" Quantidade: "
                +getQtde());

    }
}
