package vue;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenetreHome extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JButton Quitter, Jouer, instructions;
	private JButton Local;
	JPanel pan;
	private Random rand = new Random();

	public FenetreHome(String title) throws HeadlessException {
		super(title);
		pan = new JPanel();
		pan.setLayout(new FlowLayout());
		Quitter = new JButton("Quitter");
		Quitter.setAlignmentX(pan.CENTER_ALIGNMENT);
		Jouer = new JButton("Démarrer partie  ");
		Jouer.setAlignmentX(pan.CENTER_ALIGNMENT);
		instructions = new JButton("Instructions");
		instructions.setAlignmentX(pan.CENTER_ALIGNMENT);
		Local = new JButton("Démarrer partie reseau");
		Local.setAlignmentX(pan.CENTER_ALIGNMENT);
		setLocationRelativeTo(null);
		setTitle("Menu");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		BoxLayout boxLayout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
		this.setLayout(boxLayout);
		this.add(instructions);
		this.add(Jouer);
		Jouer.addActionListener(this);
		// this.add(Local);
		this.add(Quitter);
		Quitter.addActionListener(this);
		// this.add(pan);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == Quitter)
			System.exit(0);
		if (arg0.getSource() == Jouer) {
			setVisible(false);
			new Grille();
		}
	}

}
