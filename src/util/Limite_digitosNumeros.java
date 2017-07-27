/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Ronaldo Pedro
 */
public class Limite_digitosNumeros extends PlainDocument {

    private int quantidadeMax;

    public Limite_digitosNumeros(int Maxlen) {
        super();
        if (Maxlen <= 0) {
            throw new IllegalArgumentException("Especifique a quantidade!!");
        }
        quantidadeMax = Maxlen;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr)
            throws BadLocationException {
        if (str == null || getLength() == quantidadeMax) {
            return;
        }
        int totalquantia = (getLength() + str.length());
        if (totalquantia <= quantidadeMax) {
            super.insertString(offset, str.replaceAll("[^0-9]", ""), attr);
            return;
        }
        String nova = str.substring(0, getLength() - quantidadeMax);
        super.insertString(offset, nova, attr);
    }
}
