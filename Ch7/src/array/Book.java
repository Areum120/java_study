package array;

public class Book {//객체배열

    private String bookName;
    private String author;

    public Book(){
    }

    public Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName(){//값 가져오기
        return bookName;
    }

    public void setBookName(String bookName) {//값 저장
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showBookInfo(){
        System.out.println(bookName + ","+ author);
    }
}
