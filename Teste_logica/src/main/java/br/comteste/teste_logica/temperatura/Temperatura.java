package br.comteste.teste_logica.temperatura;

import br.comteste.teste_logica.funcoes.FuncaoMenorTemperatura;
import br.comteste.teste_logica.funcoes.FuncaoVerificaResultado_Temperatura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Temperatura {

        private Integer resultadoEsperado=null;
        private Integer resultado;
        public Integer numTeste=null;
        List<Integer> temperaturas = new ArrayList<>();
        FuncaoVerificaResultado_Temperatura verifcaResult = new FuncaoVerificaResultado_Temperatura();


        FuncaoMenorTemperatura menorTemp = new FuncaoMenorTemperatura();

    public  void Teste1() {
        numTeste = 1;
        temperaturas.add(17);
        temperaturas.add(32);
        temperaturas.add(14);
        temperaturas.add(21);
        Collections.sort(temperaturas);
        resultadoEsperado = 14;
        resultado = menorTemp.MenorTemperatura(temperaturas);
        verifcaResult.verificaResultado(numTeste,resultadoEsperado,resultado);
    }

    public void Teste2() {
        numTeste = 2;
        temperaturas.add(27);
        temperaturas.add(-8);
        temperaturas.add(-12);
        temperaturas.add(9);
        Collections.sort(temperaturas);
        resultadoEsperado =-8;
        resultado = menorTemp.MenorTemperatura(temperaturas);
        verifcaResult.verificaResultado(numTeste,resultadoEsperado,resultado);
    }

    public void Teste3() {
        numTeste = 3;
        temperaturas.add(-6);
        temperaturas.add(14);
        temperaturas.add(42);
        temperaturas.add(6);
        temperaturas.add(25);
        temperaturas.add(-18);
        Collections.sort(temperaturas);
        resultadoEsperado =6;
        resultado = menorTemp.MenorTemperatura(temperaturas);
        verifcaResult.verificaResultado(numTeste,resultadoEsperado,resultado);
    }

    public void Teste4() {
        numTeste = 4;
        temperaturas.add(34);
        temperaturas.add(11);
        temperaturas.add(13);
        temperaturas.add(-23);
        temperaturas.add(-11);
        temperaturas.add(18);
        Collections.sort(temperaturas);
        resultadoEsperado =6;
        resultado = menorTemp.MenorTemperatura(temperaturas);
        verifcaResult.verificaResultado(numTeste,resultadoEsperado,resultado);
    }

    public void Teste5() {
        numTeste = 5;
        temperaturas.add(17);
        temperaturas.add(0);
        temperaturas.add(28);
        temperaturas.add(-4);
        Collections.sort(temperaturas);
        resultadoEsperado =0;
        resultado = menorTemp.MenorTemperatura(temperaturas);
        verifcaResult.verificaResultado(numTeste,resultadoEsperado,resultado);
    }

    public void Teste6() {
        numTeste = 6;
        temperaturas.add(-10);
        temperaturas.add(27);
        temperaturas.add(9);
        temperaturas.add(-12);
        Collections.sort(temperaturas);
        resultadoEsperado =9;
        resultado = menorTemp.MenorTemperatura(temperaturas);
        verifcaResult.verificaResultado(numTeste,resultadoEsperado,resultado);
    }

    public void Teste7() {
        numTeste = 7;
        temperaturas.add(-47);
        temperaturas.add(-14);
        temperaturas.add(-5);
        temperaturas.add(-12);
        temperaturas.add(-8);
        Collections.sort(temperaturas);
        resultadoEsperado =-5;
        resultado = menorTemp.MenorTemperatura(temperaturas);
        verifcaResult.verificaResultado(numTeste,resultadoEsperado,resultado);
    }

    public void Teste8() {
        numTeste = 8;
        temperaturas.add(-47);
        temperaturas.add(-14);
        temperaturas.add(-5);
        temperaturas.add(-12);
        temperaturas.add(-5);
        Collections.sort(temperaturas);
        resultadoEsperado =-5;
        resultado = menorTemp.MenorTemperatura(temperaturas);
        verifcaResult.verificaResultado(numTeste,resultadoEsperado,resultado);
    }

    public void Teste9() {
        numTeste = 9;
        temperaturas.add(-7);
        temperaturas.add(12);
        temperaturas.add(-13);
        temperaturas.add(8);
        Collections.sort(temperaturas);
        resultadoEsperado =-5;
        resultado = menorTemp.MenorTemperatura(temperaturas);
        verifcaResult.verificaResultado(numTeste,resultadoEsperado,resultado);
    }
}
