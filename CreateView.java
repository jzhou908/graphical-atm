package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.*;

import controller.ViewManager;

@SuppressWarnings("serial")
public class CreateView extends JPanel implements ActionListener {
	
	private ViewManager manager;		// manages interactions between the views, model, and database
	private JButton submit;
	private JTextField firstname;
	private JTextField lastname;
	private JComboBox month;
	private JComboBox day;
	private JTextField year;
	private JTextField phone;
	private JTextField street;
	private JTextField zip;
	private JTextField pin;
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
		year = new JTextField("Year");
		year.setBounds(320, 55, 110, 35);
		this.add(year);
		phone = new JTextField("Phone Number");
		phone.setBounds(180, 100, 170, 35);
		this.add(phone);
		street = new JTextField("Street Address");
		//street.setBounds(205, 180, 200, 35);
		this.add(street);
		zip = new JTextField("Zip Code");
		//zip.setBounds(205, 180, 200, 35);
		this.add(zip);
		pin = new JTextField("Input a 4 digit pin");
		//pin.setBounds(205, 180, 200, 35);
		this.add(pin);
		city = new JTextField("City");
		//city.setBounds(205, 180, 200, 35);
		this.add(city);
		String[] states = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "DC", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ","NM","NY","NC","ND","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"};
		state = new JComboBox(states);
		//state.setBounds(205, 180, 200, 35);
		this.add(state);
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
		
		// TODO
		//
		// this is where you'll setup your action listener, which is responsible for
		// responding to actions the user might take in this view (an action can be a
		// user clicking a button, typing in a textfield, etc.).
		//
		// feel free to use my action listener in LoginView.java as an example.
	}
}