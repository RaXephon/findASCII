import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/*
   Author: Shashwat Kapoor
 */

public class findASCII
{
	public static void changeJOP()
	{
		UIManager.put("Label.font", new FontUIResource (new Font("Arial", Font.BOLD, 58)));
		UIManager.put("OptionPane.messageForeground",new Color(255,255,255));
		UIManager.put("TextField.background",new Color(255,255,255));
		UIManager.put("TextField.font", new FontUIResource(new Font("Arail", Font.BOLD, 24)));
		UIManager.put("TextField.foreground", new Color(0,0,0));
		UIManager.put("Panel.background",new Color(0,0,0));;
		UIManager.put("OptionPane.background",new Color(255,255,255));
		UIManager.put("Button.background",new Color(255,255,255));
		UIManager.put("Button.foreground", new Color(0,0,0));
		UIManager.put("Button.font", new FontUIResource	(new Font("Arial", Font.BOLD, 14)));
	}
	
	public static void main(String[] args)
	{
		changeJOP();
		String ascii = "";
		String word = JOptionPane.showInputDialog("Enter your character");
		char character = word.charAt(0);
		ascii +=  "The ASCII code of "+pig+" is "+((int) character);
		JOptionPane.showMessageDialog(null, ascii);
	}
}
