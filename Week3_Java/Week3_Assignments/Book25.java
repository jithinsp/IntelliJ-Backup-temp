package Week3_Assignments;

public class Book25 {
    public static void main(String[] args) {
        Book[] library = {
                new Book("The Road Ahead", "Bill Gates", true),
                new Book("Walter Isaacson", "Steve Jobs", true),
                new Book("Mockingjay: The Final Book of The Hunger Games", "Suzanne Collins", false)
        };

        for (Book book : library) {
            String status;
            if (book.isReadingStatus()) {
                status = "Already read";
            } else {
                status = "You still need to read";
            }
            System.out.println(status + " '" + book.getTitle() + "' by " + book.getAuthor() + ".");
        }
    }
}

class Book {
    private String title;
    private String author;
    private boolean readingStatus;

    public Book(String title, String author, boolean readingStatus) {
        this.title = title;
        this.author = author;
        this.readingStatus = readingStatus;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isReadingStatus() {
        return readingStatus;
    }
}
