package StrategyPattern.st;

public class sword implements Weapon {

    @Override
    public void attack() {
        System.out.println("검 공격");
    }

    @Override
    public void doubleattack() {
        System.out.println("검 2번 공격");
    }
}
