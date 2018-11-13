package blockPuzzle.boundary;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JToggleButton;

import blockPuzzle.controller.*;
import blockPuzzle.entity.*;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.Font;

public class BlockPuzzleApp extends JFrame{
	Model m;
	PuzzleField panel;
	JLabel lblMoves;
	KeyController key;
	
	public JLabel getLblMoves() {
		return lblMoves;
	}
	public void setLblMoves(int lblMoves) {
		this.lblMoves.setText("Moves: "+lblMoves);
	}
	public Model getM() {
		return m;
	}
	public void setM(Model m) {
		this.m = m;
	}
	public PuzzleField getPanel() {
		return panel;
	}
	public void setPanel(PuzzleField p) {
		this.panel = p;
	}
	public BlockPuzzleApp(Model m) {
		
		getContentPane().setBackground(SystemColor.menu);
		this.m=m;
		setResizable(false);
		setTitle("Block Puzzle");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(465,800);
		setLocationRelativeTo(null);
		
		addWindowListener(new WindowAdapter(){
		    public void windowClosing(WindowEvent e){
		    	if (new ExitController().confirmExit(BlockPuzzleApp.this)){
					BlockPuzzleApp.this.dispose();
				}
		    }
		});
		
		panel = new PuzzleField(m, BlockPuzzleApp.this);
		panel.setBounds(30, 30, 400, 500);
		getContentPane().add(panel);
		panel.setFocusable(true);

		key=new KeyController(m,BlockPuzzleApp.this);
		addKeyListener(key);
		
		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ResetController(m, BlockPuzzleApp.this).reset();
			}
		});
		resetButton.addKeyListener(key);
		resetButton.setBounds(275, 615, 125, 25);
		getContentPane().add(resetButton);
		
		lblMoves = new JLabel("Moves: "+m.getBlockPuzzle().getMoves());
		lblMoves.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblMoves.setBounds(275, 575, 137, 25);
		getContentPane().add(lblMoves);
		
		JButton instructionButton = new JButton("Instructions");
		instructionButton.setBounds(275, 660, 125, 25);
		getContentPane().add(instructionButton);
		instructionButton.addKeyListener(key);
		instructionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InstructionsController().showInstructions(BlockPuzzleApp.this);
			}
		});
		
		JButton upButton = new JButton("^");
		upButton.setBounds(110, 575, 50, 50);
		getContentPane().add(upButton);
		upButton.addKeyListener(key);
		upButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new MoveController(m, BlockPuzzleApp.this).move(0);
			}
		});
		
		
		JButton rightButton = new JButton(">");
		rightButton.setBounds(160, 625, 50, 50);
		getContentPane().add(rightButton);
		rightButton.addKeyListener(key);
		rightButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new MoveController(m, BlockPuzzleApp.this).move(1);
			}
		});
		
		JButton downButton = new JButton("V");
		downButton.setBounds(110, 675, 50, 50);
		getContentPane().add(downButton);
		downButton.addKeyListener(key);
		downButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new MoveController(m, BlockPuzzleApp.this).move(2);
			}
		});
		
		JButton leftButton = new JButton("<");
		leftButton.setBounds(60, 625, 50, 50);
		getContentPane().add(leftButton);
		
		JLabel lblNewLabel = new JLabel("Block Puzzle Game!!!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(118, 0, 228, 29);
		getContentPane().add(lblNewLabel);
		leftButton.addKeyListener(key);
		leftButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new MoveController(m, BlockPuzzleApp.this).move(3);
			}
		});
	}
}
