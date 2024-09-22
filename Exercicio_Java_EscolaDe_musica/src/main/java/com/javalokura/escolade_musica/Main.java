package com.javalokura.escolade_musica;

import models.Aluno;
import models.Funcionario;
import models.Pessoa;
import models.Professor;


public class Main {
    public static void main(String[] args){
        Aluno Alexander = new Aluno("Alexander", "18 anos", "9906.5327.2112");
        Aluno Leticia = new Aluno("Leticia", "16 anos", "7764.8757.0999");
        
        Professor Chuchuzao = new Professor("Chuchu", "40 anos", "986765");
        Professor Rebequinha = new Professor("Rebeca", "22 anos", "677342");
        
        Funcionario Berry = new Funcionario("Berry", "26 anos", "102");
        Funcionario Roger = new Funcionario("Roger", "35 anos", "028");
        
        Pessoa[] pessoas = {Alexander, Leticia, Chuchuzao, Rebequinha, Berry, Roger};
        
        for (Pessoa p : pessoas){
            p.atividade();
            p.getId();
            
            System.out.println("");
        }
        
        
        
    }
}
