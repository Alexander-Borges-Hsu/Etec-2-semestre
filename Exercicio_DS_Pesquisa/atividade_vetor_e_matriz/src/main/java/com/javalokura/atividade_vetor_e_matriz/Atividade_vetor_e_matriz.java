package com.javalokura.atividade_vetor_e_matriz;

/**
 *
 * @author Alexander
 */

public class Atividade_vetor_e_matriz {

    public static void main(String[] args) {
             
        int semanas = 5;
        int diaSemanas = 7;
        
        int[][] calendario = new int[semanas][diaSemanas];
        
        int dia = 1;
        boolean mesIniciado = false;
        
        for (int i = 0; i < semanas; i++){
            for (int j = 0; j < diaSemanas; j++){
                if (i == 0 && j < 2){
                    calendario[i][j] = 0;
                }
                else if (dia <= 31){
                    calendario[i][j] = dia++;
                } else {
                    calendario[i][j] = 0;
                }               
            }                      
        }
        
        String[] diasDaSemana = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab"};
        System.out.println("Calendario de Outubro 2024:");
        for (String diaDSemana : diasDaSemana){
            System.out.print
        (diaDSemana + "\t");
        }
        System.out.println();
        
        for (int i = 0; i < semanas; i++){
            for (int j = 0; j < diaSemanas; j++){
                if (calendario[i][j] == 0) {
                    System.out.print("\t");
                } else {
                    System.out.print(calendario[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
