package library.main;

import java.util.ArrayList;
import java.util.Scanner;
import library.model.Book;
import library.model.Member;

public class LibrarySystem 
{
    public static void main(String[] args) 
    {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Member> members = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        books.add(new Book("Programming Basics", "Mark Johnson", 2016));
        books.add(new Book("Data Structures", "Sarah Lee", 2019));
        members.add(new Member("Rembulan", "M01"));
        members.add(new Member("Gemerlap", "M02"));

        while (true) 
        {
            System.out.println("\n---------------------------------------");
            System.out.println("Sistem Manajemen Perpustakaan Sederhana");
            System.out.println("1. Tampilkan Daftar Buku");
            System.out.println("2. Tampilkan Daftar Anggota");
            System.out.println("3. Tambah Buku Baru");
            System.out.println("4. Tambah Anggota Baru");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) 
            {
                case 1:
                    displayBooks(books);
                    break;
                case 2:
                    displayMembers(members);
                    break;
                case 3:
                    addBook(books, scanner);
                    break;
                case 4:
                    addMember(members, scanner);
                    break;
                case 5:
                    System.out.println("GET OUTT!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void displayBooks(ArrayList<Book> books) 
    {
        System.out.println("\nDaftar Buku:");
        if (books.isEmpty()) 
        {
            System.out.println("Empty!");
        } else 
        {
            for (int i = 0; i < books.size(); i++) 
            {
                Book book = books.get(i);
                System.out.println((i + 1) + ". " + book.getTitle() + " pengarang  " + book.getAuthor() + " (" + book.getYearPublish() + ")");
            }
        }
    }

    public static void displayMembers(ArrayList<Member> members) 
    {
        System.out.println("\nDaftar Anggota:");
        if (members.isEmpty()) 
        {
            System.out.println("Empty!");
        } else 
        {
            for (int i = 0; i < members.size(); i++) 
            {
                Member member = members.get(i);
                System.out.println((i + 1) + ". " + member.getName() + " (ID. " + member.getMemberId() + ")");
            }
        }
    }

    public static void addBook(ArrayList<Book> books, Scanner scanner) 
    {
        System.out.print("Judul Buku: ");
        String title = scanner.nextLine();
        System.out.print("Penulis: ");
        String author = scanner.nextLine();
        System.out.print("Tahun Terbit: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        
        books.add(new Book(title, author, year));
        System.out.println("Buku berhasil ditambahkan!");
    }

    public static void addMember(ArrayList<Member> members, Scanner scanner) 
    {
        System.out.print("Nama Anggota: ");
        String name = scanner.nextLine();
        System.out.print("ID Anggota: ");
        String id = scanner.nextLine();
        
        members.add(new Member(name, id));
        System.out.println("Anggota berhasil ditambahkan!");
    }
}