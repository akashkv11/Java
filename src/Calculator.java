import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	JFrame jf;
	JLabel Displaylabel;
	JButton seven,eight,nine,four,five,six,one,two,three,div,mul,sub,add,zero,dot,equal,clearbutton;
	boolean isoperatorclicked = false;
	
	String oldvalue,newvalue;
	
	float result=0;
	int op;
	

	public Calculator() {
	jf = new JFrame("Calculator");
	jf.setLayout(null);
	jf.setSize(600, 600);
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setLocation(400, 150);
	
	
	
	Displaylabel = new JLabel();
	Displaylabel.setBounds(30, 30, 500, 50);
	Displaylabel.setBackground(Color.gray);
	Displaylabel.setOpaque(true);
	Displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
	Displaylabel.setForeground(Color.white);
	jf.add(Displaylabel);
	
	
	
	
	
	
	seven = new JButton("7");
	seven.setBounds(30, 120, 65, 65);
	jf.add(seven);
	seven.addActionListener(this);
	
	

	
	
	eight = new JButton("8");
	eight.setBounds(120, 120, 65, 65);
	jf.add(eight);
	eight.addActionListener(this);
	
	
	
	
	
	
	nine = new JButton("9");
	nine.setBounds(210, 120, 65, 65);
	jf.add(nine);
	nine.addActionListener(this);
	
	
	
	
	
	
	
	
	four = new JButton("4");
	four.setBounds(30, 210, 65, 65);
	jf.add(four);
	four.addActionListener(this);
	
	
	
	
	
	
	five = new JButton("5");
	five.setBounds(120, 210, 65, 65);
	jf.add(five);
	five.addActionListener(this);
	
	
	
	
	
	six = new JButton("6");
	six.setBounds(210, 210, 65, 65);
	jf.add(six);
	six.addActionListener(this);
	
	
	
	
	
	one = new JButton("1");
	one.setBounds(30, 300, 65, 65);
	jf.add(one);
	one.addActionListener(this);
	
	
	
	
	
	two = new JButton("2");
	two.setBounds(120, 300, 65, 65);
	jf.add(two);
	two.addActionListener(this);
	
	
	
	
	
	three = new JButton("3");
	three.setBounds(210, 300, 65, 65);
	jf.add(three);
	three.addActionListener(this);

	
	
	
	
	dot = new JButton(".");
	dot.setBounds(30, 390, 65, 65);
	jf.add(dot);
	dot.addActionListener(this);
	

	
	
	zero = new JButton("0");
	zero.setBounds(120, 390, 65, 65);
	jf.add(zero);
	zero.addActionListener(this);
	
	
	
	
	equal = new JButton("=");
	equal.setBounds(210, 390, 65, 65);
	jf.add(equal);
	equal.addActionListener(this);

	
	
	
	div = new JButton("÷");
	div.setBounds(300, 120, 65, 65);
	jf.add(div);
	div.addActionListener(this);
	
	

	
	

	
	mul = new JButton("x");
	mul.setBounds(300, 210, 65, 65);
	jf.add(mul);
	mul.addActionListener(this);
	
	
	
	
	
	
	
	
	
	sub = new JButton("-");
	sub.setBounds(300, 300, 65, 65);
	jf.add(sub);
	sub.addActionListener(this);

	
	
	
	
	
	

	add = new JButton("+");
	add.setBounds(300, 390, 65, 65);
	jf.add(add);
	add.addActionListener(this);

	
 
	
	clearbutton = new JButton("clear");
	clearbutton.setBounds(390, 390, 65, 65);
	jf.add(clearbutton);
	clearbutton.addActionListener(this);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== seven) {
			if(isoperatorclicked) {
				Displaylabel.setText("7");
				isoperatorclicked=false;
			}
			else {
			Displaylabel.setText(Displaylabel.getText()+"7");
			}
		}
		else if(e.getSource()== eight){
			if(isoperatorclicked) {
				Displaylabel.setText("8");
				isoperatorclicked=false;
			}
			else {
			Displaylabel.setText(Displaylabel.getText()+"8");
			}
		}
		
		else if(e.getSource()== nine){
			if(isoperatorclicked) {
				Displaylabel.setText("9");
				isoperatorclicked=false;
			}
			else {
			Displaylabel.setText(Displaylabel.getText()+"9");
			}
		}
		
		else if(e.getSource()== four){
			if(isoperatorclicked) {
				Displaylabel.setText("4");
				isoperatorclicked=false;
			}
			else {
			Displaylabel.setText(Displaylabel.getText()+"4");
			}
		}
		
		else if(e.getSource()== five ){
			if(isoperatorclicked) {
				Displaylabel.setText("5");
				isoperatorclicked=false;
			}
			else {
			Displaylabel.setText(Displaylabel.getText()+"5");
			}
		}
		
		else if(e.getSource()== six){
			if(isoperatorclicked) {
				Displaylabel.setText("6");
				isoperatorclicked=false;
			}
			else {
			Displaylabel.setText(Displaylabel.getText()+"6");
			}
		}
		
		else if(e.getSource()== one){
			if(isoperatorclicked) {
				Displaylabel.setText("1");
				isoperatorclicked=false;
			}
			else {
			Displaylabel.setText(Displaylabel.getText()+"1");
			}
		}
		
		else if(e.getSource()== two){
			if(isoperatorclicked) {
				Displaylabel.setText("2");
				isoperatorclicked=false;
			}
			else {
			Displaylabel.setText(Displaylabel.getText()+"2");
			}
		}
		
		else if(e.getSource()== three){
			if(isoperatorclicked) {
				Displaylabel.setText("3");
				isoperatorclicked=false;
			}
			else {
			Displaylabel.setText(Displaylabel.getText()+"3");
			}
		}
		
		else if(e.getSource()== zero){
			if(isoperatorclicked) {
				Displaylabel.setText("0");
				isoperatorclicked=false;
			}
			else {
			Displaylabel.setText(Displaylabel.getText()+"0");
			}
		}
		
		else if(e.getSource()== dot){
			Displaylabel.setText(Displaylabel.getText()+".");
		
		
		}
		
		else if(e.getSource()== equal){
			switch (op) {
			case 1:{
				newvalue=Displaylabel.getText();
				float oldf = Float.parseFloat(oldvalue);
				float newf = Float.parseFloat(newvalue);
				 result = oldf+newf;
				 String r = Float.toString(result);
				 Displaylabel.setText(r);
				break;
			}
			case 2:{
				newvalue=Displaylabel.getText();
				float oldf = Float.parseFloat(oldvalue);
				float newf = Float.parseFloat(newvalue);
				 result = oldf-newf; 
				 String r = Float.toString(result);
				 Displaylabel.setText(r);
				break;
			}
			case 3:{
				newvalue=Displaylabel.getText();
				float oldf = Float.parseFloat(oldvalue);
				float newf = Float.parseFloat(newvalue);
				 result = oldf*newf; 
				 String r = Float.toString(result);
				 Displaylabel.setText(r);
					
				break;
			}
			
			case 4:{
				newvalue=Displaylabel.getText();
				float oldf = Float.parseFloat(oldvalue);
				float newf = Float.parseFloat(newvalue);
				 result = newf/oldf;
				 String r = Float.toString(result);
				 Displaylabel.setText(r);
	
				break;
			}

			default:System.out.println("No");
				break;
			}
			
		}
		
		
		else if(e.getSource()== add){
			isoperatorclicked=true;
			oldvalue=Displaylabel.getText();
			
			op=1;
			
		}
		
		else if(e.getSource()== sub){
			isoperatorclicked=true;
			oldvalue=Displaylabel.getText();
			op=2;
			
		}
		
		else if(e.getSource()== mul){
			isoperatorclicked=true;
			oldvalue=Displaylabel.getText();
			op=3;

		}
		
		else if(e.getSource()== div){
			isoperatorclicked=true;
			oldvalue=Displaylabel.getText();
			op=4;

		}

		else if(e.getSource()== clearbutton){
			Displaylabel.setText("");

		}
	
		
		
	}

}
