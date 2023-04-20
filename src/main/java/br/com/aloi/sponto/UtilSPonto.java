package br.com.aloi.sponto;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import javax.swing.JTextPane;

public class UtilSPonto{
	public static void colarParaAreaTransferencia(JTextPane original) {
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable contents = clipboard.getContents(new UtilSPonto());
		if (contents == null)
			original.setText("");
		else if (contents.isDataFlavorSupported(DataFlavor.stringFlavor))
			try {
				String texto = (String) contents.getTransferData(DataFlavor.stringFlavor);
				original.setText(texto);
			} catch (UnsupportedFlavorException | IOException e1) {
				e1.printStackTrace();
			}

	}

	public static void copiarParaAreaTransferencia(JTextPane modifed) {
		
				Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
				StringSelection ss = new StringSelection(modifed.getText());
				clip.setContents(ss, ss);

			

	}
}
