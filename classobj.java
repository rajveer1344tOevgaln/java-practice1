
class book{
    String name ,author ;
    int price ;
    void display(){
        System.out.println(name+""+author+""+price);
    }
    book(String name,String author, int price){
        this.name = name;
        this.price = price;
        this.author = author;
    }
}
public class classobj{
    public static void main(String[] args) {
        book b1 = new book("c++ ,"," iron junior boy ,",3600);
        b1.display();
        book b2 = new book("java ,","hammar mauris ,",6000);
        b2.display();
    }

}