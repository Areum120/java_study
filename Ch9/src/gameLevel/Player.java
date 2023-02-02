package gameLevel;

public class Player {
    private PlayerLevel level;


    public Player(){//디폴트 생성자
        level = new BeginnerLevel();//처음 생성되면 BeginnerLevel로 시작하며 레벨 메시지 출력
        level.showLevelMessage();
    }

    public PlayerLevel getLevel(){
        return level;
    }

    //레벨 변경 메서드. 현재 자신의 level을 매개변수로 받은 level로 변경하고 레벨 메시지 출력
    public void upgradeLevel(PlayerLevel level){//매개변수 자료형은 모든 레벨로 변환가능한 PlayerLevel
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count){//PlayerLevel의 템플릿 메서드 go()호출
        level.go(count);
    }



}
