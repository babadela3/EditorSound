import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.SwingWorker;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class EditorGui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textFieldEdit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditorGui window = new EditorGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditorGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 200, 450, 300);
		frame.setSize(new Dimension(400,250));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLoad = new JButton("Load");
		
		btnLoad.setBounds(152, 91, 89, 23);
		btnLoad.setVisible(true);
		frame.getContentPane().add(btnLoad);
		
		JButton btnPush = new JButton("Push");
		
		btnPush.setBounds(152, 161, 89, 23);
		btnPush.setVisible(false);
		frame.getContentPane().add(btnPush);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(272, 161, 89, 23);
		btnSubmit.setVisible(false);
		frame.getContentPane().add(btnSubmit);
		
		textField = new JTextField();
		textField.setBackground(UIManager.getColor("Button.background"));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setVisible(false);
		textField.setBounds(10, 11, 364, 20);
		textField.setBorder(null);
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textFieldEdit = new JTextField();
		textFieldEdit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldEdit.setBounds(32, 118, 329, 20);
		textFieldEdit.setVisible(false);
		frame.getContentPane().add(textFieldEdit);
		textFieldEdit.setColumns(10);

	
		
		JButton btnPause = new JButton("");
		btnPause.setBounds(146, 52, 50, 62);
		ImageIcon pause1 = new ImageIcon(getClass().getResource("/resources/pause.png"));
		Image scalePauseImage1 = pause1.getImage().getScaledInstance(44, 44,Image.SCALE_DEFAULT);
		ImageIcon iconPause1 = new ImageIcon(scalePauseImage1);
		btnPause.setIcon(iconPause1);
		btnPause.setBorder(null);
		btnPause.setBackground(SystemColor.control);
		btnPause.setVisible(false);
		frame.getContentPane().add(btnPause);
		
		JButton btnPlay = new JButton("");
		btnPlay.setBounds(195, 52, 50, 62);
		ImageIcon play1 = new ImageIcon(getClass().getResource("/resources/play.png"));
		Image scalePlayImage1 = play1.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
		ImageIcon iconPlay1 = new ImageIcon(scalePlayImage1);
		btnPlay.setIcon(iconPlay1);
		btnPlay.setBorder(null);
		btnPlay.setBackground(SystemColor.control);
		btnPlay.setVisible(false);
		
		frame.getContentPane().add(btnPlay);
		
		
		
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>(){

					protected Void doInBackground() throws Exception {
			        
			         btnLoad.setText("Reload");
			         btnLoad.setBounds(32, 161, 89, 23);
			         btnPush.setVisible(true);
			         btnSubmit.setVisible(true);
			         textField.setText("Exercise1.mp3");
			         textField.setVisible(true);
			         textFieldEdit.setVisible(true);
			         btnPlay.setVisible(true);
			         btnPause.setVisible(true);
						
						return null;
					}
						
				};
				worker.execute();
			}
		});
		
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>(){

					protected Void doInBackground() throws Exception {
			        
			         
						
						return null;
					}
						
				};
				worker.execute();
			}
		});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>(){

					protected Void doInBackground() throws Exception {
			        

				         btnLoad.setText("Load");
				         btnLoad.setBounds(152, 91, 89, 23);
				         btnPush.setVisible(false);
				         btnSubmit.setVisible(false);
				         textField.setVisible(false);
				         textFieldEdit.setVisible(false);
				         btnPlay.setVisible(false);
				         btnPause.setVisible(false);
						
						return null;
					}
						
				};
				worker.execute();
			}
		});
		
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>(){

					protected Void doInBackground() throws Exception {
			        
			         
						
						return null;
					}
						
				};
				worker.execute();
			}
		});
		
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>(){

					protected Void doInBackground() throws Exception {
			        
			         
						
						return null;
					}
						
				};
				worker.execute();
			}
		});
	}
}
