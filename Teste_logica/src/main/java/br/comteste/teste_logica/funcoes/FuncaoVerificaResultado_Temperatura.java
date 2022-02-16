package br.comteste.teste_logica.funcoes;

public class FuncaoVerificaResultado_Temperatura {

    public void verificaResultado(int numTeste, int resultadoEsperado, Integer resultado){

        if (resultadoEsperado==resultado){
            System.out.println("Teste "+ numTeste+" passou!");
        }else{
            System.out.println("Teste "+numTeste+" Não Passou (Resultado esperado ="+resultadoEsperado+ "Resultado obtido = "+resultado);
        }
    }
}
