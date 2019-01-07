package view;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.*;
import model.BankAccount;
import model.User;

import controller.ViewManager;

@SuppressWarnings("serial")
public class CreateView extends JPanel implements ActionListener {
	
	private JButton quit;
	private ViewManager manager;		// manages interactions between the views, model, and database
	private JButton submit;
	private JTextField firstname;
	private JTextField lastname;
	private JComboBox month;
	private JComboBox day;
	private JFormattedTextField year;
	private JFormattedTextField phone;
	private JTextField street;
	private JFormattedTextField zip;
	private JFormattedTextField pin;
	private JComboBox state;
	private JTextField city;
	/**
	 * Constructs an instance (or object) of the CreateView class.
	 * 
	 * @param manager
	 */
	
	public CreateView(ViewManager manager) {
		super();
		
		this.manager = manager;
		initialize();
	}
	
	///////////////////// PRIVATE METHODS /////////////////////////////////////////////
	
	/*
	 * Initializes the CreateView components.
	 */
	
	private void initialize() {
		
		// TODO
		//
		// this is a placeholder for this view and should be removed once you start
		// building the CreateView.
		
		this.add(new javax.swing.JLabel("CreateView", javax.swing.SwingConstants.CENTER));
		this.setLayout(null);
		// TODO
		//
		// this is where you should build the CreateView (i.e., all the components that
		// allow the user to enter his or her information and create a new account).
		//
		// feel free to use my layout in LoginView as an example for laying out and
		// positioning your components.
		firstname = new JTextField("First Name");
		firstname.setBounds(100, 10, 150, 35);
		this.add(firstname);
		lastname = new JTextField("Last Name");
		lastname.setBounds(270, 10, 150, 35);
		this.add(lastname);
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		month = new JComboBox(months);
		month.setBounds(80, 55, 110, 35);
		this.add(month);
		String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		day = new JComboBox(days);
		day.setBounds(200, 55, 110, 35);
		this.add(day);
		try {
			MaskFormatter phoneFormat = new MaskFormatter("####");
			phoneFormat.setPlaceholderCharacter('_');
			year = new JFormattedTextField(phoneFormat);
		} catch (ParseException e) {
			year.setText("");
		}
		year.setBounds(320, 55, 110, 35);
		this.add(year);
		try {
			MaskFormatter phoneFormat = new MaskFormatter("(###) ###-####");
			phoneFormat.setPlaceholderCharacter('_');
			phone = new JFormattedTextField(phoneFormat);
		} catch (ParseException e) {
			phone.setText("");
		}
		phone.setBounds(180, 100, 170, 35);
		this.add(phone);
		street = new JTextField("Street Address");
		street.setBounds(180, 145, 110, 35);
		this.add(street);
		try {
			MaskFormatter phoneFormat = new MaskFormatter("#####");
			phoneFormat.setPlaceholderCharacter('_');
			zip = new JFormattedTextField(phoneFormat);
		} catch (ParseException e) {
			zip.setText("");
		}
		zip.setBounds(180, 190, 60, 35);
		this.add(zip);
		try {
			MaskFormatter phoneFormat = new MaskFormatter("####");
			phoneFormat.setPlaceholderCharacter('_');
			pin = new JFormattedTextField(phoneFormat);
		} catch (ParseException e) {
			pin.setText("");
		}
		pin.setBounds(180, 235, 60, 35);
		this.add(pin);
		city = new JTextField("City");
		city.setBounds(180, 280, 100, 35);
		this.add(city);
		String[] states = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "DC", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ","NM","NY","NC","ND","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"};
		state = new JComboBox(states);
		state.setBounds(180, 325, 50, 35);
		this.add(state);
		quit = new JButton("Quit");
		quit.setBounds(100, 370, 100, 35);
		quit.addActionListener(this);
		this.add(quit);
		submit = new JButton("Submit");
		submit.setBounds(220, 370, 100, 35);
		submit.addActionListener(this);
		this.add(submit);
	}
	
	/*
	 * CreateView is not designed to be serialized, and attempts to serialize will throw an IOException.
	 * 
	 * @param oos
	 * @throws IOException
	 */
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		throw new IOException("ERROR: The CreateView class is not serializable.");
	}
	
	///////////////////// OVERRIDDEN METHODS //////////////////////////////////////////
	
	/*
	 * Responds to button clicks and other actions performed in the CreateView.
	 * 
	 * @param e
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source.equals(quit)) {
			manager.switchTo(ATM.LOGIN_VIEW);
		}
		else if (source.equals(submitButton)) {
			String dob = "";
			switch (String.valueOf(day.getSelectedItem())) {
			case "January":
				dob = "01";
				break;
			case "February":
				dob = "02";
				break;
			case "March":
				dob = "03";
				break;
			case "April":
				dob = "04";
				break;
			case "May":
				dob = "05";
				break;
			case "June":
				dob = "06";
				break;
			case "July":
				dob = "07";
				break;
			case "August":
				dob = "08";
				break;
			case "September":
				dob = "09";
				break;
			case "October":
				dob = "10";
				break;
			case "November":
				dob = "11";
				break;
			case "December":
				dob = "12";
				break;
			}
			dob += String.valueOf(day.getSelectedItem()) + String.valueOf(year.getText());
			Long phone1 = Long.parseLong(String.valueOf(phone.getText().substring(1, 4) + phone.getText().substring(6, 9) + phone.getText().substring(10, 14)));
			User user = new User(Integer.parseInt(String.valueOf(pin)), Integer.parseInt(dob), phone1, firstname.getText(), lastname.getText(), street.getText(), city.getText(), String.valueOf(state.getSelectedItem()), zip.getText());
			manager.CreateAccount(user);
			manager.switchTo(ATM.HOME_VIEW);
		}
	}
}
