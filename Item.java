public class Item extends Book{
    public int itemId;

    private boolean borrowed;

    public  Item(int itemId, String title, String author, String isbn){
        super(title,author,isbn);
        this.itemId=itemId;
        this.borrowed=false;
    }

    //setter
    public void setBorrowed(boolean flag){
        {
            this.borrowed=flag;
        }
    }

    // getters

    public int getItemId(){
        return itemId;
    }

    public boolean getBorrowed (){
        return borrowed;
    }


    public String toString(){
        return "Itemid: "+ itemId +" |"+ super.toString();
    }

}
