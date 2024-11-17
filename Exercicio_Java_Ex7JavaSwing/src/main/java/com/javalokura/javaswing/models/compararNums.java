package com.javalokura.javaswing.models;

import javax.swing.JOptionPane;

public class compararNums {
    
    public static void maiorNum(){
        String num1;
        String num2;
        
        int StringToNum1;
        int StringToNum2;
        
        num1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro que será comparado com o segundo");
        num2 = JOptionPane.showInputDialog("Digite o segundo número inteiro");
        
        StringToNum1 = Integer.parseInt(num1);
        StringToNum2 = Integer.parseInt(num2);
        
        if (StringToNum1 == StringToNum2){
            JOptionPane.showMessageDialog(null, "O " + num1 + " é igual ao " + num2);
        }else if(StringToNum1 < StringToNum2){
            JOptionPane.showMessageDialog(null, "O " + num2 + " é maior que o " + num1);
        }else{
            JOptionPane.showMessageDialog(null, "O " + num1 + " é maior que o " + num2);
        }
            
    }
    
    public static void parImpar(){
        String num1;
        
        int StringToNum1;
        
        num1 = JOptionPane.showInputDialog("Digite um número inteiro pra saber se ele é par ou ímpar");
        
        StringToNum1 = Integer.parseInt(num1);
        
        if(StringToNum1 % 2 == 0){
            JOptionPane.showMessageDialog(null,"O " + StringToNum1 + " é um número par");
        }else{
            JOptionPane.showMessageDialog(null, "O " + StringToNum1 + " é um numero ímpar");
        }

    }
    
    public static void media(){
        String num1;
        String num2;
        String num3;
        
        Float StringToNum1;
        Float StringToNum2;
        Float StringToNum3;
        
        num1 = JOptionPane.showInputDialog("Digite a primeira nota decimal pra descobrir a média");
        num2 = JOptionPane.showInputDialog("Digite a segunda nota decimal");
        num3 = JOptionPane.showInputDialog("Digite a terceira nota decimal");
        
        StringToNum1 = Float.parseFloat(num1);
        StringToNum2 = Float.parseFloat(num2);
        StringToNum3 = Float.parseFloat(num3);
        
        Float media = (StringToNum1 + StringToNum2 + StringToNum3) / 3;
        
        if (media >= 6){
            JOptionPane.showMessageDialog(null, "O aluno foi aprovado, média: " + media);
        }else {
            JOptionPane.showMessageDialog(null, "O aluno foi reprovado, média: " + media);
        }
    }
    
    public static void naturezaNum(){
        String num1;
        
        int StringToNum1;
        
        num1 = JOptionPane.showInputDialog("Digite um número inteiro pra saber se ele é positivo, negativo ou neutro");
        
        StringToNum1 = Integer.parseInt(num1);
        
        if(StringToNum1 == 0){
            JOptionPane.showMessageDialog(null, "O número " + StringToNum1 + " é um número neutro");
        }else if(StringToNum1 > 0){
            JOptionPane.showMessageDialog(null, "O número " + StringToNum1 + " é um número positivo");
        } else{
            JOptionPane.showMessageDialog(null, "O número " + StringToNum1 + " é um número negativo");
        }
        
    }
    
}
