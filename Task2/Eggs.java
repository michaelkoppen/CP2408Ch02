
package Task2;

/**
 * Created by jc428209 on 7/08/17.
 */
import javax.swing.JOptionPane;
public class Eggs {
    public static void main(String[] args) {

        String number_of_eggs_string;
        double number_of_eggs;
        double number_of_dozens;
        double number_left_over;
        double total_cost;
        number_of_eggs_string = JOptionPane.showInputDialog(null, "How many eggs you want?", "Purchases", JOptionPane.INFORMATION_MESSAGE);
        number_of_eggs = Double.parseDouble(number_of_eggs_string);

        number_of_dozens = number_of_eggs / 12;
        number_of_dozens = Math.round(number_of_dozens);

        number_left_over = number_of_eggs % 12;

        total_cost = (number_left_over * 0.45) + (number_of_dozens * 3.25);


        JOptionPane.showMessageDialog(null, "You ordered " + number_of_eggs + ". That's " + number_of_dozens + " Dozens at $3.25 per dozen" + " and " + number_left_over + " loose eggs at 45 cents each for a total of $" + total_cost);





    }
}
