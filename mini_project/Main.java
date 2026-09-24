package mini_project;

class Book {
    String title;
    Book(String title){
        this.title = title;
    }
}

class Member {
    String name;
    Member(String name){
        this.name = name;
    }
}

class Library{
    Book book; //HAS A Relationship
    Member member; //HAS a Relationship
    
    Library(Book book, Member member){
        this.book = book;
        this.member = member;
    }

    void display() {
        System.out.println("Book Title: " + book.title);
        System.out.println("Member Name: " + member.name);
    }

}


public class Main{
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby");
        Member member = new Member("John Doe");
        Library library = new Library(book, member);
        library.display();
    }
}