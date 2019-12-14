/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Calculo {

    private String num1 = "";
    private String operador = "";
    private String num2 = "";

    public String getnum1() {
        return num1;
    }

    public void setnum1(String num1) {
        this.num1 = num1;
    }

    public String getoperador() {
        return operador;
    }

    public void setoperador(String operador) {
        this.operador = operador;
    }

    public String getnum2() {
        return num2;
    }

    public void setnum2(String num2) {
        this.num2 = num2;
    }

    public String Calcular(int num1, String ope, int num2) {
        int resultado = 0;
        switch (ope) {
            case "+":
                resultado = (num1 + num2);
                break;
            case "-":
                resultado = (num1 - num2);
                break;
            case "*":
                resultado = (num1 * num2);
                break;
            case "/":
                resultado = (num1 / num2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operador Inválido...");
        }
        return Double.toString(resultado);
    }

    public String Processo(String Valor) {
        if (operador.equals("")) {
            if (num1.equals("")) {
                num1 = Valor;
            } else {
                num1 = num1 + Valor;
            }
            return num1;
        } else {
            if (num2.equals("")) {
                num2 = Valor;
            } else {
                num2 = num2 + Valor;
            }
            return num2;
        }
    }

    public void LimparDados() {
        setoperador("");
        setnum1("");
        setnum2("");
    }
}
