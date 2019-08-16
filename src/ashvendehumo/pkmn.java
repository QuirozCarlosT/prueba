/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ashvendehumo;

/**
 *
 * @author CBN
 */
public class pkmn {
    String name;
    int hp, atk;
    
    public pkmn(String Name, int hp, int Atk){
        name = Name;
        this.hp = hp;
        atk = Atk;
    }
    public int getHp(){
        return hp;
    }
    public void tackle(int atk){
        this.hp-=atk;
    }
    public String getName(){
        return name;
    }
    public int getAtk(){
        return atk;
    }
}
