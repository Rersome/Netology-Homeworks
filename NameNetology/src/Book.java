public class Book {

    public String title;
    public int pages;
    public int releaseYear;
    public Author author;

    public Book(String title, Author author, int pages, int releaseYear) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }

    public static boolean isBig(int pages){
        return pages > 500;
    }

    public boolean matches(String word){
        return (word.contains(title)) || (word.contains(author.name) || (word.contains(author.surname)));
    }

    public int estimatePrice(int pages){
        double first = Math.floor((pages * 3) * Math.sqrt(author.rating));
        int price = (int) first;
        return (price > 250 || price < 250) ? price : 250;
    }
}
