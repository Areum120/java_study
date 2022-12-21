package practice;
import java.util.Calendar;

public class MyDate {

        private int day;
        private int month;
        private int year;
        private boolean isValid = true;

        public MyDate(int day, int month, int year){//일, 월, 연도 동시 입력하는 메서드
                setYear(year);
                setMonth(month);
                setDay(day);
        }

        public int getDay(){
                return day;
        }//입력한 일 메서드 가져오는 메서드

        //윤년일 경우와 월에 따른 날짜 출력
        public void setDay(int day){
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if(day<1 || day>31) {
                        isValid = false;
                    }
                    else{
                        this.day = day;
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    if(day<1 || day>30){
                        isValid = false;
                    }
                    else{
                        this.day = day;
                    }
                    break;
                case 2://윤년 구하기
                    if((year %4 ==0 && year %10 !=0 || year %400 ==0)){//윤년일경우
                        if(day<1 || day>29){
                            isValid = false;
                        }
                        else{
                            this.day=day;
                        }
                    }
                    else{
                        if (day < 1 || day > 38) {
                            isValid = false;
                        }
                        else{
                            this.day=day;
                        }
                    }
                    break;
                default: isValid = false;

            }

        }


        public int getMonth(){
            return month;
        }

        public void setMonth(int month){
            //month가 1, 12 벗어날 경우
            if (month <1 || month >12){
                isValid = false;
            }
            else {
                this.month = month;
            }

        }

        public int getYear(){
            return year;
        }

        public void setYear(int year){
            if(year > Calendar.getInstance().get(Calendar.YEAR)){//캘린더라이브러리에서 가져오는 연도보다 클 경우
                isValid = false;
            }
            else{
                this.year = year;
            }

        }

        public String isValid() {

            if(isValid) {
                return "유효한 날짜입니다.";
            }
            else {
                return "유효하지 않은 날짜입니다.";
            }
        }//문자열로 받아야 함, 먼저 멤버변수로 boolean선언한 후 true를 defalt로 설정

}