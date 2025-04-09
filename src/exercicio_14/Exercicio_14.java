package exercicio_14;

import javax.swing.JOptionPane;

public class Exercicio_14 {

    public static void main(String[] args) {
        int ano1, ano2, r;
        ano1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano de nascimento"));
        ano2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano atual:"));
        if (ano2 > ano1) {
            r = ano2 - ano1;
            JOptionPane.showMessageDialog(null, "Você tem: " + r + " anos");
        } else {
            if (ano1 > ano2) {
                JOptionPane.showMessageDialog(null, "Data de nasecimento invalida");
            }
        }
    }
}