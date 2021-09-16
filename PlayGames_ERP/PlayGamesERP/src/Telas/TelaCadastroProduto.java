package Telas;

import Telas.componentes.MeuJButton;
import Telas.componentes.MeuJTextField;
import java.awt.event.ActionEvent;

/**
 * @author hedermilani
 */
public class TelaCadastroProduto extends TelaSistema {

    //coluna do produto
    private MeuJTextField jtfCodigo = new MeuJTextField(20, "Código do Produto");
    private MeuJTextField jtfValorUni = new MeuJTextField(20, "Valor Unitário");
    private MeuJTextField jtfCategoria = new MeuJTextField(20, "Categoria");
    private MeuJTextField jtfStatus = new MeuJTextField(20, "Status");
    private MeuJTextField jtfNome = new MeuJTextField(20, "Nome");

    //coluna de Estoque
    private MeuJTextField jtfData = new MeuJTextField(20, "Data");
    private MeuJTextField jtfID = new MeuJTextField(20, "ID");
    private MeuJTextField jtfTipMovi = new MeuJTextField(20, "Tipo de Movimentação");
    private MeuJTextField jtfProduto = new MeuJTextField(20, "Produto");
    private MeuJTextField jtfQuantidade = new MeuJTextField(20, "Quantidae");
    private MeuJTextField jtfValor = new MeuJTextField(20, "Valor");
    private MeuJTextField jtfItemVenda = new MeuJTextField(20, "Item Venda");

    //coluna de categoria
    private MeuJTextField jtfIdCate = new MeuJTextField(20, "ID");
    private MeuJTextField jtfNomeCate = new MeuJTextField(20, "Nome");

    //coluna de Item Venda
    private MeuJTextField jtfIdVenda = new MeuJTextField(20, "ID");
    private MeuJTextField jtfNomevenda = new MeuJTextField(20, "Nome");
    private MeuJTextField jtfQuantiVenda = new MeuJTextField(20, "Quantidade");
    private MeuJTextField jtfDesconIndi = new MeuJTextField(20, "Desconto Individual");
    private MeuJTextField jtfValorLiqui = new MeuJTextField(20, "Valor Líquido");
    private MeuJTextField jtfVenda = new MeuJTextField(20, "Venda");
    private MeuJTextField jtfValorFinal = new MeuJTextField(20, "Valor Final");

    private MeuJButton jbCancelar = new MeuJButton("Cancelar");
    private MeuJButton jbSalvar = new MeuJButton("Salvar");

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
        adicionaComponentes(jpComponentes, 1, 4, 1, 1, jtfData);
        adicionaComponentes(jpComponentes, 3, 4, 1, 1, jtfID);
        adicionaComponentes(jpComponentes, 5, 4, 1, 1, jtfTipMovi);
        adicionaComponentes(jpComponentes, 7, 4, 1, 1, jtfProduto);
        adicionaComponentes(jpComponentes, 9, 4, 1, 1, jtfQuantidade);
        adicionaComponentes(jpComponentes, 11, 4, 1, 1, jtfValor);
        adicionaComponentes(jpComponentes, 13, 4, 1, 1, jtfItemVenda);

        //coluna de categoria
        adicionaComponentes(jpComponentes, 11, 1, 1, 1, jtfIdCate);
        adicionaComponentes(jpComponentes, 13, 1, 1, 1, jtfNomeCate);

        //coluna de Item Venda
        adicionaComponentes(jpComponentes, 1, 6, 1, 1, jtfIdVenda);
        adicionaComponentes(jpComponentes, 3, 6, 1, 1, jtfNomevenda);
        adicionaComponentes(jpComponentes, 5, 6, 1, 1, jtfQuantiVenda);
        adicionaComponentes(jpComponentes, 7, 6, 1, 1, jtfDesconIndi);
        adicionaComponentes(jpComponentes, 9, 6, 1, 1, jtfValorLiqui);
        adicionaComponentes(jpComponentes, 11, 6, 1, 1, jtfVenda);
        adicionaComponentes(jpComponentes, 13, 6, 1, 1, jtfValorFinal);

        adicionaComponentes(jpBotoesInferiores, 20, 7, 1, 1, jbCancelar);
        adicionaComponentes(jpBotoesInferiores, 20, 8, 1, 1, jbSalvar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    private void AdicionaListener() {
        jbCancelar.addActionListener(this);
        jbSalvar.addActionListener(this);

    }
}
