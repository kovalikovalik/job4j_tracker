package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Childhood", 250);
        Book book2 = new Book("Adolescence", 300);
        Book book3 = new Book("Youth", 200);
        Book book4 = new Book("Clean Code", 416);
        Book[] books = new Book[]{book1, book2, book3, book4};

        for (Book lb : books) {
            System.out.println(lb.getTitle() + "- number of pages: " + lb.getPages());
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (Book book : books) {
            System.out.println(book.getTitle());
        }

        for (Book book : books) {
            if ("Clean Code".equals(book.getTitle())) {
                System.out.println(book.getTitle());
            }
        }
    }
}
