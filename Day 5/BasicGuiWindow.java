import java.awt.*;
import java.awt.event.*;

class Action1 implements ActionListener{
	int Z;
	public void actionPerformed(ActionEvent X){
		System.out.println("Button! | " + Z);
		Z++;
	}
}

class BasicGuiWindow{
	public static void main(String[] XYZ){
		Frame win = new Frame();
		Button button1 = new Button("This is a button!");
		Button button2 = new Button("This is another button!");
		Button button3 = new Button("This is yet another button!");
		Button button4 = new Button("This is just another button!");
		Button button5 = new Button("This is simply another button!");

		Action1 Act1 = new Action1();
		button1.addActionListener(Act1);

		win.add(button1,BorderLayout.NORTH);
		win.add(button2,BorderLayout.SOUTH);
		win.add(button3,BorderLayout.WEST);
		win.add(button4,BorderLayout.EAST);
		win.add(button5,BorderLayout.CENTER);

		win.setSize(400,400);
		win.setVisible(true);
		
	}
}