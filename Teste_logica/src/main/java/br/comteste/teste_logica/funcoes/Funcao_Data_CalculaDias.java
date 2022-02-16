package br.comteste.teste_logica.funcoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Funcao_Data_CalculaDias {

    public Integer calculaDias(String dataInicial, String dataFinal) throws ParseException {
    Integer resultado;

    SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy/MM/dd");
    Calendar dataInic = Calendar.getInstance();
    Calendar dataFim = Calendar.getInstance();

    dataInic.setTime(simpleFormat.parse(dataInicial));
    dataFim.setTime(simpleFormat.parse(dataFinal));

    resultado = dataFim.get(Calendar.DAY_OF_YEAR) - dataInic.get(Calendar.DAY_OF_YEAR);

    return resultado;
    }
}
