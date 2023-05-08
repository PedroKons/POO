package meupacote;

import java.util.Date;

public class Gasto {
    private Date data;
    private String descricao;
    private double valor;
    private TipoGasto tipo;
    private FormaPagamento forma;

    public void Gasto(Date data, String descricao, double valor, TipoGasto tipo, FormaPagamento forma){
        this.data=data;
        this.descricao=descricao;
        this.valor=valor;
        this.tipo=tipo;
        this.forma=forma;

    }

    public String ObterDescricao(){
        return this.descricao;
    }

}

