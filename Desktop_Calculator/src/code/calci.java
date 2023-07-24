package code;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calci extends JFrame implements ActionListener {
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
	JTextField t1;
	String opr;
	int v1,v2;
	
	public calci(String title){
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b10=new JButton("+");
		b11=new JButton("-");
		b12=new JButton("*");
		b13=new JButton("/");
		b14=new JButton("=");
		b15=new JButton("C");
		b16=new JButton("<-");
		b17=new JButton(".");
		b18=new JButton("");
		b19=new JButton("");
		
		t1=new JTextField();
		setLayout(null);
		t1.setBounds(20, 10, 220, 30);
		add(t1);
		b1.setBounds(20,42,55,30);
		b2.setBounds(77,42,55,30);
		b3.setBounds(134,42,55,30);
		b0.setBounds(191,42,55,30);
		add(b1);add(b2);add(b3);add(b0);
		
		b4.setBounds(20,74,55,30);
		b5.setBounds(77,74,55,30);
		b6.setBounds(134,74,55,30);
		b7.setBounds(191,74,55,30);
		add(b4);add(b5);add(b6);add(b7);
		
		b8.setBounds(20,106,55,30);
		b9.setBounds(77,106,55,30);
		b10.setBounds(134,106,55,30);
		b11.setBounds(191,106,55,30);
		add(b8);add(b9);add(b10);add(b11);
		
		b12.setBounds(20,138,55,30);
		b13.setBounds(77,138,55,30);
		b14.setBounds(134,138,55,30);
		b15.setBounds(191,138,55,30);
		add(b12);add(b13);add(b14);add(b15);
		
		b16.setBounds(20,170,55,30);
		b17.setBounds(77,170,55,30);
		b18.setBounds(134,170,55,30);
		b19.setBounds(191,170,55,30);
		add(b16);add(b17);add(b18);add(b19);
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		
		setSize(300,300);
		setLocation(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}	
		public void actionPerformed(ActionEvent ae){
			if(ae.getSource()==b0){
				t1.setText(t1.getText()+b0.getText());
			}
			if(ae.getSource()==b1){
				t1.setText(t1.getText()+b1.getText());
			}
			if(ae.getSource()==b2){
				t1.setText(t1.getText()+b2.getText());
			}
			if(ae.getSource()==b3){
				t1.setText(t1.getText()+b3.getText());
			}
			if(ae.getSource()==b4){
				t1.setText(t1.getText()+b4.getText());
			}
			if(ae.getSource()==b5){
				t1.setText(t1.getText()+b5.getText());
			}
			if(ae.getSource()==b6){
				t1.setText(t1.getText()+b6.getText());
			}
			if(ae.getSource()==b7){
				t1.setText(t1.getText()+b7.getText());
			}
			if(ae.getSource()==b8){
				t1.setText(t1.getText()+b8.getText());
			}
			if(ae.getSource()==b9){
				t1.setText(t1.getText()+b9.getText());
			}
			if(ae.getSource()==b10){
				opr="+";
				v1=Integer.parseInt(t1.getText());
				t1.setText("");
			}
			if(ae.getSource()==b11){
				opr="-";
				v1=Integer.parseInt(t1.getText());
				t1.setText("");
			}
			if(ae.getSource()==b12){
				opr="*";
				v1=Integer.parseInt(t1.getText());
				t1.setText("");
			}
			if(ae.getSource()==b13){
				opr="/";
				v1=Integer.parseInt(t1.getText());
				t1.setText("");
			}
			if(ae.getSource()==b14){
				v2=Integer.parseInt(t1.getText());
				switch(opr){
				case "+":
					v1+=v2;break;
				case "-":
					v1-=v2;break;
				case "*":
					v1*=v2;break;
				case "/":
					v1/=v2;break;
				}
				t1.setText(String.valueOf(v1));
			}
			if(ae.getSource()==b15){
				t1.setText("");
			}
			if(ae.getSource()==b16){
				String val=t1.getText();
				t1.setText("");
				int len=val.length();
				if(len>0){
				val=val.substring(0,len-1);
				t1.setText(val);
				}
			}
		}
		
	public static void main(String[] args){
		new calci("Calculator");
	}
}
