package packageaggregation;

public class Book {
String name;
int price;

//author details
Author author;
Book(String n,int p,Author author)
{
	this.author=author;
	this.name = n;
	this.price = p;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author author = new Author("John",42,"USA");
		Book b = new Book("Java for beginner",800,author);
		System.out.println("Book name : "+b.name);
		System.out.println("Book price : "+b.price);
		System.out.println("Author details.............");
		System.out.println("Author name : "+b.author.authorName);
		System.out.println("Author age : "+b.author.age);
		System.out.println("Author place : "+b.author.place);
	}

}
