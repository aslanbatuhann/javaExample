package exercises1v2;

public class Book {
    private String name;
    private Integer pageSize;
    private String author;
    private String castDate;

    public Book(String name, Integer pageSize, String author, String castDate) {
        this.name = name;
        this.pageSize = pageSize;
        this.author = author;
        this.castDate = castDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCastDate() {
        return castDate;
    }

    public void setCastDate(String castDate) {
        this.castDate = castDate;
    }
}
