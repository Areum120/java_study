package singleton;

public class Company {//static사용해서 유일한 객체를 생성하는 싱글톤 패턴

    //내부에서 하나의 인스턴스 생성 ,프로그램 전체에서 사용할 유일한 인스턴스
    private static Company instance = new Company();

    private Company(){
        //외부 인스턴스 생성할 수 없도록 private 생성자 추가
        //public이면 외부에서 인스턴스 여러개 생성할 수 있음
    }
    //유일하게 생성한 인스턴스를 반환할 메서드 선언, 외부에서 참조할 수 있도록 public get()메서드 구현
    public static Company getInstance(){//static 선언 이유, getInstance()는 인스턴스 생성과 상관없이 호출할 수 있어야 함
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }



}
