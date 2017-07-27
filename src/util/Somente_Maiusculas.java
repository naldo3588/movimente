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
public class Somente_Maiusculas extends PlainDocument {

    public void insertString(int offs, String str,
            AttributeSet a) throws BadLocationException {

        // transforma o conteúdo para letras maiúsculas
        super.insertString(offs, str.toUpperCase(), a);

    }
}
