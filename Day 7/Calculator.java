import java.awt.*;
import java.awt.event.*;

class Ehandler implements ActionListener{
	TextField Display;
	int NumberStorage = 0;
	String Operation = "C";
	
	public Ehandler(TextField Dsply) {
		Display = Dsply;
	}
	
	public void actionPerformed(ActionEvent Trigger) {
		Button btnPressed = (Button) Trigger.getSource();
		String chrPressed = btnPressed.getLabel();
		
		if (chrPressed.equals("0")) {
			Display.setText(Display.getText() + "0");
		}
		if (chrPressed.equals("1")) {
			Display.setText(Display.getText() + "1");
		}
		if (chrPressed.equals("2")) {
			Display.setText(Display.getText() + "2");
		}
		if (chrPressed.equals("3")) {
			Display.setText(Display.getText() + "3");
		}
		if (chrPressed.equals("4")) {
			Display.setText(Display.getText() + "4");
		}
		if (chrPressed.equals("5")) {
			Display.setText(Display.getText() + "5");
		}
		if (chrPressed.equals("6")) {
			Display.setText(Display.getText() + "6");
		}
		if (chrPressed.equals("7")) {
			Display.setText(Display.getText() + "7");
		}
		if (chrPressed.equals("8")) {
			Display.setText(Display.getText() + "8");
		}
		if (chrPressed.equals("9")) {
			Display.setText(Display.getText() + "9");
		}
		if (chrPressed.equals("+")) {
			try {
			NumberStorage = Integer.parseInt(Display.getText());
			Operation = "+";
			Display.setText("");
			}
			catch(NumberFormatException Err) {
				System.out.println("Error - Non-Numerical Character In Display");
			}
		}
		if (chrPressed.equals("-")) {
			try {
			NumberStorage = Integer.parseInt(Display.getText());
			Operation = "-";
			Display.setText("");
			}
			catch(NumberFormatException Err) {
				System.out.println("Error - Non-Numerical Character In Display");
			}
		}
		if (chrPressed.equals("X")) {
			try {
			NumberStorage = Integer.parseInt(Display.getText());
			Operation = "X";
			Display.setText("");
			}
			catch(NumberFormatException Err) {
				System.out.println("Error - Non-Numerical Character In Display");
			}
		}
		if (chrPressed.equals("/")) {
			try {
			NumberStorage = Integer.parseInt(Display.getText());
			Operation = "/";
			Display.setText("");
			}
			catch(NumberFormatException Err) {
				System.out.println("Error - Non-Numerical Character In Display");
			}
		}
		if (chrPressed.equals("=")) {
			try {
				if (Operation == "+") {
					Display.setText(Integer.toString(NumberStorage + Integer.parseInt(Display.getText())));
				}
				if (Operation == "-") {
					Display.setText(Integer.toString(NumberStorage - Integer.parseInt(Display.getText())));
				}
				if (Operation == "X") {
					Display.setText(Integer.toString(NumberStorage * Integer.parseInt(Display.getText())));
				}
				if (Operation == "/") {
					Display.setText(Integer.toString(NumberStorage / Integer.parseInt(Display.getText())));
				}
				if (Operation == "C") {
					System.out.println("Error - Please Select An Operator Before Equals");
				}
			}
			catch(NumberFormatException Err) {
				System.out.println("Error - Non-Numerical Character In Display");
			}
		}
		if (chrPressed.equals("C")) { 
			NumberStorage = 0;
			Operation = "C";
			Display.setText("");
		}	
	}
}

public class Calculator {
	public static void main(String[] args) {
		Frame F = new Frame("Calculator");
		Panel P1 = new Panel();
		Panel P2 = new Panel();
		TextField Display = new TextField(20);
		Button B0,B1,B2,B3,B4,B5,B6,B7,B8,B9;
		Button BAdd, BSub, BMul, BDiv, BEql, BCle;
		Ehandler E = new Ehandler(Display);
		B0 = new Button("0");
		B0.addActionListener(E);
		B1 = new Button("1");
		B1.addActionListener(E);
		B2 = new Button("2");
		B2.addActionListener(E);
		B3 = new Button("3");
		B3.addActionListener(E);
		B4 = new Button("4");
		B4.addActionListener(E);
		B5 = new Button("5");
		B5.addActionListener(E);
		B6 = new Button("6");
		B6.addActionListener(E);
		B7 = new Button("7");
		B7.addActionListener(E);
		B8 = new Button("8");
		B8.addActionListener(E);
		B9 = new Button("9");
		B9.addActionListener(E);
		BAdd = new Button("+");
		BAdd.addActionListener(E);
		BSub = new Button("-");
		BSub.addActionListener(E);
		BMul = new Button("X");
		BMul.addActionListener(E);
		BDiv = new Button("/");
		BDiv.addActionListener(E);
		BEql = new Button("=");
		BEql.addActionListener(E);
		BCle = new Button("C");
		BCle.addActionListener(E);
		GridLayout GL = new GridLayout(4,4);
		P2.setLayout(GL);
		P1.add(Display);
		P2.add(B0);
		P2.add(B1);
		P2.add(B2);
		P2.add(B3);
		P2.add(B4);
		P2.add(B5);
		P2.add(B6);
		P2.add(B7);
		P2.add(B8);
		P2.add(B9);
		P2.add(BAdd);
		P2.add(BSub);
		P2.add(BMul);
		P2.add(BDiv);
		P2.add(BEql);
		P2.add(BCle);	
		F.add(P1,BorderLayout.NORTH);
		F.add(P2,BorderLayout.CENTER);	
		F.setSize(300,200);
		F.setVisible(true);
	}
}