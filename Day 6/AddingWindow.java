import java.awt.*;
import java.awt.event.*;

class EhandlerAdd implements ActionListener{
	TextField Tf1, Tf2, Result;
	public EhandlerAdd(TextField A, TextField B, TextField C){
		Tf1 = A;
		Tf2 = B;
		Result = C;
	}
	public void actionPerformed(ActionEvent X){
		int A, B, C;
		try{
			A = Integer.parseInt(Tf1.getText());
			B = Integer.parseInt(Tf2.getText());
			C = A + B;
			Result.setText(Integer.toString(C));
		}
		catch(NumberFormatException E){
			System.out.println("Invalid Input!");
		}
	}
}

class EhandlerSub implements ActionListener{
	TextField Tf1, Tf2, Result;
	public EhandlerSub(TextField A, TextField B, TextField C){
		Tf1 = A;
		Tf2 = B;
		Result = C;
	}
	public void actionPerformed(ActionEvent X){
		int A, B, C;
		try{
			A = Integer.parseInt(Tf1.getText());
			B = Integer.parseInt(Tf2.getText());
			C = A - B;
			Result.setText(Integer.toString(C));
		}
		catch(NumberFormatException E){
			System.out.println("Invalid Input!");
		}
	}
}

class EhandlerMul implements ActionListener{
	TextField Tf1, Tf2, Result;
	public EhandlerMul(TextField A, TextField B, TextField C){
		Tf1 = A;
		Tf2 = B;
		Result = C;
	}
	public void actionPerformed(ActionEvent X){
		int A, B, C;
		try{
			A = Integer.parseInt(Tf1.getText());
			B = Integer.parseInt(Tf2.getText());
			C = A * B;
			Result.setText(Integer.toString(C));
		}
		catch(NumberFormatException E){
			System.out.println("Invalid Input!");
		}
	}
}

class EhandlerDiv implements ActionListener{
	TextField Tf1, Tf2, Result;
	public EhandlerDiv(TextField A, TextField B, TextField C){
		Tf1 = A;
		Tf2 = B;
		Result = C;
	}
	public void actionPerformed(ActionEvent X){
		int A, B, C;
		try{
			A = Integer.parseInt(Tf1.getText());
			B = Integer.parseInt(Tf2.getText());
			C = A / B;
			Result.setText(Integer.toString(C));
		}
		catch(NumberFormatException E){
			System.out.println("Invalid Input!");
		}
	}
}

class AddingWindow{
	public static void main(String[] XYZ){
		Frame F = new Frame("Adding Window");
		TextField T1,T2,T3;
		Label L1,L2,L3;
		Button B1 = new Button("+");
		Button B2 = new Button("-");
		Button B3 = new Button("X");
		Button B4 = new Button("/");
		L1 = new Label("First Number:");
		L2 = new Label("Second Number:");
		L3 = new Label("Result:");
		T1 = new TextField(10);
		T2 = new TextField(10);
		T3 = new TextField(10);

		FlowLayout FL = new FlowLayout();
		F.setLayout(FL);

		EhandlerAdd E = new EhandlerAdd(T1,T2,T3);
		B1.addActionListener(E);

		EhandlerSub D = new EhandlerSub(T1,T2,T3);
		B2.addActionListener(D);

		EhandlerMul G = new EhandlerMul(T1,T2,T3);
		B3.addActionListener(G);

		EhandlerDiv H = new EhandlerDiv(T1,T2,T3);
		B4.addActionListener(H);

		F.add(L1);
		F.add(T1);
		F.add(L2);
		F.add(T2);
		F.add(B1);
		F.add(B2);
		F.add(B3);
		F.add(B4);
		F.add(L3);
		F.add(T3);

		F.setSize(1000,75);
		F.setVisible(true);
	}
}