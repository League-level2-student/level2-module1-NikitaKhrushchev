package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook implements ActionListener {
	JFrame frame;
	JTextField n = new JTextField(20);
	JPanel panel;
	String f = new String();
	String[] nameList = new String[10];
	int currentNum = 0;
	JButton addName = new JButton();
	JFrame addingPanel;
	JLabel names = new JLabel();
	JLabel l = new JLabel();
	public static void main(String[] args) {
		new GuestBook().start();
		
	}
	public void start() {
		f = "";
		frame = new JFrame();
		panel = new JPanel();
		panel.add(names);
		panel.add(addName);
		addName.setText("add name");
		addName.addActionListener(this);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void nextName() {
		addingPanel = new JFrame();
		JPanel s = new JPanel();
		
		JButton done = new JButton("Done");
		s.add(n);
		s.add(done);
		addingPanel.add(s);
		done.addActionListener(this);
		addingPanel.pack();
		addingPanel.setVisible(true);
		addingPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton s = (JButton) e.getSource();
		if(s == addName) {
		this.nextName();
		}
		else {
			nameList[currentNum] = n.getText();
			currentNum +=1;
			addingPanel.dispose();
			if(currentNum-1 > 0) {
			f = f + ", "+nameList[currentNum-1];
			}
			else {
				f = nameList[currentNum-1];
			}
			System.out.println(f);
			names.setText(f);
		}
		
	}
}
