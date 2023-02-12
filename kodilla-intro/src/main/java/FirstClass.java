public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 950, 2019);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkAll();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2022);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkAll();

        Notebook oldNotebook = new Notebook(1600, 700, 2014);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkAll();

        Notebook myNotebook = new Notebook(1800, 900, 2021);
        System.out.println(myNotebook.weight + " " + myNotebook.price + " " + myNotebook.year);
        myNotebook.checkPrice();
        myNotebook.checkWeight();
        myNotebook.checkAll();

    }
}