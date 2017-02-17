package guiS;

import javax.swing.JList;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;

import player.NonEuPlayer;
import player.Player;
import functionality.PlayerList;
import myBeers.Beer;
import myBeers.Lager;
import myBeers.Stout;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
//import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class RegApp {

	public JFrame frame;
	@SuppressWarnings("unused")
	private JPanel panelMenu;
	@SuppressWarnings("unused")
	private JPanel EuPlayer;
	@SuppressWarnings("unused")
	private JPanel panelRemove;
	@SuppressWarnings("unused")
	private JPanel panelSearchUpdate;
	@SuppressWarnings("unused")
	private JPanel panelNonEuPlaye;
	@SuppressWarnings("unused")
	private JPanel panelPlayerList;
	@SuppressWarnings("unused")
	private JPanel panelListAllPlayers;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;

	PlayerList listOfPlayers = new PlayerList();
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	String pps;
	private JPanel panelListAllPlayers_1;
	private JPanel panelMenu_1;

	/**
	 * Create the application.
	 */
	public RegApp() {
		listOfPlayers.loadPlayerDataFromFile();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame("PFA System");
		frame.setResizable(false);
		frame.setBounds(100, 100, 861, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		panelMenu_1 = new JPanel();
		frame.getContentPane().add(panelMenu_1, "name_11259099034038");
		panelMenu_1.setLayout(null);
		panelMenu_1.setVisible(true);

		final JPanel EuPlayer = new JPanel();
		frame.getContentPane().add(EuPlayer, "name_15111657676472");
		EuPlayer.setLayout(null);
		EuPlayer.setVisible(false);

		final JPanel panelNonEuPlayer = new JPanel();
		frame.getContentPane().add(panelNonEuPlayer, "name_11264371052137");
		panelNonEuPlayer.setLayout(null);
		panelNonEuPlayer.setVisible(false);

		final JPanel panelRemove = new JPanel();
		frame.getContentPane().add(panelRemove, "name_11270356646777");
		panelRemove.setLayout(null);
		panelRemove.setVisible(false);

		final JPanel panelSearchUpdate = new JPanel();
		panelSearchUpdate.setBackground(UIManager.getColor("Button.background"));
		frame.getContentPane().add(panelSearchUpdate, "name_11272531267167");
		panelSearchUpdate.setLayout(null);
		panelSearchUpdate.setVisible(false);

		final JPanel panelPlayerList = new JPanel();
		frame.getContentPane().add(panelPlayerList, "name_11546601240735");
		panelPlayerList.setLayout(null);
		panelPlayerList.setVisible(false);

		// ------------------------------------------------------------------------------------------------------------------------------

		panelListAllPlayers_1 = new JPanel();
		panelListAllPlayers_1.setToolTipText("");
		frame.getContentPane().add(panelListAllPlayers_1, "name_104075274280111");
		panelListAllPlayers_1.setLayout(null);
		panelListAllPlayers_1.setVisible(false);

		JLabel lblEnterPpsNumber_1 = new JLabel("Enter PPS Number Of The ");
		lblEnterPpsNumber_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterPpsNumber_1.setBackground(UIManager.getColor("Button.darkShadow"));
		lblEnterPpsNumber_1.setBounds(21, 11, 223, 26);
		panelSearchUpdate.add(lblEnterPpsNumber_1);

		textField_23 = new JTextField();
		textField_23.setBounds(264, 27, 137, 31);
		panelSearchUpdate.add(textField_23);
		textField_23.setColumns(10);

		JButton btnName = new JButton("First Name");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player playerDetails;
				String pps = textField_23.getText();
				playerDetails = listOfPlayers.updateDetail(pps);
				try {
					String name = JOptionPane.showInputDialog(panelSearchUpdate, "Update Name");
					playerDetails.setfName(name);
				} catch (Exception d) {

					JOptionPane.showMessageDialog(null, "Must Change a detail");
				}

			}
		});
		btnName.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnName.setBackground(UIManager.getColor("Button.darkShadow"));
		btnName.setBounds(161, 108, 155, 31);
		panelSearchUpdate.add(btnName);

		JButton btnSurname = new JButton("Surname");
		btnSurname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player playerDetails;
				String pps = textField_23.getText();
				playerDetails = listOfPlayers.updateDetail(pps);
				try {
					String surname = JOptionPane.showInputDialog(panelSearchUpdate, "Update Surname");
					playerDetails.setlName(surname);
				} catch (Exception d) {

					JOptionPane.showMessageDialog(null, "Must Change a detail");
				}

			}
		});
		btnSurname.setBackground(UIManager.getColor("Button.darkShadow"));
		btnSurname.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSurname.setBounds(418, 106, 155, 33);
		panelSearchUpdate.add(btnSurname);

		JLabel lblPlayerYouWant = new JLabel("Player You Want To Update");
		lblPlayerYouWant.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlayerYouWant.setBounds(21, 45, 204, 26);
		panelSearchUpdate.add(lblPlayerYouWant);

		JButton btnNewButton_1 = new JButton("PPS Number");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player playerDetails;
				String pps = textField_23.getText();
				playerDetails = listOfPlayers.updateDetail(pps);
				try {
					String ppsNum = JOptionPane.showInputDialog(panelSearchUpdate, "Update PPS Number");
					playerDetails.setPpsNum(ppsNum);
				} catch (Exception d) {

					JOptionPane.showMessageDialog(null, "Must Change a detail");
				}

			}
		});
		btnNewButton_1.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(654, 107, 147, 32);
		panelSearchUpdate.add(btnNewButton_1);

		JButton btnPhoneNumber = new JButton("Phone Number");
		btnPhoneNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player playerDetails;
				String pps = textField_23.getText();

				playerDetails = listOfPlayers.updateDetail(pps);
				try {
					String phoneNum = JOptionPane.showInputDialog(panelSearchUpdate, "Update Phone Number");
					playerDetails.setPhoneNum(phoneNum);
				} catch (Exception d) {

					JOptionPane.showMessageDialog(null, "Must Change a detail");
				}
			}
		});
		btnPhoneNumber.setBackground(UIManager.getColor("Button.darkShadow"));
		btnPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPhoneNumber.setBounds(401, 170, 183, 33);
		panelSearchUpdate.add(btnPhoneNumber);

		JButton btnNewButton_2 = new JButton("D.O.B");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player playerDetails;
				String pps = textField_23.getText();
				playerDetails = listOfPlayers.updateDetail(pps);
				try {
					String dob = JOptionPane.showInputDialog(panelSearchUpdate, "Update D.O.B");
					playerDetails.setDob(dob);
				} catch (Exception d) {

					JOptionPane.showMessageDialog(null, "Must Change a detail");
				}
			}
		});
		btnNewButton_2.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(179, 170, 137, 33);
		panelSearchUpdate.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Salary");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player playerDetails;
				String pps = textField_23.getText();
				playerDetails = listOfPlayers.updateDetail(pps);
				try {
					double salary = Double.parseDouble(JOptionPane.showInputDialog(panelSearchUpdate, "Update Salary"));
					playerDetails.setSalary(salary);
				} catch (Exception d) {

					JOptionPane.showMessageDialog(null, "Must Change a detail");
				}
			}
		});
		btnNewButton_3.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(654, 171, 121, 32);
		panelSearchUpdate.add(btnNewButton_3);

		JLabel lblPressToUpdate = new JLabel("Press to update a field");
		lblPressToUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPressToUpdate.setBounds(375, 64, 245, 31);
		panelSearchUpdate.add(lblPressToUpdate);

		JButton btnNewButton_4 = new JButton("Town");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player playerDetails;
				String pps = textField_23.getText();
				playerDetails = listOfPlayers.updateDetail(pps);
				try {
					String town = JOptionPane.showInputDialog(panelSearchUpdate, "Update Town");
					playerDetails.setTown(town);
				} catch (Exception d) {

					JOptionPane.showMessageDialog(null, "Must Change a detail");
				}

			}
		});
		btnNewButton_4.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.setBounds(179, 228, 137, 31);
		panelSearchUpdate.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("City");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player playerDetails;
				String pps = textField_23.getText();
				playerDetails = listOfPlayers.updateDetail(pps);
				try {
					String city = JOptionPane.showInputDialog(panelSearchUpdate, "Update City");
					playerDetails.setCity(city);
				} catch (Exception d) {

					JOptionPane.showMessageDialog(null, "Must Change a detail");
				}
			}
		});
		btnNewButton_5.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5.setBounds(340, 228, 109, 31);
		panelSearchUpdate.add(btnNewButton_5);

		JButton btnCounty = new JButton("County");
		btnCounty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player playerDetails;
				String pps = textField_23.getText();
				playerDetails = listOfPlayers.updateDetail(pps);
				try {
					String county = JOptionPane.showInputDialog(panelSearchUpdate, "Update County");
					playerDetails.setCounty(county);
				} catch (Exception d) {

					JOptionPane.showMessageDialog(null, "Must Change a detail");
				}
			}
		});
		btnCounty.setBackground(UIManager.getColor("Button.darkShadow"));
		btnCounty.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCounty.setBounds(500, 228, 109, 31);
		panelSearchUpdate.add(btnCounty);

		JButton btnNationality = new JButton("Nationality");
		btnNationality.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player playerDetails;
				String pps = textField_23.getText();
				playerDetails = listOfPlayers.updateDetail(pps);
				try {
					String nationality = JOptionPane.showInputDialog(panelSearchUpdate, "Update Nationality");
					playerDetails.setNationality(nationality);
				} catch (Exception d) {

					JOptionPane.showMessageDialog(null, "Must Change a detail");
				}

			}
		});
		btnNationality.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNationality.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNationality.setBounds(654, 228, 147, 31);
		panelSearchUpdate.add(btnNationality);

		JButton btnWorkPermit = new JButton("Work Permit");
		btnWorkPermit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player playerDetails;
				String pps = textField_23.getText();
				playerDetails = listOfPlayers.updateDetail(pps);
				try {
					String workPermit = JOptionPane.showInputDialog(panelSearchUpdate, "Update Work-Permit");
					((NonEuPlayer) playerDetails).setWorkPermit(workPermit);
				} catch (Exception d) {

					JOptionPane.showMessageDialog(null, "Must Change a detail");
				}
			}
		});
		btnWorkPermit.setBackground(UIManager.getColor("Button.darkShadow"));
		btnWorkPermit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnWorkPermit.setBounds(654, 297, 168, 33);
		panelSearchUpdate.add(btnWorkPermit);

		JButton btnTeam = new JButton("Team");
		btnTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player playerDetails;
				String pps = textField_23.getText();
				playerDetails = listOfPlayers.updateDetail(pps);
				try {
					String team = JOptionPane.showInputDialog(panelSearchUpdate, "Update Team");
					playerDetails.setTeam(team);
				} catch (Exception d) {

					JOptionPane.showMessageDialog(null, "Must Change a detail");
				}
			}
		});
		btnTeam.setBackground(UIManager.getColor("Button.darkShadow"));
		btnTeam.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnTeam.setBounds(220, 302, 96, 28);
		panelSearchUpdate.add(btnTeam);

		JButton btnContract = new JButton("Contract");
		btnContract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player playerDetails;
				String pps = textField_23.getText();

				playerDetails = listOfPlayers.updateDetail(pps);
				try {
					int contract = Integer.parseInt(JOptionPane.showInputDialog(panelSearchUpdate, "Update Contract"));
					playerDetails.setContract(contract);
				} catch (Exception d) {

					JOptionPane.showMessageDialog(null, "Must Change a detail");
				}

			}
		});
		btnContract.setBackground(UIManager.getColor("Button.darkShadow"));
		btnContract.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnContract.setBounds(438, 298, 135, 31);
		panelSearchUpdate.add(btnContract);

		JButton btnMenu_5 = new JButton("Menu");
		btnMenu_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSearchUpdate.setVisible(false);
				panelMenu_1.setVisible(true);
			}
		});
		btnMenu_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMenu_5.setBackground(UIManager.getColor("Button.darkShadow"));
		btnMenu_5.setBounds(438, 375, 111, 31);
		panelSearchUpdate.add(btnMenu_5);

		JButton btnNewButton_6 = new JButton("Search");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pps = textField_23.getText();
				Player playerDetails;

				playerDetails = listOfPlayers.updateDetail(pps);

				if (playerDetails == null) {
					JOptionPane.showMessageDialog(null, "Not a Valid PPS Number, Must Enter Valid PPS Number");
				} else if (playerDetails != null) {

					JOptionPane.showMessageDialog(null, playerDetails.toString());
				}
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_6.setBounds(484, 27, 89, 31);
		panelSearchUpdate.add(btnNewButton_6);

		JButton btnMenu_3 = new JButton("Menu");
		btnMenu_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPlayerList.setVisible(false);
				panelMenu_1.setVisible(true);
			}
		});
		btnMenu_3.setBackground(UIManager.getColor("Button.darkShadow"));
		btnMenu_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMenu_3.setBounds(366, 244, 110, 32);
		panelPlayerList.add(btnMenu_3);

		JButton btnSearchPpsNumber = new JButton("Search PPS Number");
		btnSearchPpsNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSearchPpsNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String playerDetails;

				String pps = textField_22.getText();
				playerDetails = listOfPlayers.ListAPlayer(pps);

				if (playerDetails == "") {
					JOptionPane.showMessageDialog(null, "No PPS Number Entered or Invaild PPS Number");
				} else {
					JOptionPane.showMessageDialog(null, playerDetails);
				}

			}
		});
		btnSearchPpsNumber.setBackground(UIManager.getColor("Button.darkShadow"));
		btnSearchPpsNumber.setBounds(10, 245, 235, 31);
		panelPlayerList.add(btnSearchPpsNumber);

		JLabel lblEnterPpsNumber = new JLabel("Enter PPS Number");
		lblEnterPpsNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterPpsNumber.setBounds(10, 211, 170, 23);
		panelPlayerList.add(lblEnterPpsNumber);

		textField_22 = new JTextField();
		textField_22.setBounds(229, 211, 110, 21);
		panelPlayerList.add(textField_22);
		textField_22.setColumns(10);
		panelPlayerList.setVisible(false);

		JButton btnEuPlayerRegistration = new JButton("Eu Player Registration");
		btnEuPlayerRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EuPlayer.setVisible(true);
				panelMenu_1.setVisible(false);
			}
		});
		btnEuPlayerRegistration.setBackground(UIManager.getColor("Button.darkShadow"));
		btnEuPlayerRegistration.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnEuPlayerRegistration.setBounds(27, 111, 354, 47);
		panelMenu_1.add(btnEuPlayerRegistration);

		JButton btnNonEuPlayer = new JButton("Non Eu Player Registration");
		btnNonEuPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelNonEuPlayer.setVisible(true);
				panelMenu_1.setVisible(false);

			}
		});
		btnNonEuPlayer.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNonEuPlayer.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnNonEuPlayer.setBounds(397, 111, 420, 47);
		panelMenu_1.add(btnNonEuPlayer);

		JButton btnPfaPlayerRegistration = new JButton("PFA Player Registration Menu");
		btnPfaPlayerRegistration.setBackground(UIManager.getColor("Button.darkShadow"));
		btnPfaPlayerRegistration.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnPfaPlayerRegistration.setBounds(191, 28, 472, 47);
		panelMenu_1.add(btnPfaPlayerRegistration);

		JButton btnUpdatePlayer = new JButton("Update Player");
		btnUpdatePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSearchUpdate.setVisible(true);
				panelMenu_1.setVisible(false);
			}
		});
		btnUpdatePlayer.setBackground(UIManager.getColor("Button.darkShadow"));
		btnUpdatePlayer.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnUpdatePlayer.setBounds(71, 201, 273, 47);
		panelMenu_1.add(btnUpdatePlayer);

		JButton btnRemovePlayer = new JButton("Remove Player");
		btnRemovePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				panelRemove.setVisible(true);
				panelMenu_1.setVisible(false);
			}
		});
		btnRemovePlayer.setBackground(UIManager.getColor("Button.darkShadow"));
		btnRemovePlayer.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnRemovePlayer.setBounds(493, 201, 273, 47);
		panelMenu_1.add(btnRemovePlayer);

		JButton btnListPlayers = new JButton("List Player");
		btnListPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPlayerList.setVisible(true);
				panelMenu_1.setVisible(false);

			}
		});
		btnListPlayers.setBackground(UIManager.getColor("Button.darkShadow"));
		btnListPlayers.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnListPlayers.setBounds(103, 279, 209, 47);
		panelMenu_1.add(btnListPlayers);

		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				listOfPlayers.savePlayerToFromFile();
				frame.dispose();
			}
		});

		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnNewButton.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton.setBounds(367, 363, 106, 47);
		panelMenu_1.add(btnNewButton);

		JButton btnListPlayers_1 = new JButton("List Players");
		btnListPlayers_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				panelListAllPlayers_1.setVisible(true);
				panelMenu_1.setVisible(false);

			}
		});
		btnListPlayers_1.setBackground(UIManager.getColor("Button.darkShadow"));
		btnListPlayers_1.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnListPlayers_1.setBounds(535, 279, 202, 47);
		panelMenu_1.add(btnListPlayers_1);

		JLabel lblEuPlayerRegister = new JLabel("Eu Player Register");
		lblEuPlayerRegister.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEuPlayerRegister.setBounds(271, 11, 228, 29);
		EuPlayer.add(lblEuPlayerRegister);

		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFirstName.setBounds(39, 51, 116, 19);
		EuPlayer.add(lblFirstName);

		textField_11 = new JTextField();
		textField_11.setBounds(222, 51, 120, 20);
		EuPlayer.add(textField_11);
		textField_11.setColumns(10);

		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSurname.setBounds(461, 51, 97, 18);
		EuPlayer.add(lblSurname);

		textField_12 = new JTextField();
		textField_12.setBounds(592, 53, 121, 20);
		EuPlayer.add(textField_12);
		textField_12.setColumns(10);

		JLabel lblDob = new JLabel("D.O.B:");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDob.setBounds(39, 89, 97, 20);
		EuPlayer.add(lblDob);

		textField_13 = new JTextField();
		textField_13.setBounds(221, 93, 121, 19);
		EuPlayer.add(textField_13);
		textField_13.setColumns(10);

		JLabel lblPpsNumber_2 = new JLabel("PPS Number");
		lblPpsNumber_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPpsNumber_2.setBounds(461, 85, 117, 29);
		EuPlayer.add(lblPpsNumber_2);

		textField_14 = new JTextField();
		textField_14.setBounds(592, 92, 121, 20);
		EuPlayer.add(textField_14);
		textField_14.setColumns(10);

		JLabel lblPhoneNumber_1 = new JLabel("Phone Number:");
		lblPhoneNumber_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPhoneNumber_1.setBounds(39, 132, 146, 20);
		EuPlayer.add(lblPhoneNumber_1);

		textField_15 = new JTextField();
		textField_15.setBounds(221, 129, 121, 23);
		EuPlayer.add(textField_15);
		textField_15.setColumns(10);

		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSalary.setBounds(461, 129, 97, 27);
		EuPlayer.add(lblSalary);

		textField_16 = new JTextField();
		textField_16.setBounds(592, 135, 121, 20);
		EuPlayer.add(textField_16);
		textField_16.setColumns(10);

		JLabel lblAddress_1 = new JLabel("Address");
		lblAddress_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAddress_1.setBounds(332, 180, 97, 23);
		EuPlayer.add(lblAddress_1);

		JLabel lblTown = new JLabel("Street:");
		lblTown.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTown.setBounds(90, 226, 65, 23);
		EuPlayer.add(lblTown);

		textField_17 = new JTextField();
		textField_17.setBounds(221, 229, 121, 23);
		EuPlayer.add(textField_17);
		textField_17.setColumns(10);

		JLabel lblCity_1 = new JLabel("Town:");
		lblCity_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCity_1.setBounds(461, 225, 71, 25);
		EuPlayer.add(lblCity_1);

		textField_18 = new JTextField();
		textField_18.setBounds(592, 229, 121, 22);
		EuPlayer.add(textField_18);
		textField_18.setColumns(10);

		JLabel lblCounty_1 = new JLabel("County:");
		lblCounty_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCounty_1.setBounds(90, 276, 86, 23);
		EuPlayer.add(lblCounty_1);

		textField_19 = new JTextField();
		textField_19.setBounds(221, 279, 121, 23);
		EuPlayer.add(textField_19);
		textField_19.setColumns(10);

		JLabel lblNationality_1 = new JLabel("Nationality:");
		lblNationality_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNationality_1.setBounds(461, 274, 110, 26);
		EuPlayer.add(lblNationality_1);

		textField_20 = new JTextField();
		textField_20.setBounds(592, 279, 121, 23);
		EuPlayer.add(textField_20);
		textField_20.setColumns(10);

		JButton btnAddPlayer_1 = new JButton("Add Player");

		btnAddPlayer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boolean ifPlayerIsAdded;
				try {
					String fName = textField_11.getText();
					String lName = textField_12.getText();
					String dob = textField_13.getText();
					String ppsNum = textField_14.getText();
					String phoneNum = textField_15.getText();
					String salary = (textField_16.getText());
					String town = textField_17.getText();
					String city = textField_18.getText();
					String county = textField_19.getText();
					String nationality = textField_20.getText();
					String team = textField_26.getText();
					String contract = textField_27.getText();

					Player player = new Player(fName, lName, dob, ppsNum, phoneNum, salary, town, city, county,
							nationality, team, contract);
					ifPlayerIsAdded = listOfPlayers.addPlayer(player);
					if (ifPlayerIsAdded == true) {
						JOptionPane.showMessageDialog(null, "Player added");
					} else {

						JOptionPane.showMessageDialog(null, "Player With That PPS Number Already Exist's");
					}
				} catch (NumberFormatException e7) {

					JOptionPane.showMessageDialog(null,
							"Must Enter a Number and Fill in Details Before You Add a Player");
				} catch (IllegalArgumentException e7) {

					JOptionPane.showMessageDialog(null, e7.getMessage());
				}

			}

		});
		btnAddPlayer_1.setBackground(UIManager.getColor("Button.darkShadow"));
		btnAddPlayer_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAddPlayer_1.setBounds(38, 397, 117, 34);
		EuPlayer.add(btnAddPlayer_1);

		JButton btnMenu = new JButton("Menu");
		btnMenu.setBackground(UIManager.getColor("Button.darkShadow"));
		btnMenu.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				EuPlayer.setVisible(false);
				panelMenu_1.setVisible(true);
			}
		});
		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMenu.setBounds(721, 398, 97, 31);
		EuPlayer.add(btnMenu);

		JLabel lblTeam_1 = new JLabel("Team:");
		lblTeam_1.setBackground(UIManager.getColor("Button.darkShadow"));
		lblTeam_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTeam_1.setBounds(90, 339, 65, 24);
		EuPlayer.add(lblTeam_1);

		textField_26 = new JTextField();
		textField_26.setBounds(221, 343, 121, 23);
		EuPlayer.add(textField_26);
		textField_26.setColumns(10);

		JLabel lblContract_1 = new JLabel("Contract:");
		lblContract_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblContract_1.setBounds(461, 337, 97, 29);
		EuPlayer.add(lblContract_1);

		textField_27 = new JTextField();
		textField_27.setBounds(592, 343, 121, 23);
		EuPlayer.add(textField_27);
		textField_27.setColumns(10);

		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(72, 49, 125, 29);
		panelNonEuPlayer.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(249, 56, 105, 20);
		panelNonEuPlayer.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Surname");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(467, 49, 113, 29);
		panelNonEuPlayer.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setBounds(637, 54, 105, 20);
		panelNonEuPlayer.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("D.O.B");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(72, 92, 73, 29);
		panelNonEuPlayer.add(lblNewLabel_2);

		textField_2 = new JTextField();
		textField_2.setBounds(249, 99, 105, 20);
		panelNonEuPlayer.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(637, 97, 105, 20);
		panelNonEuPlayer.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblPpsNumber = new JLabel("PPS Number");
		lblPpsNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPpsNumber.setBounds(466, 92, 133, 29);
		panelNonEuPlayer.add(lblPpsNumber);

		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPhoneNumber.setBounds(72, 136, 167, 29);
		panelNonEuPlayer.add(lblPhoneNumber);

		textField_4 = new JTextField();
		textField_4.setBounds(249, 143, 105, 20);
		panelNonEuPlayer.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblPpsNumber_1 = new JLabel("Salary");
		lblPpsNumber_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPpsNumber_1.setBounds(467, 136, 86, 29);
		panelNonEuPlayer.add(lblPpsNumber_1);

		textField_5 = new JTextField();
		textField_5.setBounds(637, 140, 105, 20);
		panelNonEuPlayer.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddress.setBounds(344, 182, 104, 29);
		panelNonEuPlayer.add(lblAddress);

		JLabel lblNewLabel_3 = new JLabel("Town");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(72, 218, 86, 20);
		panelNonEuPlayer.add(lblNewLabel_3);

		textField_6 = new JTextField();
		textField_6.setBounds(249, 222, 105, 20);
		panelNonEuPlayer.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCity.setBounds(467, 235, 73, 29);
		panelNonEuPlayer.add(lblCity);

		textField_7 = new JTextField();
		textField_7.setBounds(637, 222, 105, 20);
		panelNonEuPlayer.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblCounty = new JLabel("County");
		lblCounty.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCounty.setBounds(72, 267, 86, 29);
		panelNonEuPlayer.add(lblCounty);

		textField_9 = new JTextField();
		textField_9.setBounds(637, 276, 105, 20);
		panelNonEuPlayer.add(textField_9);
		textField_9.setColumns(10);

		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNationality.setBounds(467, 275, 113, 29);
		panelNonEuPlayer.add(lblNationality);

		textField_8 = new JTextField();
		textField_8.setBounds(249, 272, 105, 20);
		panelNonEuPlayer.add(textField_8);
		textField_8.setColumns(10);

		JLabel lblWorkpermitNumber = new JLabel("Workpermit Number");
		lblWorkpermitNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWorkpermitNumber.setBounds(72, 363, 217, 31);
		panelNonEuPlayer.add(lblWorkpermitNumber);

		textField_10 = new JTextField();
		textField_10.setBounds(343, 371, 105, 20);
		panelNonEuPlayer.add(textField_10);
		textField_10.setColumns(10);

		JButton btnAddPlayer = new JButton("Add Player");
		btnAddPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) throws NumberFormatException {
				boolean ifPlayerIsAdded;
				try {
					String fName = textField.getText();
					String lName = textField_1.getText();
					String dob = textField_2.getText();
					String ppsNum = textField_3.getText();
					String phoneNum = textField_4.getText();
					String salary = (textField_5.getText());
					String town = textField_6.getText();
					String city = textField_7.getText();
					String county = textField_8.getText();
					String nationality = textField_9.getText();
					String workPermitNum = textField_10.getText();
					String team = textField_24.getText();
					String contract = (textField_25.getText());

					NonEuPlayer player = new NonEuPlayer(fName, lName, dob, ppsNum, phoneNum, salary, town, city,
							county, nationality, team, contract, workPermitNum);

					ifPlayerIsAdded = listOfPlayers.addPlayer(player);

					if (ifPlayerIsAdded == true) {
						JOptionPane.showMessageDialog(null, "Player Added");
					} else {

						JOptionPane.showMessageDialog(null, "Player With That PPS Number Already Exist's");
					}
				} catch (NumberFormatException e7) {

					JOptionPane.showMessageDialog(null,
							"Must Enter a Number and Fill in Details Before You Add a Player");

				} catch (IllegalArgumentException e5) {

					JOptionPane.showMessageDialog(null, e5.getMessage());
				}
			}

		});

		btnAddPlayer.setBackground(UIManager.getColor("Button.darkShadow"));
		btnAddPlayer.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAddPlayer.setBounds(510, 396, 162, 35);
		panelNonEuPlayer.add(btnAddPlayer);

		JLabel lblNonEuPlayer = new JLabel("Non Eu Player");
		lblNonEuPlayer.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNonEuPlayer.setBounds(324, 11, 203, 31);
		panelNonEuPlayer.add(lblNonEuPlayer);

		JButton btnMenu_1 = new JButton("Menu");
		btnMenu_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				panelNonEuPlayer.setVisible(false);
				panelMenu_1.setVisible(true);
			}
		});
		btnMenu_1.setBackground(UIManager.getColor("Button.darkShadow"));
		btnMenu_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMenu_1.setBounds(710, 396, 104, 35);
		panelNonEuPlayer.add(btnMenu_1);

		JLabel lblTeam = new JLabel("Team");
		lblTeam.setBackground(UIManager.getColor("Button.darkShadow"));
		lblTeam.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTeam.setBounds(72, 318, 86, 19);
		panelNonEuPlayer.add(lblTeam);

		textField_24 = new JTextField();
		textField_24.setBounds(249, 320, 105, 20);
		panelNonEuPlayer.add(textField_24);
		textField_24.setColumns(10);

		JLabel lblContract = new JLabel("Contract");
		lblContract.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblContract.setBounds(467, 320, 97, 20);
		panelNonEuPlayer.add(lblContract);

		textField_25 = new JTextField();
		textField_25.setBounds(637, 320, 105, 20);
		panelNonEuPlayer.add(textField_25);
		textField_25.setColumns(10);

		JLabel lblPleaseEnterThe = new JLabel("Please Enter The PPS Number ");
		lblPleaseEnterThe.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPleaseEnterThe.setBounds(334, 27, 275, 35);
		panelRemove.add(lblPleaseEnterThe);

		JButton btnSearch = new JButton("Remove");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boolean removePlayer;

				String ppsNum = textField_21.getText();
				removePlayer = listOfPlayers.removePlayer(ppsNum);
				if (removePlayer == true) {
					JOptionPane.showMessageDialog(null, "Player Removed");
				} else {

					JOptionPane.showMessageDialog(null, "No Such Player Found");
				}
			}
		});

		btnSearch.setBackground(UIManager.getColor("Button.darkShadow"));
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSearch.setBounds(412, 246, 131, 42);
		panelRemove.add(btnSearch);

		textField_21 = new JTextField();
		textField_21.setBounds(412, 117, 131, 32);
		panelRemove.add(textField_21);
		textField_21.setColumns(10);

		JLabel lblOfTheLayer = new JLabel("Of The Palyer  You Are Looking For");
		lblOfTheLayer.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOfTheLayer.setBounds(303, 71, 359, 35);
		panelRemove.add(lblOfTheLayer);

		JButton btnMenu_2 = new JButton("Menu");
		btnMenu_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelRemove.setVisible(false);
				panelMenu_1.setVisible(true);
			}
		});
		btnMenu_2.setBackground(UIManager.getColor("Button.darkShadow"));
		btnMenu_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMenu_2.setBounds(412, 316, 131, 42);
		panelRemove.add(btnMenu_2);

		JButton btnSearch_1 = new JButton("Search");
		btnSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String playerDetails;

				String pps = textField_21.getText();
				playerDetails = listOfPlayers.ListAPlayer(pps);
				if (playerDetails == "") {
					JOptionPane.showMessageDialog(null, "No PPS Number Entered or Invaild PPS Number");

				} else {
					JOptionPane.showMessageDialog(null, playerDetails);
				}
			}
		});
		btnSearch_1.setBackground(UIManager.getColor("Button.darkShadow"));
		btnSearch_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSearch_1.setBounds(412, 181, 131, 42);
		panelRemove.add(btnSearch_1);

		JLabel lblListOfAll = new JLabel("List of all Players ");
		lblListOfAll.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblListOfAll.setBounds(335, 0, 169, 24);
		panelListAllPlayers_1.add(lblListOfAll);

		JButton btnMenu_4 = new JButton("Menu");
		btnMenu_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelListAllPlayers_1.setVisible(false);
				panelMenu_1.setVisible(true);
			}
		});
		btnMenu_4.setBackground(UIManager.getColor("Button.darkShadow"));
		btnMenu_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMenu_4.setBounds(729, 408, 106, 23);
		panelListAllPlayers_1.add(btnMenu_4);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setBounds(36, 46, 783, 351);
		panelListAllPlayers_1.add(scrollPane_2);

		JList list_l = new JList();
		scrollPane_2.setViewportView(list_l);

		JButton btnListPlayers_2 = new JButton("List Players");
		btnListPlayers_2.setVerticalTextPosition(SwingConstants.TOP);
		btnListPlayers_2.setVerticalAlignment(SwingConstants.TOP);
		btnListPlayers_2.setAlignmentY(Component.TOP_ALIGNMENT);
		btnListPlayers_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Player> playerList;
				playerList = listOfPlayers.listAllPlayers();

				DefaultListModel<String> l = new DefaultListModel<>();
				list_l.setModel(l);

				for (Player p : playerList)
					l.addElement(p.toStringPlayers());

			}

		});
		btnListPlayers_2.setBackground(UIManager.getColor("Button.darkShadow"));
		btnListPlayers_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnListPlayers_2.setBounds(23, 408, 106, 24);
		panelListAllPlayers_1.add(btnListPlayers_2);

	}
	
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			List<Beer> tempBeerList;
			tempBeerList = beerList.returnBeer();

			DefaultListModel<String> l = new DefaultListModel<>();
			list.setModel(l);

			for (Beer b : tempBeerList)
				l.addElement(b.toString());

		}
	});
	btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
	btnNewButton_1.setBounds(167, 133, 141, 33);
	contentPane.add(btnNewButton_1);

	JButton btnNewButton_2 = new JButton("DELETE");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			boolean deleted;

			deleted = beerList.remove(Integer.parseInt(barcode.getText()));
			if (deleted == true)

			{

				JOptionPane.showMessageDialog(null, "Beer Removed");
			} else

			{

				JOptionPane.showMessageDialog(null, "Beer not Removed");
			}

		}
	});
	btnNewButton_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
	btnNewButton_2.setBounds(24, 133, 110, 33);
	contentPane.add(btnNewButton_2);

	JButton btnNewButton = new JButton("UPDATE");
	btnNewButton.
}
