import javax.swing.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String entry1 = JOptionPane.showInputDialog("Por favor especificar si se requiere Tipo A o Tipo B");
		System.out.println(typeMethod(entry1));
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Monteria");
		list.add("Momil");
		list.add("Moñitos");
		list.add("Lorica");
		list.add("Cerete");
		
		
		String entry2 = JOptionPane.showInputDialog("Por favor ingresar un municipio de cordoba");
		System.out.println(CheckStringList(list,entry2));
		
		
		
	}
	
	public static String typeMethod(String typeString) {
		int min = 1;
		int max = 9999999;
		int numero_random;
		if(typeString.contains("Tipo A")){
			numero_random =(int)(Math.random()*99999999+1);
			return "54" + numero_random; 
		}else if(typeString.contains("Tipo B")) {
			numero_random =(int)(Math.random()*99999999+1);
			return "08" + numero_random; 
		}else {
			return "Invalid option";
		}
	}
	
	public static boolean CheckStringList(ArrayList<String> list , String string) {
		for(String element: list) {
			if(element.contains(string)) {
				return true;
			}
		}
		return false;
	}
}
