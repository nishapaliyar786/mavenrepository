package packageaggregation2;

public class Book {
String name;
int price;

//author details
Author author;
Publisher publisher;
Book(String n,int p,Author author,Publisher publisher)
{
	this.author=author;
	this.publisher = publisher;
	
	this.name = n;
	this.price = p;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author author = new Author("John",42,"USA");
		Publisher publisher = new Publisher("Nisha","India",23);
		Book b = new Book("Java for beginner",800,author,publisher);
		System.out.println("Book name : "+b.name);
		System.out.println("Book price : "+b.price);
		System.out.println("Author details.............");
		System.out.println("Author name : "+b.author.authorName);
		System.out.println("Author age : "+b.author.age);
		System.out.println("Author place : "+b.author.place);
		System.out.println("Publisher details ..........");
		System.out.println("Publisher name : "+b.publisher.pname);
		System.out.println("Publisher id : "+b.publisher.publisher_id);
		System.out.println("Publisher city : "+b.publisher.city);
		
	}

}
