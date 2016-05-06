/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cooking;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import cooking.calculator;
import static cooking.main.script;

import java.util.Arrays;
/**
 *
 * @author diaros
 */
public class NewJFrame extends javax.swing.JFrame {

    

  
    
    /**
     * Creates new form NewJFrame
     */
    AnimationClass AC = new AnimationClass();
    
    public NewJFrame() {//String[][][] script
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        
        
        
        
        //animateShow();//script
        
        
        
        /////  จากบนลงล่าง
            
        
       
    }
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
   public void animateShow(String[][][] animatescript) //String[][][] script
    {
       
        //String[][][] animatescript = {{{"sprinkle", null, "cheese", null, null}}};
        String[] verb_animate = {
            "am,are,was,were,been,add,grab,get,use,cook,bake,store,keep,put,pour,toss,using" /////////// 0  ลงเฉยๆๆ

                /// ขึ้น ลง ขึ้น ลง tool>tool ;not tool>addtool(verb)////////// 1
            ,"beat,cut,flip,hit"
            +",baste"// ทุบตี
            +",mash,chop"
                
                // สะบัดซ้ายขวาๆ ไวๆ แกว่งสะบัด tool>tool ; notool > container; nocontainer > ingredient ////////// 2
            ,"whisk,drain,strain,grate,blend,mix" 
                    
                /// จากขวามาทางซ้าย  นำเข้า container ////////// 3
            ,"microwave"

                /// นำออก ไป จาก container จาก ซ้ายไป ขวา ////////// 4
            ,"take,remove"//out"

                /// อยู่เฉยๆ ยังไม่รู้จะทำอะไรดี ////////// 5
            ,"simmer" // หลน ต้ม
            +",fire up,start"
            +",boil,prepare,marinate,hot"

                // สะบัดซ้ายขวา ช้าๆ  ////////// 6
            ,"roast,fry,ease,fold,slice,stir,barbeque,stir-fry,roll,crush,peel,spread,grill"    

                /// ลง มา เขย่า กลางอากาศ และ ลง  //////////// 7
            ,"crack,sprinkle,pinch"};
            String[] temp_verb_animate;
            String verb_case = "";
            String act_case = "";
            String ingredient_case = "";
            String tool_case = "";
            String container_case = "";
            String Lcontainer_case = "";
            
            //for (int i = 0 ; i < animatescript.length ; i++){
            for (int i = 0 ; i < 1 ; i++){
               System.out.println(i + " i    !!!!!!!!!!!!!!");
                for (int j = 0 ; j < animatescript[i].length ; j++){
               
                    for (int k = 0 ; k < verb_animate.length ; k++){
                        
                        temp_verb_animate = verb_animate[k].split(",");
                        
                        
                        for (int l = 0 ; l < temp_verb_animate.length ; l++){
                            
                                
                            if (animatescript[i][j][0].equals(temp_verb_animate[l])){
                                verb_case += k;
                               
                            }
                            
                        }
                    }
                    
                    //System.out.println(animatescript[i][j][1]);
                    
                    act_case += animatescript[i][j][0] + ",";
                    tool_case += animatescript[i][j][1] + ",";
                    ingredient_case += animatescript[i][j][2] + ",";
                    container_case += animatescript[i][j][3] + ",";
                    Lcontainer_case += animatescript[i][j][4] + ",";
                    
                    
                    
                }
            } 
        char[] verb_case1 = verb_case.toCharArray();
        
        String[] ingredient_ca = ingredient_case.split(",");
        //System.out.println(Arrays.toString(ingredient_ca));
        String[] act_ca = act_case.split(",");
        String[] tool_ca = tool_case.split(",");
        String[] container_ca = container_case.split(",");
        String[] Lcontainer_ca = Lcontainer_case.split(",");
        
        new Thread()
        {
            int count;
            String na = "null";
            @Override
            public void run()
            {
                
                try
                {
                    
                    int verb_ca = (verb_case1[0])-48;
                    
                    int round = 0;
                    ImageIcon empty_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                    
                    ImageIcon ingredient_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                    jLabel2.setIcon(ingredient_pic);
                    ImageIcon tool_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                    jLabel1.setIcon(tool_pic);
                    ImageIcon container_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                    jLabel3.setIcon(container_pic);
                    ImageIcon Lcontainer_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                    jLabel4.setIcon(Lcontainer_pic);
                    while(true)
                    {
                        
                        switch(verb_ca)
                        {//7340
                            
                            case 0:  ///////////////// ใส่ add
    //                            
                                
                                
                                AC.jLabelYUp(150, 10, 1, 1, jLabel2);Thread.sleep(130);
                                if (tool_ca[round].equals(na)){}
                                else{
                                    tool_pic = new ImageIcon(getClass().getResource("/image_tool/"+tool_ca[round]+".png"));            
                                }
                                
                                if (ingredient_ca[round].equals(na)){}
                                else{
                                    ingredient_pic = new ImageIcon(getClass().getResource("/image_ingredient/"+ingredient_ca[round]+".png"));          
                                }
                                
                                if (container_ca[round].equals(na)){ }
                                else{
                                     container_pic = new ImageIcon(getClass().getResource("/image_container/"+container_ca[round]+".png"));
                                }
                                if (Lcontainer_ca[round].equals(na)){}
                                else{
                                     Lcontainer_pic = new ImageIcon(getClass().getResource("/image_Large_container/"+Lcontainer_ca[round]+".png"));
                                }
                           
                                jLabel1.setIcon(tool_pic);
                                jLabel2.setIcon(ingredient_pic);
                                jLabel3.setIcon(container_pic);
                                jLabel4.setIcon(Lcontainer_pic);
                                
                                if (ingredient_ca[round].equals(na)){ ///// ยังไม่ได้ทำ
                                    if (tool_ca[round].equals(na)){
                                        jLabel2.setIcon(container_pic);
                                        jLabel3.setIcon(empty_pic);
                                        Thread.sleep(200);
                                
                                        AC.jLabelYDown(10, 150, 5, 1, jLabel2);
                                        Thread.sleep(800);}
                                    else{
                                        jLabel2.setIcon(tool_pic);
                                        jLabel1.setIcon(empty_pic);
                                        Thread.sleep(200);
                                
                                        AC.jLabelYDown(10, 150, 5, 1, jLabel2);
                                        Thread.sleep(800);
                                         }
                                    
                                }
                                else{
                                Thread.sleep(200);
                                
                                AC.jLabelYDown(10, 150, 5, 1, jLabel2);
                                Thread.sleep(800);
                                }
                                
                                 
                                ingredient_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel2.setIcon(ingredient_pic);
                                tool_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel1.setIcon(tool_pic);
                                container_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel3.setIcon(container_pic);
                                Lcontainer_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel4.setIcon(Lcontainer_pic);
                                break;
                                
                            
                            case 1:   ///////// สับ ขึ้นลง
                                AC.jLabelYDown(150, 180, 2, 5, jLabel2);//Thread.sleep(200);
                                AC.jLabelYDown(110, 150, 2, 5, jLabel1);//Thread.sleep(200);
                                
                                
                                
                                if (tool_ca[round].equals(na)){ ///// ยังไม่ได้ทำ
                                    System.out.print(act_ca[round]);
                                    System.out.println(act_ca[round].equals("chop"));
                                    if(act_ca[round].equals("beat")){
                                        tool_ca[round] = "batter"; 
                                    }
                                    else if(act_ca[round].equals("cut")){
                                        tool_ca[round] = "knife";
                                    }
                                    else if(act_ca[round].equals("flip")){
                                        tool_ca[round] = "spatula";
                                    }
                                    else if(act_ca[round].equals("hit")){
                                        tool_ca[round] = "pestle";
                                    }
                                    else if(act_ca[round].equals("baste")){
                                        tool_ca[round] = "tenderizer";
                                    }
                                    else if(act_ca[round].equals("mash")){
                                        tool_ca[round] = "masher";
                                    }
                                    else if(act_ca[round].equals("chop")){
                                        
                                        tool_ca[round] = "cleaver";
                                    }
                                    tool_pic = new ImageIcon(getClass().getResource("/image_tool/"+tool_ca[round]+".png")); 
                                }
                                else{
                                    tool_pic = new ImageIcon(getClass().getResource("/image_tool/"+tool_ca[round]+".png"));            
                                }
                                
                                if (ingredient_ca[round].equals(na)){}
                                else{
                                    ingredient_pic = new ImageIcon(getClass().getResource("/image_ingredient/"+ingredient_ca[round]+".png"));          
                                }
                                
                                if (container_ca[round].equals(na)){ }
                                else{
                                     container_pic = new ImageIcon(getClass().getResource("/image_container/"+container_ca[round]+".png"));
                                }
                                if (Lcontainer_ca[round].equals(na)){}
                                else{
                                     Lcontainer_pic = new ImageIcon(getClass().getResource("/image_Large_container/"+Lcontainer_ca[round]+".png"));
                                }
                           
                                jLabel1.setIcon(tool_pic);
                                jLabel2.setIcon(ingredient_pic);
                                jLabel3.setIcon(container_pic);
                                jLabel4.setIcon(Lcontainer_pic);
                                
                                      
                               
                                AC.jLabelYDown(150, 190, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelYUp(190, 150, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelYDown(150, 190, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelYUp(190, 150, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelYDown(150, 190, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelYUp(190, 150, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelYDown(150, 190, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelYUp(190, 150, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelYDown(150, 190, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelYUp(190, 150, 2, 1, jLabel1);Thread.sleep(200);
                                
                               
                                ingredient_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel2.setIcon(ingredient_pic);
                                tool_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel1.setIcon(tool_pic);
                                container_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel3.setIcon(container_pic);
                                Lcontainer_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel4.setIcon(Lcontainer_pic);
                                AC.jLabelYDown(150, 110, 5, 5, jLabel1);Thread.sleep(200);
                                AC.jLabelYUp(180, 150, 5, 5, jLabel1);Thread.sleep(50);
                                break;  
                               
                                
                            case 2:      //////////////// สะ บัด  เขย่า
                                AC.jLabelYUp(110, 130, 2, 1, jLabel1);Thread.sleep(1000);
                                if (tool_ca[round].equals(na)){}
                                else{
                                    tool_pic = new ImageIcon(getClass().getResource("/image_tool/"+tool_ca[round]+".png"));            
                                }
                                
                                if (ingredient_ca[round].equals(na)){}
                                else{
                                    ingredient_pic = new ImageIcon(getClass().getResource("/image_ingredient/"+ingredient_ca[round]+".png"));          
                                }
                                
                                if (container_ca[round].equals(na)){ }
                                else{
                                     container_pic = new ImageIcon(getClass().getResource("/image_container/"+container_ca[round]+".png"));
                                }
                                if (Lcontainer_ca[round].equals(na)){}
                                else{
                                     Lcontainer_pic = new ImageIcon(getClass().getResource("/image_Large_container/"+Lcontainer_ca[round]+".png"));
                                }
                           
                                jLabel1.setIcon(tool_pic);
                                jLabel2.setIcon(ingredient_pic);
                                jLabel3.setIcon(container_pic);
                                jLabel4.setIcon(Lcontainer_pic);
                                
                                if (tool_ca[round].equals(na)){ ///// ยังไม่ได้ทำ
                                    jLabel1.setIcon(container_pic);
                                    jLabel3.setIcon(empty_pic);
                                    if (container_ca[round].equals(na)){
                                        jLabel1.setIcon(ingredient_pic);
                                        jLabel2.setIcon(empty_pic);
                                    
                                    }
                                }
                                Thread.sleep(200);
                                
                                AC.jLabelXLeft(300, 280, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelXRight(280, 320, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelXLeft(320, 280, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelXRight(280, 320, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelXLeft(320, 280, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelXRight(280, 320, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelXLeft(320, 280, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelXRight(280, 320, 2, 1, jLabel1);Thread.sleep(200);
                                AC.jLabelXLeft(320, 300, 2, 1, jLabel1);Thread.sleep(200);
                                
                                
                                 
                                ingredient_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel2.setIcon(ingredient_pic);
                                tool_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel1.setIcon(tool_pic);
                                container_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel3.setIcon(container_pic);
                                Lcontainer_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel4.setIcon(Lcontainer_pic);
                               break;
                            case 3: ///////////////  นำเข้า ซ้ายมาขวา
                                AC.jLabelXLeft(300, 100, 1, 1, jLabel2);Thread.sleep(200);
                                if (tool_ca[round].equals(na)){}
                                else{
                                    tool_pic = new ImageIcon(getClass().getResource("/image_tool/"+tool_ca[round]+".png"));            
                                }
                                
                                if (ingredient_ca[round].equals(na)){}
                                else{
                                    ingredient_pic = new ImageIcon(getClass().getResource("/image_ingredient/"+ingredient_ca[round]+".png"));          
                                }
                                
                                if (container_ca[round].equals(na)){ }
                                else{
                                     container_pic = new ImageIcon(getClass().getResource("/image_container/"+container_ca[round]+".png"));
                                }
                                if (Lcontainer_ca[round].equals(na)){}
                                else{
                                     Lcontainer_pic = new ImageIcon(getClass().getResource("/image_Large_container/"+Lcontainer_ca[round]+".png"));
                                }
                           
                                jLabel1.setIcon(tool_pic);
                                jLabel2.setIcon(ingredient_pic);
                                jLabel3.setIcon(container_pic);
                                jLabel4.setIcon(Lcontainer_pic);
                                
                                if (ingredient_ca[round].equals(na)){ ///// ยังไม่ได้ทำ
                                    jLabel2.setIcon(container_pic);
                                    jLabel3.setIcon(empty_pic);
                                    
                                }        
                                Thread.sleep(200);
                                
                                AC.jLabelXRight(100, 300, 5, 1, jLabel2);Thread.sleep(1000);
                                
                                
                                
                                 
                                ingredient_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel2.setIcon(ingredient_pic);
                                tool_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel1.setIcon(tool_pic);
                                container_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel3.setIcon(container_pic);
                                Lcontainer_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel4.setIcon(Lcontainer_pic);
                               break;
                            case 4: /////////// นำออก 
                                
                                if (tool_ca[round].equals(na)){}
                                else{
                                    tool_pic = new ImageIcon(getClass().getResource("/image_tool/"+tool_ca[round]+".png"));            
                                }
                                
                                if (ingredient_ca[round].equals(na)){}
                                else{
                                    ingredient_pic = new ImageIcon(getClass().getResource("/image_ingredient/"+ingredient_ca[round]+".png"));          
                                }
                                
                                if (container_ca[round].equals(na)){ }
                                else{
                                     container_pic = new ImageIcon(getClass().getResource("/image_container/"+container_ca[round]+".png"));
                                }
                                if (Lcontainer_ca[round].equals(na)){}
                                else{
                                     Lcontainer_pic = new ImageIcon(getClass().getResource("/image_Large_container/"+Lcontainer_ca[round]+".png"));
                                }
                           
                                jLabel1.setIcon(tool_pic);
                                jLabel2.setIcon(ingredient_pic);
                                jLabel3.setIcon(container_pic);
                                jLabel4.setIcon(Lcontainer_pic);
                                
                                if (ingredient_ca[round].equals(na)){ ///// ยังไม่ได้ทำ
                                    jLabel2.setIcon(container_pic);
                                    jLabel3.setIcon(empty_pic);
                                    
                                }        
                                Thread.sleep(1200);
                                
                                AC.jLabelXRight(300, 500, 5, 1, jLabel2);Thread.sleep(1200);
                                
                                
                                
                                 
                                ingredient_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel2.setIcon(ingredient_pic);
                                tool_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel1.setIcon(tool_pic);
                                container_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel3.setIcon(container_pic);
                                Lcontainer_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel4.setIcon(Lcontainer_pic);
                              break;
                            case 5: /////////////////  อยู่เฉยๆ รอร้อน
                                //AC.jLabelYUp(150, 10, 2, 1, jLabel2);
                                Thread.sleep(700);
                                if (tool_ca[round].equals(na)){}
                                else{
                                    tool_pic = new ImageIcon(getClass().getResource("/image_tool/"+tool_ca[round]+".png"));            
                                }
                                
                                if (ingredient_ca[round].equals(na)){}
                                else{
                                    ingredient_pic = new ImageIcon(getClass().getResource("/image_ingredient/"+ingredient_ca[round]+".png"));          
                                }
                                
                                if (container_ca[round].equals(na)){ }
                                else{
                                     container_pic = new ImageIcon(getClass().getResource("/image_container/"+container_ca[round]+".png"));
                                }
                                if (Lcontainer_ca[round].equals(na)){}
                                else{
                                     Lcontainer_pic = new ImageIcon(getClass().getResource("/image_Large_container/"+Lcontainer_ca[round]+".png"));
                                }
                           
                                jLabel1.setIcon(tool_pic);
                                jLabel2.setIcon(ingredient_pic);
                                jLabel3.setIcon(container_pic);
                                jLabel4.setIcon(Lcontainer_pic);
                                
                                
                                
                                
                                Thread.sleep(5000);
                                AC.jLabelXLeft(300, 295, 2, 1, jLabel3);Thread.sleep(50);
                                AC.jLabelXRight(295, 305, 2, 1, jLabel3);Thread.sleep(50);
                                AC.jLabelXLeft(305, 295, 2, 1, jLabel3);Thread.sleep(50);
                                AC.jLabelXRight(295, 305, 2, 1, jLabel3);Thread.sleep(50);
                                AC.jLabelXLeft(305, 295, 2, 1, jLabel3);Thread.sleep(50);
                                AC.jLabelXRight(295, 305, 2, 1, jLabel3);Thread.sleep(50);
                                AC.jLabelXLeft(305, 300, 2, 1, jLabel3);Thread.sleep(50);
                                
                                
                                 
                                ingredient_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel2.setIcon(ingredient_pic);
                                tool_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel1.setIcon(tool_pic);
                                container_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel3.setIcon(container_pic);
                                Lcontainer_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel4.setIcon(Lcontainer_pic);
                                Thread.sleep(400);
                                break;
                            case 6: ///// สะบัดช้าๆ
                                Thread.sleep(1000);
                                if (tool_ca[round].equals(na)){}
                                else{
                                    tool_pic = new ImageIcon(getClass().getResource("/image_tool/"+tool_ca[round]+".png"));            
                                }
                                
                                if (ingredient_ca[round].equals(na)){}
                                else{
                                    ingredient_pic = new ImageIcon(getClass().getResource("/image_ingredient/"+ingredient_ca[round]+".png"));          
                                }
                                
                                if (container_ca[round].equals(na)){ }
                                else{
                                     container_pic = new ImageIcon(getClass().getResource("/image_container/"+container_ca[round]+".png"));
                                }
                                if (Lcontainer_ca[round].equals(na)){}
                                else{
                                     Lcontainer_pic = new ImageIcon(getClass().getResource("/image_Large_container/"+Lcontainer_ca[round]+".png"));
                                }
                           
                                jLabel1.setIcon(tool_pic);
                                jLabel2.setIcon(ingredient_pic);
                                jLabel3.setIcon(container_pic);
                                jLabel4.setIcon(Lcontainer_pic);
                                
                                if (ingredient_ca[round].equals(na)){ ///// ยังไม่ได้ทำ
                                    
                                }    
                                else{
                                
                                jLabel2.setIcon(empty_pic);
                                    
                                }
                                Thread.sleep(200);
                                
                                AC.jLabelXLeft(300, 280, 5, 1, jLabel3);Thread.sleep(200);
                                AC.jLabelXRight(280, 320, 5, 1, jLabel3);Thread.sleep(200);
                                AC.jLabelXLeft(320, 280, 5, 1, jLabel3);Thread.sleep(200);
                                AC.jLabelXRight(280, 320, 5, 1, jLabel3);Thread.sleep(200);
                                AC.jLabelXLeft(320, 280, 5, 1, jLabel3);Thread.sleep(200);
                                AC.jLabelXRight(280, 320, 5, 1, jLabel3);Thread.sleep(200);
                                AC.jLabelXLeft(320, 300, 5, 1, jLabel3);Thread.sleep(200);
                                
                                
                                 
                                ingredient_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel2.setIcon(ingredient_pic);
                                tool_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel1.setIcon(tool_pic);
                                container_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel3.setIcon(container_pic);
                                Lcontainer_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel4.setIcon(Lcontainer_pic);
                               break;
                            
                            case 7:  //// crack
                                
                                AC.jLabelYUp(150, 10, 1, 1, jLabel2);Thread.sleep(120);
                                if (tool_ca[round].equals(na)){}
                                else{
                                    tool_pic = new ImageIcon(getClass().getResource("/image_tool/"+tool_ca[round]+".png"));            
                                }
                                
                                if (ingredient_ca[round].equals(na)){}
                                else{
                                    ingredient_pic = new ImageIcon(getClass().getResource("/image_ingredient/"+ingredient_ca[round]+".png"));          
                                }
                                
                                if (container_ca[round].equals(na)){ }
                                else{
                                     container_pic = new ImageIcon(getClass().getResource("/image_container/"+container_ca[round]+".png"));
                                }
                                if (Lcontainer_ca[round].equals(na)){}
                                else{
                                     Lcontainer_pic = new ImageIcon(getClass().getResource("/image_Large_container/"+Lcontainer_ca[round]+".png"));
                                }
                           
                                jLabel1.setIcon(tool_pic);
                                jLabel2.setIcon(ingredient_pic);
                                jLabel3.setIcon(container_pic);
                                jLabel4.setIcon(Lcontainer_pic);
                                
                                if (ingredient_ca[round].equals(na)){ ///// ยังไม่ได้ทำ
                                    jLabel2.setIcon(container_pic);
                                    jLabel3.setIcon(empty_pic);
                                    
                                }        
                                Thread.sleep(200);
                                AC.jLabelYDown(10, 80, 2, 1, jLabel2);Thread.sleep(200);
                                AC.jLabelXLeft(300, 280, 2, 1, jLabel2);Thread.sleep(200);
                                AC.jLabelXRight(280, 320, 2, 1, jLabel2);Thread.sleep(200);
                                AC.jLabelXLeft(320, 280, 2, 1, jLabel2);Thread.sleep(200);
                                AC.jLabelXRight(280, 320, 2, 1, jLabel2);Thread.sleep(200);
                                AC.jLabelXLeft(320, 280, 2, 1, jLabel2);Thread.sleep(200);
                                AC.jLabelXRight(280, 320, 2, 1, jLabel2);Thread.sleep(200);
                                AC.jLabelXLeft(320, 300, 2, 1, jLabel2);Thread.sleep(200);
                                AC.jLabelYDown(80, 150, 2, 1, jLabel2);Thread.sleep(200);
                                
                                 
                                ingredient_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel2.setIcon(ingredient_pic);
                                tool_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel1.setIcon(tool_pic);
                                container_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel3.setIcon(container_pic);
                                Lcontainer_pic = new ImageIcon(getClass().getResource("/image/pic_empty.png"));
                                jLabel4.setIcon(Lcontainer_pic);
                                break;
                                }        
                       round++; 
                       verb_ca = (verb_case1[round])-48;                         
                    }
                
                }
                
                catch(Exception e)
                {

                }
                jPanel1.removeAll();
                jPanel1.repaint();
                jPanel1.revalidate();

                jPanel1.add(Fin);
                jPanel1.repaint();
                jPanel1.revalidate();
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
        Janimate = new javax.swing.JPanel()
        ;
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bg_kitchen = new javax.swing.JLabel();
        Fin = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        bg_kitchen2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cooking Simulator");
        setMinimumSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new java.awt.CardLayout());

        Janimate.setMaximumSize(new java.awt.Dimension(800, 500));
        Janimate.setMinimumSize(new java.awt.Dimension(800, 500));
        Janimate.setPreferredSize(new java.awt.Dimension(800, 500));
        Janimate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home_small_normal.png"))); // NOI18N
        jButton4.setToolTipText("Back to first page.");
        jButton4.setContentAreaFilled(false);
        jButton4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home_small_hover.png"))); // NOI18N
        jButton4.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home_small_active.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Janimate.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 80, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit_normal.png"))); // NOI18N
        jButton5.setToolTipText("exit program.");
        jButton5.setContentAreaFilled(false);
        jButton5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit_hover.png"))); // NOI18N
        jButton5.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit_active.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Janimate.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 90, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_container/wok.png"))); // NOI18N
        Janimate.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_tool/spoon.png"))); // NOI18N
        Janimate.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_ingredient/mushroom.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Janimate.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_Large_container/stove.png"))); // NOI18N
        Janimate.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_Large_container/counter.png"))); // NOI18N
        jLabel5.setText("jLabel4");
        Janimate.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 740, -1));

        bg_kitchen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg_kitchen.jpg"))); // NOI18N
        Janimate.add(bg_kitchen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(Janimate, "card2");

        Fin.setMaximumSize(new java.awt.Dimension(800, 500));
        Fin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tryagain_normal.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tryagain_hover.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tryagain_active.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Fin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home_normal.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home_cover.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home_active.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Fin.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit_normal.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit_hover.png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit_active.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Fin.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, 60));

        bg_kitchen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg_kitchen2.jpg"))); // NOI18N
        bg_kitchen2.setText("jLabel1");
        bg_kitchen2.setMaximumSize(new java.awt.Dimension(800, 500));
        bg_kitchen2.setMinimumSize(new java.awt.Dimension(800, 500));
        bg_kitchen2.setPreferredSize(new java.awt.Dimension(800, 500));
        Fin.add(bg_kitchen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(Fin, "card3");

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false); //you can't see me!
        dispose(); 
                    
        cooking.main main = new main();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         //TODO add your handling code here:
        System.exit(0);
        //dispose(); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false); //you can't see me!
        dispose();
        new NewJFrame().animateShow(main.script);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false); //you can't see me!
        dispose(); 
                    
        cooking.main main = new main();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fin;
    public static javax.swing.JPanel Janimate;
    private javax.swing.JLabel bg_kitchen;
    private javax.swing.JLabel bg_kitchen2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
