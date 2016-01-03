package guitest2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;


public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField jTextField1;
	private JTextField jTextField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 746);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jTextField1 = new JTextField();
		jTextField1.setEditable(false);
		jTextField1.setText("0");
		jTextField1.setFont(new Font("Tahoma", Font.BOLD, 72));
		jTextField1.setHorizontalAlignment(SwingConstants.RIGHT);
		jTextField1.setBounds(4, 11, 450, 168);
		contentPane.add(jTextField1);
		jTextField1.setColumns(10);
		
		jTextField2 = new JTextField();
		jTextField2.setFont(new Font("Tahoma", Font.BOLD, 15));
		jTextField2.setEditable(false);
		jTextField1.setEditable(false);
		jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		jTextField2.setHorizontalAlignment(SwingConstants.RIGHT);
		jTextField2.setBounds(16, 15, 426, 37);
		contentPane.add(jTextField2);
		jTextField2.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takeIn;
				takeIn = jTextField2.getText() + btn7.getText();
				jTextField2.setText(takeIn);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn7.setBounds(21, 228, 90, 71);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takeIn;
				takeIn = jTextField2.getText() + btn8.getText();
				jTextField2.setText(takeIn);
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn8.setBounds(126, 228, 90, 71);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takeIn;
				takeIn = jTextField2.getText() + btn9.getText();
				jTextField2.setText(takeIn);
				
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn9.setBounds(233, 228, 90, 71);
		contentPane.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takeIn;
				takeIn = jTextField2.getText() + btn4.getText();
				jTextField2.setText(takeIn);
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn4.setBounds(21, 307, 90, 71);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takeIn;
				takeIn = jTextField2.getText() + btn5.getText();
				jTextField2.setText(takeIn);
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn5.setBounds(126, 307, 90, 71);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takeIn;
				takeIn = jTextField2.getText() + btn6.getText();
				jTextField2.setText(takeIn);
				
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn6.setBounds(233, 307, 90, 71);
		contentPane.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takeIn;
				takeIn = jTextField2.getText() + btn1.getText();
				jTextField2.setText(takeIn);
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn1.setBounds(21, 389, 90, 71);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takeIn;
				takeIn = jTextField2.getText() + btn2.getText();
				jTextField2.setText(takeIn);
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn2.setBounds(126, 389, 90, 71);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takeIn;
				takeIn = jTextField2.getText() + btn3.getText();
				jTextField2.setText(takeIn);
				
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn3.setBounds(233, 389, 90, 71);
		contentPane.add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takeIn;
				takeIn = jTextField2.getText() + btn0.getText();
				jTextField2.setText(takeIn);
				
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn0.setBounds(126, 471, 90, 71);
		contentPane.add(btn0);
		
		JButton btnPosNeg = new JButton("\u00B1");
		btnPosNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jTextField2.getText().isEmpty()){
					Double negPos = Double.parseDouble(jTextField1.getText());
					negPos = -negPos;
					DecimalFormat df = new DecimalFormat("###.########");
					//finalResult = String.valueOf(df.format(result));
					//Double finalResult2 = (Double) finalResult;
					String finalResult3 = String.valueOf(df.format(negPos));
					jTextField1.setText(finalResult3);
					jTextField2.setText("");
				}
				else
				{
					Double negPos = Double.parseDouble(jTextField2.getText());
					negPos = -negPos;
					DecimalFormat df = new DecimalFormat("###.########");
					//finalResult = String.valueOf(df.format(result));
					//Double finalResult2 = (Double) finalResult;
					String finalResult3 = String.valueOf(df.format(negPos));
					jTextField1.setText(finalResult3);
					jTextField2.setText("");
				}
			}
		});
		btnPosNeg.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnPosNeg.setBounds(21, 471, 90, 71);
		contentPane.add(btnPosNeg);
		
		JButton btnDeci = new JButton(".");
		btnDeci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takeIn;
				takeIn = jTextField2.getText() + btnDeci.getText();
				jTextField2.setText(takeIn);
							
			}
		});
		btnDeci.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnDeci.setBounds(233, 471, 90, 71);
		contentPane.add(btnDeci);
		
		JButton btnDivide = new JButton("\u00F7");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numNum = jTextField2.getText();
				if (jTextField1.getText() != "0" && numNum.isEmpty())
				{
					String takeIn;
					takeIn = jTextField1.getText() + "/";
					jTextField2.setText(takeIn);
				}
				else
				{
					String takeIn;
					takeIn = jTextField2.getText() + "/";
					jTextField2.setText(takeIn);
				}
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnDivide.setBounds(339, 228, 90, 71);
		contentPane.add(btnDivide);
		
		JButton btnMultiply = new JButton("\u00D7");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numNum = jTextField2.getText();
				if (jTextField1.getText() != "0" && numNum.isEmpty())
				{
					String takeIn;
					takeIn = jTextField1.getText() + "*";
					jTextField2.setText(takeIn);
				}
				else
				{
					String takeIn;
					takeIn = jTextField2.getText() + "*";
					jTextField2.setText(takeIn);
				}
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnMultiply.setBounds(339, 307, 90, 71);
		contentPane.add(btnMultiply);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numNum = jTextField2.getText();
				if (jTextField1.getText() != "0" && numNum.isEmpty())
				{
					String takeIn;
					takeIn = jTextField1.getText() + btnSubtract.getText();
					jTextField2.setText(takeIn);
				}
				else
				{
					String takeIn;
					takeIn = jTextField2.getText() + btnSubtract.getText();
					jTextField2.setText(takeIn);
				}
			}
		});
		btnSubtract.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSubtract.setBounds(339, 389, 90, 71);
		contentPane.add(btnSubtract);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numNum = jTextField2.getText();
				if (jTextField1.getText() != "0" && numNum.isEmpty())
				{
					String takeIn;
					takeIn = jTextField1.getText() + btnAdd.getText();
					jTextField2.setText(takeIn);
				}
				else
				{
					String takeIn;
					takeIn = jTextField2.getText() + btnAdd.getText();
					jTextField2.setText(takeIn);
				}
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnAdd.setBounds(339, 471, 90, 71);
		contentPane.add(btnAdd);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String clear = "";
				jTextField2.setText(clear);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnClear.setBounds(21, 553, 90, 71);
		contentPane.add(btnClear);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setToolTipText("Equals");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numToAddTogether = jTextField2.getText();
				Double result = 0.0;
				Object finalResult = null;
				/*for(int i=0; i<numToAddTogether.length(); i++)
				{
					if(numToAddTogether.charAt(i)=='+')
					{
						result=Double.parseDouble(numToAddTogether.substring(0, i))+Double.parseDouble(numToAddTogether.substring(i+1, numToAddTogether.length()));
					}
					if(numToAddTogether.charAt(i)=='/')
					{
						result=Double.parseDouble(numToAddTogether.substring(0, i))/Double.parseDouble(numToAddTogether.substring(i+1, numToAddTogether.length()));
					}
					if(numToAddTogether.charAt(i)=='*')
					{
						result=Double.parseDouble(numToAddTogether.substring(0, i))*Double.parseDouble(numToAddTogether.substring(i+1, numToAddTogether.length()));
					}
					if(numToAddTogether.charAt(i)=='-')
					{
						result=Double.parseDouble(numToAddTogether.substring(0, i))-Double.parseDouble(numToAddTogether.substring(i+1, numToAddTogether.length()));
					}
				}*/
				
				ScriptEngineManager mgr = new ScriptEngineManager();
				ScriptEngine engine = mgr.getEngineByName("JavaScript");
				try {
					finalResult = engine.eval(numToAddTogether);
				} catch (ScriptException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				DecimalFormat df = new DecimalFormat("###.########");
				//finalResult = String.valueOf(df.format(result));
				//Double finalResult2 = (Double) finalResult;
				String finalResult3 = String.valueOf(df.format(finalResult));
				jTextField1.setText(finalResult3);
				jTextField2.setText("");
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnEquals.setBounds(233, 553, 196, 71);
		contentPane.add(btnEquals);
		
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String clear = "";
				jTextField2.setText(clear);
				jTextField1.setText("0");
			}
		});
		btnCE.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnCE.setBounds(126, 553, 90, 71);
		contentPane.add(btnCE);
		
		JButton btnLeft = new JButton("(");
		btnLeft.setToolTipText("Left Parentheses");
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takeIn;
				takeIn = jTextField2.getText() + btnLeft.getText();
				jTextField2.setText(takeIn);
				
			}
		});
		btnLeft.setBounds(22, 194, 89, 23);
		contentPane.add(btnLeft);
		
		JButton btnRight = new JButton(")");
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takeIn;
				takeIn = jTextField2.getText() + btnRight.getText();
				jTextField2.setText(takeIn);
				
			}
		});
		btnRight.setToolTipText("Right Parentheses");
		btnRight.setBounds(127, 194, 89, 23);
		contentPane.add(btnRight);
		
		JButton btnCarrot = new JButton("x\u00B2");
		btnCarrot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double finalResult;
				finalResult = Double.parseDouble(jTextField2.getText())*Double.parseDouble(jTextField2.getText());
				DecimalFormat df = new DecimalFormat("###.########");
				//finalResult = String.valueOf(df.format(result));
				//Double finalResult2 = (Double) finalResult;
				String finalResult3 = String.valueOf(df.format(finalResult));
				jTextField1.setText(finalResult3);
				jTextField2.setText("");
				
			}
		});
		btnCarrot.setToolTipText("Squared");
		btnCarrot.setBounds(233, 194, 89, 23);
		contentPane.add(btnCarrot);
		
		JButton btnBack = new JButton("\u00AB");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backSpaceString = jTextField2.getText();
				if(backSpaceString.length() > 0)
				{
					StringBuilder strB = new StringBuilder(backSpaceString);
					strB.deleteCharAt(backSpaceString.length()-1);
					backSpaceString = strB.toString();
					jTextField2.setText(backSpaceString);
				}
			}
		});
		btnBack.setToolTipText("Backspace");
		btnBack.setBounds(340, 194, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnNum = new JButton("num");
		btnNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jTextField2.setText(jTextField2.getText() + jTextField1.getText());
			}
		});
		btnNum.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNum.setBounds(21, 636, 90, 42);
		contentPane.add(btnNum);
		
		JButton btnPI = new JButton("\u03C0");
		btnPI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTextField2.setText(jTextField2.getText() + "3.14159");
			}
		});
		btnPI.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnPI.setBounds(126, 636, 90, 42);
		contentPane.add(btnPI);
		
		JButton btnSqrRt = new JButton("\u221A");
		btnSqrRt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jTextField2.getText().isEmpty()){
					Double sqrRt = Double.parseDouble(jTextField1.getText());
					Double sqrRtFinal = java.lang.Math.sqrt(sqrRt);
					DecimalFormat df = new DecimalFormat("###.########");
					//finalResult = String.valueOf(df.format(result));
					//Double finalResult2 = (Double) finalResult;
					String finalResult3 = String.valueOf(df.format(sqrRtFinal));
					jTextField1.setText(finalResult3);
					jTextField2.setText("");
				}
				else
				{
					Double sqrRt = Double.parseDouble(jTextField2.getText());
					Double sqrRtFinal = java.lang.Math.sqrt(sqrRt);
					DecimalFormat df = new DecimalFormat("###.########");
					//finalResult = String.valueOf(df.format(result));
					//Double finalResult2 = (Double) finalResult;
					String finalResult3 = String.valueOf(df.format(sqrRtFinal));
					jTextField1.setText(finalResult3);
					jTextField2.setText("");
				}
			}
		});
		btnSqrRt.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSqrRt.setBounds(233, 635, 90, 43);
		contentPane.add(btnSqrRt);
		
		JButton btnPrcnt = new JButton("%");
		btnPrcnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jTextField2.getText().isEmpty()){
					Double numPercent = Double.parseDouble(jTextField1.getText());
					Double numPercentFinal = numPercent / 100;
					DecimalFormat df = new DecimalFormat("###.########");
					//finalResult = String.valueOf(df.format(result));
					//Double finalResult2 = (Double) finalResult;
					String finalResult3 = String.valueOf(df.format(numPercentFinal));
					jTextField1.setText(finalResult3);
					jTextField2.setText("");
				}
				else
				{
					Double numPercent = Double.parseDouble(jTextField2.getText());
					Double numPercentFinal = numPercent / 100;
					DecimalFormat df = new DecimalFormat("###.########");
					//finalResult = String.valueOf(df.format(result));
					//Double finalResult2 = (Double) finalResult;
					String finalResult3 = String.valueOf(df.format(numPercentFinal));
					jTextField1.setText(finalResult3);
					jTextField2.setText("");
				}
			}
		});
		btnPrcnt.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnPrcnt.setBounds(339, 636, 90, 43);
		contentPane.add(btnPrcnt);
		
		
	}
}
