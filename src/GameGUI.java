import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GameGUI extends JFrame
{
	private JPanel contentPane;
	public GameGUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 420);
		contentPane= new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	public void initialize()
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				setTitle("Game");
				setLocationRelativeTo(null);
				setResizable(false);
				setVisible(true);
			}
				
		});

	}
		
}