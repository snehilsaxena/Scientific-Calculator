import java.awt.*;
import java.awt.event.*;

class Calc{
	Button b[],sb[];
	TextField tf;
	Frame f;
	Panel p3,p1,p2;
	Panel p4;

	public static double fact(double k)
	{
		double f = 1;
		while(k>0)
		{
			f = f*k ;
			k--;
		}
		return f;
	}

	Calc(String s){

		f = new Frame(s);
		b = new Button[30];
		sb = new Button[30];

		// CHANGING ICON
		Toolkit t = Toolkit.getDefaultToolkit();
		f.setIconImage(t.getImage("G:/JAVAwork/AWT/Calculator/icon.jpg"));

		//CREATING MENU BAR

		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("View");
		Menu m2 = new Menu("Help");
		m1.add(new MenuItem("Standard"));
		m1.add(new MenuItem("Scientific"));
		m1.add(new MenuItem("Programmer"));
		m1.add(new MenuItem("Statistics"));
		m1.add(new MenuItem("History"));
		m1.add(new MenuItem("Digit Grouping"));
		m1.add(new MenuItem("Basic"));
		m1.add(new MenuItem("Unit Conversion"));
		m1.add(new MenuItem("Date Calculation"));
		m1.add(new MenuItem("Worksheet"));
		mb.add(m1);
		Menu m3 = new Menu("Edit");
		m3.add(new MenuItem("copy"));
		m3.add(new MenuItem("paste"));
		m3.add(new MenuItem("history"));
		mb.add(m3);
		m2.add(new MenuItem("Help!!!!"));
		m2.add(new MenuItem("About..."));
		mb.add(m2);
		f.setMenuBar(mb); //IMPPPPPPPPPPPPPPPPPPPPPPP

		//CREATING A PANEL FOR TEXTFIELD

		p1 = new Panel();
		p1.setBounds(0,37,248,67);
		p1.setLayout(null);
		//p1.setBackground(Color.BLACK);
		//p1.setLayout(new GridLayout(1,1,0,0));

		//CREATING A TEXTFIELD

		tf = new TextField();
		tf.setFont(new Font("Times New Roman",0,15)); // SETTING FONT & SIZE
		tf.setBounds(15,17,217,45);
		tf.setText(" ");
		p1.add(tf);
		f.add(p1);

		//CREATING A PANEL FOR BUTTONS

		p3 = new Panel();
		p3.setBounds(15,105,217,240);
		p3.setBackground(Color.BLACK);

		Listener o = new Listener(this); //OBJECT TO IMPLEMENT EVENT HANDLING

		//CREATING GRID BAG LAYOUT

		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		p3.setLayout(layout);
		gbc.weightx = 1;  //FOR SIZE OF MATRIX
		gbc.weighty = 1;
		gbc.ipady = 30;

		gbc.fill = GridBagConstraints.HORIZONTAL;

		//CREATING BUTTONS

		gbc.gridx = 0;
		gbc.gridy = 0;
		b[21] = new Button("MC");
		b[21].addActionListener(o);
		p3.add(b[21],gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		b[22] = new Button("MR");
		b[22].addActionListener(o);
		p3.add(b[22],gbc);

		gbc.gridx = 2;
		gbc.gridy = 0;
		b[23] = new Button("MS");
		b[23].addActionListener(o);
		p3.add(b[23],gbc);

		gbc.gridx = 3;
		gbc.gridy = 0;
		b[24] = new Button("M+");
		b[24].addActionListener(o);
		p3.add(b[24],gbc);

		gbc.gridx = 4;
		gbc.gridy = 0;
		b[25] = new Button("M-");
		b[25].addActionListener(o);
		p3.add(b[25],gbc);

		// NEXT ROW

		gbc.gridx = 0;
		gbc.gridy = 1;
		b[27] = new Button("Bkspc");
		b[27].addActionListener(o);
		p3.add(b[27],gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		b[28] = new Button("CE");
		b[28].addActionListener(o);
		p3.add(b[28],gbc);

		gbc.gridx = 2;
		gbc.gridy = 1;
		b[29] = new Button("Clr");
		b[29].addActionListener(o);
		p3.add(b[29],gbc);

		gbc.gridx = 3;
		gbc.gridy = 1;
		b[19] = new Button("+/-");
		b[19].addActionListener(o);
		p3.add(b[19],gbc);

		gbc.gridx = 4;
		gbc.gridy = 1;
		b[17] = new Button("Sqrt");
		b[17].addActionListener(o);
		p3.add(b[17],gbc);

		// NEXT ROW

		gbc.gridx = 0;
		gbc.gridy = 2;
		b[7] = new Button("7");
		b[7].addActionListener(o);
		p3.add(b[7],gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		b[8] = new Button("8");
		b[8].addActionListener(o);
		p3.add(b[8],gbc);

		gbc.gridx = 2;
		gbc.gridy = 2;
		b[9] = new Button("9");
		b[9].addActionListener(o);
		p3.add(b[9],gbc);

		gbc.gridx = 3;
		gbc.gridy = 2;
		b[13] = new Button("/");
		b[13].addActionListener(o);
		p3.add(b[13],gbc);

		gbc.gridx = 4;
		gbc.gridy = 2;
		b[14] = new Button("%");
		b[14].addActionListener(o);
		p3.add(b[14],gbc);

		// NEXT ROW

		gbc.gridx = 0;
		gbc.gridy = 3;
		b[4] = new Button("4");
		b[4].addActionListener(o);
		p3.add(b[4],gbc);

		gbc.gridx = 1;
		gbc.gridy = 3;
		b[5] = new Button("5");
		b[5].addActionListener(o);
		p3.add(b[5],gbc);

		gbc.gridx = 2;
		gbc.gridy = 3;
		b[6] = new Button("6");
		b[6].addActionListener(o);
		p3.add(b[6],gbc);

		gbc.gridx = 3;
		gbc.gridy = 3;
		b[12] = new Button("*");
		b[12].addActionListener(o);
		p3.add(b[12],gbc);

		gbc.gridx = 4;
		gbc.gridy = 3;
		b[18] = new Button("1/x");
		b[18].addActionListener(o);
		p3.add(b[18],gbc);

		// NEXT ROW

		gbc.gridx = 0;
		gbc.gridy = 4;
		b[1] = new Button("1");
		b[1].addActionListener(o);
		p3.add(b[1],gbc);

		gbc.gridx = 1;
		gbc.gridy = 4;
		b[2] = new Button("2");
		b[2].addActionListener(o);
		p3.add(b[2],gbc);

		gbc.gridx = 2;
		gbc.gridy = 4;
		b[3] = new Button("3");
		b[3].addActionListener(o);
		p3.add(b[3],gbc);

		gbc.gridx = 3;
		gbc.gridy = 4;
		b[11] = new Button("-");
		b[11].addActionListener(o);
		p3.add(b[11],gbc);

		gbc.gridx = 4;
		gbc.gridy = 4;
		b[10] = new Button("+");
		b[10].addActionListener(o);
		p3.add(b[10],gbc);

		// NEXT ROW

		gbc.gridx = 0;
		gbc.gridy = 5;
		//gbc.gridwidth = 2;
		b[0] = new Button("0");
		b[0].addActionListener(o);
		p3.add(b[0],gbc);

		gbc.gridwidth = 1;
		gbc.gridx = 1;
		gbc.gridy = 5;
		b[16] = new Button(".");
		b[16].addActionListener(o);
		p3.add(b[16],gbc);

		gbc.gridx = 2;
		gbc.gridy = 5;
		gbc.gridwidth = 2;  //INCREASING SIZE OF BUTTON
		b[15] = new Button("=");
		b[15].addActionListener(o);
		p3.add(b[15],gbc);

		gbc.gridx = 4;
		gbc.gridy = 5;
		b[20] = new Button("SCI");
		b[20].addActionListener(o);
		p3.add(b[20],gbc);

		//Scientific Calc
		p4 = new Panel();
		p4.setBounds(15,105,217,240);

		//CREATING GRID BAG LAYOUT

		GridBagConstraints g = new GridBagConstraints();
		p4.setLayout(layout);
		g.weightx = 1;  //FOR SIZE OF MATRIX
		g.weighty = 1;
		g.ipady = 30;

		g.fill = GridBagConstraints.HORIZONTAL;

		//CREATING BUTTONS

		g.gridx = 0;
		g.gridy = 0;
		sb[29] = new Button("D2R");
		sb[29].addActionListener(o);
		p4.add(sb[29],g);

		g.gridx = 1;
		g.gridy = 0;
		sb[10] = new Button("e^x");
		sb[10].addActionListener(o);
		p4.add(sb[10],g);

		g.gridx = 2;
		g.gridy = 0;
		sb[18] = new Button("sinh");
		sb[18].addActionListener(o);
		p4.add(sb[18],g);

		g.gridx = 3;
		g.gridy = 0;
		sb[20] = new Button("cosh");
		sb[20].addActionListener(o);
		p4.add(sb[20],g);

		g.gridx = 4;
		g.gridy = 0;
		sb[22] = new Button("tanh");
		sb[22].addActionListener(o);
		p4.add(sb[22],g);

		// NEXT ROW

		g.gridx = 0;
		g.gridy = 1;
		sb[14] = new Button("R2D");
		sb[14].addActionListener(o);
		p4.add(sb[14],g);

		g.gridwidth = 2;
		g.gridx = 1;
		g.gridy = 1;
		sb[17] = new Button("sin");
		sb[17].addActionListener(o);
		p4.add(sb[17],g);

		g.gridwidth = 2;
		g.gridx = 3;
		g.gridy = 1;
		sb[11] = new Button("asin");
		sb[11].addActionListener(o);
		p4.add(sb[11],g);

		g.gridwidth = 1;

		// NEXT ROW

		g.gridx = 0;
		g.gridy = 2;
		sb[15] = new Button("x^2");
		sb[15].addActionListener(o);
		p4.add(sb[15],g);

		g.gridwidth = 2;
		g.gridx = 1;
		g.gridy = 2;
		sb[19] = new Button("cos");
		sb[19].addActionListener(o);
		p4.add(sb[19],g);

		g.gridwidth = 2;
		g.gridx = 3;
		g.gridy = 2;
		sb[12] = new Button("acos");
		sb[12].addActionListener(o);
		p4.add(sb[12],g);

		// NEXT ROW
		g.gridwidth = 1;

		g.gridx = 0;
		g.gridy = 3;
		sb[16] = new Button("x^y");
		sb[16].addActionListener(o);
		p4.add(sb[16],g);

		g.gridwidth = 2;
		g.gridx = 1;
		g.gridy = 3;
		sb[21] = new Button("tan");
		sb[21].addActionListener(o);
		p4.add(sb[21],g);

		//g.gridwidth = 2;
		g.gridx = 3;
		g.gridy = 3;
		sb[13] = new Button("atan");
		sb[13].addActionListener(o);
		p4.add(sb[13],g);

		// NEXT ROW
		g.gridwidth = 1;

		g.gridx = 0;
		g.gridy = 4;
		sb[25] = new Button("x!");
		sb[25].addActionListener(o);
		p4.add(sb[25],g);

		g.gridwidth = 2;
		g.gridx = 1;
		g.gridy = 4;
		sb[23] = new Button("log");
		sb[23].addActionListener(o);
		p4.add(sb[23],g);

		g.gridx = 3;
		g.gridy = 4;
		sb[24] = new Button("ln");
		sb[24].addActionListener(o);
		p4.add(sb[24],g);

		// NEXT ROW

		g.gridx = 1;
		g.gridy = 5;
		g.gridwidth = 1;
		sb[0] = new Button("Int");
		sb[0].addActionListener(o);
		p4.add(sb[0],g);

		g.gridx = 2;
		g.gridy = 5;
		sb[1] = new Button("(");
		sb[1].addActionListener(o);
		p4.add(sb[1],g);

		g.gridx = 3;
		g.gridy = 5;
		sb[2] = new Button(")");
		sb[2].addActionListener(o);
		p4.add(sb[2],g);


		g.gridwidth = 1;
		g.gridx = 0;
		g.gridy = 5;
		sb[27] = new Button("|x|");
		sb[27].addActionListener(o);
		p4.add(sb[27],g);

		g.gridx = 4;
		g.gridy = 5;
		//g.gridwidth = 2;  //INCREASING SIZE OF BUTTON
		sb[28] = new Button("STD");
		sb[28].addActionListener(o);
		p4.add(sb[28],g);

		// DESIGNING OR SETTING FRAME

		f.setBackground(Color.BLUE);
		f.add(p3);
		f.setLayout(null);
		f.setSize(248,360);
		f.setResizable(false);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent windowEvent){
		    		System.exit(0);
		    }
        });
	}
}

