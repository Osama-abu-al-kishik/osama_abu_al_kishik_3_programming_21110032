package osama;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.html.ImageView;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class EventDriven {

	public static void main ( String [ ] args )
	{
		JFrame frame = new JFrame ( "The authority to send to the manager" );
		frame.setSize ( 500 , 500 );
		frame.setLocationRelativeTo ( null );
		frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
		
		
		JLabel usrlbl = new JLabel ( " username " );
		JTextField usernameField = new JTextField ( 40 );
		JLabel pwslbl = new JLabel ( " password " );
		JPasswordField passwordFld = new JPasswordField ( 40 );
		
		JButton loginBtn = new JButton ( " login " );
		
		loginBtn.addActionListener ( new ActionListener ( )
		{
			//override
			public void actionPerformed ( ActionEvent e )
			{
				String username = usernameField.getText ( );
				String password = new String (passwordFld.getPassword ( ) );
				System.out.println ( username ) ;
				System.out.println ( password ) ; 
			
			
			if ( username.equalsIgnoreCase ( "osama" ) && password.equals ( "12345678" ) )
			{
				
						
						JFrame frame = new JFrame ( " write a massege for my Boss " );
						
						JLabel label1 = new JLabel ( " Words : " ) ;
						label1.setBounds ( 100 , 25 , 100 , 30 ) ;
						
						JLabel label2 = new JLabel ( " Charcters : " ) ;
						label2.setBounds ( 250 , 25 , 100 , 30 ) ;
						
						JLabel label3 = new JLabel ( "If the message is more than 100 words, The Boss will not read it" ) ;
						label3.setBounds ( 60 , 370 , 380 , 30 );
						label3.setForeground(Color.red);
						
						
						JTextArea area = new JTextArea ( ) ; 
						area.setBounds ( 20,75,440 , 200 ) ;
						
						
						JButton btn1 = new JButton ( " Count words and characters " );
						btn1.setBounds ( 230 , 300 , 220 , 30 ) ; 
						
						
						
						btn1.addActionListener ( (ActionListener) new ActionListener ( )
						{
							@Override
							public void actionPerformed( ActionEvent e ) 
							{
								String content = area.getText ( ) ;
								String [ ] words = content.split ( " " ) ;
								for ( int i = 0 ; i < words .length ; i ++ )
								{
									System.out.println ( words [ i ] ) ; 
									}
								label1.setText ( " words : " + words.length ) ;
								String contentWithoutSpace = content.replace ( " " , " " ) ;
								label2.setText ( " Charcters : " + contentWithoutSpace.length ( ) ) ;
								
								
							}
						});
								
								
								JButton btn2 = new JButton("send a massege");
								frame.add(btn2);
								btn2.setBounds(10, 300, 220, 30);
								
								
								
								btn2.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										
										
										JFrame frame = new JFrame ( "Sending successful" );
										frame.setSize(500, 500);
										frame.setVisible ( true ) ;
										frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
										frame.setLayout(null);
										
										
										 
										Icon icon = new ImageIcon ("C:\\Users\\User\\Downloads\\qq.png " ) ; 
										JButton button1 = new JButton ( icon ) ;
										button1.setBounds ( 130 , 170 , icon.getIconWidth ( ) , icon.getIconHeight () );
										frame.add(button1);
										
								
										JLabel label4 = new JLabel("You will be answered within 48 hours");
										
										label4.setBounds(110,100,270,100);
										label4.setForeground(Color.green);
										 frame.add ( label4 );
										 
										
										 
											
											
										 
										 JLabel label5 = new JLabel("***  Good luck  ***");
											
											label5.setBounds(160,285,270,100);
											label5.setForeground(Color.black);
											 frame.add ( label5 );
										 
									}
								});
								
														
						
						 frame.add ( label1 ) ;
						 frame.add ( label2 ) ; 
						 frame.add ( label3 ) ;
						 frame.add ( area ) ;
						 frame.add ( btn1 ) ; 
						 frame.setLayout ( null ) ;
						 frame.setSize ( 500,500 ) ;
						 frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE ) ;
						 frame.setLocationRelativeTo ( null ) ; 
						 frame.setVisible ( true ) ;
						
				
			}
				else 
				{
					JOptionPane.showMessageDialog ( null , " invalid username or password " ) ;
				}
			}
		});
			
		frame.add ( usrlbl ) ;
		frame.add ( usernameField ) ; 
		frame.add ( pwslbl ) ; 
		frame.add (passwordFld); 
		frame.add ( loginBtn ) ; 
		frame.setLayout (new FlowLayout()); 
		frame.setVisible ( true ) ;
			}
		
	}

