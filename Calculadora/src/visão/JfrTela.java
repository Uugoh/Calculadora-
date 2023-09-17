package visão;

import Enums.EnumOperação;
import controle.CalculadoraControle;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author hugop
 */
public class JfrTela extends javax.swing.JFrame {

    private CalculadoraControle calculadoracontrole;
    private EnumOperação ultimaoperacao;

    public JfrTela() {
        initComponents();
        calculadoracontrole = new CalculadoraControle();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton12 = new javax.swing.JButton();
        tfValor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BtC = new javax.swing.JButton();
        BtMaisMenos = new javax.swing.JButton();
        BtBarra = new javax.swing.JButton();
        BtPorcento = new javax.swing.JButton();
        BtZero = new javax.swing.JButton();
        BtUm = new javax.swing.JButton();
        BtDois = new javax.swing.JButton();
        BtVezes = new javax.swing.JButton();
        BtTres = new javax.swing.JButton();
        BtQuatro = new javax.swing.JButton();
        BtCinco = new javax.swing.JButton();
        BtMais = new javax.swing.JButton();
        BtSeis = new javax.swing.JButton();
        BtSete = new javax.swing.JButton();
        BtOito = new javax.swing.JButton();
        BtMenos = new javax.swing.JButton();
        BtNove = new javax.swing.JButton();
        BtVirgula = new javax.swing.JButton();
        BtPonto = new javax.swing.JButton();
        BtIgual = new javax.swing.JButton();

        jButton12.setText("jButton12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        tfValor.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        tfValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfValor.setText("0,00");
        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.GridLayout(5, 4));

        BtC.setText("C");
        BtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCActionPerformed(evt);
            }
        });
        jPanel2.add(BtC);

        BtMaisMenos.setText("+/-");
        BtMaisMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMaisMenosActionPerformed(evt);
            }
        });
        jPanel2.add(BtMaisMenos);

        BtBarra.setText("/");
        BtBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBarraActionPerformed(evt);
            }
        });
        jPanel2.add(BtBarra);

        BtPorcento.setText("%");
        BtPorcento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPorcentoActionPerformed(evt);
            }
        });
        jPanel2.add(BtPorcento);

        BtZero.setText("0");
        BtZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtZeroActionPerformed(evt);
            }
        });
        jPanel2.add(BtZero);

        BtUm.setText("1");
        BtUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtUmActionPerformed(evt);
            }
        });
        jPanel2.add(BtUm);

        BtDois.setText("2");
        BtDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDoisActionPerformed(evt);
            }
        });
        jPanel2.add(BtDois);

        BtVezes.setText("*");
        BtVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVezesActionPerformed(evt);
            }
        });
        jPanel2.add(BtVezes);

        BtTres.setText("3");
        BtTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtTresActionPerformed(evt);
            }
        });
        jPanel2.add(BtTres);

        BtQuatro.setText("4");
        BtQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtQuatroActionPerformed(evt);
            }
        });
        jPanel2.add(BtQuatro);

        BtCinco.setText("5");
        BtCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCincoActionPerformed(evt);
            }
        });
        jPanel2.add(BtCinco);

        BtMais.setText("+");
        BtMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMaisActionPerformed(evt);
            }
        });
        jPanel2.add(BtMais);

        BtSeis.setText("6");
        BtSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSeisActionPerformed(evt);
            }
        });
        jPanel2.add(BtSeis);

        BtSete.setText("7");
        BtSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSeteActionPerformed(evt);
            }
        });
        jPanel2.add(BtSete);

        BtOito.setText("8");
        BtOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtOitoActionPerformed(evt);
            }
        });
        jPanel2.add(BtOito);

        BtMenos.setText("-");
        BtMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMenosActionPerformed(evt);
            }
        });
        jPanel2.add(BtMenos);

        BtNove.setText("9");
        BtNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtNoveActionPerformed(evt);
            }
        });
        jPanel2.add(BtNove);

        BtVirgula.setText(",");
        BtVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVirgulaActionPerformed(evt);
            }
        });
        jPanel2.add(BtVirgula);

        BtPonto.setText(".");
        BtPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPontoActionPerformed(evt);
            }
        });
        jPanel2.add(BtPonto);

        BtIgual.setText("=");
        BtIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtIgualActionPerformed(evt);
            }
        });
        jPanel2.add(BtIgual);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfValor, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorActionPerformed

    private void BtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCActionPerformed
        limpa();
        calculadoracontrole.zerar();
    }//GEN-LAST:event_BtCActionPerformed

    private void BtMaisMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMaisMenosActionPerformed
        digita("+/-");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_BtMaisMenosActionPerformed

    private void BtPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtPontoActionPerformed

    private void BtZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtZeroActionPerformed
        digita("0");
    }//GEN-LAST:event_BtZeroActionPerformed

    private void BtUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtUmActionPerformed
        digita("1");        // TODO add your handling code here:
    }//GEN-LAST:event_BtUmActionPerformed

    private void BtDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDoisActionPerformed
        digita("2");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_BtDoisActionPerformed

    private void BtTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtTresActionPerformed
        digita("3");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_BtTresActionPerformed

    private void BtQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtQuatroActionPerformed
        digita("4");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_BtQuatroActionPerformed

    private void BtCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCincoActionPerformed
        digita("5");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_BtCincoActionPerformed

    private void BtSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSeisActionPerformed
        digita("6");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_BtSeisActionPerformed

    private void BtSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSeteActionPerformed
        digita("7");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_BtSeteActionPerformed

    private void BtOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtOitoActionPerformed
        digita("8");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_BtOitoActionPerformed

    private void BtNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtNoveActionPerformed
        digita("9");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_BtNoveActionPerformed

    private void BtBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBarraActionPerformed
        calculadoracontrole.realizaoperação(EnumOperação.DIVISÃO, stringToDouble(tfValor.getText()));
        ultimaoperacao = EnumOperação.DIVISÃO;
        limpa();
    }//GEN-LAST:event_BtBarraActionPerformed

    private void BtPorcentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPorcentoActionPerformed
        digita("%");
    }//GEN-LAST:event_BtPorcentoActionPerformed

    private void BtVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVezesActionPerformed
        calculadoracontrole.realizaoperação(EnumOperação.MULTIPLICAÇÃO, stringToDouble(tfValor.getText()));
        ultimaoperacao = EnumOperação.MULTIPLICAÇÃO;
        limpa();
    }//GEN-LAST:event_BtVezesActionPerformed

    private void BtMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMaisActionPerformed
        calculadoracontrole.realizaoperação(EnumOperação.SOMA, stringToDouble(tfValor.getText()));
        ultimaoperacao = EnumOperação.SOMA;
        limpa();
    }//GEN-LAST:event_BtMaisActionPerformed

    private void BtMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMenosActionPerformed
        calculadoracontrole.realizaoperação(EnumOperação.SUBTRAÇÃO, stringToDouble(tfValor.getText()));
        limpa();
        ultimaoperacao = EnumOperação.SUBTRAÇÃO;
    }//GEN-LAST:event_BtMenosActionPerformed

    private void BtVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVirgulaActionPerformed
        digita(",");
    }//GEN-LAST:event_BtVirgulaActionPerformed

    private void BtIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIgualActionPerformed
        calculadoracontrole.realizaoperação(ultimaoperacao, stringToDouble(tfValor.getText()));
        tfValor.setText(DoubleToString(calculadoracontrole.getTotal()));// TODO add your handling code here:
    }//GEN-LAST:event_BtIgualActionPerformed
    private String DoubleToString(Double numero) {
        if (numero != null) {
            DecimalFormat formato = new DecimalFormat("##,###,##0.00", new DecimalFormatSymbols(new Locale("pt", "br")));
            formato.setParseBigDecimal(true);
            return formato.format(numero);
        }
        return "";
    }

    private Double stringToDouble(String numero) {
        NumberFormat nf = NumberFormat.getInstance();
        Double dv = 0.0;
        try {
            dv = nf.parse(numero).doubleValue();
        } catch (ParseException ex) {

        }
        return dv;
    }

    private void limpa() {
        tfValor.setText("0,00");
    }

    private void digita(String caractere) {
        if (tfValor.getText().equals("0,00")) {
            tfValor.setText(caractere);
        } else {
            if (caractere.equals(",") && tfValor.getText().contains(",")) {

            } else {
                tfValor.setText(tfValor.getText().concat(caractere));
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBarra;
    private javax.swing.JButton BtC;
    private javax.swing.JButton BtCinco;
    private javax.swing.JButton BtDois;
    private javax.swing.JButton BtIgual;
    private javax.swing.JButton BtMais;
    private javax.swing.JButton BtMaisMenos;
    private javax.swing.JButton BtMenos;
    private javax.swing.JButton BtNove;
    private javax.swing.JButton BtOito;
    private javax.swing.JButton BtPonto;
    private javax.swing.JButton BtPorcento;
    private javax.swing.JButton BtQuatro;
    private javax.swing.JButton BtSeis;
    private javax.swing.JButton BtSete;
    private javax.swing.JButton BtTres;
    private javax.swing.JButton BtUm;
    private javax.swing.JButton BtVezes;
    private javax.swing.JButton BtVirgula;
    private javax.swing.JButton BtZero;
    private javax.swing.JButton jButton12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
