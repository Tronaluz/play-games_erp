package Telas;

import Telas.componentes.MeuJButton;
import Telas.componentes.MeuJTextField;
import java.awt.event.ActionEvent;

/**
 *
 * @author Lucas
 */
public class TelaMoviProduto extends TelaSistema {

    private MeuJTextField jtfProduto = new MeuJTextField(20, "Produto");
    private MeuJTextField jtfItemVenda = new MeuJTextField(20, "Item Venda");
    private MeuJTextField jtfData = new MeuJTextField(20, "Data");
    private MeuJTextField jtfTipMovi = new MeuJTextField(20, "Tipo de Movimentação");
    private MeuJTextField jtfQuantidade = new MeuJTextField(20, "Quantidade");
    private MeuJTextField jtfValorTotal = new MeuJTextField(20, "Valor Total");
    
    private MeuJButton jbCancelar = new MeuJButton("Cancelar");
    private MeuJButton jbSalvar = new MeuJButton("Salvar");

    public TelaMoviProduto() {
        super("Movimento de Produtos");
        AdicionaListener();
        montaTela();
        pack();
    }

    private void montaTela() {
        adicionaComponentes(jpComponentes, 1, 1, 1, 1, jtfProduto);
        adicionaComponentes(jpComponentes, 1, 2, 1, 1, jtfItemVenda);
        adicionaComponentes(jpComponentes, 5, 1, 1, 1, jtfData);  
        adicionaComponentes(jpComponentes, 5, 2, 1, 1, jtfTipMovi);
        adicionaComponentes(jpComponentes, 9, 1, 1, 1, jtfQuantidade); 
        adicionaComponentes(jpComponentes, 9, 2, 1, 1, jtfValorTotal);
        
        
        
        
        
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
