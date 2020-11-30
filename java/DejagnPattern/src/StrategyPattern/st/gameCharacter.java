package StrategyPattern.st;

public class gameCharacter {

    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.attack();
    }

    public void doubleattack() {
        weapon.doubleattack();
    }





}
