package gameLevel;

public abstract class PlayerLevel {

    //각 레벨마다 메서드가 조금씩 다르게 구현되므로 추상 메서드로 선언
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

//    template 메서드, 시나리오 대로 실행
    final public void go(int count){//재정의되면 안되므로 final
        run();
        for(int i = 0; i < count; i++){
            jump();
        }
        turn();
    }
}
