package StrategyPattern.st;

public class strategyMain {

    /*charater에서 weapon의 접근점과 델리게이트를 하고
    * weapon이 객체를 이어주는 인터페이스 역활
    * 나머지 검과 칼을 정리하여
    * 메인에서 불러옴
    * Stractegy pettern*/
    public static void main(String[] args) {

        gameCharacter character = new gameCharacter();

        character.setWeapon(new knife());
        character.attack();
        character.doubleattack();

        character.setWeapon(new sword());
        character.attack();
        character.doubleattack();

        character.setWeapon(new gun());
        character.attack();
        character.doubleattack();
    }
}
