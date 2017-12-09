import javax.swing.*;		// Needed for Swing classes
import java.awt.event.*;			// Needed for ActionListener Interface

/**
 * The MonthlySalesTax class displays a JFrame that
 * lets the user enter the total sales for the month.
 * When the Calculate button is clicked, a dialog box is
 * displayed with the amount of county sales tax, amount
 * of state sales tax, and the total sales tax.
 */

public class MonthlySalesTax extends JFrame
{
	private JPanel panel;								// To reference a panel
	private JLabel messageLabel;						// To reference a label
	private JTextField totalTextField;					// To reference a text field
	private JButton calcButton;							// To reference a button
	private final int WINDOW_WIDTH = 310;				// Window width
	private final int WINDOW_HEIGHT = 100;				// Window height
	
	
	/**
	 * Constructor
	 */
	
	public MonthlySalesTax()
	{
		// Set the window title
		setTitle("Monthly Sales Tax");
		
		// Set the size of the window
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Build the panel and add it to the frame.
		buildPanel();
		
		// Add the panel to the frame's content pane.
		add(panel);
		
		// Display the window
		setVisible(true);
	}
	
	/**
	 * The buildPanel method adds a label, a text field,
	 * and a button to a panel.
	 */
	
	private void buildPanel()
	{
		// Create a label to display instructions.
		messageLabel = new JLabel("Enter the total sales for the month: ");
		
		// Create a text field 10 characters wide.
		totalTextField = new JTextField(10);
		
		// Create a button with the caption "Calculate."
		calcButton = new JButton("Calculate");
		
		// Add an action listener to the button.
		calcButton.addActionListener(new CalcButtonListener());
		
		// Create a JPanel object and let the panel
		// field reference it.
		panel = new JPanel();
		
		// Add the label, text field, and button
		// components to the panel.
		panel.add(messageLabel);
		panel.add(totalTextField);
		panel.add(calcButton);
	}
	
	/**
	 * CalcButtonListener is an action listener class for
	 * the Calculate button.
	 */
	
	private class CalcButtonListener implements ActionListener
	{
		/**
		 * The actionPerformed method executes when the user
		 * clicks on the Calculate button.
		 * @param e The event object.
		 */
		
		public void actionPerformed(ActionEvent e)
		{
			String input;		// User's input
			final double COUNTY_TAX_PERCENT = 0.02;		// County sales tax percent
			final double STATE_TAX_PERCENT = 0.04;		// State sales tax percent
			double monthlySales;						// Monthly sales
			double countySalesTax;						// County sales tax
			double stateSalesTax;						// State sales tax
			double totalSalesTax;						// Total sales tax
			
			// Get the text entered by the user into the
			// text field.
			input = totalTextField.getText();
			
			// Convert the input to a double
			monthlySales = Double.parseDouble(input);
			
			// Calculate the county sales tax
			countySalesTax = monthlySales * COUNTY_TAX_PERCENT;
			
			// Calculate the state sales tax
			stateSalesTax = monthlySales * STATE_TAX_PERCENT;
			
			// Calculate total sales tax
			totalSalesTax = countySalesTax + stateSalesTax;
			
			// Display the calculations
			JOptionPane.showMessageDialog(null, String.format("County Sales Tax: $%,.2f\nState Sales Tax: $%,.2f\nTotal Sales Tax: $%,.2f",
					                      countySalesTax, stateSalesTax, totalSalesTax));
		}
	}
}
