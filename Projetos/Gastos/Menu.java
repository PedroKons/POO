package meupacote;

import main.java.meupacote;
import java.util.Scanner;

public class Menu {
    private Aplicacao aplicacao;
    
    public String LerValor(String rotulo) {
        System.out.print(rotulo+": ");
        Scanner leitor = new Scanner(System.in);
        return leitor.nextLine();
    }

    public Menu(Aplicacao aplicacao) {
        this.aplicacao = aplicacao;
    }

    public void menu(){
        char opcao = 'h';
        do { 
            System.out.println("Menu do Programa ");
            System.out.println("1- Adicionar Tipo de Gasto ");
            System.out.println("2- Adicionar Forma de Pagamento ");
            System.out.println("3- Extrato de Gasto ");
            System.out.println("4- Novo Gasto ");
            opcao = this.LerValor("Selecione uma opcao").toUpperCase().charAt(0);
            switch (opcao) {
                case '1' : addGasto();break;
              //  case '2' : addPagamento();break;
                // case '3' : extrato();break;
               // case '4' : nGasto();break;
            
            } 
        } while (opcao != 's');

    }

    private void addGasto(){
        TipoGasto tipo = new TipoGasto();
        tipo.setDescricao(LerValor("Informe o tipo de gasto"));
        this.aplicacao.adicionarTipoDeGasto(tipo);
    }
}