// SELF EXECUTABLE CLASS

class Calculator{
	public static void main(String s[]){
		new Calc("$$ CALCULATOR");
	}
}

// EVENT HANDLING

class Listener implements ActionListener{

	Calc d ;
	double u,v,mem = 0,result = 0,x;
	int count = 1;
	char OP = 'l', OZ = 'b'; // FOR OPERATOR

	Listener(Calc d){
		this.d = d;
	}

	public void actionPerformed(ActionEvent e){

		//CODING FOR NORMAL CALCULATOR

		if( e.getSource() == d.b[0] )
			d.tf.setText(d.tf.getText() + "0");
		if( e.getSource() == d.b[1] )
			d.tf.setText(d.tf.getText() + "1");
		if( e.getSource() == d.b[2] )
			d.tf.setText(d.tf.getText() + "2");
		if( e.getSource() == d.b[3] )
			d.tf.setText(d.tf.getText() + "3");
		if( e.getSource() == d.b[4])
			d.tf.setText(d.tf.getText()+ "4");
		if( e.getSource() == d.b[5] )
			d.tf.setText(d.tf.getText()+"5");
		if( e.getSource() == d.b[6] )
			d.tf.setText(d.tf.getText()+"6");
		if( e.getSource() == d.b[7] )
			d.tf.setText(d.tf.getText()+"7");
		if( e.getSource() == d.b[8] )
			d.tf.setText(d.tf.getText()+"8");
		if( e.getSource() == d.b[9] )
			d.tf.setText(d.tf.getText()+"9");
		if( e.getSource() == d.b[16] )
		{
			if(count==1)
				d.tf.setText(d.tf.getText()+".");
			count++;
		}

		if( e.getSource() == d.b[17] )
		{
			u = Double.parseDouble(d.tf.getText());
			d.tf.setText("sqrt("+d.tf.getText()+")");
			OP = 's';
		}

		if( e.getSource() == d.b[18] )
		{
			u = Double.parseDouble(d.tf.getText());
			if(u != 0)
			{
				u = 1/u;
				d.tf.setText("" + u);
			}
		}

		if( e.getSource() == d.b[19] )
		{
			u = Double.parseDouble(d.tf.getText());
			if(u != 0)
			{
				d.tf.setText("" + (-1)*u);
			}
		}

		if( e.getSource() == d.b[21] ) //MC
		{
			mem = 0;
		}

		if( e.getSource() == d.b[22] ) //MR
		{
			d.tf.setText(""+ mem);
		}

		if( e.getSource() == d.b[23] )  //MS
		{
			mem = Double.parseDouble(d.tf.getText());
			d.tf.setText("");
		}

		if( e.getSource() == d.b[24] )  //M+
		{

			mem = mem + Double.parseDouble(d.tf.getText());
			d.tf.setText("");
		}

		if( e.getSource() == d.b[25] )  //M-
		{

			mem = mem - Double.parseDouble(d.tf.getText());
			d.tf.setText("");
		}

		if( e.getSource() == d.b[27] ) //Backspace
		{

			String str = d.tf.getText();
			d.tf.select(0,str.length()-1);
			str = d.tf.getSelectedText();
			d.tf.setText("" + str);
		}



		if( e.getSource() == d.b[29] )  //CLEAR
		{
			d.tf.setText("");
			OP = 'l';
			u = 0;
			v = 0;
			count = 1;
		}

		if( e.getSource() == d.b[28] )  //CE
		{
			d.tf.setText("");
			count = 1;
		}

		if(e.getSource()==d.b[10]){ // IMPLEMENTING + BUTTON
			if(OP == 'l')
			{
				try{
					u = Double.parseDouble(d.tf.getText());
				}
				catch(NumberFormatException a){
				}
			}
			if(OP == '*')
						{
							u = u * Double.parseDouble(d.tf.getText());
						}
						if(OP == '+')
						{
							u = u + Double.parseDouble(d.tf.getText());
						}
						if(OP == '-')
						{
							u = u - Double.parseDouble(d.tf.getText());
						}
						if(OP == '/')
						{
							u = u / Double.parseDouble(d.tf.getText());
						}
						if(OP == '%')
						{
							u = u % Double.parseDouble(d.tf.getText());
			}
			OP = '+';
			d.tf.setText("");
			count = 1;
		}

		if(e.getSource()==d.b[11]){ // IMPLEMENTING - BUTTON
			if(OP == 'l')
			{
				try{
					u = Double.parseDouble(d.tf.getText());
				}
				catch(NumberFormatException a){
				}
			}
			if(OP == '*')
						{
							u = u * Double.parseDouble(d.tf.getText());
						}
						if(OP == '+')
						{
							u = u + Double.parseDouble(d.tf.getText());
						}
						if(OP == '-')
						{
							u = u - Double.parseDouble(d.tf.getText());
						}
						if(OP == '/')
						{
							u = u / Double.parseDouble(d.tf.getText());
						}
						if(OP == '%')
						{
							u = u % Double.parseDouble(d.tf.getText());
			}
			OP = '-';
			d.tf.setText("");
			count = 1;
		}

		if(e.getSource()==d.b[12]){ // IMPLEMENTING * BUTTON
			if(OP == 'l')
			{
				try{
					u = Double.parseDouble(d.tf.getText());
				}
				catch(NumberFormatException a){
				}
			}
			if(OP == '*')
			{
				u = u * Double.parseDouble(d.tf.getText());
			}
			if(OP == '+')
			{
				u = u + Double.parseDouble(d.tf.getText());
			}
			if(OP == '-')
			{
				u = u - Double.parseDouble(d.tf.getText());
			}
			if(OP == '/')
			{
				u = u / Double.parseDouble(d.tf.getText());
			}
			if(OP == '%')
			{
				u = u % Double.parseDouble(d.tf.getText());
			}
			OP = '*';
			d.tf.setText("");
			count = 1;
		}

		if(e.getSource()==d.b[13]){ // IMPLEMENTING / BUTTON
			if(OP == 'l')
			{
				try{
					u = Double.parseDouble(d.tf.getText());
				}
				catch(NumberFormatException a){
				}
				catch(ArithmeticException a){
					d.tf.setText("0");
				}
			}
			if(OP == '*')
			{
				u = u * Double.parseDouble(d.tf.getText());
			}
			if(OP == '+')
			{
				u = u + Double.parseDouble(d.tf.getText());
			}
			if(OP == '-')
			{
				u = u - Double.parseDouble(d.tf.getText());
			}
			if(OP == '/')
			{
				u = u / Double.parseDouble(d.tf.getText());
			}
			if(OP == '%')
			{
				u = u % Double.parseDouble(d.tf.getText());
			}
			OP = '/';
			d.tf.setText("");
			count = 1;
		}

		if(e.getSource()==d.b[14]){ // IMPLEMENTING % BUTTON
			try{
				u = Double.parseDouble(d.tf.getText());
			}
			catch(NumberFormatException a){
			}
			if(OP == '*')
						{
							u = u * Double.parseDouble(d.tf.getText());
						}
						if(OP == '+')
						{
							u = u + Double.parseDouble(d.tf.getText());
						}
						if(OP == '-')
						{
							u = u - Double.parseDouble(d.tf.getText());
						}
						if(OP == '/')
						{
							u = u / Double.parseDouble(d.tf.getText());
						}
						if(OP == '%')
						{
							u = u % Double.parseDouble(d.tf.getText());
			}
			OP = '%';
			d.tf.setText("");
			count = 1;
		}

		if( e.getSource() == d.b[20] ) //SWITCHING
		{
			d.f.setSize(446,360);
			d.p1.setBounds(0,37,446,67);
			d.tf.setBounds(15,17,416,45);
			d.p4.setBounds(230,105,205,240);
			d.f.add(d.p4);
			d.p1.setBackground(Color.BLACK);
			d.p4.setBackground(Color.BLACK);
			d.f.setBackground(Color.BLACK);
		}

		// CODING FOR SCIENTIFIC CALCULATOR

				if( e.getSource() == d.sb[0] )
				{
					int k = (int)Double.parseDouble(d.tf.getText());
					d.tf.setText("" + k);
				}

				if( e.getSource() == d.sb[27] )  //MOD
				{
					u = Double.parseDouble(d.tf.getText());
					if(u < 0)
						d.tf.setText("" + ((-1)*u));
					else
						d.tf.setText("" + u);
				}

				if( e.getSource() == d.sb[29] )  //Degree to Radian
				{
					u = Double.parseDouble(d.tf.getText());
					result = ((u*22)/(7*180));
					d.tf.setText("" + result);
				}

				if( e.getSource() == d.sb[28] ) //Switch Button
				{
					d.f.setSize(248,360);
					d.p1.setBounds(0,37,248,67);
					d.tf.setBounds(15,17,217,45);
					d.f.remove(d.p4);
					d.f.setBackground(Color.BLUE);
					d.p1.setBackground(Color.BLUE);
				}

				if( e.getSource() == d.sb[10] ) //Exponent
								{
					u = Double.parseDouble(d.tf.getText());
					d.tf.setText("" + Math.exp(u));
				}
				if( e.getSource() == d.sb[11] ) //asin
												{
					u = Double.parseDouble(d.tf.getText());
					d.tf.setText("" + Math.asin(u));
				}
				if( e.getSource() == d.sb[12] ) //acos
				{
					u = Double.parseDouble(d.tf.getText());
					d.tf.setText("" + Math.acos(u));
				}
				if( e.getSource() == d.sb[13] ) //atan
								{
					u = Double.parseDouble(d.tf.getText());
					d.tf.setText("" + Math.atan(u));
				}
				if( e.getSource() == d.sb[14] ) //  Radian to Degree
				{
					u = Double.parseDouble(d.tf.getText());
					result = ((u*180*7)/(22));
					d.tf.setText("" + result);
				}
				if( e.getSource() == d.sb[15] ) //x^2
				{
					u = Double.parseDouble(d.tf.getText());
					d.tf.setText("" + (u*u));
				}
				//char OZ = ' ';
				if( e.getSource() == d.sb[16] ) //x^y
				{
					try{
						u = Double.parseDouble(d.tf.getText());
						OP = '_';
					}
					catch(NumberFormatException ex){}
					d.tf.setText("");
				}
				if( e.getSource() == d.sb[17] ) //sin
				{
					u = Double.parseDouble(d.tf.getText());
					d.tf.setText("" + Math.sin(u));
				}

				if( e.getSource() == d.sb[18] ) //sinh
				{
					u = Double.parseDouble(d.tf.getText());
					d.tf.setText("" + Math.sinh(u));
				}

				if( e.getSource() == d.sb[19] ) //cos
				{
					u = Double.parseDouble(d.tf.getText());
					d.tf.setText("" + Math.cos(u));
				}

				if( e.getSource() == d.sb[20] ) //cosh
				{
					u = Double.parseDouble(d.tf.getText());
					d.tf.setText("" + Math.cosh(u));
				}

				if( e.getSource() == d.sb[21] ) //tan
				{
					u = Double.parseDouble(d.tf.getText());
					d.tf.setText("" + Math.tan(u));
				}
				if( e.getSource() == d.sb[22] ) //tanh
				{
					u = Double.parseDouble(d.tf.getText());
					d.tf.setText("" + Math.tanh(u));
				}

				if( e.getSource() == d.sb[23] ) //log10
				{
					u = Double.parseDouble(d.tf.getText());
					d.tf.setText("" + Math.log10(u));
				}

				if( e.getSource() == d.sb[24] ) //log
				{
					u = Double.parseDouble(d.tf.getText());
					d.tf.setText("" + Math.log(u));
				}

				if( e.getSource() == d.sb[25] ) //factorial
				{
					u = Double.parseDouble(d.tf.getText());
					d.tf.setText("" + Calc.fact(u));
				}

				if( e.getSource() == d.sb[1] ) //(
				{
					System.out.println(x);
					x = u;
					//u =0;
					OZ = OP;
					OP = 'l';
					count = 1;
				}
				if( e.getSource() == d.sb[2] ) //)
				{
					if(OP == '*')
					{
						u = u * Double.parseDouble(d.tf.getText());
					}
					if(OP == '+')
					{
						u = u + Double.parseDouble(d.tf.getText());
					}
					if(OP == '-')
					{
						u = u - Double.parseDouble(d.tf.getText());
					}
					if(OP == '/')
					{
						u = u / Double.parseDouble(d.tf.getText());
					}
					if(OP == '%')
					{
						u = u % Double.parseDouble(d.tf.getText());
					}
					if(OZ == '*')
						u = x*u;
					if(OZ == '+')
						u = x+u;
					if(OZ == '-')
						u = x-u;
					if(OZ == '/')
						u = x/u;
					if(OZ == '%')
						u = x%u;
					OP ='l';
					result = u;
					d.tf.setText("");
					count = 1;
				}


		if(e.getSource()== d.b[15]) // IMPLEMENTING = BUTTON
		{
					try{
						v = Double.parseDouble(d.tf.getText());
					}
					catch(NumberFormatException a){
					}
					if(OP == '+')
						result = (u+v);
					else if(OP == '-')
						result = (float)u-v;
					else if(OP == '*')
						result = (float)u*v;
					else if(OP == '/')
						result = (float)u/v;
					else if(OP == '%')
						result = (float)u%v;
					else if(OP == 's')
						result = Math.sqrt(u);
					try{
						v = Double.parseDouble(d.tf.getText());
					}
					catch(NumberFormatException ex){}
					if(OP == '_')
					{
						result = (Math.pow(u,v));
					}
					OP = 'l';
					d.tf.setText("" + result);
		}
	}
}