package PianoGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PianoGUI implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	Dimension screenSize;
	
	JButton A1;
	JButton A2;
	JButton A3;
	JButton A4;
	JButton A5;
	
	JButton ASharp1;
	JButton ASharp2;
	JButton ASharp3;
	JButton ASharp4;
	JButton ASharp5;
	
	JButton B1;
	JButton B2;
	JButton B3;
	JButton B4;
	JButton B5;
	
	JButton C1;
	JButton C2;
	JButton C3;
	JButton C4;
	JButton C5;
	JButton C6;
	
	JButton CSharp1;
	JButton CSharp2;
	JButton CSharp3;
	JButton CSharp4;
	JButton CSharp5;
	JButton CSharp6;
	
	JButton D1;
	JButton D2;
	JButton D3;
	JButton D4;
	JButton D5;
	JButton D6;
	
	JButton DSharp1;
	JButton DSharp2;
	JButton DSharp3;
	JButton DSharp4;
	JButton DSharp5;
	JButton DSharp6;

	JButton E1;
	JButton E2;
	JButton E3;
	JButton E4;
	JButton E5;
	JButton E6;

	JButton F1;
	JButton F2;
	JButton F3;
	JButton F4;
	JButton F5;
	JButton F6;
	
	JButton FSharp1;
	JButton FSharp2;
	JButton FSharp3;
	JButton FSharp4;
	JButton FSharp5;
	JButton FSharp6;	
	
	JButton G1;
	JButton G2;
	JButton G3;
	JButton G4;
	JButton G5;
	JButton G6;
	
	JButton GSharp1;
	JButton GSharp2;
	JButton GSharp3;
	JButton GSharp4;
	JButton GSharp5;
	
	public PianoGUI() {
		
		frame = new JFrame();
		panel = new JPanel();
		
		screenSize = new Dimension(1940, 500);
		
		frame.setSize(screenSize);
		frame.setPreferredSize(screenSize);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Piano");
		frame.pack();
		frame.setVisible(true);
		
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(null);
		
		C1 = new JButton();
		C1.setBackground(Color.WHITE);
		C1.setBounds(0, 300, 48, 200);
		C1.addActionListener(this);
		CSharp1 = new JButton();
		CSharp1.setBackground(Color.BLACK);
		CSharp1.setForeground(Color.WHITE);
		CSharp1.setBounds(24, 200, 48, 100);
		CSharp1.addActionListener(this);
		D1 = new JButton();
		D1.setBackground(Color.WHITE);
		D1.setBounds(48, 300, 48, 200);
		D1.addActionListener(this);
		DSharp1 = new JButton();
		DSharp1.setBackground(Color.BLACK);
		DSharp1.setForeground(Color.WHITE);
		DSharp1.setBounds(72, 200, 48, 100);
		DSharp1.addActionListener(this);
		E1 = new JButton();
		E1.setBackground(Color.WHITE);
		E1.setBounds(96, 300, 48, 200);
		E1.addActionListener(this);
		F1 = new JButton();
		F1.setBackground(Color.WHITE);
		F1.setBounds(144, 300, 48, 200);
		F1.addActionListener(this);
		FSharp1 = new JButton();
		FSharp1.setBackground(Color.BLACK);
		FSharp1.setForeground(Color.WHITE);
		FSharp1.setBounds(168, 200, 48, 100);
		FSharp1.addActionListener(this);
		G1 = new JButton();
		G1.setBackground(Color.WHITE);
		G1.setBounds(192, 300, 48, 200);
		G1.addActionListener(this);
		GSharp1 = new JButton();
		GSharp1.setBackground(Color.BLACK);
		GSharp1.setForeground(Color.WHITE);
		GSharp1.setBounds(216, 200, 48, 100);
		GSharp1.addActionListener(this);
		A1 = new JButton();
		A1.setBackground(Color.WHITE);
		A1.setBounds(240, 300, 48, 200);
		A1.addActionListener(this);
		ASharp1 = new JButton();
		ASharp1.setBackground(Color.BLACK);
		ASharp1.setForeground(Color.WHITE);
		ASharp1.setBounds(264, 200, 48, 100);
		ASharp1.addActionListener(this);
		B1 = new JButton();
		B1.setBackground(Color.WHITE);
		B1.setBounds(288, 300, 48, 200);
		B1.addActionListener(this);
		
		C2 = new JButton();
		C2.setBackground(Color.WHITE);
		C2.setBounds(336, 300, 48, 200);
		C2.addActionListener(this);
		CSharp2 = new JButton();
		CSharp2.setBackground(Color.BLACK);
		CSharp2.setForeground(Color.WHITE);
		CSharp2.setBounds(360, 200, 48, 100);
		CSharp2.addActionListener(this);
		D2 = new JButton();
		D2.setBackground(Color.WHITE);
		D2.setBounds(384, 300, 48, 200);
		D2.addActionListener(this);
		DSharp2 = new JButton();
		DSharp2.setBackground(Color.BLACK);
		DSharp2.setForeground(Color.WHITE);
		DSharp2.setBounds(408, 200, 48, 100);
		DSharp2.addActionListener(this);
		E2 = new JButton();
		E2.setBackground(Color.WHITE);
		E2.setBounds(432, 300, 48, 200);
		E2.addActionListener(this);
		F2 = new JButton();
		F2.setBackground(Color.WHITE);
		F2.setBounds(480, 300, 48, 200);
		F2.addActionListener(this);
		FSharp2 = new JButton();
		FSharp2.setBackground(Color.BLACK);
		FSharp2.setForeground(Color.WHITE);
		FSharp2.setBounds(504, 200, 48, 100);
		FSharp2.addActionListener(this);
		G2 = new JButton();
		G2.setBackground(Color.WHITE);
		G2.setBounds(528, 300, 48, 200);
		G2.addActionListener(this);
		GSharp2 = new JButton();
		GSharp2.setBackground(Color.BLACK);
		GSharp2.setForeground(Color.WHITE);
		GSharp2.setBounds(552, 200, 48, 100);
		GSharp2.addActionListener(this);
		A2 = new JButton();
		A2.setBackground(Color.WHITE);
		A2.setBounds(576, 300, 48, 200);
		A2.addActionListener(this);
		ASharp2 = new JButton();
		ASharp2.setBackground(Color.BLACK);
		ASharp2.setForeground(Color.WHITE);
		ASharp2.setBounds(600, 200, 48, 100);
		ASharp2.addActionListener(this);
		B2 = new JButton();
		B2.setBackground(Color.WHITE);
		B2.setBounds(624, 300, 48, 200);
		B2.addActionListener(this);
		
		C3 = new JButton();
		C3.setBackground(Color.WHITE);
		C3.setBounds(672, 300, 48, 200);
		C3.addActionListener(this);
		CSharp3 = new JButton();
		CSharp3.setBackground(Color.BLACK);
		CSharp3.setForeground(Color.WHITE);
		CSharp3.setBounds(696, 200, 48, 100);
		CSharp3.addActionListener(this);
		D3 = new JButton();
		D3.setBackground(Color.WHITE);
		D3.setBounds(720, 300, 48, 200);
		D3.addActionListener(this);
		DSharp3 = new JButton();
		DSharp3.setBackground(Color.BLACK);
		DSharp3.setForeground(Color.WHITE);
		DSharp3.setBounds(744, 200, 48, 100);
		DSharp3.addActionListener(this);
		E3 = new JButton();
		E3.setBackground(Color.WHITE);
		E3.setBounds(768, 300, 48, 200);
		E3.addActionListener(this);
		F3 = new JButton();
		F3.setBackground(Color.WHITE);
		F3.setBounds(816, 300, 48, 200);
		F3.addActionListener(this);
		FSharp3 = new JButton();
		FSharp3.setBackground(Color.BLACK);
		FSharp3.setForeground(Color.WHITE);
		FSharp3.setBounds(840, 200, 48, 100);
		FSharp3.addActionListener(this);
		G3 = new JButton();
		G3.setBackground(Color.WHITE);
		G3.setBounds(864, 300, 48, 200);
		G3.addActionListener(this);
		GSharp3 = new JButton();
		GSharp3.setBackground(Color.BLACK);
		GSharp3.setForeground(Color.WHITE);
		GSharp3.setBounds(888, 200, 48, 100);
		GSharp3.addActionListener(this);
		A3 = new JButton();
		A3.setBackground(Color.WHITE);
		A3.setBounds(912, 300, 48, 200);
		A3.addActionListener(this);
		ASharp3 = new JButton();
		ASharp3.setBackground(Color.BLACK);
		ASharp3.setForeground(Color.WHITE);
		ASharp3.setBounds(936, 200, 48, 100);
		ASharp3.addActionListener(this);
		B3 = new JButton();
		B3.setBackground(Color.WHITE);
		B3.setBounds(960, 300, 48, 200);
		B3.addActionListener(this);
		
		C4 = new JButton();
		C4.setBackground(Color.WHITE);
		C4.setBounds(1008, 300, 48, 200);
		C4.addActionListener(this);
		CSharp4 = new JButton();
		CSharp4.setBackground(Color.BLACK);
		CSharp4.setForeground(Color.WHITE);
		CSharp4.setBounds(1032, 200, 48, 100);
		CSharp4.addActionListener(this);
		D4 = new JButton();
		D4.setBackground(Color.WHITE);
		D4.setBounds(1056, 300, 48, 200);
		D4.addActionListener(this);
		DSharp4 = new JButton();
		DSharp4.setBackground(Color.BLACK);
		DSharp4.setForeground(Color.WHITE);
		DSharp4.setBounds(1080, 200, 48, 100);
		DSharp4.addActionListener(this);
		E4 = new JButton();
		E4.setBackground(Color.WHITE);
		E4.setBounds(1104, 300, 48, 200);
		E4.addActionListener(this);
		F4 = new JButton();
		F4.setBackground(Color.WHITE);
		F4.setBounds(1152, 300, 48, 200);
		F4.addActionListener(this);
		FSharp4 = new JButton();
		FSharp4.setBackground(Color.BLACK);
		FSharp4.setForeground(Color.WHITE);
		FSharp4.setBounds(1176, 200, 48, 100);
		FSharp4.addActionListener(this);
		G4 = new JButton();
		G4.setBackground(Color.WHITE);
		G4.setBounds(1200, 300, 48, 200);
		G4.addActionListener(this);
		GSharp4 = new JButton();
		GSharp4.setBackground(Color.BLACK);
		GSharp4.setForeground(Color.WHITE);
		GSharp4.setBounds(1224, 200, 48, 100);
		GSharp4.addActionListener(this);
		A4 = new JButton();
		A4.setBackground(Color.WHITE);
		A4.setBounds(1248, 300, 48, 200);
		A4.addActionListener(this);
		ASharp4 = new JButton();
		ASharp4.setBackground(Color.BLACK);
		ASharp4.setForeground(Color.WHITE);
		ASharp4.setBounds(1272, 200, 48, 100);
		ASharp4.addActionListener(this);
		B4 = new JButton();
		B4.setBackground(Color.WHITE);
		B4.setBounds(1296, 300, 48, 200);
		B4.addActionListener(this);
		
		C5 = new JButton();
		C5.setBackground(Color.WHITE);
		C5.setBounds(1344, 300, 48, 200);
		C5.addActionListener(this);
		CSharp5 = new JButton();
		CSharp5.setBackground(Color.BLACK);
		CSharp5.setForeground(Color.WHITE);
		CSharp5.setBounds(1368, 200, 48, 100);
		CSharp5.addActionListener(this);
		D5 = new JButton();
		D5.setBackground(Color.WHITE);
		D5.setBounds(1392, 300, 48, 200);
		D5.addActionListener(this);
		DSharp5 = new JButton();
		DSharp5.setBackground(Color.BLACK);
		DSharp5.setForeground(Color.WHITE);
		DSharp5.setBounds(1416, 200, 48, 100);
		DSharp5.addActionListener(this);
		E5 = new JButton();
		E5.setBackground(Color.WHITE);
		E5.setBounds(1440, 300, 48, 200);
		E5.addActionListener(this);
		F5 = new JButton();
		F5.setBackground(Color.WHITE);
		F5.setBounds(1488, 300, 48, 200);
		F5.addActionListener(this);
		FSharp5 = new JButton();
		FSharp5.setBackground(Color.BLACK);
		FSharp5.setForeground(Color.WHITE);
		FSharp5.setBounds(1512, 200, 48, 100);
		FSharp5.addActionListener(this);
		G5 = new JButton();
		G5.setBackground(Color.WHITE);
		G5.setBounds(1536, 300, 48, 200);
		G5.addActionListener(this);
		GSharp5 = new JButton();
		GSharp5.setBackground(Color.BLACK);
		GSharp5.setForeground(Color.WHITE);
		GSharp5.setBounds(1560, 200, 48, 100);
		GSharp5.addActionListener(this);
		A5 = new JButton();
		A5.setBackground(Color.WHITE);
		A5.setBounds(1584, 300, 48, 200);
		A5.addActionListener(this);
		ASharp5 = new JButton();
		ASharp5.setBackground(Color.BLACK);
		ASharp5.setForeground(Color.WHITE);
		ASharp5.setBounds(1608, 200, 48, 100);
		ASharp5.addActionListener(this);
		B5 = new JButton();
		B5.setBackground(Color.WHITE);
		B5.setBounds(1632, 300, 48, 200);
		B5.addActionListener(this);
		
		C6 = new JButton();
		C6.setBackground(Color.WHITE);
		C6.setBounds(1680, 300, 48, 200);
		C6.addActionListener(this);
		CSharp6 = new JButton();
		CSharp6.setBackground(Color.BLACK);
		CSharp6.setForeground(Color.WHITE);
		CSharp6.setBounds(1704, 200, 48, 100);
		CSharp6.addActionListener(this);
		D6 = new JButton();
		D6.setBackground(Color.WHITE);
		D6.setBounds(1728, 300, 48, 200);
		D6.addActionListener(this);
		DSharp6 = new JButton();
		DSharp6.setBackground(Color.BLACK);
		DSharp6.setForeground(Color.WHITE);
		DSharp6.setBounds(1752, 200, 48, 100);
		DSharp6.addActionListener(this);
		E6 = new JButton();
		E6.setBackground(Color.WHITE);
		E6.setBounds(1776, 300, 48, 200);
		E6.addActionListener(this);
		F6 = new JButton();
		F6.setBackground(Color.WHITE);
		F6.setBounds(1824, 300, 48, 200);
		F6.addActionListener(this);
		FSharp6 = new JButton();
		FSharp6.setBackground(Color.BLACK);
		FSharp6.setForeground(Color.WHITE);
		FSharp6.setBounds(1848, 200, 48, 100);
		FSharp6.addActionListener(this);
		G6 = new JButton();
		G6.setBackground(Color.WHITE);
		G6.setBounds(1872, 300, 48, 200);
		G6.addActionListener(this);
		
		panel.add(C1);
		panel.add(CSharp1);
		panel.add(D1);
		panel.add(DSharp1);
		panel.add(E1);
		panel.add(F1);
		panel.add(FSharp1);
		panel.add(G1);
		panel.add(GSharp1);
		panel.add(A1);
		panel.add(ASharp1);
		panel.add(B1);
		panel.add(C2);
		panel.add(CSharp2);
		panel.add(D2);
		panel.add(DSharp2);
		panel.add(E2);
		panel.add(F2);
		panel.add(FSharp2);
		panel.add(G2);
		panel.add(GSharp2);
		panel.add(A2);
		panel.add(ASharp2);
		panel.add(B2);
		panel.add(C3);
		panel.add(CSharp3);
		panel.add(D3);
		panel.add(DSharp3);
		panel.add(E3);
		panel.add(F3);
		panel.add(FSharp3);
		panel.add(G3);
		panel.add(GSharp3);
		panel.add(A3);
		panel.add(ASharp3);
		panel.add(B3);
		panel.add(C4);
		panel.add(CSharp4);
		panel.add(D4);
		panel.add(DSharp4);
		panel.add(E4);
		panel.add(F4);
		panel.add(FSharp4);
		panel.add(G4);
		panel.add(GSharp4);
		panel.add(A4);
		panel.add(ASharp4);
		panel.add(B4);
		panel.add(C5);
		panel.add(CSharp5);
		panel.add(D5);
		panel.add(DSharp5);
		panel.add(E5);
		panel.add(F5);
		panel.add(FSharp5);
		panel.add(G5);
		panel.add(GSharp5);
		panel.add(A5);
		panel.add(ASharp5);
		panel.add(B5);
		panel.add(C6);
		panel.add(CSharp6);
		panel.add(D6);
		panel.add(DSharp6);
		panel.add(E6);
		panel.add(F6);
		panel.add(FSharp6);
		panel.add(G6);
		}
	
	public void playSound(String soundName)
	 {
	   try 
	   {
	    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
	    Clip clip = AudioSystem.getClip( );
	    clip.open(audioInputStream);
	    clip.start( );
	   }
	   catch(Exception ex)
	   {
	     System.out.println("Error with playing sound.");
	     ex.printStackTrace( );
	   }
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == A1) {
			System.out.println("A1");
				playSound("A1.wav");
		}	else if (obj == A2) {
				playSound("A2.wav");
		}	else if (obj == A3) {
				playSound("A3.wav");
		} 	else if (obj == A4) {
				playSound("A4.wav");
		}	else if (obj == A5) {
				playSound("A5.wav");
		}	else if (obj == ASharp1) {
				playSound("A#1.wav");
		}	else if (obj == ASharp2) {
				playSound("A#2.wav");
		} 	else if (obj == ASharp3) {
				playSound("A#3.wav");
		}	else if (obj == ASharp4) {
				playSound("A#4.wav");	
		}	else if (obj == ASharp5) {
				playSound("A#5.wav");
		}	else if (obj == B1) {
				playSound("B1.wav");
		}	else if (obj == B2) {
				playSound("B2.wav");
		}	else if (obj == B3) {
				playSound("B3.wav");;
		} 	else if (obj == B4) {
				playSound("B4.wav");
		}	else if (obj == B5) {
				playSound("B5.wav");
		}	else if (obj == C1) {
				playSound("C1.wav");
		}	else if (obj == C2) {
				playSound("C2.wav");
		} 	else if (obj == C3) {
				playSound("C3.wav");
		}	else if (obj == C4) {
				playSound("C4.wav");
		}	else if (obj == C5) {
				playSound("C5.wav");
		}	else if (obj == C6) {
				playSound("C6.wav");
		}	else if (obj == CSharp1) {
				playSound("C#1.wav");
		}	else if (obj == CSharp2) {
				playSound("C#2.wav");
		} 	else if (obj == CSharp3) {
				playSound("C#3.wav");
		}	else if (obj == CSharp4) {
				playSound("C#4.wav");
		}	else if (obj == CSharp5) {
				playSound("C#5.wav");
		}	else if (obj == CSharp6) {
				playSound("C#6.wav");
		}	else if (obj == D1) {
				playSound("D1.wav");
		}	else if (obj == D2) {
				playSound("D2.wav");
		} 	else if (obj == D3) {
				playSound("D3.wav");
		}	else if (obj == D4) {
				playSound("D4.wav");
		}	else if (obj == D5) {
				playSound("D5.wav");
		}	else if (obj == D6) {
				playSound("D6.wav");
		}	else if (obj == DSharp1) {
				playSound("D#1.wav");
		}	else if (obj == DSharp2) {
				playSound("D#2.wav");
		} 	else if (obj == DSharp3) {
				playSound("D#3.wav");
		}	else if (obj == DSharp4) {
				playSound("D#4.wav");
		}	else if (obj == DSharp5) {
				playSound("D#5.wav");
		}	else if (obj == DSharp6) {
				playSound("D#6.wav");
		}	else if (obj == E1) {
				playSound("E1.wav");
		}	else if (obj == E2) {
				playSound("E2.wav");
		} 	else if (obj == E3) {
				playSound("E3.wav");
		}	else if (obj == E4) {
				playSound("E4.wav");
		}	else if (obj == E5) {
				playSound("E5.wav");
		}	else if (obj == E6) {
				playSound("E6.wav");
		}	else if (obj == F1) {
				playSound("F1.wav");
		}	else if (obj == F2) {
				playSound("F2.wav");
		} 	else if (obj == F3) {
				playSound("F3.wav");
		}	else if (obj == F4) {
				playSound("F4.wav");
		}	else if (obj == F5) {
				playSound("F5.wav");
		}	else if (obj == F6) {
				playSound("F6.wav");
		}	else if (obj == FSharp1) {
				playSound("F#1.wav");
		}	else if (obj == FSharp2) {
				playSound("F#2.wav");
		} 	else if (obj == FSharp3) {
				playSound("F#3.wav");
		}	else if (obj == FSharp4) {
				playSound("F#4.wav");
		}	else if (obj == FSharp5) {
				playSound("F#5.wav");
		}	else if (obj == FSharp6) {
				playSound("F#6.wav");
		}	else if (obj == G1) {
				playSound("G1.wav");
		}	else if (obj == G2) {
				playSound("G2.wav");
		} 	else if (obj == G3) {
				playSound("G3.wav");
		}	else if (obj == G4) {
				playSound("G4.wav");
		}	else if (obj == G5) {
				playSound("G5.wav");
		}	else if (obj == G6) {
				playSound("G6.wav");
		}	else if (obj == GSharp1) {
				playSound("G#1.wav");
		}	else if (obj == GSharp2) {
				playSound("G#2.wav");
		} 	else if (obj == GSharp3) {
				playSound("G#3.wav");
		}	else if (obj == GSharp4) {
				playSound("G#4.wav");
		}	else if (obj == GSharp5) {
				playSound("G#5.wav");
		}
	}
}
