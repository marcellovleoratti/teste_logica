package br.comteste.teste_logica.funcoes;


import java.util.List;

public class FuncaoMenorTemperatura {

   public Integer MenorTemperatura(List<Integer> s){

       Integer maior=null;
       Integer menor=null;
       int i=0;
       while (true) {
           if (s.get(i)==0) {
               break;
           } else {
               if (maior == null) {
                   maior = menor;
                   menor = s.get(i);
               } else {
                   if (s.get(i) > maior) {
                       maior = s.get(i);
                   } else {
                       if (s.get(i) < menor) {
                           menor = s.get(i);

                       }
                   }
               }
           }
           i++;
       }
       return menor;
   }


}
