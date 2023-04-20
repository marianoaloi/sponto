/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aloi.sponto;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author maloi
 */
public class SPoint extends javax.swing.JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 8617343896666271L;
    private int sponto;
    private final JFrame TuQueSabe = new TuQueSabe();

    /**
     * Creates new form SPoint
     */
    public SPoint() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jSplitPane = new javax.swing.JSplitPane();
        sOriginal = new javax.swing.JScrollPane();
        original = new javax.swing.JTextPane();
        sModifed = new javax.swing.JScrollPane();
        modifed = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        buttons = new javax.swing.JPanel();
        colar = new javax.swing.JButton();
        copiar = new javax.swing.JButton();
        jLError = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMISpontear = new javax.swing.JButton();
        jMIAlinhar = new javax.swing.JButton();
        jMIStringar = new javax.swing.JButton();
        jMIMegaStringar = new javax.swing.JButton();
        jMIBuffar = new javax.swing.JButton();
        jMIColar = new javax.swing.JButton();
        jMIReverter = new javax.swing.JButton();
        jMITuQueSabe = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMISair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMISpontear1 = new javax.swing.JMenuItem();
        jMIAlinhar1 = new javax.swing.JMenuItem();
        jMIStringar1 = new javax.swing.JMenuItem();
        jMIMegaStringar1 = new javax.swing.JMenuItem();
        jMIBuffar1 = new javax.swing.JMenuItem();
        jMIColar1 = new javax.swing.JMenuItem();
        jMIReverter1 = new javax.swing.JMenuItem();
        jMITuQueSabe1 = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sponto - utilitário desde 2005");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("Sponto"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.BorderLayout());

        jSplitPane.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jSplitPaneAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jSplitPane.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jSplitPaneAncestorResized(evt);
            }
        });

        sOriginal.setViewportBorder(javax.swing.BorderFactory.createTitledBorder("Original"));
        sOriginal.setViewportView(original);

        jSplitPane.setLeftComponent(sOriginal);

        sModifed.setViewportBorder(javax.swing.BorderFactory.createTitledBorder("Modificado"));
        sModifed.setViewportView(modifed);

        jSplitPane.setRightComponent(sModifed);

        getContentPane().add(jSplitPane, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.BorderLayout());

        buttons.setLayout(new java.awt.GridLayout(1, 2));

        colar.setText("colar");
        colar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colarActionPerformed(evt);
            }
        });
        buttons.add(colar);

        copiar.setText("copiar");
        copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarActionPerformed(evt);
            }
        });
        buttons.add(copiar);

        jPanel1.add(buttons, java.awt.BorderLayout.CENTER);
        jPanel1.add(jLError, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        jPanel2.setLayout(new java.awt.GridLayout(8, 0));

        jMISpontear.setText("Spontear");
        jMISpontear.setToolTipText("Botão de Spontear");
        jMISpontear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISpontearActionPerformed(evt);
            }
        });
        jPanel2.add(jMISpontear);

        jMIAlinhar.setText("Alinhar");
        jMIAlinhar.setToolTipText("Botão de Alinhar");
        jMIAlinhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAlinharActionPerformed(evt);
            }
        });
        jPanel2.add(jMIAlinhar);

        jMIStringar.setText("Stringar");
        jMIStringar.setToolTipText("Botão de Stringar");
        jMIStringar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIStringarActionPerformed(evt);
            }
        });
        jPanel2.add(jMIStringar);

        jMIMegaStringar.setText("MegaStringar");
        jMIMegaStringar.setToolTipText("Botão de MegaStringar");
        jMIMegaStringar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMegaStringarActionPerformed(evt);
            }
        });
        jPanel2.add(jMIMegaStringar);

        jMIBuffar.setText("Buffar");
        jMIBuffar.setToolTipText("Botão de Buffar");
        jMIBuffar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIBuffarActionPerformed(evt);
            }
        });
        jPanel2.add(jMIBuffar);

        jMIColar.setText("Colar");
        jMIColar.setToolTipText("Botão de Colar");
        jMIColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIColarActionPerformed(evt);
            }
        });
        jPanel2.add(jMIColar);

        jMIReverter.setText("Reverter");
        jMIReverter.setToolTipText("Botão de Reverter");
        jMIReverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIReverterActionPerformed(evt);
            }
        });
        jPanel2.add(jMIReverter);

        jMITuQueSabe.setText("TuQueSabe");
        jMITuQueSabe.setToolTipText("Botão de TuQueSabe");
        jMITuQueSabe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMITuQueSabeActionPerformed(evt);
            }
        });
        jPanel2.add(jMITuQueSabe);

        getContentPane().add(jPanel2, java.awt.BorderLayout.EAST);

        jMenu1.setText("File");

        jMISair.setText("Sair");
        jMISair.setToolTipText("Sair da aplicação");
        jMISair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISairActionPerformed(evt);
            }
        });
        jMenu1.add(jMISair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMISpontear1.setText("Spontear");
        jMISpontear1.setToolTipText("Botão de Spontear");
        jMISpontear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISpontearActionPerformed(evt);
            }
        });
        jMenu2.add(jMISpontear1);

        jMIAlinhar1.setText("Alinhar");
        jMIAlinhar1.setToolTipText("Botão de Alinhar");
        jMIAlinhar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAlinharActionPerformed(evt);
            }
        });
        jMenu2.add(jMIAlinhar1);

        jMIStringar1.setText("Stringar");
        jMIStringar1.setToolTipText("Botão de Stringar");
        jMIStringar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIStringarActionPerformed(evt);
            }
        });
        jMenu2.add(jMIStringar1);

        jMIMegaStringar1.setText("MegaStringar");
        jMIMegaStringar1.setToolTipText("Botão de MegaStringar");
        jMIMegaStringar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMegaStringarActionPerformed(evt);
            }
        });
        jMenu2.add(jMIMegaStringar1);

        jMIBuffar1.setText("Buffar");
        jMIBuffar1.setToolTipText("Botão de Buffar");
        jMIBuffar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIBuffarActionPerformed(evt);
            }
        });
        jMenu2.add(jMIBuffar1);

        jMIColar1.setText("Colar");
        jMIColar1.setToolTipText("Botão de Colar");
        jMIColar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIColarActionPerformed(evt);
            }
        });
        jMenu2.add(jMIColar1);

        jMIReverter1.setText("Reverter");
        jMIReverter1.setToolTipText("Botão de Reverter");
        jMIReverter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIReverterActionPerformed(evt);
            }
        });
        jMenu2.add(jMIReverter1);

        jMITuQueSabe1.setText("TuQueSabe");
        jMITuQueSabe1.setToolTipText("Botão de TuQueSabe");
        jMITuQueSabe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMITuQueSabeActionPerformed(evt);
            }
        });
        jMenu2.add(jMITuQueSabe1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colarActionPerformed

        UtilSPonto.colarParaAreaTransferencia(original);
    }//GEN-LAST:event_colarActionPerformed

    private void copiarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        UtilSPonto.copiarParaAreaTransferencia(modifed);
    }                                      

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMISairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMISairActionPerformed
        System.exit(0); // TODO add your handling code here:
    }// GEN-LAST:event_jMISairActionPerformed

    private void jSplitPaneAncestorAdded(javax.swing.event.AncestorEvent evt) {// GEN-FIRST:event_jSplitPaneAncestorAdded
        jSplitPane.setDividerLocation(getSize().width / 2);
    }// GEN-LAST:event_jSplitPaneAncestorAdded

    private void jSplitPaneAncestorResized(java.awt.event.HierarchyEvent evt) {// GEN-FIRST:event_jSplitPaneAncestorResized
        jSplitPane.setDividerLocation(getSize().width / 2);
    }// GEN-LAST:event_jSplitPaneAncestorResized

    private void jMISpontearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMISpontearActionPerformed
        this.sponto = 0;
        String pText = original.getText();
        StringBuffer resultado = new StringBuffer();
        Pattern p = Pattern.compile("sponto\\s*:=.*?;", 2);
        Matcher m = p.matcher(pText);

        int posicaoFinal = 0;
        while (m.find()) {
            m.appendReplacement(resultado, "Sponto := '#"
                    + new DecimalFormat("0000").format(++this.sponto) + "';");
            posicaoFinal = m.end();
        }
        resultado.append(pText.substring(posicaoFinal));
        modifed.setText(resultado.toString());

    }// GEN-LAST:event_jMISpontearActionPerformed

    private void jMIAlinharActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMIAlinharActionPerformed

        String pText = original.getText();
        modifed.setText(alinhar(pText));

    }// GEN-LAST:event_jMIAlinharActionPerformed

    private void jMIStringarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMIStringarActionPerformed
        String[] texto = original.getText().split("\n");
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length; i++) {
            String linha = texto[i];
            resultado.append(i == 0 ? "" : "+");
            resultado.append(" \"");
            resultado.append(linha.replaceAll("\"", "\\\\\""));
            resultado.append(" \"\n");
        }

        resultado.append(" ;\n");
        modifed.setText(resultado.toString());

        //jMIAlinharActionPerformed(evt);
    }// GEN-LAST:event_jMIStringarActionPerformed

    private void jMIMegaStringarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMIMegaStringarActionPerformed

        String[] texto = original.getText().split("\n");
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length; i++) {
            String linha = texto[i];
            resultado.append(i == 0 ? "" : "+");
            resultado.append(" \"");
            resultado.append(linha.replaceAll("\"", "\\\\\""));
            resultado.append(" \\n \"\n");
        }
        resultado.append(" ;\n");

        modifed.setText(resultado.toString());
    }// GEN-LAST:event_jMIMegaStringarActionPerformed

    private void jMIBuffarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMIBuffarActionPerformed
        String[] texto = original.getText().split("\n");
        StringBuilder resultado = new StringBuilder();
        resultado.append("StringBuilder auxiliar=new StringBuilder();\n\n");
        for (String linha : texto) {
            resultado.append(" auxiliar.append(\"");
            resultado.append(linha.replaceAll("\"", "\\\\\""));
            resultado.append(" \\n\");\n");
        }
        resultado.append(" ;\n");

        modifed.setText(resultado.toString());
    }// GEN-LAST:event_jMIBuffarActionPerformed

    private void jMIColarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMIColarActionPerformed
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contents = clipboard.getContents(this);
        if (contents == null) {
            this.original.setText("");
        } else if (contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            try {
                String texto = (String) contents
                        .getTransferData(DataFlavor.stringFlavor);
                this.original.setText(texto);
            } catch (UnsupportedFlavorException | IOException e1) {
                jLError.setText(e1.getMessage());
            }
        }
    }// GEN-LAST:event_jMIColarActionPerformed

    private void jMITuQueSabeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMITuQueSabeActionPerformed
        TuQueSabe.setVisible(true);
    }// GEN-LAST:event_jMITuQueSabeActionPerformed

    private void jMIReverterActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMIReverterActionPerformed
        StringBuilder saida = new StringBuilder(original.getText().length());
        for (int i = original.getText().toCharArray().length - 1; i >= 0; i--) {
            saida.append(original.getText().toCharArray()[i]);
        }
        modifed.setText(saida.toString());
    }// GEN-LAST:event_jMIReverterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        SPoint sPt = new SPoint();
        sPt.setVisible(true);
        UtilSPonto.colarParaAreaTransferencia(sPt.original);
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttons;
    private javax.swing.JButton colar;
    private javax.swing.JButton copiar;
    private javax.swing.JLabel jLError;
    private javax.swing.JButton jMIAlinhar;
    private javax.swing.JMenuItem jMIAlinhar1;
    private javax.swing.JButton jMIBuffar;
    private javax.swing.JMenuItem jMIBuffar1;
    private javax.swing.JButton jMIColar;
    private javax.swing.JMenuItem jMIColar1;
    private javax.swing.JButton jMIMegaStringar;
    private javax.swing.JMenuItem jMIMegaStringar1;
    private javax.swing.JButton jMIReverter;
    private javax.swing.JMenuItem jMIReverter1;
    private javax.swing.JMenuItem jMISair;
    private javax.swing.JButton jMISpontear;
    private javax.swing.JMenuItem jMISpontear1;
    private javax.swing.JButton jMIStringar;
    private javax.swing.JMenuItem jMIStringar1;
    private javax.swing.JButton jMITuQueSabe;
    private javax.swing.JMenuItem jMITuQueSabe1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane modifed;
    private javax.swing.JTextPane original;
    private javax.swing.JScrollPane sModifed;
    private javax.swing.JScrollPane sOriginal;
    // End of variables declaration//GEN-END:variables

    private DocumentListener alinharQuandoModificar() {
        return new DocumentListener() {
            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = alinhar(original.getText());
                text = text.replaceAll("˜a", "ã");
                text = text.replaceAll("˜ a", "ã");
                text = text.replaceAll("˜o", "õ");
                text = text.replaceAll("˜ o", "õ");
                text = text.replaceAll("'i", "í");
                text = text.replaceAll("' i", "í");

                modifed.setText(text);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                modifed.setText(alinhar(original.getText()));
            }

        };
    }

    private String alinhar(String text) {

        String pText = original.getText();
        StringBuilder resultado = new StringBuilder();
        Pattern p = Pattern.compile("\\s+", 2);
        Matcher m = p.matcher(pText);

        resultado.append(m.replaceAll(" "));

        return (resultado.toString());

    }

}
