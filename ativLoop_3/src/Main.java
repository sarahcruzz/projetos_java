import javax.swing.*;

public class Main {
    public static void main(String[] args){
        // declaração de variáveis
        String senha = "449Sarah@", tentativa = "";

        while (true){
            // entrada do usuário
            tentativa = JOptionPane.showInputDialog("Digite a senha do usuário: ");

            if (tentativa.equals(senha)){
                JOptionPane.showMessageDialog(null, "A senha do usuário esta correta." +
                        "\nSeja Bem vindo!", "Login", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "A senha digitada esta incorreta!");
            }
        }
    }
}