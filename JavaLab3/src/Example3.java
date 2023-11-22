import javax.swing.*;
public class Example3 {

	public static void main(String[] args) {
		double weight = Double.parseDouble
				(JOptionPane.showInputDialog("Input Weight:"));
		double height = Double.parseDouble
				(JOptionPane.showInputDialog("Input Height:"));
		height = height/100;
		double bmi = weight/(height*height);
		
		String bmiCategory;
		
		if (bmi<18.5) bmiCategory="Underweight"; 
		else if  (bmi<25) bmiCategory="Normal-Weight";	
		else if  (bmi<30) bmiCategory="Overweight";
		else bmiCategory = "Obesily";
		JOptionPane.showMessageDialog(null, "BMI"+String.format("%.1f",bmi)
				+"\n You're"+bmiCategory);
		
	}

}
