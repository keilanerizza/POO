package exercicio_ocp;

public class Teste {
    //@Test

    public void testeMetodoCalcula() {
        Compra compra = new Compra(100.0, "SAO PAULO");
        //System.out.println(new CalculadoraDePrecos().calcula(compra));
        //Assert.assertEquals(115, new CalculadoraDePrecos().calcula(compra),0.0001);
    }

    /*public void deveCalcularDescontoEFrete() {
// criando os mocks
        TabelaDePreco simuladorDeTabela = mock(TabelaDePreco.class);
        ServicoDeEntrega simuladorDeEntrega = mock(ServicoDeEntrega.class);

// cria a classe principal, passando os
// mocks (dublês) como dependência
        CalculadoraDePrecos calculadora = new CalculadoraDePrecos(simuladorDeTabela,simuladorDeEntrega);
        Produto cd = new Produto("CD do Jorge e Mateus", 50.0);

// simulando o comportamento das dependências
// usando os mocks criados acima

        when(simuladorDeTabela.descontoPara(50)).thenReturn(5.0);
        when(simuladorDeEntrega.para("SP")).thenReturn(10.0);

// invoca o comportamento que queremos testar
        double valor = calculadora.calcula(cd);

// garante que o resultado da operação é 55 reais.
        assertEquals(55.0, valor, 0.0001);
    }*/
}
