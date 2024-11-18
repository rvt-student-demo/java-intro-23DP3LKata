package lv.rvt;

public class Book {

    private String title;
    private int pages;
    private int year;


    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getDetails() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }

    public String getTitle() {
        return this.title;
    }
}
