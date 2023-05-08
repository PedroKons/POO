package meupacote;

import java.util.Date;

public class Aplicacao {
    public FormaPagamento []formas = new FormaPagamento[4];
    public TipoGasto []tipos = new TipoGasto[4];
    private Gasto []gastos = new Gasto[4];

    public void adicionarFormaDePagamento (FormaPagamento forma) {
        for(int x=0; x<=4; x++){
            if(this.formas[x]==null){
                this.formas[x] = forma;
            }
        }
    }

    public void adicionarTipoDeGasto(TipoGasto tipo) {
        for(int x=0;x<=4;x++){
            if(this.tipos[x]==null){
                this.tipos[x] = tipo;
            }
        }
    }

    public void listaGastos(int mes , int dia) {
        for(int x=0;x<=4;x++){
            System.out.println(gastos[x]);
            System.out.println("\n");
        }
    }

    public void novoGasto(String descricao, Date data, double valor, TipoGasto tipo, FormaPagamento forma){
        for(int x=0; x<=4; x++){
            if(this.gastos[x]==null){
                this.gastos[x].Gasto(data, descricao, valor, tipo, forma);
            }
        }
            
    }
}
