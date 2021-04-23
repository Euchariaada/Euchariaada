
import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			String question = JOptionPane.showInputDialog("Which of the following is not a high level programming language?\n");
			
			question += "A. PHP\n";
			question += "B. Python\n";
			question += "C. Assembly\n";
			question += "D. C#\n";
			question += "E. Java\n";
	
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			
			if(answer.equals("C")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				break;	
			}
			else if(answer.equals("B")) {
				JOptionPane.showMessageDialog(null, "Incorrect!");
			}
			else if(answer.equals("A")) {
				JOptionPane.showMessageDialog(null, "Incorrect!");
			}
			else if(answer.equals("D")) {
				JOptionPane.showMessageDialog(null, "Incorrect!");
			}
			else if(answer.equals("E")) {
				JOptionPane.showMessageDialog(null, "Incorrect!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Invalid Option");
			}
		
		}
			
	}

}
