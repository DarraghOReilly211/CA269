/*
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.time.Period;
*/
/*
 class JavaStringMethod{
    to use these place the string name in front with a dot
    {String Name}.charAt()	Returns the character at the specified index (position)	char
    {String Name}.codePointAt()	Returns the Unicode of the character at the specified index	int
    {String Name}.codePointBefore()	Returns the Unicode of the character before the specified index	int
    {String Name}.codePointCount()	Returns the number of Unicode values found in a string.	int
    {String Name}.compareTo({Second String})	Compares two strings lexicographically	int
    {String Name}.compareToIgnoreCase({Second String})	Compares two strings lexicographically, ignoring case differences	int
    {String Name}.concat({second String or "string"})	Appends a string to the end of another string	String
    {String Name}.contains()	Checks whether a string contains a sequence of characters	boolean
    {String Name}.contentEquals("string or {Second String}")	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	boolean
    {String Name}.copyValueOf()	Returns a String that represents the characters of the character array	String
    {String Name}.endsWith("Sring/char")	Checks whether a string ends with the specified character(s)	boolean
    {String Name}.equals()	Compares two strings. Returns true if the strings are equal, and false if not	boolean
    {String Name}.equalsIgnoreCase()	Compares two strings, ignoring case considerations	boolean
    {String Name}.format()	Returns a formatted string using the specified locale, format string, and arguments	String
    {String Name}.getBytes()	Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array	byte[]
    {String Name}.getChars()	Copies characters from a string to an array of chars	void
    {String Name}.hashCode()	Returns the hash code of a string	int
    {String Name}.indexOf()	Returns the position of the first found occurrence of specified characters in a string	int
    {String Name}.intern()	Returns the canonical representation for the string object	String
    {String Name}.lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string	int
    {String Name}.length()	Returns the length of a specified string	int
    {String Name}.replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced	String
    {String Name}.replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
    {String Name}.replaceAll()	Replaces each substring of this string that matches the given regular expression with the given replacement	String
    {String Name}.split()	Splits a string into an array of substrings	String[]
    {String Name}.startsWith()	Checks whether a string starts with specified characters	boolean
    {String Name}.subSequence()	Returns a new character sequence that is a subsequence of this sequence	CharSequence
    {String Name}.substring(startIndex, EndIndex)	Returns a new string which is the substring of a specified string	String
    {String Name}.toCharArray()	Converts this string to a new character array	char[]
    {String Name}.toLowerCase()	Converts a string to lower case letters	String
    {String Name}.toString()	Returns the value of a String object	String
    {String Name}.toUpperCase()	Converts a string to upper case letters	String
    {String Name}.trim()	Removes whitespace from both ends of a string	String
    {String Name}.valueOf()	Returns the string representation of the specified value	String
 }
 */
/* 
class arrayUses{

    To use arrays import java.util.Arrays;

    With Arrays you can use new Arrays e.g String {name} = new String[{array lenght}] and input lenght manually
    or for a String array use String {name} = [{input array}]:
    you can still index arrays.
    To print an array use System.out.println(Array.toString({Array Name}));
    To get Array length use the lenght method e.g ArrayName.length
    
    To sort an array use Arrays.sort({array name}), this has many different sorts such as Arrays.sort(ArrayName, startSort, endSort)
    
    To change every value in an array use Arrays.fill({Array name}, X) will change all values to x.
    Or you can just use the array index e.g. {arrayName}[index] = newValue;

    To search for an array use Array.binarySearch({arrayName}, valueToSearch) will return the index of the item.
    This method can also take a search range e.g Arrays.binarySearch({arrayName}, startingIndex, endingIndex, valueToSeach)
    
    To copy an array you must use Arrays.copyOf({Array Name}, lenght) with the lenght you can make it larger or smaller
    You can also define the starting and ending index using
    Array.copyOfRange({Array Name}, startIndex, endIndex) 
    If you use a larger value for the endIndex it will extend the length of the list

    To compare two arrays use Arrays.equals({Array1}, {Array2}).


}
*/

/*
 class Loops{
    for(int i = 1; i <= 10; i++){
        This is an example of a for loop

    }



 }
 */

 /*
  class doWhileLoop and whileLoop{
    example of "WhileLoop":
    int i = 0;
    while(i < 10){
        Syetem.out.printf("%s", "String");

        i++;

    }

    example of "DoWhileLoop":
    do{
        Syetem.out.printf("%s", "String");
    } while (i <= 10);


  */

/* 
class ArrayList{
    To use ArrayList you must import java.util.ArrayList.
    And java.util.Comparatator
    
    To make an ArrayList you must initialize this like ArrayList<Integer> {name} = new ArrayList<Integer>();
    
    //Side note "Integer" is a wrapper class which must be used for ArrayList

    To add numbers to an ArrayList you must use {Array Name}.add(); and insert the desired number into the add.
    
    To print an arraylist use System.out.println({Array Name}.toString);
    
    To print a single value from the list use System.out.println({ArrayName}.get())
    The get method will take the index number.

    An ArrayList is dynamic so it does not require a lenght you can also add and remove value from it

    To remove numbers use {Array Name}.remove() and in the remove use the index of the item
    You can also remove all value of e.g you want to remove all occurances of the number 4 from your ArrayList use {Array Name}.remove(Integer.valueOf(4));
    You can also remove all items of the arrayList using {Array name}.clear()

    To update an element in an arrayList you use the set() method,
    e.g {array name}.set(2, Integer.valueOf(5));
    This will the value in index 2 to 30.

    To sort an ArrayList you use {Array name}.sort(Comparator.naturalOrder);
    The above code will sort it from smallest to largest,
    To reverse this use "Comparator.reverseOrder" rather than the "Comparator.naturalOrder"

    To get the size of an ArrayList use {Array Name}.size()

    To know if an Array list contains a certain value use {Array name}.contains(Integer.valueOf(1))
    This above code will tell use if the array list contains 1
    To know if the ArrayList is empty use {ArrayList}.isEmpty()

    You cannot use a for loop for an ArrayList, you can only use it for Arrays
    Instead use forEach e.g, {Array Name}.forEach(numbersInArrayList -> {
        System.out.println(numberInArrayList)
        
        //Note multiply numberInArrayList by 2
        {Array Name}.set(numbersInArrayList.indexOf(number), number * 2)
    });
    This is a lambda expression


    }
*/

