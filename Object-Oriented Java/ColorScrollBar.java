//This program displays a text that the user can manipulate by changing
//the calue of the scrollbars. The scrollbars represent the colors red, green and blue.

import java.awt.*;
import java.awt.event.*;	
import javax.swing.*;

class ColorScrollBar extends JFrame implements AdjustmentListener {

	private JScrollBar RedScroll, GreenScroll, BlueScroll;	
	private JLabel TextRed, TextGreen, TextBlue;
	private JPanel Text;
	private JPanel p1;

	public ColorScrollBar() {

		super("Tekst i farger"); //Headline for program window
		
		//Creating the panel to hold the objects
		
		p1 = new JPanel();
		getContentPane().add(p1);
	
		// Creating scrollbars and labels for the red scrollbar
		
		TextRed = new JLabel("Red");
		TextRed.setPreferredSize(new Dimension(125, 10));
		p1.add(TextRed);
		
		RedScroll = new JScrollBar(SwingConstants.HORIZONTAL, 0, 0, 0, 255);
		RedScroll.setPreferredSize(new Dimension(220, 20));
		RedScroll.addAdjustmentListener(this);
		p1.add(RedScroll);
		
		// Creating scrollbars and labels for the Green scrollbar
		
		TextGreen = new JLabel("Green");
		TextGreen.setPreferredSize(new Dimension(125, 10));
		p1.add(TextGreen);

		GreenScroll = new JScrollBar(SwingConstants.HORIZONTAL, 0, 0, 0, 255);
		GreenScroll.setPreferredSize(new Dimension(220, 20));
		GreenScroll.addAdjustmentListener(this);
		p1.add(GreenScroll);
		
		// Creating scrollbars and labels for the red scrollbar
	
		TextBlue = new JLabel("Blue");
		TextBlue.setPreferredSize(new Dimension(125, 10));
		p1.add(TextBlue);

		BlueScroll = new JScrollBar(SwingConstants.HORIZONTAL, 0, 0, 0, 255);
		BlueScroll.setPreferredSize(new Dimension(220, 20));
		BlueScroll.addAdjustmentListener(this);
		p1.add(BlueScroll);

		
		//Use messagepanel to display text. The text changes color depending on the user interferences
		Text = new MessagePanel(); 
		Font font = new Font("", Font.BOLD, 12);
		Text.setFont(font);
		Text.setForeground(new Color(0, 0, 0));
		p1.add(Text, BorderLayout.CENTER); //Adding the text to the panel
	}
	
	public class MessagePanel extends JPanel { //MessagePanel.java imported from example files for DA-OBP 1000, provided by Helge Herheim
		/** The message to be displayed */
		private String message = "Tekst i Farger";
		
		/** The x coordinate where the message is displayed */
		private int xCoordinate = 50;

		/** The y coordinate where the message is displayed */
		private int yCoordinate =25;

		/** Indicate whether the message is displayed in the center */
		private boolean centered;

		/**
		 * The interval for moving the message horizontally and vertically
		 */
		private int interval = 20;

		/** Construct with default properties */
		public MessagePanel() {
		}

		/** Construct a message panel with a specified message */
		public MessagePanel(String message) {
			this.message = message;
		}

		/** Return message */
		public String getMessage() {
			return message;
		}

		/** Set a new message */
		public void setMessage(String message) {
			this.message = message;
			repaint();
		}

		/** Return xCoordinator */
		public int getXCoordinate() {
			return xCoordinate;
		}

		/** Set a new xCoordinator */
		public void setXCoordinate(int x) {
			this.xCoordinate = x;
			repaint();
		}

		/** Return yCoordinator */
		public int getYCoordinate() {
			return yCoordinate;
		}

		/** Set a new yCoordinator */
		public void setYCoordinate(int y) {
			this.yCoordinate = y;
			repaint();
		}

		/** Return centered */
		public boolean isCentered() {
			return centered;
		}

		/** Set a new centered */
		public void setCentered(boolean centered) {
			this.centered = centered;
			repaint();
		}

		/** Return interval */
		public int getInterval() {
			return interval;
		}

		/** Set a new interval */
		public void setInterval(int interval) {
			this.interval = interval;
			repaint();
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			if (centered) {
				// Get font metrics for the current font
				FontMetrics fm = g.getFontMetrics();

				// Find the center location to display
				int stringWidth = fm.stringWidth(message);
				int stringAscent = fm.getAscent();
				// Get the position of the leftmost character in the baseline
				xCoordinate = getWidth() / 2 - stringWidth / 2;
				yCoordinate = getHeight() / 2 + stringAscent / 2;
			}

			g.drawString(message, xCoordinate, yCoordinate);
		}

		/** Move the message left */
		public void moveLeft() {
			xCoordinate -= interval;
			repaint();
		}

		/** Move the message right */
		public void moveRight() {
			xCoordinate += interval;
			repaint();
		}

		/** Move the message up */
		public void moveUp() {
			yCoordinate -= interval;
			repaint();
		}

		/** Move the message down */
		public void moveDown() {
			yCoordinate += interval;
			repaint();
		}

		/** Override get method for preferredSize */
		public Dimension getPreferredSize() {
			return new Dimension(200, 30);
		}
	}

	// Checking for scrollbar adjustments from user
	public void adjustmentValueChanged(AdjustmentEvent event) {
		// If statement chechking for which scrollbar to adjust, and set new value
		
		if (event.getSource() == RedScroll || event.getSource() == GreenScroll || event.getSource() == BlueScroll) {
			
			// Getting new value of color
			int Red = RedScroll.getValue();
			int Green = GreenScroll.getValue();
			int Blue = BlueScroll.getValue();

			// Updating the color of the text, depending on what the user has changed
			Text.setForeground(new Color(Red, Green, Blue));
			Text.repaint();
		}
	}
	
	// Main program, creating an instance of the ColorScrollBar application
	public static void main(String args[]) {
		
		ColorScrollBar frame = new ColorScrollBar();
		frame.setSize(400, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
