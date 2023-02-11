public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 1000 && this.weight < 2000) {
            System.out.println("This notebook is not very heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkAll() {
        if (this.price < 900 && this.year < 2019)
        {
            System.out.println("This notebook has a good price, but it's not very new.");
        } else if (this.price > 900 && this.year < 2019)
        {
            System.out.println("This notebook is not the cheapest and it's not new");
        } else if (this.price < 900 && this.year > 2019)
        {
            System.out.println("This notebook has a good price and it's new");
        }        else
        {
            System.out.println("This notebook is not very cheap, but it's new");
        }
    }
}