import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.ImageIcon;


public class FrmStations extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPanel panel;
    private MyTableModel maTable;
    private JLabel adresse;
    private JLabel date;
    private JLabel ouvert;
    private JLabel attache;
    private JLabel carteBancaire;
	private JRadioButton lastButtonSelected = null;
	private JTable table;
	private JLabel nbVelos;
	private JLabel nbTotalAttaches;

	// Création du frame
	public FrmStations() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_arrondissement = new JPanel();
		panel_arrondissement.setBorder(new TitledBorder(null, "Arrondissement de Paris", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_arrondissement.setBounds(10, 11, 364, 138);
		contentPane.add(panel_arrondissement);
		panel_arrondissement.setLayout(null);
		
		JRadioButton radioButton_1 = new JRadioButton("1");
		radioButton_1.addActionListener(this);
		
		radioButton_1.setBounds(18, 21, 44, 23);
		panel_arrondissement.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("2");
		radioButton_2.setBounds(74, 21, 49, 23);
		radioButton_2.addActionListener(this);
		panel_arrondissement.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("3");
		radioButton_3.setBounds(135, 21, 55, 23);
		radioButton_3.addActionListener(this);
		panel_arrondissement.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("4");
		radioButton_4.setBounds(202, 21, 50, 23);
		radioButton_4.addActionListener(this);
		panel_arrondissement.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("5");
		radioButton_5.setIconTextGap(5);
		radioButton_5.setActionCommand("5");
		radioButton_5.setBounds(264, 21, 49, 23);
		radioButton_5.addActionListener(this);
		panel_arrondissement.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("6");
		radioButton_6.setBounds(18, 47, 44, 23);
		radioButton_6.addActionListener(this);
		panel_arrondissement.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("7");
		radioButton_7.setBounds(74, 47, 49, 23);
		radioButton_7.addActionListener(this);
		panel_arrondissement.add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("8");
		radioButton_8.setBounds(135, 47, 55, 23);
		radioButton_8.addActionListener(this);
		panel_arrondissement.add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("9");
		radioButton_9.setBounds(202, 47, 50, 23);
		radioButton_9.addActionListener(this);
		panel_arrondissement.add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("10");
		radioButton_10.setBounds(264, 47, 49, 23);
		radioButton_10.addActionListener(this);
		panel_arrondissement.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("11");
		radioButton_11.setBounds(18, 73, 55, 23);
		radioButton_11.addActionListener(this);
		panel_arrondissement.add(radioButton_11);
		
		JRadioButton radioButton_12 = new JRadioButton("12");
		radioButton_12.setBounds(74, 73, 49, 23);
		radioButton_12.addActionListener(this);
		panel_arrondissement.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("13");
		radioButton_13.setBounds(135, 73, 55, 23);
		radioButton_13.addActionListener(this);
		panel_arrondissement.add(radioButton_13);
		
		JRadioButton radioButton_14 = new JRadioButton("14");
		radioButton_14.setBounds(202, 73, 49, 23);
		radioButton_14.addActionListener(this);
		panel_arrondissement.add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("15");
		radioButton_15.setBounds(264, 73, 49, 23);
		radioButton_15.addActionListener(this);
		panel_arrondissement.add(radioButton_15);
		
		JRadioButton radioButton_16 = new JRadioButton("16");
		radioButton_16.setBounds(18, 99, 55, 23);
		radioButton_16.addActionListener(this);
		panel_arrondissement.add(radioButton_16);
		
		JRadioButton radioButton_17 = new JRadioButton("17");
		radioButton_17.setBounds(74, 99, 49, 23);
		radioButton_17.addActionListener(this);
		panel_arrondissement.add(radioButton_17);
		
		JRadioButton radioButton_18 = new JRadioButton("18");
		radioButton_18.setBounds(135, 99, 55, 23);
		radioButton_18.addActionListener(this);
		panel_arrondissement.add(radioButton_18);
		
		JRadioButton radioButton_19 = new JRadioButton("19");
		radioButton_19.setBounds(202, 99, 49, 23);
		radioButton_19.addActionListener(this);
		panel_arrondissement.add(radioButton_19);
		
		JRadioButton radioButton_20 = new JRadioButton("20");
		radioButton_20.setBounds(264, 99, 49, 23);
		radioButton_20.addActionListener(this);
		panel_arrondissement.add(radioButton_20);
		
		JPanel panel_departement = new JPanel();
		panel_departement.setBorder(new TitledBorder(null, "D\u00E9partements", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_departement.setBounds(386, 11, 258, 138);
		contentPane.add(panel_departement);
		panel_departement.setLayout(null);
		
		JRadioButton radioButton_92 = new JRadioButton("92");
		radioButton_92.setBounds(24, 57, 58, 23);
		radioButton_92.addActionListener(this);
		panel_departement.add(radioButton_92);
		
		JRadioButton radioButton_93 = new JRadioButton("93");
		radioButton_93.setBounds(106, 57, 58, 23);
		radioButton_93.addActionListener(this);
		panel_departement.add(radioButton_93);
		
		JRadioButton radioButton_94 = new JRadioButton("94");
		radioButton_94.setBounds(194, 57, 58, 23);
		radioButton_94.addActionListener(this);
		panel_departement.add(radioButton_94);
		
		JPanel panel_autres = new JPanel();
		panel_autres.setBorder(new TitledBorder(null, "Autres", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_autres.setBounds(656, 11, 147, 138);
		contentPane.add(panel_autres);
		panel_autres.setLayout(null);
		
		JRadioButton rdbtnMobile = new JRadioButton("mobile");
		rdbtnMobile.setBounds(31, 54, 84, 23);
		rdbtnMobile.addActionListener(this);
		panel_autres.add(rdbtnMobile);
		
		JPanel panel_disponibilite = new JPanel();
		panel_disponibilite.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Disponibilit\u00E9", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_disponibilite.setBounds(10, 160, 793, 121);
		contentPane.add(panel_disponibilite);
		panel_disponibilite.setLayout(null);
		
		adresse = new JLabel("adresse");
		adresse.setForeground(Color.RED);
		adresse.setVisible(false);
		adresse.setBounds(27, 16, 564, 16);
		panel_disponibilite.add(adresse);
		
		date = new JLabel("date");
		date.setForeground(Color.BLUE);
		date.setVisible(false);
		date.setBounds(27, 40, 216, 16);
		panel_disponibilite.add(date);
		
		ouvert = new JLabel("ouvert/fermé");
		ouvert.setForeground(Color.BLUE);
		ouvert.setVisible(false);
		ouvert.setBounds(454, 40, 202, 16);
		panel_disponibilite.add(ouvert);
		
		nbVelos = new JLabel("Vélos disponibles :");
		nbVelos.setForeground(Color.BLUE);
		nbVelos.setVisible(false);
		nbVelos.setBounds(27, 68, 191, 16);
		panel_disponibilite.add(nbVelos);
		
		attache = new JLabel("point d'attache disponibles : ");
		attache.setForeground(Color.BLUE);
		attache.setVisible(false);
		attache.setBounds(454, 68, 216, 16);
		panel_disponibilite.add(attache);
		
		nbTotalAttaches = new JLabel("New label");
		nbTotalAttaches.setForeground(Color.BLUE);
		nbTotalAttaches.setVisible(false);
		nbTotalAttaches.setBounds(27, 99, 295, 16);
		panel_disponibilite.add(nbTotalAttaches);
		
		carteBancaire = new JLabel("location par carte bancaire :");
		carteBancaire.setForeground(Color.BLUE);
		carteBancaire.setVisible(false);
		carteBancaire.setBounds(454, 99, 287, 16);
		panel_disponibilite.add(carteBancaire);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon("/Users/jeremydebelleix/Desktop/suivant.png"));
		btnNewButton.setBounds(205, 28, 143, 39);
		panel_disponibilite.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 293, 793, 208);
		contentPane.add(scrollPane);
		
		
		// Création du model et du tableau
		maTable = new MyTableModel();
		table = new JTable();
		// listener pour récupérer les infos de la ligne sélectionnée
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();

				if (row != -1){
					//Afficher les information du conducteur sur le covoiturage sélectionné
					String numero = table.getModel().getValueAt(row, 0).toString();
					adresse.setText(table.getModel().getValueAt(row, 1).toString());
					HashMap<String, String> info = Passerelle.getDispo(numero);
					changerLabels(true, info);
					// vérification si la station est ouverte
					setOuvert((boolean)table.getModel().getValueAt(row, 3));
					
					// Affichage de la date
					Date currentDate = new Date();
					SimpleDateFormat formater = new SimpleDateFormat("'le'dd/MM/yyyy 'à' HH:mm:ss");
					String laDate = formater.format(currentDate);
					date.setText(laDate);
				}
			}
		});
		table.setModel(maTable);
		
		scrollPane.setViewportView(table);

	}
	

	private void setOuvert(boolean unBool){
		if (unBool)
			ouvert.setText("La station est ouverte");
		else 
			ouvert.setText("La station est fermée");
	}
	
	// Lorsque l'on clique sur un radio bouton
	public void actionPerformed(ActionEvent e){
		//On déselectionne l'ancien bouton
		if(lastButtonSelected != null){
			lastButtonSelected.setSelected(false);
		}
		//On enregistre le bouton
		this.lastButtonSelected = (JRadioButton) e.getSource();
		// On change les labels 
		maTable.setLesStations(e.getActionCommand());
		this.changerLabels(false, null);
		// On rafraichit le tableau
		table.revalidate();
		table.clearSelection();
		table.repaint();
		
	}
	
	private void changerLabels(boolean visible, HashMap<String, String> info){
		
		 if(info != null){
			 this.attache.setText("Points d'attaches disponibles : "+info.get("available"));
			 this.nbVelos.setText("Vélos disponibles : "+info.get("free"));
			 this.nbTotalAttaches.setText("Nombre total de points d'attache :"+info.get("total"));
			 this.attache.setText("Points d'attache disponibles :"+info.get("total"));

			 if (info.get("connected").equals("1")){
				 this.carteBancaire.setText("Paiement par carte bancaire : oui");
			 }
			 else{
				 this.carteBancaire.setText("Paiement par carte bancaire : oui"); 
			 }
		 }
		 // On change la visibilté de tous les labels
		 this.nbVelos.setVisible(visible);
		 this.adresse.setVisible(visible);
		 this.date.setVisible(visible);
		 this.ouvert.setVisible(visible);
		 this.attache.setVisible(visible);
		 this.carteBancaire.setVisible(visible);
		 this.nbTotalAttaches.setVisible(visible);
	}
}
