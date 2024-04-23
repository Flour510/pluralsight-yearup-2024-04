import java.util.Scanner;

public class FamousQuotes {

    static Scanner userInput = new Scanner(System.in);

    private int id;
    private String famousQuote;

    public FamousQuotes(int id, String famousQuotes)
    {
        this.id = id;
        this.famousQuote = famousQuotes;
    }

    public static void main(String[] args) {

        FamousQuotes[] famousQuotes =
        {
                new FamousQuotes(1, "In the midst of winter, I found there was, within me, an invincible summer. - Albert Camus"),
                new FamousQuotes(2, "Believe you can and you're halfway there. - Theodore Roosevelt"),
                new FamousQuotes(3, "The only way to do great work is to love what you do. - Steve Jobs"),
                new FamousQuotes(4, "Every moment is a fresh beginning. - T.S. Eliot"),
                new FamousQuotes(5, "In the end, we only regret the chances we didn't take. - Lewis Carroll"),
                new FamousQuotes(6, "The best way to predict the future is to create it. - Peter Drucker"),
                new FamousQuotes(7, "Happiness is not something ready-made. It comes from your own actions. - Dalai Lama"),
                new FamousQuotes(8, "The journey of a thousand miles begins with one step. - Lao Tzu"),
                new FamousQuotes(9, "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill"),
                new FamousQuotes(10, "Life is what happens when you're busy making other plans. - John Lennon")
        };

        // prompt the user to select a number between 1 - 10 and display the quote
        System.out.println("Select a number from 1 through 10 to display a quote: ");
        int userSelection = userInput.nextInt();

        // implement try/catch statement here
        try {
            if (userSelection >= 1 && userSelection <= 10) {
                System.out.println(famousQuotes[userSelection - 1].famousQuote);
            } else {
                System.out.println("Invalid input!");
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds! Please select a number between 1 and 10." );
        }

    }



}
