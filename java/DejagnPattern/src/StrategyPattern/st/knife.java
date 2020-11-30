package StrategyPattern.st;

public class knife implements Weapon{

    @Override
    public void attack() {
        System.out.println("칼 공격");
    }

    @Override
    public void doubleattack() {
        System.out.println("칼 2번 공격");
    }
}
