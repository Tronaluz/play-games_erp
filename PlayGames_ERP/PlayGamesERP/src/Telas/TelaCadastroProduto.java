package Telas;

import Telas.componentes.MeuJTextField;
import java.awt.event.ActionEvent;

/**
 * @author hedermilani
 */
public class TelaCadastroProduto extends TelaSistema {

    //coluna do produto
     MeuJTextField jtfCodigo = new MeuJTextField(20,"Código do Produto");
     MeuJTextField jtfValorUni = new MeuJTextField(20,"Valor Unitário");
     MeuJTextField jtfCategoria = new MeuJTextField(20,"Categoria");
     MeuJTextField jtfStatus = new MeuJTextField(20,"Status");
     MeuJTextField jtfNome = new MeuJTextField(20,"Nome");
    
    //coluna de Estoque
    private MeuJTextField jtfData = new MeuJTextField(20,"Data");
    private MeuJTextField jtfID = new MeuJTextField(20,"ID");
    private MeuJTextField jtfTipMovi = new MeuJTextField(20,"Tipo de Movimentação");
    private MeuJTextField jtfProduto = new MeuJTextField(20,"Produto");
    private MeuJTextField jtfQuantidade = new MeuJTextField(20,"Quantidae");
    private MeuJTextField jtfValor = new MeuJTextField(20,"Valor");
    private MeuJTextField jtfItemVenda = new MeuJTextField(20,"Item Venda");

    //coluna de categoria
    private MeuJTextField jtfIdCate = new MeuJTextField(20, "ID");
    private MeuJTextField jtfNomeCate = new MeuJTextField(20, "Nome");
    
    //coluna de Item Venda
    private MeuJTextField jtfIdVenda = new MeuJTextField(20,"ID");
    private MeuJTextField jtfNomevenda = new MeuJTextField(20,"Nome");
    private MeuJTextField jtfQuantiVenda = new MeuJTextField(20,"Quantidade");
    private MeuJTextField jtfDesconIndi = new MeuJTextField(20,"Desconto Individual");
    private MeuJTextField jtfValorLiqui = new MeuJTextField(20,"Valor Líquido");
    private MeuJTextField jtfVenda = new MeuJTextField(20,"Venda");
    private MeuJTextField jtfValorFinal = new MeuJTextField(20,"Valor Final");

    public TelaCadastroProduto() {
        super("Cadastro de Produtos");
        AdicionaListener();
        montaTela();
        pack();
    }

    private void montaTela() {
        
        //coluna do produto
        adicionaComponentes(jpComponentes, 1, 1, 1, 1, jtfCodigo);
        adicionaComponentes(jpComponentes, 3, 1, 1, 1, jtfValorUni);
        adicionaComponentes(jpComponentes, 5, 1, 1, 1, jtfCategoria);
        adicionaComponentes(jpComponentes, 7, 1, 1, 1, jtfStatus);
        adicionaComponentes(jpComponentes, 9, 1, 1, 1, jtfNome);

        //coluna de Estoque
        //adicionaComponentes(jpBotoesSuperiores, 1, 1, 1, 1, jtfData);
       // adicionaComponentes(jpBotoesSuperiores, 1, 1, 1, 1, jtfID);
       // adicionaComponentes(jpBotoesSuperiores, 1, 1, 1, 1, jtfTipMovi);
       // adicionaComponentes(jpBotoesSuperiores, 1, 1, 1, 1, jtfProduto);
       // adicionaComponentes(jpBotoesSuperiores, 1, 1, 1, 1, jtfQuantidade);
       // adicionaComponentes(jpBotoesSuperiores, 1, 1, 1, 1, jtfValor);
       // adicionaComponentes(jpBotoesSuperiores, 1, 1, 1, 1, jtfItemVenda);

        //coluna de categoria
       // adicionaComponentes(jpBotoesSuperiores, 1, 1, 1, 1, jtfIdCate);
       // adicionaComponentes(jpBotoesSuperiores, 1, 1, 1, 1, jtfNomeCate);

        //coluna de Item Venda
       // adicionaComponentes(jpBotoesSuperiores, 1, 1, 1, 1, jtfIdVenda);
       // adicionaComponentes(jpBotoesSuperiores, 1, 1, 1, 1, jtfNomevenda);
       // adicionaComponentes(jpBotoesSuperiores, 1, 1, 1, 1, jtfQuantiVenda);
       // adicionaComponentes(jpBotoesSuperiores, 1, 1, 1, 1, jtfDesconIndi);
       // adicionaComponentes(jpBotoesSuperiores, 1, 1, 1, 1, jtfValorLiqui);
       // adicionaComponentes(jpBotoesSuperiores, 1, 1, 1, 1, jtfVenda);
       // adicionaComponentes(jpBotoesSuperiores, 1, 1, 1, 1, jtfValorFinal);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    private void AdicionaListener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
