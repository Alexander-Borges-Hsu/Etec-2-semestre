package calculadora;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        
        JPanelCalculadora  calculadoraPanel = new JPanelCalculadora(null, true);
        
        frame.add(calculadoraPanel);
        frame.setVisible(true);
    }
}
