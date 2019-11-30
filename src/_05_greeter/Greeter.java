package _05_greeter;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String name = JOptionPane.showInputDialog(null, "What's your name?");
			JOptionPane.showMessageDialog(null, "Hello "+ name);

		}
	}


