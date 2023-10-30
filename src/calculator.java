import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calculator implements ActionListener{

	
	JFrame frame = new JFrame("Calculator");
	
	calculator(){
		
		frame.setSize(420, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
