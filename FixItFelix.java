enum BookMedium {PhysicalBook, EBook, Audiobook};
enum BookGenre {Fiction, NonFiction, Biography, History, Mystery, Romance, Sciencefiction, Fantasy, Horror, Poetry, Drama, Selfhelp, Other};
enum BookRating {Rating1, Rating2, Rating3, Rating4, Rating5};

public class FixItFelix {
    public static abstract class Book {
    private final String title;
    private final String author;
    private BookGenre genre;

    Book(String title, String author, BookGenre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public BookGenre getGenre() {
        return this.genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }
}

public static class PublishedBook extends Book {
    private Integer publishedDate;
    private BookMedium medium;

    PublishedBook(String title, String author, BookGenre genre, int publishedDate, BookMedium medium) {
        super(title, author, genre);
        this.publishedDate = publishedDate;
        this.medium = medium;
    }

    public Integer getPublishedDate() {
        return this.publishedDate;
    }

    public void setPublishedDate(Integer publishedDate) {
        this.publishedDate = publishedDate;
    }

    public BookMedium getMedium() {
        return this.medium;
    }

    public void setMedium(BookMedium medium) {
        this.medium = medium;
    }

    public String toString() {
        String message = super.getTitle() + " by " + super.getAuthor();
        if (publishedDate != null) {
            message += " (" + this.publishedDate + ")";
        }
        if (medium != null) {
            message += " - " + this.medium;
        }
        return message;
    }
}

public static class ReadBook extends PublishedBook {
    private BookRating rating;
    private Integer readDate;

    ReadBook(String title, String author, BookGenre genre, int publishedDate, BookMedium medium, BookRating rating, int readDate) {
        super(title, author, genre, publishedDate, medium);
        this.rating = rating;
        this.readDate = readDate;
    }

    public BookRating getRating() {
        return this.rating;
    }

    public void setRating(BookRating rating) {
        this.rating = rating;
    }

    public Integer getReadDate() {
        return this.readDate;
    }

    public void setReadDate(Integer readDate) {
        this.readDate = readDate;
    }

    public String toString() {
        String message = super.toString();
        if (readDate != null) {
            message += " - read in " + this.readDate;
        }
        if (rating != null) {
            switch (rating) {
                case Rating1:
                    message += ", rated " + "1/5";
                    break;
                case Rating2:
                    message += ", rated " + "2/5";
                    break;
                case Rating3:
                    message += ", rated " + "3/5";
                    break;
                case Rating4:
                    message += ", rated " + "4/5";
                    break;
                case Rating5:
                    message += ", rated " + "5/5";
                    break;
            }
        }
        return message;
    }
}
    
    public static void main(String[] args) {
        Book book1 = new PublishedBook("The Hobbit", "J.R.R. Tolkien", BookGenre.Fantasy, 1937, BookMedium.PhysicalBook);
        Book book2 = new PublishedBook("The Lord of the Rings", "J.R.R. Tolkien", BookGenre.Fantasy, 1954, BookMedium.PhysicalBook);
        Book book3 = new ReadBook("The Silmarillion", "J.R.R. Tolkien", BookGenre.Fantasy, 1977, BookMedium.PhysicalBook, BookRating.Rating5, 2022);
        Book book4 = new ReadBook("The Fellowship of the Ring", "J.R.R. Tolkien", BookGenre.Fantasy, 1954, BookMedium.PhysicalBook, BookRating.Rating5, 2021);
            
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
            
        book1.setGenre(BookGenre.Other);
        System.out.println(book1);
    }
    

}


