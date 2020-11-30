package StrategyPattern.st;

public class gun implements Weapon {
    @Override
    public void attack() {
        System.out.println("총 발사");
    }

    @Override
    public void doubleattack() {
        System.out.println("연속 발사");
    }
}
