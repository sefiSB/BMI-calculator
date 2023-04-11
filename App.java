package com.sef1.bmi;

import javax.swing.JOptionPane;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        Object[] selectionweight = { "kg", "lbs" };
        String initialSelection = "kg";
        Object selectionw = JOptionPane.showInputDialog(null, "Unit of measure(weight)",
                "BMI", JOptionPane.QUESTION_MESSAGE, null, selectionweight, initialSelection);

        Object[] selectionheight = { "cm", "inch" };
        String initialSelection2 = "cm";
        Object selectionh = JOptionPane.showInputDialog(null, "Unit of measure(height)",
                "BMI", JOptionPane.QUESTION_MESSAGE, null, selectionheight, initialSelection2);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        double weight = Integer.parseInt(JOptionPane.showInputDialog("Enter your weight:"));
        double height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height:"));

        double bmi=0;
        if (age > 18) {
            if (selectionw=="lbs"){
                weight=weight*0.45359237;
            }
            if(selectionh=="inch"){
                height=height*2.54;
            }
            bmi=weight/ Math.pow(height/100, 2);

        }
        else if(age>=0 && age <=18){
            if (selectionw=="kg"){
                weight=weight/0.45359237;
            }
            if(selectionh=="cm"){
                height=height/2.54;
            }

            bmi = weight*703 / Math.pow(height,2);
        }
        else{
            JOptionPane.showMessageDialog(null, "Age must be greater than -1");
        }
        JOptionPane.showMessageDialog(null, "Your BMI is " + bmi);

    }

}

/*if (selectionw == "kg") {

    if (selectionh == "cm") {
        bmi = weight / (Math.pow(height / 100, 2));

    } else {
       
        bmi = weight / (Math.pow((height * 0.39) / 100, 2));

    }
} else {
    if (selectionh == "cm") {
        
        bmi = (weight * 0.45) / (Math.pow(height / 100, 2));

    } else {
        
        bmi = (weight * 0.45) / (Math.pow((height * 0.39) / 100, 2));

    }
}*/
