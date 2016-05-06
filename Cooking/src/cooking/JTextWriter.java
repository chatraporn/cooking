/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cooking;

import java.util.Arrays;
import cooking.calculator;

class JTextWriter extends javax.swing.JPanel
implements java.awt.event.ActionListener
{
  javax.swing.JTextArea textArea = new javax.swing.JTextArea(20,40);
  javax.swing.JButton button = new javax.swing.JButton("Write to file"); 
  
  public JTextWriter()
  {
    
    this.setPreferredSize(new java.awt.Dimension(640,480));
    this.add(textArea);
    this.add(button);
    button.addActionListener(this);
    
    
  }

  public void writeFile()
  {
      //System.out.print(textBox);
//    try
//    {
//        java.io.PrintWriter out = new java.io.PrintWriter(
//        new java.io.FileWriter("out.txt")
//      );
//      
//      out.print(textArea.getText());
//      out.close();
//
//    }
//    catch (Exception e)
//    {
//      e.printStackTrace();
//    }

  }

  public void actionPerformed(java.awt.event.ActionEvent event)
  { 
    String textBox = textArea.getText();
    //System.out.println(Arrays.toString(textForCal.split("[.]")));
    
    calculator call = new calculator(textBox);
    String[][][] script = call.script_for_animate;
    boolean flag = false;
    
        for (int i = 0; i < script.length ; i++){
            for (int j = 0; j < script[i].length ; j++){
                flag = false;
                    for (int k = 0; k < script[i][j].length ; k++){
                        //if (script[i][j][k]!= null){
                        System.out.print(script[i][j][k]);
                        //flag = true;
                    //}
                        
                    }
                    System.out.println(".");
                }
            
     }  
    
  }
   
    //writeFile();
    
  

  public static void main(String[] args) throws Exception
  {
      
    javax.swing.JFrame frame = new javax.swing.JFrame("JTextWriter");
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.add(new JTextWriter());
    frame.pack();
    frame.setVisible(true);

  } 
}