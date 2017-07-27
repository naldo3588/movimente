/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Ronaldo Pedro
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {

        Double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor da Mensalidade"));
        int numPar = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de parcelas"));
        GregorianCalendar gc = new GregorianCalendar();

        Date diaAtual = new Date();
        for (int e = 1; e <= numPar; e++) {
            gc.setTime(diaAtual);
            gc.add(GregorianCalendar.MONTH, e - 1);
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date d = gc.getTime();
            df.format(d);
            System.out.println("INSERT INTO parcela_contrato VALUES numero_parcela='" + e + "' valor_parcela='" + valor + "' data_vencimento'" + d 
                    +"'");
//            System.out.println("Parcela " + e + ": " + valor + df.format(d));

        }
    }
}
