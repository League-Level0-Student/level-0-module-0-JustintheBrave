package _04_knock_knock;

import javax.swing.JOptionPane;

public class KnockKnock {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Knock! Knock! \n -you");
		String p = JOptionPane.showInputDialog(null, "Who's there?");
		String l = JOptionPane.showInputDialog(null, p + " who?");
		JOptionPane.showMessageDialog(null, p + " " + l + "!");

	}

}
