package kcp.spring.test;

import java.awt.FlowLayout;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class I18NTest {

	public static void main(String[] args) {
		Locale locale=null;
		ResourceBundle bundle=null;
		JFrame frame=null;
		JButton bt1=null,bt2=null,bt3=null,bt4=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter language code::");
		String lan=sc.nextLine();
		System.out.println("Enter country code::");
		String con=sc.nextLine();
		locale=new Locale(lan, con);
		bundle= ResourceBundle.getBundle("kcp/spring/commons/App",locale);
		frame=new JFrame("I18n");
		frame.setLayout(new FlowLayout());
		bt1=new JButton(bundle.getString("key1"));
		bt2=new JButton(bundle.getString("key2"));
		bt3=new JButton(bundle.getString("key3"));
		bt4=new JButton(bundle.getString("key4"));
		frame.add(bt1);frame.add(bt2);frame.add(bt3);frame.add(bt4);
		frame.setVisible(true);
		frame.pack();
		
		

	}

}
