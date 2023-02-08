public class SimpleArray {
    public static void main(String[] args) {
        String[] hpCharacters = new String[] {"Harry Potter", "Hermione Granger", "Ron Weasley", "Neville Longbottom", "Luna Lovegood"};
        String character = hpCharacters[3];
        int numberOfElements = hpCharacters.length;

        System.out.println(character);
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
    }
}