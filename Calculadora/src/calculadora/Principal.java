package calculadora;

import visão.JfrTela;

/**
 *
 * @author hugop
 */
public class Principal {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrTela().setVisible(true);
            }
        });
    }

}
