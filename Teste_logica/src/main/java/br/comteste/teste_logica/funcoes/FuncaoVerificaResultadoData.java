package br.comteste.teste_logica.funcoes;

public class FuncaoVerificaResultadoData {

    public void verificaResultado(String NumTeste,Integer resultadoEsperado, Integer resultado){
        if (resultadoEsperado == resultado){
            System.out.println("O Teste "+NumTeste+" Passou");
        }else{
            System.out.println("O Teste "+ NumTeste+ "Não Passou (Resultado esperado = "+ resultadoEsperado+" , resultado Obtido = "+
                    resultado);
        }

    }

}
