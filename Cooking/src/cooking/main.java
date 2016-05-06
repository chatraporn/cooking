/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cooking;



import AppPackage.AnimationClass;
import java.awt.Frame;
import java.awt.image.ImageObserver;
import java.io.*;
import java.lang.*;
import java.lang.Object;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import cooking.calculator;
import java.util.Arrays;


import static spark.Spark.*;
/**
 *
 * @author ajnto_
 */
public final class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    AnimationClass AC = new AnimationClass();
    private Timer t;
    private ActionListener al;
    static String[][][] script;        
    
    public main() 
    {
        
        //get("/hello", (req, res) -> "Hello World");
        
        al = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                
                String textBox = jTextArea1.getText();
                //System.out.println(Arrays.toString(textForCal.split("[.]")));
                String textName = jTextField1.getText();
                calculator call = new calculator(textBox);
                script = call.script_for_animate;
                
                boolean flag = false;
                        
                    for (int i = 0; i < script.length ; i++){// dot
                        
                        for (int j = 0; j < script[i].length ; j++){// conj
                            flag = false;
                                for (int k = 0; k < script[i][j].length ; k++){
                                    //if (script[i][j][k]!= null){
                                    //System.out.print(script[i][j][k]);
                                    //flag = true;
                                //}
                                 
                            }
                        }
                    }
                    
                    
                
                if(jProgressBar2.getValue() < 100){
                    jProgressBar2.setValue(jProgressBar2.getValue()+5);}
                else{
                    
                    
                    t.stop();
//                    jPanel2.removeAll();
//                    jPanel2.repaint();
//                    jPanel2.revalidate();
                    //animateShow();
                    setVisible(false); //you can't see me!
                    dispose(); 
//                    try{
//                    String verify, putData = null;
//                    boolean loop = true;
//                    textName = textName.replaceAll(" ", "_");
//                    File file = new File("Menulist.txt");
//                    file.createNewFile();
//                    FileReader fr = new FileReader(file);
//                    BufferedReader br = new BufferedReader(fr);
//                    //while( (loop)){ //***editted
//                        verify=br.readLine();
//                        
//                        System.out.println(verify);
//                        if(verify == null){
//                            loop = false;
//                            verify = "";
//                        }
//                           //**deleted**verify = br.readLine();**
//                         //***edited
//                        putData = verify+"EOL"+ textName +"_____"+textBox;
//                            System.out.println(putData);
//                        
//                    FileWriter fw = new FileWriter(file);
//                    BufferedWriter bw = new BufferedWriter(fw);
//                        bw.write(putData);
//                        
//                    //}
//                    System.out.println(putData);
//                    //bw.write(textBox);
//                    bw.flush();
//                    bw.close();
//                    }catch(IOException e){
//                    e.printStackTrace();
//                    }
//                    new NewJFrame().animateShow(script);
                    //NewJFrame AC = new NewJFrame();
                    
                    //JFrame.getContentPane().add(new Janimate());
                    
                        
//                    jPanel2.add(jAnimate);
//                    jPanel2.repaint();
//                    jPanel2.revalidate();
                }
            }

          
        };
        t = new Timer(30, al);
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        SlideShow();
    }
    
    
    
    public void SlideShow() 
    {
        new Thread()
        {
            int count;
            
            @Override
            public void run()
            {
                try
                {
                    while(true)
                    {
                        switch(count)
                        {
                            case 0:
                                ImageIcon II = new ImageIcon(getClass().getResource("/image/food_bg0.png"));
                                bg_1.setIcon(II);
                                Thread.sleep(8000);
                                AC.jLabelXLeft(0, -800, 20, 5, bg_1);
                                AC.jLabelXLeft(800, 0, 20, 5, bg_2);
                                      
                                count = 1;
                                break;
                                        
                                        
                            case 1:
                                ImageIcon II2 = new ImageIcon(getClass().getResource("/image/food_bg1.jpg"));
                                bg_2.setIcon(II2);
                                Thread.sleep(8000);
                                AC.jLabelXRight(-800, 0, 20, 5, bg_1);
                                AC.jLabelXRight(0, 800, 20, 5, bg_2);
                                
                                count = 2;
                                break;
                                
                            case 2:
                                ImageIcon II3 = new ImageIcon(getClass().getResource("/image/food_bg2.jpg"));
                                bg_1.setIcon(II3);
                                Thread.sleep(8000);
                                AC.jLabelXLeft(0, -800, 20, 5, bg_1);
                                AC.jLabelXLeft(800, 0, 20, 5, bg_2);
                                      
                                count = 3;
                                break;
                                        
                                        
                            case 3:
                                ImageIcon II4 = new ImageIcon(getClass().getResource("/image/food_bg3.jpg"));
                                bg_2.setIcon(II4);
                                Thread.sleep(8000);
                                AC.jLabelXRight(-800, 0, 20, 5, bg_1);
                                AC.jLabelXRight(0, 800, 20, 5, bg_2);
                                
                                count = 0;
                                break;
                                
                  
                        }
                    }
                }
                catch(Exception e)
                {
        
                }
            }
                
        }.start();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bg_2 = new javax.swing.JLabel();
        bg_1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        bg1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        bg_load_menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cooking Simulator");
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setName(""); // NOI18N

        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel3.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/New_normal.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/New_hover.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/New_active.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(50, 390, 219, 57);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Load_normal.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Load_hover.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Load_active.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(280, 390, 219, 57);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Credit_normal.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Credit_cover.png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Credit_activel.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(510, 390, 219, 57);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome");
        jLabel4.setToolTipText("");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(260, 50, 289, 87);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("to");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(400, 130, 21, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Untitled.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(130, 180, 560, 220);

        bg_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/food_bg1.jpg"))); // NOI18N
        jPanel3.add(bg_2);
        bg_2.setBounds(800, 0, 800, 500);

        bg_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/food_bg0.png"))); // NOI18N
        jPanel3.add(bg_1);
        bg_1.setBounds(0, 0, 800, 500);

        jPanel2.add(jPanel3, "card3");

        jPanel4.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Go_normal.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Go_hover.png"))); // NOI18N
        jButton4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Go_active.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 100, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back_active.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back_hover.png"))); // NOI18N
        jButton5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back_normal.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 100, 40));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setToolTipText("input name");
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 250, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("input your process cooking.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 640, 220));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("New Menu");
        jLabel1.setToolTipText("");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter your name menu");
        jLabel6.setToolTipText("");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Enter process of cooking");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 210, -1));

        jProgressBar2.setStringPainted(true);
        jPanel4.add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 550, 20));

        bg1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/food_bg4.jpg"))); // NOI18N
        jPanel4.add(bg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        jPanel2.add(jPanel4, "card4");

        jPanel6.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("LilyUPC", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Rangsiman Poto");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 170, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Credit");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel13.setFont(new java.awt.Font("LilyUPC", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Chatraporn Yongtalay");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 230, 40));
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 800, 10));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back2.png"))); // NOI18N
        jButton6.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back1.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bgcredit.jpg"))); // NOI18N
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 1600, -1));

        jPanel2.add(jPanel6, "card5");

        jPanel7.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel7.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel7.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Please select menu.");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Go_normal.png"))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Go_active.png"))); // NOI18N
        jButton7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Go_hover.png"))); // NOI18N
        jPanel7.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 110, 50));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back_normal.png"))); // NOI18N
        jButton8.setContentAreaFilled(false);
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back_active.png"))); // NOI18N
        jButton8.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back_hover.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 100, 30));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 430, -1));

        bg_load_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/strawberry-food-wallpaper.jpg"))); // NOI18N
        bg_load_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.add(bg_load_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        jPanel2.add(jPanel7, "card6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(800, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();

        jPanel2.add(jPanel4);
        jPanel2.repaint();
        jPanel2.revalidate();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();

        jPanel2.add(jPanel3);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();

        jPanel2.add(jPanel6);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(!t.isRunning()){
            t.start();
        }
        String textBox = jTextArea1.getText();
                //System.out.println(Arrays.toString(textForCal.split("[.]")));
        String textName = jTextField1.getText();
        calculator call = new calculator(textBox);
        script = call.script_for_animate;
        
        try{
                    String verify, putData = null;
                    boolean loop = true;
                    textName = textName.replaceAll(" ", "_");
                    File file = new File("Menulist.txt");
                    file.createNewFile();
                    FileReader fr = new FileReader(file);
                    BufferedReader br = new BufferedReader(fr);
                    //while( (loop)){ //***editted
                        verify=br.readLine();
                        
                        System.out.println(verify);
                        if(verify == null){
                            loop = false;
                            verify = "";
                        }
                           //**deleted**verify = br.readLine();**
                         //***edited
                        putData = verify+"EOL"+ textName +"_____"+textBox;
                            System.out.println(putData);
                        
                    FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(putData);
                        
                    //}
                    System.out.println(putData);
                    //bw.write(textBox);
                    bw.flush();
                    bw.close();
                    }catch(IOException e){
                    e.printStackTrace();
                    }
                    new NewJFrame().animateShow(script);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();

        jPanel2.add(jPanel3);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();

        jPanel2.add(jPanel3);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();

        jPanel2.add(jPanel7);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg1;
    private javax.swing.JLabel bg_1;
    private javax.swing.JLabel bg_2;
    private javax.swing.JLabel bg_load_menu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    

    

}
