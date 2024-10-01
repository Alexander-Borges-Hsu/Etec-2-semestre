package com.mycompany.polimosfirsmo;

import com.mycompany.mavenproject1.models.Bispo;
import com.mycompany.mavenproject1.models.Cavalo;
import com.mycompany.mavenproject1.models.Peao;
import com.mycompany.mavenproject1.models.Torre;

public class Main { 
    public static void main (String[] args){
        
        Peao p1 = new Peao();
        p1.mover();
        
        Cavalo p2 = new Cavalo();
        p2.mover();
        
        Bispo p3 = new Bispo();
        p3.mover();
        
        Torre p4 = new Torre();
        p4.mover();
        
        
    }
}
