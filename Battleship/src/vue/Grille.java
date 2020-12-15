package vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import modele.Bateau2;
import modele.Bateau3;
import modele.Bateau4;
import modele.Bateau5;

public class Grille extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelHeader;
	private JPanel panelFooter;
	
	private Bateau2 Torpilleur;
	private Bateau3 Sousmarin;
	private Bateau3 ContreTorpilleur;
	private Bateau4 Croiseur;
	private Bateau5 PorteAvion;

	private Bateau2 Torpilleur1;
	private Bateau3 Sousmarin1;
	private Bateau3 ContreTorpilleur1;
	private Bateau4 Croiseur1;
	private Bateau5 PorteAvion1;

	private JPanel Plateaux;
	private JPanel PlateauxJ1;
	private JPanel PlateauxJ2;
	private JButton Grille1[];
	private JButton Grille2[];
	JLabel label1;
	JLabel label2;
	private JButton BoutonStart;
	private JButton BoutonStopRestart;
	private JPanel pan;

	public Grille() {
		super("Jeu");
		panelHeader = new JPanel();
		panelFooter = new JPanel();

		Plateaux = new JPanel();
		PlateauxJ1 = new JPanel();
		PlateauxJ2 = new JPanel();
		Grille1 = new JButton[100];
		Grille2 = new JButton[100];
		label1 = new JLabel("Joueur");
		BoutonStart = new JButton();
		BoutonStart.setText("Start");
		BoutonStart.addActionListener(this);
		BoutonStopRestart = new JButton();
		BoutonStopRestart.setText("restart");
		BoutonStopRestart.setName("restart");
		BoutonStopRestart.addActionListener(this);

		panelHeader.setLayout(new GridLayout(2, 1));
		panelHeader.add(label1);
		label2 = new JLabel("Score");
		panelFooter.setLayout(new GridLayout(3, 1));
		panelFooter.add(label2);
		panelFooter.add(BoutonStart);
		panelFooter.add(BoutonStopRestart);

		setSize(1070, 400);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());

		getContentPane().add(Plateaux, BorderLayout.CENTER);
		getContentPane().add(panelHeader, BorderLayout.NORTH);
		getContentPane().add(panelFooter, BorderLayout.SOUTH);
		Plateaux.setLayout(new GridLayout(1, 2, 30, 30));
		Plateaux.add(PlateauxJ1);
		Plateaux.add(PlateauxJ2);
		PlateauxJ1.setLayout(new GridLayout(10, 10, 0, 0));
		PlateauxJ2.setLayout(new GridLayout(10, 10, 0, 0));

		for (int i = 0; i <= 99; i++) {
			Grille1[i] = new JButton();
			Grille1[i].setName("" + (i + 1));
			Grille1[i].setActionCommand("Grille1" + i);
			Grille1[i].addActionListener(this);
			PlateauxJ1.add(Grille1[i]);

			Grille1[i].setEnabled(false);

		}

		for (int i = 0; i <= 99; i++) {
			Grille2[i] = new JButton();
			Grille2[i].setName("" + ((i + 101)));
			Grille2[i].setActionCommand("Grille2" + i);
			Grille2[i].addActionListener(this);
			PlateauxJ2.add(Grille2[i]);
			Grille2[i].setEnabled(false);

		}

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//doit appeler la methode action du Contoller

		String RecuperationBouton = ((JButton) arg0.getSource()).getName();
		String RecuperationActionBouton = ((JButton) arg0.getSource()).getActionCommand();
		int tabl[] = null;
		boolean bool = false;
		if (RecuperationActionBouton == BoutonStopRestart.getActionCommand()) {
			setVisible(false);
			new FenetreHome("Home");
		} else if (RecuperationActionBouton == BoutonStart.getActionCommand()) {

			for (int i = 0; i <= 99; i++) {
				Grille1[i].setEnabled(true);
				Grille2[i].setEnabled(false);
			}

			Torpilleur = new Bateau2("Torpilleur");
			Sousmarin = new Bateau3("Sous-Marin");
			ContreTorpilleur = new Bateau3("Contre-Torpilleur");
			Croiseur = new Bateau4("Croiseur");
			PorteAvion = new Bateau5("Porte-Avion");

			Torpilleur1 = new Bateau2("TorpilleurG2");
			Sousmarin1 = new Bateau3("Sous-MarinG2");
			ContreTorpilleur1 = new Bateau3("Contre-TorpilleurG2");
			Croiseur1 = new Bateau4("CroiseurG2");
			PorteAvion1 = new Bateau5("Porte-AvionG2");

			Torpilleur.setPosition(5);
			Torpilleur.setPosition(6);

			Sousmarin.setPosition(30);
			Sousmarin.setPosition(40);
			Sousmarin.setPosition(50);

			ContreTorpilleur.setPosition(35);
			ContreTorpilleur.setPosition(36);
			ContreTorpilleur.setPosition(37);

			Croiseur.setPosition(76);
			Croiseur.setPosition(77);
			Croiseur.setPosition(78);
			Croiseur.setPosition(79);

			PorteAvion.setPosition(8);
			PorteAvion.setPosition(18);
			PorteAvion.setPosition(28);
			PorteAvion.setPosition(38);
			PorteAvion.setPosition(48);
			Torpilleur1.setPosition(105);
			Torpilleur1.setPosition(106);

			Sousmarin1.setPosition(130);
			Sousmarin1.setPosition(140);
			Sousmarin1.setPosition(150);

			ContreTorpilleur1.setPosition(135);
			ContreTorpilleur1.setPosition(136);
			ContreTorpilleur1.setPosition(137);

			Croiseur1.setPosition(176);
			Croiseur1.setPosition(177);
			Croiseur1.setPosition(178);
			Croiseur1.setPosition(179);

			PorteAvion1.setPosition(108);
			PorteAvion1.setPosition(118);
			PorteAvion1.setPosition(128);
			PorteAvion1.setPosition(138);
			PorteAvion1.setPosition(148);

			for (int i = 0; i <= 99; i++) {
				Grille2[i].setEnabled(false);
			}

		} else {
			int NomBoutonAppuyer = Integer.parseInt(RecuperationBouton);
			NomBoutonAppuyer = (NomBoutonAppuyer - 1);

			if (NomBoutonAppuyer <= 199 && NomBoutonAppuyer >= 0) {
				// test si le bouton appuyer fait partie du premier tableau
				if (NomBoutonAppuyer <= 99 && NomBoutonAppuyer >= 0) {
					 System.out.println(NomBoutonAppuyer);

					for (int i = 0; i <= 99; i++) {
						Grille2[i].setEnabled(true);
						Grille1[i].setEnabled(false);
					}
					if (Torpilleur1.testPosition(NomBoutonAppuyer + 100) > 1) {
						Grille1[NomBoutonAppuyer].setBackground(Color.GREEN);
						if (Torpilleur1.addTouch()) {
							tabl = new int[Torpilleur1.getTaille()];
							tabl = Torpilleur1.getPositions();
							bool = true;
						}
					} else if (Sousmarin1.testPosition(NomBoutonAppuyer + 100) > 1) {
						Grille1[NomBoutonAppuyer].setBackground(Color.GREEN);
						if (Sousmarin1.addTouch()) {
							tabl = new int[Sousmarin1.getTaille()];
							tabl = Sousmarin1.getPositions();
							bool = true;
						}
					} else if (ContreTorpilleur1.testPosition(NomBoutonAppuyer + 100) > 1) {
						Grille1[NomBoutonAppuyer].setBackground(Color.GREEN);
						if (ContreTorpilleur1.addTouch()) {
							tabl = new int[ContreTorpilleur1.getTaille()];
							tabl = ContreTorpilleur1.getPositions();
							bool = true;
						}
					} else if (Croiseur1.testPosition(NomBoutonAppuyer + 100) > 1) {
						Grille1[NomBoutonAppuyer].setBackground(Color.GREEN);
						if (Croiseur1.addTouch()) {
							tabl = new int[Croiseur1.getTaille()];
							tabl = Croiseur1.getPositions();
							bool = true;
						}
					} else if (PorteAvion1.testPosition(NomBoutonAppuyer + 100) > 1) {
						Grille1[NomBoutonAppuyer].setBackground(Color.GREEN);
						if (PorteAvion1.addTouch()) {
							tabl = new int[PorteAvion1.getTaille()];
							tabl = PorteAvion1.getPositions();
							bool = true;
						}
					} else {
						Grille1[NomBoutonAppuyer].setBackground(Color.WHITE);
					}
					if (bool) {
						for (int i = 0; i < tabl.length; i++) {

							Grille1[tabl[i] - 100].setBackground(Color.RED);
						}
					}
				} else {
					if (NomBoutonAppuyer <= 199 && NomBoutonAppuyer >= 100) {

						 System.out.print(NomBoutonAppuyer);
						System.out.println(" " + (NomBoutonAppuyer - 100));

						for (int i = 0; i <= 99; i++) {
							Grille2[i].setEnabled(false);
							Grille1[i].setEnabled(true);
						}
						if (Torpilleur.testPosition(NomBoutonAppuyer - 100) > 1) {
							Grille2[NomBoutonAppuyer - 100].setBackground(Color.GREEN);
						} else if (Sousmarin.testPosition(NomBoutonAppuyer - 100) > 1) {
							Grille2[NomBoutonAppuyer - 100].setBackground(Color.GREEN);
						} else if (ContreTorpilleur.testPosition(NomBoutonAppuyer - 100) > 1) {
							Grille2[NomBoutonAppuyer - 100].setBackground(Color.GREEN);
						} else if (Croiseur.testPosition(NomBoutonAppuyer - 100) > 1) {
							Grille2[NomBoutonAppuyer - 100].setBackground(Color.GREEN);
						} else if (PorteAvion.testPosition(NomBoutonAppuyer - 100) > 1) {
							Grille2[NomBoutonAppuyer - 100].setBackground(Color.GREEN);
						} else
							Grille2[NomBoutonAppuyer - 100].setBackground(Color.WHITE);

					}
				}
			}
		}
	}
}
