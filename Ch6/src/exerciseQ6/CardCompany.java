package exerciseQ6;

import singleton.Car;

public class CardCompany {

    private static CardCompany Instance = new CardCompany();

    private CardCompany(){

    }

    public static CardCompany getInstance(){//인스턴스를 외부에서 참조할 수 있도록
        if(Instance == null){
            Instance = new CardCompany();
        }
        return Instance;//유일한 인스턴스 반환
    }

    //Card 인스턴스 반환, Test가 아닌 싱글턴 패턴으로 반환
    public Card issuerCard(){
        Card card = new Card();
        return card;
    }




}
