
public class Calculo {

    private String num1 = "", num2 = "", operador = "";
    private boolean chk = false;

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
        chk=false;
    }

    public void LimparDados() {
        num1 = "";
        num2 = "";
        operador = "";
        chk=false;

    }

    public String Calcular(String n1, String n2, String op) {

        switch (op) {

            case "+":
                num1 = Double.toString(Double.parseDouble(num1) + Double.parseDouble(num2));
                break;
            case "-":
                num1 = Double.toString(Double.parseDouble(num1) - Double.parseDouble(num2));
                break;
            case "/":
                num1 = Double.toString(Double.parseDouble(num1) / Double.parseDouble(num2));
                break;
            case "*":
                num1 = Double.toString(Double.parseDouble(num1) * Double.parseDouble(num2));
                break;
        }
        chk = true;
        num2="";
        operador="";
        return num1;
    }

    public void Processo(String numero) {

        if (chk == false) {
            if (operador == "") {
                num1 = num1 + numero;
            } else {
                num2 = num2 + numero;
            }
        }else{
           if (operador == "") {
                num1="";
                num1=num1 + numero;
            } else {
                num2 = num2 + numero;
            } 
           chk=false; 
        }

    }

}
