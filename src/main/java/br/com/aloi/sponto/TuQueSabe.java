/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aloi.sponto;

import com.github.fge.largetext.LargeText;
import com.github.fge.largetext.LargeTextFactory;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.swing.AbstractAction;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.text.Document;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author maloi
 */
public class TuQueSabe extends javax.swing.JFrame {

    /**
     * @param FindBreak the FindBreak to set
     */
    public void setFindBreak(javax.swing.JCheckBox FindBreak) {
        this.FindBreak = FindBreak;
    }

    /**
     * @param OnlyFind the OnlyFind to set
     */
    public void setOnlyFind(javax.swing.JCheckBox OnlyFind) {
        this.OnlyFind = OnlyFind;
    }

    /**
     * @param ReplaceFind the ReplaceFind to set
     */
    public void setReplaceFind(javax.swing.JCheckBox ReplaceFind) {
        this.ReplaceFind = ReplaceFind;
    }

    /**
     * @return the autoProcess
     */
    public javax.swing.JCheckBox getAutoProcess() {
        return autoProcess;
    }

    /**
     * @param autoProcess the autoProcess to set
     */
    public void setAutoProcess(javax.swing.JCheckBox autoProcess) {
        this.autoProcess = autoProcess;
    }

    /**
     * @return the buttons
     */
    public javax.swing.JPanel getButtons() {
        return buttons;
    }

    /**
     * @param buttons the buttons to set
     */
    public void setButtons(javax.swing.JPanel buttons) {
        this.buttons = buttons;
    }

    /**
     * @return the colar
     */
    public javax.swing.JButton getColar() {
        return colar;
    }

    /**
     * @param colar the colar to set
     */
    public void setColar(javax.swing.JButton colar) {
        this.colar = colar;
    }

    /**
     * @return the copiar
     */
    public javax.swing.JButton getCopiar() {
        return copiar;
    }

    /**
     * @param copiar the copiar to set
     */
    public void setCopiar(javax.swing.JButton copiar) {
        this.copiar = copiar;
    }

    /**
     * @return the exceptionE
     */
    public javax.swing.JLabel getExceptionE() {
        return exceptionE;
    }

    /**
     * @param exceptionE the exceptionE to set
     */
    public void setExceptionE(javax.swing.JLabel exceptionE) {
        this.exceptionE = exceptionE;
    }

    /**
     * @param findReplace the findReplace to set
     */
    public void setFindReplace(javax.swing.JTextArea findReplace) {
        this.findReplace = findReplace;
    }

    /**
     * @return the groupvalue
     */
    public javax.swing.JTextField getGroupvalue() {
        return groupvalue;
    }

    /**
     * @param groupvalue the groupvalue to set
     */
    public void setGroupvalue(javax.swing.JTextField groupvalue) {
        this.groupvalue = groupvalue;
    }

    /**
     * @param jUniquew the jUniquew to set
     */
    public void setjUniquew(javax.swing.JCheckBoxMenuItem jUniquew) {
        this.jUniquew = jUniquew;
    }

    /**
     * @param modifed the modifed to set
     */
    public void setModifed(javax.swing.JTextArea modifed) {
        this.modifed = modifed;
    }

    /**
     * @return the original
     */
    public javax.swing.JTextArea getOriginal() {
        return original;
    }

    /**
     * @param original the original to set
     */
    public void setOriginal(javax.swing.JTextArea original) {
        this.original = original;
    }

    /**
     * @return the process
     */
    public javax.swing.JButton getProcess() {
        return process;
    }

    /**
     * @param process the process to set
     */
    public void setProcess(javax.swing.JButton process) {
        this.process = process;
    }

    /**
     * @param replaceInclude the replaceInclude to set
     */
    public void setReplaceInclude(javax.swing.JCheckBox replaceInclude) {
        this.replaceInclude = replaceInclude;
    }

    /**
     * @return the resultReplace
     */
    public javax.swing.JTextArea getResultReplace() {
        return resultReplace;
    }

    /**
     * @param resultReplace the resultReplace to set
     */
    public void setResultReplace(javax.swing.JTextArea resultReplace) {
        this.resultReplace = resultReplace;
    }

    /**
     * @return the sModifed
     */
    public javax.swing.JScrollPane getsModifed() {
        return sModifed;
    }

