package ee.peeyushlearningjava.Library;

class LibraryItem {

    private String itemID;
    private String title;
    private String author;

    public void checkOut() {
        System.out.println("Checkout");
    }

    public void returnItem() {
        System.out.println("return");
    }
}
