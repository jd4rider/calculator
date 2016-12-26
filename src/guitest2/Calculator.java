package guitest2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.JLabel;
import javax.swing.BoundedRangeModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import javax.swing.JScrollBar;


public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn0;
	private JButton btnDeci;
	private JButton btnDivide;
	private JButton btnMultiply;
	private JButton btnSubtract;
	private JButton btnAdd;
	private JButton btnEquals;
	private JButton btnLeft;
	private JButton btnRight;
	private JButton btnBack;
	private JButton btnCE;
	private JTextField errorTextField;
	private JScrollBar scrollBar;
	private JScrollBar scrollBar_1;
	private String numberFormat = "###,###.############################################################################################";
	

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//java.net.URL url = ClassLoader.getSystemResource("bin/guitest2/calculator.png");
				//Toolkit kit = Toolkit.getDefaultToolkit();
				//Image img = kit.createImage(url);
				//getFrame().setIconImage(img);
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
					frame.setFocusable(true);
					frame.setAlwaysOnTop(true);
					frame.setFocusableWindowState(true);
					frame.requestFocusInWindow(true);
					frame.requestFocus(true);
					//frame.setIconImage(img);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	
	public Calculator() {
		//setIconImage(Toolkit.getDefaultToolkit().getImage(Calculator.class.getResource("guitest2/calculator.png")));
		setResizable(false);
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()== KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_NUMPAD7)
				{
					btn7.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_NUMPAD8)
				{
					btn8.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_9 || e.getKeyCode() == KeyEvent.VK_NUMPAD9)
				{
					btn9.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_4 || e.getKeyCode() == KeyEvent.VK_NUMPAD4)
				{
					btn4.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_5 || e.getKeyCode() == KeyEvent.VK_NUMPAD5)
				{
					btn5.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_6 || e.getKeyCode() == KeyEvent.VK_NUMPAD6)
				{
					btn6.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_NUMPAD1)
				{
					btn1.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_NUMPAD2)
				{
					btn2.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_NUMPAD3)
				{
					btn3.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_0 || e.getKeyCode() == KeyEvent.VK_NUMPAD0)
				{
					btn0.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_DECIMAL || e.getKeyCode()== KeyEvent.VK_PERIOD)
				{
					btnDeci.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_DIVIDE || e.getKeyCode()== KeyEvent.VK_SLASH)
				{
					btnDivide.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_MINUS || e.getKeyCode()== KeyEvent.VK_SUBTRACT)
				{
					btnSubtract.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_MULTIPLY || e.getKeyCode()== KeyEvent.VK_ASTERISK)
				{
					btnMultiply.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_ADD || e.getKeyCode()== KeyEvent.VK_PLUS)
				{
					btnAdd.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_ENTER || e.getKeyCode()== KeyEvent.VK_EQUALS)
				{
					btnEquals.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_LEFT_PARENTHESIS)
				{
					btnLeft.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_RIGHT_PARENTHESIS)
				{
					btnRight.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_BACK_SPACE)
				{
					btnBack.doClick();
				}
				else if(e.getKeyCode()== KeyEvent.VK_C)
				{
					btnCE.doClick();
				}
				
			}
		});
		setFocusable(true);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 746);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollBar_1 = new JScrollBar();
		scrollBar_1.setOrientation(JScrollBar.HORIZONTAL);
		scrollBar_1.setBounds(12, 160, 442, 23);
		
				
		jTextField1 = new JTextField();
		jTextField1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Calculator calculator1 = new Calculator();
				calculator1.setFocusable(true);
			}
		});
		jTextField1.setEditable(false);
		jTextField1.setText("0");
		jTextField1.setFont(new Font("Tahoma", Font.PLAIN, 72));
		jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		jTextField1.setHorizontalAlignment(SwingConstants.RIGHT);
		jTextField1.setBounds(11, 59, 443, 78);
		BoundedRangeModel brm = jTextField1.getHorizontalVisibility();
		scrollBar_1.setModel(brm);
		contentPane.add(jTextField1);
		contentPane.add(scrollBar_1);
		scrollBar_1.setVisible(false);
		jTextField1.setColumns(10);
		jTextField1.setFocusable(false);
						
		
		jTextField2 = new JTextField();
		jTextField2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jTextField2.setEditable(false);
		jTextField1.setEditable(false);
		jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		jTextField2.setHorizontalAlignment(SwingConstants.RIGHT);
		jTextField2.setBounds(21, 31, 426, 23);
		contentPane.add(jTextField2);
		jTextField2.setColumns(10);
		jTextField2.setFocusable(false);
				
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getAndSetText(btn7);				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn7.setBounds(28, 228, 90, 71);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getAndSetText(btn8);	
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn8.setBounds(133, 228, 90, 71);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getAndSetText(btn9);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn9.setBounds(240, 228, 90, 71);
		contentPane.add(btn9);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getAndSetText(btn4);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn4.setBounds(28, 307, 90, 71);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getAndSetText(btn5);	
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn5.setBounds(133, 307, 90, 71);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getAndSetText(btn6);	
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn6.setBounds(240, 307, 90, 71);
		contentPane.add(btn6);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getAndSetText(btn1);	
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn1.setBounds(28, 389, 90, 71);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getAndSetText(btn2);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn2.setBounds(133, 389, 90, 71);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getAndSetText(btn3);	
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn3.setBounds(240, 389, 90, 71);
		contentPane.add(btn3);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getAndSetText(btn0);	
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn0.setBounds(133, 471, 90, 71);
		contentPane.add(btn0);
		
		JButton btnPosNeg = new JButton("\u00B1");
		btnPosNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jTextField2.getText().isEmpty()){
					Double negPos = Double.parseDouble(numberOnly(jTextField1.getText()));
					negPos = -negPos;
					String finalResult3 = decimalFormatReturn(negPos);
					jTextField1.setText(finalResult3);
					jTextField2.setText("");
				}
				else
				{
					Double negPos = Double.parseDouble(jTextField2.getText());
					negPos = -negPos;
					String finalResult3 = decimalFormatReturn(negPos);
					jTextField1.setText(finalResult3);
					jTextField2.setText("");
				}
				btnPosNeg.setFocusable(false);
				CalculatorFocusable();	
			}
		});
		btnPosNeg.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnPosNeg.setBounds(28, 471, 90, 71);
		contentPane.add(btnPosNeg);
		
		btnDeci = new JButton(".");
		btnDeci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takeIn;
				takeIn = jTextField2.getText() + btnDeci.getText();
				jTextField2.setText(takeIn);
				btnDeci.setFocusable(false);
				CalculatorFocusable();	
			}
		});
		btnDeci.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnDeci.setBounds(240, 471, 90, 71);
		contentPane.add(btnDeci);
		
		btnDivide = new JButton("\u00F7");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnDivide.setFocusable(false);
				String numNum = jTextField2.getText();
				if (jTextField1.getText() != "0" && numNum.isEmpty())
				{
					String takeIn;
					String takeIn3 = numberOnly(jTextField1.getText());
					takeIn = takeIn3 + "/";
					jTextField2.setText(takeIn);
				}
				else
				{
					String takeIn;
					takeIn = jTextField2.getText() + "/";
					jTextField2.setText(takeIn);
				}
				btnDivide.setFocusable(false);
				CalculatorFocusable();
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnDivide.setBounds(346, 228, 90, 71);
		contentPane.add(btnDivide);
		
		btnMultiply = new JButton("\u00D7");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numNum = jTextField2.getText();
				if (jTextField1.getText() != "0" && numNum.isEmpty())
				{
					String takeIn;
					String takeIn3 = numberOnly(jTextField1.getText());
					takeIn = takeIn3 + "*";
					jTextField2.setText(takeIn);
				}
				else
				{
					String takeIn;
					takeIn = jTextField2.getText() + "*";
					jTextField2.setText(takeIn);
				}
				btnMultiply.setFocusable(false);
				CalculatorFocusable();	
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnMultiply.setBounds(346, 307, 90, 71);
		contentPane.add(btnMultiply);
		
		btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numNum = jTextField2.getText();
				if (jTextField1.getText() != "0" && numNum.isEmpty())
				{
					String takeIn;
					String takeIn3 = numberOnly(jTextField1.getText());
					takeIn = takeIn3 + btnSubtract.getText();
					jTextField2.setText(takeIn);
					btnSubtract.setFocusable(false);
				}
				else
				{
					String takeIn;
					takeIn = jTextField2.getText() + btnSubtract.getText();
					jTextField2.setText(takeIn);
					btnSubtract.setFocusable(false);
				}
				btnSubtract.setFocusable(false);
				CalculatorFocusable();	
			}
		});
		btnSubtract.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSubtract.setBounds(346, 389, 90, 71);
		contentPane.add(btnSubtract);
		
		btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String numNum = jTextField2.getText();
				if (jTextField1.getText() != "0" && numNum.isEmpty())
				{
					String takeIn;
					String takeIn3 = numberOnly(jTextField1.getText());
					takeIn = takeIn3 + btnAdd.getText();
					jTextField2.setText(takeIn);
				}
				else
				{
					String takeIn;
					takeIn = jTextField2.getText() + btnAdd.getText();
					jTextField2.setText(takeIn);
				}
				btnAdd.setFocusable(false);
				CalculatorFocusable();	
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnAdd.setBounds(346, 471, 90, 71);
		contentPane.add(btnAdd);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String clear = "";
				errorTextField.setText(clear);
				jTextField2.setText(clear);
				btnClear.setFocusable(false);
				CalculatorFocusable();	
			}
			
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnClear.setBounds(28, 553, 90, 71);
		contentPane.add(btnClear);
		
		btnEquals = new JButton("=");
		btnEquals.setToolTipText("Equals");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double finalResult = javaScriptEvalEquals(jTextField2.getText());
				String finalResult3 = decimalFormatReturn(finalResult);
				
				jTextField1.setText(finalResult3);
				if (finalResult3.length() > 12)
				{
					scrollBar_1.setVisible(true);
				}
				else
				{
					scrollBar_1.setVisible(false);
				}
				jTextField2.setText("");
				btnEquals.setFocusable(false);
				CalculatorFocusable();	
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnEquals.setBounds(240, 553, 196, 71);
		contentPane.add(btnEquals);
		
		btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String clear = "";
				errorTextField.setText(clear);
				jTextField2.setText(clear);
				jTextField1.setText("0");
				btnCE.setFocusable(false);
				CalculatorFocusable();	
				scrollBar_1.setVisible(false);
			}
		});
		btnCE.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnCE.setBounds(133, 553, 90, 71);
		contentPane.add(btnCE);
		
		btnLeft = new JButton("(");
		btnLeft.setToolTipText("Left Parentheses");
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takeIn;
				takeIn = jTextField2.getText() + btnLeft.getText();
				jTextField2.setText(takeIn);
				btnLeft.setFocusable(false);
				CalculatorFocusable();	
			}
		});
		btnLeft.setBounds(29, 194, 89, 23);
		contentPane.add(btnLeft);
		
		btnRight = new JButton(")");
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takeIn;
				takeIn = jTextField2.getText() + btnRight.getText();
				jTextField2.setText(takeIn);
				btnRight.setFocusable(false);
				CalculatorFocusable();	
			}
		});
		btnRight.setToolTipText("Right Parentheses");
		btnRight.setBounds(134, 194, 89, 23);
		contentPane.add(btnRight);
		
		JButton btnCarrot = new JButton("x\u00B2");
		btnCarrot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (jTextField2.getText().isEmpty()){
					Double finalResult;
					String numString = numberOnly(jTextField1.getText());
					finalResult = Double.parseDouble(numString)*Double.parseDouble(numString);
					String finalResult3 = decimalFormatReturn(finalResult);
					jTextField1.setText(finalResult3);
					if (finalResult3.length() > 12)
					{
						scrollBar_1.setVisible(true);
					}
					else
					{
						scrollBar_1.setVisible(false);
					}
					jTextField2.setText("");
					btnCarrot.setFocusable(false);
					CalculatorFocusable();
				}
				else
				{
					Double finalResult;
					finalResult = Double.parseDouble(jTextField2.getText())*Double.parseDouble(jTextField2.getText());
					String finalResult3 = decimalFormatReturn(finalResult);
					jTextField1.setText(finalResult3);
					jTextField2.setText("");
					btnCarrot.setFocusable(false);
					CalculatorFocusable();	
				}
			}
		});
		btnCarrot.setToolTipText("Squared");
		btnCarrot.setBounds(240, 194, 89, 23);
		contentPane.add(btnCarrot);
		
		btnBack = new JButton("\u00AB");
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
				btnBack.setFocusable(false);
				CalculatorFocusable();	
			}
		});
		btnBack.setToolTipText("Backspace");
		btnBack.setBounds(347, 194, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnNum = new JButton("num");
		btnNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String finalResult = numberOnly(jTextField1.getText());
				jTextField2.setText(jTextField2.getText() + finalResult);
				btnNum.setFocusable(false);
				CalculatorFocusable();	
			}
		});
		btnNum.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNum.setBounds(28, 636, 90, 42);
		contentPane.add(btnNum);
		
		JButton btnPI = new JButton("\u03C0");
		btnPI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTextField2.setText(jTextField2.getText() + "3.14159");
				btnPI.setFocusable(false);
			}
		});
		btnPI.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnPI.setBounds(133, 636, 90, 42);
		contentPane.add(btnPI);
		
		JButton btnSqrRt = new JButton("\u221A");
		btnSqrRt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jTextField2.getText().isEmpty()){
					Double sqrRt = Double.parseDouble(jTextField1.getText());
					Double sqrRtFinal = java.lang.Math.sqrt(sqrRt);
					String finalResult3 = decimalFormatReturn(sqrRtFinal);
					jTextField1.setText(finalResult3);
					jTextField2.setText("");
				}
				else
				{
					Double sqrRt = Double.parseDouble(jTextField2.getText());
					Double sqrRtFinal = java.lang.Math.sqrt(sqrRt);
					String finalResult3 = decimalFormatReturn(sqrRtFinal);
					jTextField1.setText(finalResult3);
					jTextField2.setText("");
				}
				btnSqrRt.setFocusable(false);
				CalculatorFocusable();	
			}
		});
		btnSqrRt.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSqrRt.setBounds(240, 635, 90, 43);
		contentPane.add(btnSqrRt);
		
		JButton btnPrcnt = new JButton("%");
		btnPrcnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jTextField2.getText().isEmpty()){
					String numNumPercent = numberOnly(jTextField1.getText());
					Double numPercent = Double.parseDouble(numNumPercent);
					Double numPercentFinal = numPercent / 100;
					String finalResult3 = decimalFormatReturn(numPercentFinal);
					jTextField1.setText(finalResult3);
					jTextField2.setText("");
				}
				else
				{
					Double numPercent = Double.parseDouble(jTextField2.getText());
					Double numPercentFinal = numPercent / 100;
					String finalResult3 = decimalFormatReturn(numPercentFinal);
					jTextField1.setText(finalResult3);
					jTextField2.setText("");
				}
				btnPrcnt.setFocusable(false);
				CalculatorFocusable();	
			}
		});
		btnPrcnt.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnPrcnt.setBounds(346, 636, 90, 43);
		contentPane.add(btnPrcnt);
		
		errorTextField = new JTextField();
		errorTextField.setForeground(Color.RED);
		errorTextField.setEditable(false);
		errorTextField.setBounds(10, 138, 432, 20);
		errorTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(errorTextField);
		errorTextField.setColumns(10);
		
		
		
			
		setFocusable(true);
		InitiateJavascript();
	}
	
	public void CalculatorFocusable()
	{
		requestFocus(true);
		setFocusable(true);
	}
	
	public void InitiateJavascript(){
		javaScriptEvalEquals("1*2");
		//System.out.println("test");
		
	}
	
	public void getAndSetText(JButton a)
	{
		a.setFocusable(false);
		String takeIn;
		takeIn = jTextField2.getText() + a.getText();
		jTextField2.setText(takeIn);
		a.setFocusable(false);
		
		CalculatorFocusable();	
	}
	
	public String numberOnly(String a)
	{
		
		String finalResult;
		Number number = null;
		NumberFormat format = NumberFormat.getInstance();
		try {
			number = format.parse(a);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finalResult = String.valueOf(number);
		return finalResult;
		
	}
	
	public String javaScriptEval(String a)
	{
		Object finalResult = null;
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		try {
			finalResult = engine.eval(a);
		} catch (ScriptException e) {
			errorTextField.setText("Error. Clear the Calculator and Try again");
			CalculatorFocusable();
			e.printStackTrace();
		}
		String finalResult2 = String.valueOf(finalResult);
		return finalResult2;
	}
	
	public Double javaScriptEvalEquals(String a)
	{
		Double finalResult = Double.parseDouble(javaScriptEval(a));
		return finalResult;
	}
	
	public String decimalFormatReturn(Double a)
	{
		DecimalFormat df = new DecimalFormat(numberFormat);
		String finalResult = String.valueOf(df.format(a));
		return finalResult;
	}
}




