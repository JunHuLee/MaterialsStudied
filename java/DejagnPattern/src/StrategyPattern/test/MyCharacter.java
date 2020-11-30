package StrategyPattern.test;

public class MyCharacter {

    private MyPetAction myPetAction;

    public void setMyPetAction(MyPetAction myPetAction) {
        this.myPetAction = myPetAction;
    }

    public void attack() {
        myPetAction.acttack();
    }
}