/*
    class HashMap{
        To use HashMaps in java you must import java.util.HashMap

        To initialize a hashmap or dictionary, you must use wrappers
        e.g., HashMap<String, Integer> example = new HashMap<String, Integer>();
        Here you can see that the keys will be Strings and the value will be Integers

        To insert something into a hashmap you must use the put() method
        E.g., Example.put("Score", 75);

        To print a hasmap use System.out.println(Example.toString());

        Hashmaps are not sorted they appear in a random order

        To print out a specific value use .get() e.g.,
        System.out.println(Example.geth("Score")); this will print out the value which key Score is assigned to

        To replace a value use .replace() method
        e.g., Example.replace("Score", 1098);

        There is another get() method called getOrDefault()
        This will return a default value if the key is not found,
        E.g., Example.getOrDefault("Size", -76);
        If "Size" is not found it will return -76

        To clear a hashmap use the .clear()

        And to get the size use the .size() method

        To remove an item from a hashmap use the .remove() method and use a key in the .remove() method.

        To check if an item exists in the hashmap you can check either if the key or value exist
        This can be done using the .containsKey() and insert the Key into the method
        To check the value use .containsValue() and insert the value in the method or if you eant to be more specific you can do this
        e.g., Example.containsValue(Integer.valueOf(100));

        To check if a hashmap is empty use the .isEmpty() method

        To loop through the hashmap you use the .forEach() method and insert the key and value into the forEach() method
        e.g., Example.forEach((Key, valu)e -> {
            System.out.println(Key + "-" + value);
            Example.replace(Key, value - 10);
        });
    }

*/

/* 
class User {
    public String name;
    public LocalDate birthDay;
    public ArrayList<Book> books = new ArrayList<Book>();

    User(String name, String birthDay){
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);

    }

    public int age() {
        Period age = Period.between(this.birthDay, LocalDate.now());
        
        return age.getYears();
    }

    public void borrow(Book book) {
        this.books.add(book);

    }

}

class Book {
    public String Title;
    public String Author;

    //There is no toSTring for a custom build method so we create a toString method 
    //for this class
    public String toString() {
        return String.format("%s by %s.", this.Title, this.Author);
    }

}


class LearningJava{
    public static void main(String args[]){
        User secondUser = new User("Tony", "1998-08-09");

        Book book = new Book();
        book.Title = "Test object oriented programming";
        book.Author = "Darragh";

        secondUser.borrow(book);

        //System.out.printf("%s was born back in %s, he is now %s years old\n", testUser.name, testUser.birthDate.toString(), testUser.age());
        System.out.printf("%s was born back in %s, he is now %s years old\n He has borrowed these books: %s\n", secondUser.name, secondUser.birthDay.toString(), secondUser.age(), secondUser.books.toString());
    }
}
*/

enum BookMedium {PhysicalBook, EBook, Audiobook};
enum BookGenre {Fiction, NonFiction, Biography, History, Mystery, Romance, Sciencefiction, Fantasy, Horror, Poetry, Drama, Selfhelp, Other};
enum BookRating {Rating1, Rating2, Rating3, Rating4, Rating5};


public class Book {
    private final String title;
    private final String author;
    private Integer publishedDate;
    private BookMedium medium;
    private BookGenre genre;
    private BookRating rating;
    private Integer readDate;


    Book(String title, String author, BookGenre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    Book(String title, String author, BookGenre genre, int publishedDate) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishedDate = publishedDate;
    }

    Book(String title, String author, BookGenre genre, int publishedDate, BookMedium medium, BookRating rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishedDate = publishedDate;
        this.medium = medium;
        this.rating = rating;
    }

    Book(String title, String author, BookGenre genre, int publishedDate, int readDate, BookMedium medium, BookRating rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishedDate = publishedDate;
        this.medium = medium;
        this.rating = rating;
        this.readDate = readDate;
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
        String message = this.title + " by " + this.author;
        if (publishedDate != null) {
            message += " (" + this.publishedDate + ")";
        }
        if (readDate != null) {
            message += " - read in " + this.readDate;
        }
        if (rating != null) {
            if (rating == BookRating.Rating1)
                message += ", rated " + "1/5";
            else if (rating == BookRating.Rating2)
                message += ", rated " + "2/5";
            else if (rating == BookRating.Rating3)
                message += ", rated " + "3/5";
            else if (rating == BookRating.Rating4)
                message += ", rated " + "4/5";
            else if (rating == BookRating.Rating5)
                message += ", rated " + "5/5";
        }
        return message;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Children of Time", "Adrian Tchaikovsky", BookGenre.Fiction);
        System.out.println(b1);
        Book b2 = new Book("The Fifth Season", "N. K. Jemesin", BookGenre.Fiction, 2015);
        System.out.println(b2);
        Book b3 = new Book("Perdido Street Station", "China Mieville", BookGenre.Fiction, 2000, 2020, BookMedium.EBook, BookRating.Rating5);
        System.out.println(b3);

        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getGenre());
        System.out.println(b2.getPublishedDate());
        System.out.println(b3.getReadDate());
        System.out.println(b3.getMedium());
        System.out.println(b3.getRating());
    } 
}
