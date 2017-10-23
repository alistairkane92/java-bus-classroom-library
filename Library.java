// library capacity is 50
// stock is made of stock class

public class Library{
    private Book[] stock;

    public Library(){
        this.stock = new Book[50];
    }

    public int stockCount(){
        int count = 0;

        for(Book book : this.stock){
            if(book != null){
                count ++;
            }
        }

        return count;
    }

    public void addBook(Book book){
        if(!isLibraryFull()){
            int stockCount = stockCount();
            this.stock[stockCount] = book;
        }
    }

    public boolean isLibraryFull(){
        return stockCount() == this.stock.length;
    }
}
