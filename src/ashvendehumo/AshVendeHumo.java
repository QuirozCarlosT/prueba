/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ashvendehumo;

import java.util.Random;

/**
 *
 * @author CBN
 */
public class AshVendeHumo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int x = r.nextInt(30)+1;
        int z = r.nextInt(30)+1;
        pkmn pitochu = new pkmn("pitochu", 100, x);
        pkmn pendertuga = new pkmn("pendertuga", 100, z);
        int sw =0;
        while(pitochu.getHp()>0 && pendertuga.getHp()>0){
            switch(sw){
                case 0: pendertuga.tackle(pitochu.getAtk());
                sw=1;
                break;
                case 1: pitochu.tackle(pendertuga.getAtk());
                sw=0;
                break;
            }
        }
        if(pitochu.getHp()>0){
            System.out.println("Gano "+pitochu.getName());
        }else{
            System.out.println("Gano "+pendertuga.getName());
        }
    }
    
}