    /**
     * @param sModifed the sModifed to set
     */
    public void setsModifed(javax.swing.JScrollPane sModifed) {
        this.sModifed = sModifed;
    }

    /**
     * @return the sOriginal
     */
    public javax.swing.JScrollPane getsOriginal() {
        return sOriginal;
    }

    /**
     * @param sOriginal the sOriginal to set
     */
    public void setsOriginal(javax.swing.JScrollPane sOriginal) {
        this.sOriginal = sOriginal;
    }

    /**
     * @return the saveBigFile
     */
    public javax.swing.JMenuItem getSaveBigFile() {
        return saveBigFile;
    }

    /**
     * @param saveBigFile the saveBigFile to set
     */
    public void setSaveBigFile(javax.swing.JMenuItem saveBigFile) {
        this.saveBigFile = saveBigFile;
    }

    /**
     *
     */
    private static final long serialVersionUID = 7975045097186485692L;

    public static void main(String[] args) {
        new TuQueSabe().setVisible(true);
    }

    /**
     * Creates new form TuQueSabe
     */
    public TuQueSabe() {
        initComponents();

        initMineListeners();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private TuQueSabe parent;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    private TuQueSabe(Document doc, TuQueSabe aThis) {
        this();
        parent = aThis;
        original.setEnabled(false);
        original.setDocument(doc);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        findReplace = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        resultReplace = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        OnlyFind = new javax.swing.JCheckBox();
        replaceInclude = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        autoProcess = new javax.swing.JCheckBox();
        process = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        groupvalue = new javax.swing.JTextField();
        separetor = new javax.swing.JTextField();
        begin = new javax.swing.JTextField();
        end = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jSplitPane = new javax.swing.JSplitPane();
        sOriginal = new javax.swing.JScrollPane();
        original = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        sModifed = new javax.swing.JScrollPane();
        modifed = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        FindBreak = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        ReplaceFind = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        refreshFile = new javax.swing.JButton();
        buttons = new javax.swing.JPanel();
        colar = new javax.swing.JButton();
        copiar = new javax.swing.JButton();
        exceptionE = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        saveBigFile = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        optionsMenu = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jUniquew = new javax.swing.JCheckBoxMenuItem();
        jSort = new javax.swing.JCheckBoxMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItemReopen = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tu que Sabe Regex");
        setMinimumSize(new java.awt.Dimension(400, 400));

        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 5, 5));

        jSplitPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jSplitPane1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jSplitPane1.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jSplitPane1AncestorResized(evt);
            }
        });

        findReplace.setFont(new java.awt.Font("Courier 10 Pitch", 0, 12)); // NOI18N
        findReplace.setText("[\\d]{10}");
        findReplace.setToolTipText("Text do you like find with regex ");
        findReplace.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane3.setViewportView(findReplace);

        jSplitPane1.setLeftComponent(jScrollPane3);

        resultReplace.setFont(new java.awt.Font("Courier 10 Pitch", 0, 12)); // NOI18N
        resultReplace.setText("n0");
        resultReplace.setToolTipText("Only used in replace of text");
        resultReplace.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane4.setViewportView(resultReplace);

        jSplitPane1.setRightComponent(jScrollPane4);

        jPanel1.add(jSplitPane1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel5.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanel5.setName(""); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setMinimumSize(new java.awt.Dimension(0, 0));

        jList1.setFont(new java.awt.Font("Courier 10 Pitch", 0, 12)); // NOI18N
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jPanel5.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jButton1.setText("close");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);

        jButton2.setText("remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);

        jPanel5.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel11.add(jPanel5, java.awt.BorderLayout.WEST);

        jPanel8.setLayout(new java.awt.GridLayout(6, 1));

        OnlyFind.setSelected(true);
        OnlyFind.setText("Only Find");
        OnlyFind.setToolTipText("");
        jPanel8.add(OnlyFind);

        replaceInclude.setText("Replace and include what Find");
        jPanel8.add(replaceInclude);

        jPanel10.setLayout(new java.awt.BorderLayout());

        autoProcess.setSelected(true);
        autoProcess.setText("auto");
        autoProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoProcessActionPerformed(evt);
            }
        });
        jPanel10.add(autoProcess, java.awt.BorderLayout.CENTER);

        process.setText("process");
        process.setEnabled(false);
        process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processActionPerformed(evt);
            }
        });
        jPanel10.add(process, java.awt.BorderLayout.EAST);

        jPanel8.add(jPanel10);

        jPanel9.setMinimumSize(new java.awt.Dimension(22, 50));
        jPanel9.setLayout(new java.awt.GridLayout(2, 2));

        groupvalue.setToolTipText("Group List");
        jPanel9.add(groupvalue);

        separetor.setToolTipText("Separator");
        jPanel9.add(separetor);

        begin.setBackground(new java.awt.Color(247, 247, 245));
        begin.setToolTipText("Begin group");
        jPanel9.add(begin);

        end.setBackground(new java.awt.Color(247, 247, 245));
        end.setToolTipText("End group");
        jPanel9.add(end);

        jPanel8.add(jPanel9);

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3);

        jPanel11.add(jPanel8, java.awt.BorderLayout.EAST);

        jPanel2.add(jPanel11, java.awt.BorderLayout.EAST);

        jSplitPane.setDividerLocation(400);
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

        original.setFont(new java.awt.Font("Courier 10 Pitch", 0, 12)); // NOI18N
        original.setLineWrap(true);
        original.setWrapStyleWord(true);
        sOriginal.setViewportView(original);

        jSplitPane.setLeftComponent(sOriginal);
        jSplitPane.setRightComponent(jSeparator1);

        modifed.setFont(new java.awt.Font("Courier 10 Pitch", 0, 12)); // NOI18N
        modifed.setLineWrap(true);
        modifed.setWrapStyleWord(true);
        sModifed.setViewportView(modifed);

        jSplitPane.setRightComponent(sModifed);

        jPanel2.add(jSplitPane, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.BorderLayout());

        FindBreak.setText("Break Line");
        jPanel3.add(FindBreak);
        jPanel3.add(jPanel6);

        ReplaceFind.setText("Replace what Find");
        jPanel3.add(ReplaceFind);

        jButton4.setLabel("saved");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);

        jButton5.setLabel("options");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);

        refreshFile.setText("Refresh File");
        refreshFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshFileActionPerformed(evt);
            }
        });
        jPanel3.add(refreshFile);

        jPanel4.add(jPanel3, java.awt.BorderLayout.CENTER);

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

        jPanel4.add(buttons, java.awt.BorderLayout.NORTH);

        exceptionE.setToolTipText("");
        jPanel4.add(exceptionE, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel4, java.awt.BorderLayout.SOUTH);

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Salva Query Replace");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveQuery(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Open Store");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openQuery(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem4.setText("Open Big File");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBigFile(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        saveBigFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        saveBigFile.setText("Save Big File");
        saveBigFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBigFileActionPerformed(evt);
            }
        });
        jMenu1.add(saveBigFile);
        jMenu1.add(jSeparator3);

        optionsMenu.setText("Options");
        optionsMenu.setToolTipText("");
        optionsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsMenuActionPerformed(evt);
            }
        });
        jMenu1.add(optionsMenu);
        jMenu1.add(jSeparator5);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Sair");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem5.setText("Get Store Path");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jUniquew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jUniquew.setText("unique");
        jMenu2.add(jUniquew);

        jSort.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jSort.setText("Sort");
        jMenu2.add(jSort);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setLabel("Open new follow this result");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItemReopen.setLabel("Reopnne  follow this result");
        jMenuItemReopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReopenActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemReopen);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemReopenActionPerformed(ActionEvent evt) {
        tuque = null;
        jMenuItem6ActionPerformed(evt);
 
    }
       private TuQueSabe getSingleton() {
        return (tuque != null ? tuque : (tuque = new TuQueSabe(getModifed().getDocument(), this)));
    }
       private TuQueSabe tuque; // só para economiozar recurso caso nÃ£o vÃ¡ usar.

    private void jSplitPaneAncestorAdded(javax.swing.event.AncestorEvent evt) {// GEN-FIRST:event_jSplitPaneAncestorAdded
        jSplitPane.setDividerLocation(getSize().width / 2);
    }// GEN-LAST:event_jSplitPaneAncestorAdded

    private void jSplitPaneAncestorResized(java.awt.event.HierarchyEvent evt) {// GEN-FIRST:event_jSplitPaneAncestorResized
        jSplitPane.setDividerLocation(getSize().width / 2);

    }// GEN-LAST:event_jSplitPaneAncestorResized

    private void colarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_colarActionPerformed

        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contents = clipboard.getContents(this);
        if (contents == null) {
            TuQueSabe.this.getOriginal().setText("");
        } else if (contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            try {
                String texto = (String) contents.getTransferData(DataFlavor.stringFlavor);
                TuQueSabe.this.getOriginal().setText(texto);
            } catch (UnsupportedFlavorException | IOException e1) {
                getExceptionE().setText(e1.getMessage());
            }
        }
        copiarParaAreaTransferencia();
    }// GEN-LAST:event_colarActionPerformed

    private void copiarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_copiarActionPerformed
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection ss = new StringSelection(TuQueSabe.this.getModifed().getText());
        clip.setContents(ss, ss);
    }// GEN-LAST:event_copiarActionPerformed



    private void optionsMenuActionPerformed (java.awt.event.ActionEvent evt) {
        jPanel8.setVisible(true);
    }
    

    private void saveQuery(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_saveQuery
        try {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would You Like to Save the Query?", "Warning",
                    JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.NO_OPTION) {
                return;
            }
            JSONArray array = openStoredFile();
            JSONObject o;

            array.put(o = new JSONObject());

            o.put("query", getFindReplace().getText());
            o.put("replace", getResultReplace().getText());

            try (FileWriter fw = new FileWriter(storeQuery); BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(array.toString());
            }
        } catch (JSONException | IOException ex) {
            getExceptionE().setText(ex.getMessage());
        }

    }// GEN-LAST:event_saveQuery

    private void openQuery(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_openQuery
        JSONArray array = openStoredFile();
        jPanel5.setVisible(true);
        DefaultListModel<String> model;
        jList1.setModel(model = new DefaultListModel<>());
        for (int i = 0; i < array.length(); i++) {
            try {
                JSONObject get = array.getJSONObject(i);

                model.addElement(get.getString("query") + "[###]" + get.getString("replace"));
            } catch (JSONException ex) {
                getExceptionE().setText(ex.getMessage());
            }

        }
    }// GEN-LAST:event_openQuery

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        jPanel5.setVisible(false);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jList1MouseClicked
        String result = jList1.getSelectedValue();
        if (result != null) {
            String[] resultA = result.split("\\[###\\]");
            getFindReplace().setText(resultA[0]);
            getResultReplace().setText(resultA[1]);
        }
    }// GEN-LAST:event_jList1MouseClicked

    LargeText inputLargeText;

    private void openBigFile(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_openBigFile

        JFileChooser c = new JFileChooser();
        if (!original.isEnabled()) {
            getOriginal().setEnabled(true);
                refreshFile.setEnabled(false);
            getAutoProcess().setSelected(true);
            autoProcessActionPerformed(null);
            return;
        }
        autoProcessActionPerformed(null);

        switch (c.showOpenDialog(getOriginal())) {
            case JFileChooser.APPROVE_OPTION:

                final LargeTextFactory factory = LargeTextFactory.defaultFactory();

                final Path fileToSearch = Paths.get(c.getSelectedFile().toURI());
                 {
                    try {
                        inputLargeText = factory.load(fileToSearch);
                    } catch (IOException ex) {
                        getExceptionE().setText(ex.getMessage());
                    }
                    getOriginal().setText(c.getSelectedFile().getAbsolutePath());
                    getOriginal().setEnabled(false);
                    refreshFile.setEnabled(true);

                    listener.modifi();
                }
                getOriginal().setText(c.getSelectedFile().getAbsolutePath());
                getOriginal().setEnabled(false);

                listener.modifi();

                break;
            case JFileChooser.CANCEL_OPTION:
                getExceptionE().setText("Cancelado ");
                break;
        }

    }




    private static File bw;
    private void saveBigFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBigFileActionPerformed
        JFileChooser c = new JFileChooser();
        if (!modifed.isEnabled()) {
            getModifed().setEnabled(true);
            bw = null;
            getAutoProcess().setSelected(true);
            autoProcessActionPerformed(null);
            return;
        }
        autoProcessActionPerformed(null);
        getAutoProcess().setSelected(false);
        switch (c.showSaveDialog(getModifed())) {
            case JFileChooser.APPROVE_OPTION: {
                bw = c.getSelectedFile();
            }

            break;
            case JFileChooser.CANCEL_OPTION:
                getExceptionE().setText("Cancelado Salvar");
                break;
        }
    }//GEN-LAST:event_saveBigFileActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        getExceptionE().setText(storeQuery.getAbsolutePath());
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String result = jList1.getSelectedValue();
        if (result != null) {

            int dialogResult = JOptionPane.showConfirmDialog(null, "Would You Like to REMOVE the Query?", "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.NO_OPTION) {
                return;
            }
            JSONArray array = openStoredFile();
            JSONArray arrayResult = new JSONArray();

            String[] resultA = result.split("\\[###\\]");

            try {
                for (int i = 0; i < array.length(); i++) {
                    JSONObject ob = array.getJSONObject(i);
                    if (!resultA[0].equals(ob.getString("query")) || !resultA[1].equals(ob.getString("replace"))) {
                        arrayResult.put(ob);
                    }
                }

                try (FileWriter fw = new FileWriter(storeQuery); BufferedWriter bw = new BufferedWriter(fw)) {
                    bw.write(arrayResult.toString());
                    bw.flush();
                    bw.close();
                    fw.close();

                    openQuery(evt);
                } catch (IOException ex) {
                    Logger.getLogger(TuQueSabe.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (JSONException ex) {
                Logger.getLogger(TuQueSabe.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jSplitPane1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jSplitPane1AncestorAdded
        jSplitPane1.setDividerLocation(getSize().width / 2);
    }//GEN-LAST:event_jSplitPane1AncestorAdded

    private void jSplitPane1AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jSplitPane1AncestorResized
        jSplitPane1.setDividerLocation(getSize().width / 2);
    }//GEN-LAST:event_jSplitPane1AncestorResized

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        TuQueSabe tqs = getSingleton();
        tqs.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jPanel8.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void processActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processActionPerformed
        
        try {
            convert(getOriginal(), getFindReplace(), getResultReplace(), getModifed());
        } catch (InterruptedException e) {
            getExceptionE().setText(e.getMessage());
        }

        getsModifed().getVerticalScrollBar().setValue(getsModifed().getVerticalScrollBar().getMinimum());
        getsModifed().getHorizontalScrollBar().setValue(getsModifed().getHorizontalScrollBar().getMinimum());
    }//GEN-LAST:event_processActionPerformed

    private void autoProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoProcessActionPerformed
        getProcess().setEnabled(!autoProcess.isSelected());
    }//GEN-LAST:event_autoProcessActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        optionsMenuActionPerformed(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        openQuery(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void refreshFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshFileActionPerformed
       
        final LargeTextFactory factory = LargeTextFactory.defaultFactory();

        final Path fileToSearch = Paths.get(new File(getOriginal().getText()).toURI());
        try {
            inputLargeText = factory.load(fileToSearch);
        } catch (IOException ex) {
            Logger.getLogger(TuQueSabe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshFileActionPerformed


    private ActionListener copiarParaAreaTransferencia() {
        return (ActionEvent e) -> {
            Clipboard clip = Toolkit.getDefaultToolkit()
                    .getSystemClipboard();
            StringSelection ss = new StringSelection(
                    TuQueSabe.this.getModifed().getText());
            clip.setContents(ss, ss);
        };

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox FindBreak;
    private javax.swing.JCheckBox OnlyFind;
    private javax.swing.JCheckBox ReplaceFind;
    private javax.swing.JCheckBox autoProcess;
    private javax.swing.JTextField begin;
    private javax.swing.JPanel buttons;
    private javax.swing.JButton colar;
    private javax.swing.JButton copiar;
    private javax.swing.JTextField end;
    private javax.swing.JLabel exceptionE;
    private javax.swing.JTextArea findReplace;
    private javax.swing.JTextField groupvalue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemReopen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JCheckBoxMenuItem jSort;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JCheckBoxMenuItem jUniquew;
    private javax.swing.JTextArea modifed;
    private javax.swing.JMenuItem optionsMenu;
    private javax.swing.JTextArea original;
    private javax.swing.JButton process;
    private javax.swing.JButton refreshFile;
    private javax.swing.JCheckBox replaceInclude;
    private javax.swing.JTextArea resultReplace;
    private javax.swing.JScrollPane sModifed;
    private javax.swing.JScrollPane sOriginal;
    private javax.swing.JMenuItem saveBigFile;
    private javax.swing.JTextField separetor;
    // End of variables declaration//GEN-END:variables

    private void initMineListeners() {
        getOriginal().getDocument().addDocumentListener(listener);
        getFindReplace().getDocument().addDocumentListener(listener);
        getResultReplace().getDocument().addDocumentListener(listener);
        getOnlyFind().addChangeListener(listener);
        getFindBreak().addChangeListener(listener);
        getReplaceFind().addChangeListener(listener);
        getReplaceInclude().addChangeListener(listener);
        getGroupvalue().getDocument().addDocumentListener(listener);
        getSeparetor().getDocument().addDocumentListener(listener);
        getjUniquew().addChangeListener(listener);
        getjSort().addChangeListener(listener);
        getBegin().getDocument().addDocumentListener(listener);
        getEnd().getDocument().addDocumentListener(listener);

        storeQuery = new File(System.getProperty("user.home") + "/store.json");
        jPanel5.setVisible(false);
        jPanel8.setVisible(false);

        doAndUndo();
        URL local;
        System.out.println(local = TuQueSabe.class.getResource("TuQueSabe.class"));
        Font font = null; // new java.awt.Font("Courier 10 Pitch", 0, 15)
        try {
            InputStream is = this.getClass().getResourceAsStream("/CourierPrime-Regular.ttf");
            font = Font.createFont(Font.TRUETYPE_FONT, is);
            System.out.println(">>>>" + is);
            setIconImage(Toolkit.getDefaultToolkit()
                    .getImage(Thread.currentThread().getContextClassLoader().getResource("tq.png")));

        } catch(FontFormatException | IOException  e) {
            getExceptionE().setText(e.getMessage());
            getExceptionE().setVisible(true);
        }

        try {
            if (font != null) {
                //findReplace.setFont(font); // NOI18N
               // resultReplace.setFont(font); // NOI18N
              //  original.setFont(font); // NOI18N
              //  modifed.setFont(font); // NOI18N
            }
        } catch (Exception e) {
            getExceptionE().setText(e.getMessage());
            getExceptionE().setVisible(true);
        }
    }

    private void doAndUndo() {
        /*------------------------------------------*/

        final UndoManager undoManager = new UndoManager();
        javax.swing.text.Document doc = getFindReplace().getDocument();

        doc.addUndoableEditListener((UndoableEditEvent evt) -> {
            undoManager.addEdit(evt.getEdit());
        });

        getFindReplace().getActionMap().put("Undo", new AbstractAction("Undo") {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (undoManager.canUndo()) {
                        undoManager.undo();
                    }
                } catch (CannotUndoException e) {
                    getExceptionE().setText(e.getMessage());
                }
            }
        });

        getFindReplace().getInputMap().put(KeyStroke.getKeyStroke("control Z"), "Undo");

        getFindReplace().getActionMap().put("Redo", new AbstractAction("Redo") {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (undoManager.canRedo()) {
                        undoManager.redo();
                    }
                } catch (CannotRedoException e) {
                    getExceptionE().setText(e.getMessage());
                }
            }
        });

        getFindReplace().getInputMap().put(KeyStroke.getKeyStroke("control Y"), "Redo");
    }

    File storeQuery;

    private JSONArray openStoredFile() {

        JSONArray result = new JSONArray();

        if (!storeQuery.exists()) {
            return result;
        }
        try {
            FileReader fr = new FileReader(storeQuery);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();

            br.lines().forEach((String t) -> {
                sb.append(t);
            });

            result = new JSONArray(sb.toString());
        } catch (FileNotFoundException | JSONException ex) {
            getExceptionE().setText(ex.getMessage());
        }

        return result;
    }

 

    private JTextField getSeparetor() {
        return separetor;
    }

    class ListenerChanges implements DocumentListener, ChangeListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            modifi();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            modifi();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            modifi();
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            modifi();

        }

        private void modifi() {

            if (!autoProcess.isSelected()) {
                return;
            }

            processActionPerformed(null);

        }

    }

    ListenerChanges listener = new ListenerChanges();

    ExecThread master = null;
    ExecThread slave = null;

    private void convert(JTextArea text, JTextArea pattern, JTextArea replace, JTextArea modifed)
            throws InterruptedException {
        CharSequence textStr = text.isEnabled() ? text.getText()
                : inputLargeText == null ? text.getText() : inputLargeText;
        try {
            ExecThread newThread = new ExecThread(this, textStr, bw == null ? null : new FileWriter(bw));

            if (master == null || !master.isAlive()) {
                master = newThread;
                master.start();
                getExceptionE().setForeground(Color.red);
                getExceptionE().setText("Processando");
                master.join(5000);
            } else {
                slave = newThread;
            }

        } catch (IOException | InterruptedException e) {
            getExceptionE().setText(e.getMessage());
        }

    }

    /**
     * @return the FindBreak
     */
    public javax.swing.JCheckBox getFindBreak() {
        return FindBreak;
    }

    /**
     * @return the OnlyFind
     */
    public javax.swing.JCheckBox getOnlyFind() {
        return OnlyFind;
    }

    /**
     * @return the ReplaceFind
     */
    public javax.swing.JCheckBox getReplaceFind() {
        return ReplaceFind;
    }

    /**
     * @return the findReplace
     */
    public javax.swing.JTextArea getFindReplace() {
        return findReplace;
    }

    /**
     * @return the jSort
     */
    public javax.swing.JCheckBoxMenuItem getjSort() {
        return jSort;
    }

    /**
     * @return the jUniquew
     */
    public javax.swing.JCheckBoxMenuItem getjUniquew() {
        return jUniquew;
    }

    /**
     * @return the modifed
     */
    public javax.swing.JTextArea getModifed() {
        return modifed;
    }

    /**
     * @return the replaceInclude
     */
    public javax.swing.JCheckBox getReplaceInclude() {
        return replaceInclude;
    }

    public static class ExecThread extends Thread {

        private final TuQueSabe tuQueSabe;
        private final FileWriter bw;
        private final CharSequence textStr;
        



        private ExecThread(TuQueSabe tuQueSabe,CharSequence textStr, FileWriter bw) {
            this.tuQueSabe = tuQueSabe;
            this.bw = bw;
            this.textStr = textStr;
        }

        @Override
        public void run() {
            int start = 0;
            Integer count = 0;
            StringBuilder result = new StringBuilder();
            String replaceStr = tuQueSabe.getResultReplace().getText().replaceAll("\\\\n", "\n");
            try {
                Pattern p = Pattern.compile(tuQueSabe.getFindReplace().getText(), 2);
                if (textStr == null) {
                    return;
                }
                Matcher m = p.matcher(textStr);

                if (!tuQueSabe.getOnlyFind().isSelected()) {
                    result.append(m.replaceAll(replaceStr));
                } else {
                    ArrayList<String> linhas = new ArrayList<>(m.groupCount());
                    while (m.find()) {
                        String resultAux;
                        resultAux = m.group();
                        if (tuQueSabe.getReplaceFind().isSelected()) {
                            resultAux = replaceStr;
                            Pattern pR = Pattern.compile("#\\$\\{(?<x>[^\\}]*)\\}");
                            Matcher mR = pR.matcher(replaceStr);

                            while (mR.find()) {
                                String key = mR.group("x");
                                resultAux = resultAux.replace("#${" + key + "}", m.group(key));
                            }
                            if(resultAux.contains("&*&")){
                                resultAux = resultAux.replaceAll("\\&\\*\\&", count.toString());
                            }
//                            String pptern = "\\d+";
//                            if(!tuQueSabe.getGroupvalue().getText().isEmpty() && tuQueSabe.getGroupvalue().getText().matches(pptern)){
//                                Matcher pp = Pattern.compile(pptern).matcher(tuQueSabe.getGroupvalue().getText());
//                                  if(pp.find() ){
//                                    int sizeblock = Integer.parseInt(pp.group());
//                                    if((count+1)%sizeblock==0)
//                                        resultAux += '\n';
//                                  }
//                            }
                        }
                        if (tuQueSabe.getFindBreak().isSelected()) {
                            resultAux += '\n';
                        }

                        if (tuQueSabe.getReplaceInclude().isSelected()) {

                            result.append(textStr.subSequence(start, m.start()));
                            start = m.end();
                        }
                        if ((tuQueSabe.getjUniquew().isSelected() && !linhas.contains(resultAux)) 
                            ||
                            (!tuQueSabe.getjUniquew().isSelected()))
                        
                            linhas.add(resultAux);
                  
                        count++;
                    }
                    if (tuQueSabe.getReplaceInclude().isSelected() && start != 0) {                        
                            result.append(textStr.toString().substring(start));
                    }

                  //  if (tuQueSabe.getjUniquew().isSelected() || tuQueSabe.getjSort().isSelected()) {
                        if (tuQueSabe.getjSort().isSelected()) {
                            linhas.sort((String o1, String o2) -> o1.compareTo(o2));
                        }
                        
                        String pptern = "\\d+";
                        int spliterCount;
                        if(!tuQueSabe.getGroupvalue().getText().isEmpty() && tuQueSabe.getGroupvalue().getText().matches(pptern)){
                            Matcher pp = Pattern.compile(pptern).matcher(tuQueSabe.getGroupvalue().getText());
                            pp.find();
                            spliterCount = Integer.parseInt(pp.group());
                        } else {
                            spliterCount = linhas.size();
                        }
                        
                        
                        Partition<String> subLinhasAux = Partition.ofSize(linhas, spliterCount);
                        String separetor = tuQueSabe.getSeparetor().getText();
//                        if(tuQueSabe.getSeparetor().getText().isEmpty())
//                            linhas.stream().forEach(
//                                    (String x) -> {
//                                        setResult(result, x);
//                                    }
//                            );
//                        else{
//                            setResult(result, linhas.stream().collect(Collectors.joining(tuQueSabe.getSeparetor().getText())));
//                        }
                        setResult(result,
                            subLinhasAux.stream().map(x->x.stream().collect(Collectors.joining(separetor,tuQueSabe.getBegin().getText(),tuQueSabe.getEnd().getText()))).collect(Collectors.joining("\n"))
                        );
                  //  }

                }

                tuQueSabe.getExceptionE().setForeground(Color.black);
                tuQueSabe.getExceptionE().setText("ok");

                tuQueSabe.getModifed().setText(result.toString());

            } catch (NumberFormatException e) {
                tuQueSabe.getModifed().setText("ERROR " + e.getMessage());
                tuQueSabe.getExceptionE().setText(e.getMessage());
                throw new RuntimeException(e);
            } finally {
                try {
                    if (bw != null) {
                        bw.flush();
                        bw.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(TuQueSabe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        private void setResult(StringBuilder result, String resultAux) {
            if (bw == null) {
                result.append(resultAux);
            } else {
                try {

                    bw.write(resultAux);
                } catch (IOException ex) {
                    Logger.getLogger(TuQueSabe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    /**
     * @return the begin
     */
    public javax.swing.JTextField getBegin() {
        return begin;
    }

    /**
     * @param begin the begin to set
     */
    public void setBegin(javax.swing.JTextField begin) {
        this.begin = begin;
    }

    /**
     * @return the end
     */
    public javax.swing.JTextField getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(javax.swing.JTextField end) {
        this.end = end;
    }
}

final class Partition<T> extends AbstractList<List<T>> {

    private final List<T> list;
    private final int chunkSize;
    
    public Partition(List<T> list, int chunkSize) {
        this.list = new ArrayList<>(list);
        this.chunkSize = chunkSize;
//        StreamSupport.
    }

    public static <T> Partition<T> ofSize(List<T> list, int chunkSize) {
        return new Partition<>(list, chunkSize);
    }

    @Override
    public List<T> get(int index) {
        int start = index * chunkSize;
        int end = Math.min(start + chunkSize, list.size());

        if (start > end) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of the list range <0," + (size() - 1) + ">");
        }

        return new ArrayList<>(list.subList(start, end));
    }

    @Override
    public int size() {
        return (int) Math.ceil((double) list.size() / (double) chunkSize);
    }
}