package br.comteste.teste_logica.data;

import br.comteste.teste_logica.funcoes.FuncaoVerificaResultadoData;
import br.comteste.teste_logica.funcoes.Funcao_Data_CalculaDias;

import java.text.ParseException;

public class Data {


    private String dataIncial;
    private String dataFinal;
    public Integer resultadoEsperado;
    public Integer resultado;

    Funcao_Data_CalculaDias calculo = new Funcao_Data_CalculaDias();
    FuncaoVerificaResultadoData verificaResultado = new FuncaoVerificaResultadoData();

    public void Teste01() throws ParseException {
        dataIncial = "2018-01-01";
        dataFinal = "2018-01-02";
        resultadoEsperado = 1;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("01", resultadoEsperado, resultado);
    }

    public void Teste02() throws ParseException {
        dataIncial = "2018-01-01";
        dataFinal = "2018-02-01";
        resultadoEsperado = 31;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("02", resultadoEsperado, resultado);
    }

    public void Teste03() throws ParseException {
        dataIncial = "2018-01-01";
        dataFinal = "2018-02-02";
        resultadoEsperado = 1;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("03", resultadoEsperado, resultado);
    }

    public void Teste04() throws ParseException {
        dataIncial = "2018-01-01";
        dataFinal = "2018-02-28";
        resultadoEsperado = 58;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("04", resultadoEsperado, resultado);
    }

    public void Teste05() throws ParseException {
        dataIncial = "2018-01-15";
        dataFinal = "2018-03-15";
        resultadoEsperado = 58;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("05", resultadoEsperado, resultado);
    }

    public void Teste06() throws ParseException {
        dataIncial = "2018-01-01";
        dataFinal = "2019-01-01";
        resultadoEsperado = 365;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("06", resultadoEsperado, resultado);
    }

    public void Teste07() throws ParseException {
        dataIncial = "2018-01-01";
        dataFinal = "2020-01-01";
        resultadoEsperado = 730;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("07", resultadoEsperado, resultado);
    }

    public void Teste08() throws ParseException {
        dataIncial = "2018-12-31";
        dataFinal = "2019-01-01";
        resultadoEsperado = 1;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("08", resultadoEsperado, resultado);
    }

    public void Teste09() throws ParseException {
        dataIncial = "2018-05-31";
        dataFinal = "2018-06-01";
        resultadoEsperado = 1;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("09", resultadoEsperado, resultado);
    }

    public void Teste10() throws ParseException {
        dataIncial = "2018-05-31";
        dataFinal = "2019-06-01";
        resultadoEsperado = 366;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("10", resultadoEsperado, resultado);
    }

    public void Teste11() throws ParseException {
        dataIncial = "2016-02-01";
        dataFinal = "2016-03-01";
        resultadoEsperado = 29;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("11", resultadoEsperado, resultado);
    }

    public void Teste12() throws ParseException {
        dataIncial = "2016-01-01";
        dataFinal = "2016-03-01";
        resultadoEsperado = 60;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("12", resultadoEsperado, resultado);
    }

    public void Teste13() throws ParseException {
        dataIncial = "1981-09-21";
        dataFinal = "2009-02-12";
        resultadoEsperado = 10006;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("13", resultadoEsperado, resultado);
    }

    public void Teste14() throws ParseException {
        dataIncial = "1981-07-31";
        dataFinal = "2009-02-12";
        resultadoEsperado = 10058;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("14", resultadoEsperado, resultado);
    }

    public void Teste15() throws ParseException {
        dataIncial = "2004-03-01";
        dataFinal = "2009-02-12";
        resultadoEsperado = 1809;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("15", resultadoEsperado, resultado);
    }

    public void Teste16() throws ParseException {
        dataIncial = "2004-03-01";
        dataFinal = "2009-02-12";
        resultadoEsperado = 1809;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("16", resultadoEsperado, resultado);
    }

    public void Teste17() throws ParseException {
        dataIncial = "2004-03-01";
        dataFinal = "2009-02-12";
        resultadoEsperado = 28;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("17", resultadoEsperado, resultado);
    }

    public void Teste18() throws ParseException {
        dataIncial = "1899-01-01";
        dataFinal = "1901-01-01";
        resultadoEsperado = 730;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("18", resultadoEsperado, resultado);
    }


    public void Teste20() throws ParseException {
        dataIncial = "1999-01-01";
        dataFinal = "2001-01-01";
        resultadoEsperado = 730;
        resultado = calculo.calculaDias(dataIncial, dataFinal);
        verificaResultado.verificaResultado("20", resultadoEsperado, resultado);
    }
}