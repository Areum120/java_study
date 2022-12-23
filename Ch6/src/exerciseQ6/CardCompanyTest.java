package exerciseQ6;

public class CardCompanyTest {

    public static void main(String[] args) {

        CardCompany company = CardCompany.getInstance();//싱글턴

        Card hcard = company.issuerCard();//hcard 발행
        Card ncard = company.issuerCard();//ncard 발행

        //hcard.setCardNum(3000);

        System.out.println(hcard.getCardNum());//hcardnum반환
        System.out.println(ncard.getCardNum());//ncardnum반환

    }
}
