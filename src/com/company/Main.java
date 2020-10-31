package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        HavingSuperAbility Medic =new Medic();
        HavingSuperAbility Warrior =new Warrior();
        HavingSuperAbility Magic =new Magic();
        HavingSuperAbility[] hero = {Medic, Warrior, Magic};
        for (int i = 0; i < hero.length; i++) {
            print(hero[i]);
        }
    }
    public static void print(HavingSuperAbility p){
        p.applySuperAbility();
        System.out.println(p.superAbilityType("magical, damage, medicine"));
    }
}
