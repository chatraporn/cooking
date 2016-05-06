/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cooking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Collections; 
import java.util.HashSet;
import java.util.Set;
import java.util.Collections; 
import static javafx.scene.input.KeyCode.T;
/**
 *
 * @author diaros
 */
public class calculator {
    static String[][][] script_for_animate;
    
    //public static void main(String[] args) 
    /////////////////////////////////////////////////tag
//    {
//    ArrayList<ArrayList<ArrayList<String>>> listTool = new ArrayList<ArrayList<ArrayList<String>>>();
//    ArrayList<ArrayList<String>> com = new ArrayList<ArrayList<String>>();
//    ArrayList<String> nameTool = new ArrayList<String>();
//    ArrayList<String> tagTool = new ArrayList<String>();
//    
//    tagTool.add("meat");
//    tagTool.add("veg");
//    nameTool.add("pan");
//    com.add(nameTool);
//    com.add(tagTool);
//    listTool.add(com);
//    System.out.print(listTool.get(0).get(0).get(0));
////    String tool = ",batter"
////    + ",beater"
////    + ",broom"
////    + ",can opener"
////    + ",chop"
////    + ",chopsticks,grater,knife,knife sharpener,ladle"
////    + ",measuring spoons,mixer,pestle,nut pick"
////    + ",opener,poultry shears,reamer,rolling pin"
////    + ",shears,sieve,skewers,slicer,spoon,steak knife,tablespoon,teaspoon,tongs"
////    + ",vegetable brush,vegetable peeler,whip,whisk,zester";
//            
//   
//    }
       
           
    //public static void cal(String[] args) 
    public static void main(String[] args)
    { }
    
   calculator(String textBox) {
        
        String tool = "batter"
                + ",beater"
                + ",broom"
                + ",opener"
                + ",chopsticks"
                + ",grater"
                + ",knife"
                + ",sharpener"
                + ",ladle"
                + ",measuring spoons"
                + ",mixer"
                + ",pestle"
                + ",nut pick"
                + ",poultry shears"
                + ",reamer"
                + ",rolling pin"
                + ",shears"
                + ",sieve"
                + ",skewers"
                + ",slicer"
                + ",spoon"
                + ",steak knife"
                + ",tablespoon"
                + ",teaspoon"
                + ",tongs"
                + ",vegetable brush"
                + ",vegetable peeler"
                + ",whip"
                + ",whisk"
                + ",zester"
                + ",scoop"/// ที่ตักไอติม
                + ",pick"
                ////////////////
                + ",masher"/// ที่บดมันฝรั่ง
                + ",potato masher"
                ////////////////
                + ",tenderizer"//// ที่ตีเนื้อสเต็กให้นุ่ม
                + ",cracker" //ที่บีบเปลือก
                + ",fork"
                + ",meat thermometer"
                + ",spatula,thermometer"
                + ",honey dipper"/// ไม้น้ำผึ้ง
                ;
        
        
//        String conjunction = "and|" + "but|" +"however|" +"still|" +"yet|" +"although|" +
//                "though|" +"until|" + "or|" +"so|" +"therefore|" +"thus|" 
//                +"because|" +"for|" +"as|" +"since" +
        
        String conjunction = ",|"+" and|" + " but |" +" however |" +"still |" +" yet |" +" although |" +
                " though |" +" until |" + " or |" +" therefore |" +" thus |" 
                +" because |"  +" since" +
             //+" so |"  +" as |" +" for |" 
        ",and|" + ",but|" +",however|" +",still|" +",yet|" +",although|" +
                ",though|" +",until|" + ",or|" +",so|" +",therefore|" +",thus|" 
                +",because|" +",for|" +",as|" +",since" +
        
        "and,|" + "but,|" +"however,|" +"still,|" +"yet,|" +"although,|" +
               "though,|" +"until,|" + "or,|" +"so,|" +"therefore,|" +"thus,|" 
              +"because,|" +"for,|" +"as,|" +"since," ;
        
        String verb = "am,are,was,were,been,beat,add,grab,get,ease,fold,using,use,boil,whisk,drain,cut,cook,strain"
                
                
                
                
                + ",grate,bake,store,microwave,chop,blend,mix,keep,grab,take"
                + ",simmer,fire up,start,roast,fry,slice,sprinkle,barbeque,flip,put"
                + ",stir,toss,prepare,baste"
                + ",stir-fry,roll,hit,crack,hot,remove,sprinkle,grill"
                
                 + ",marinate"// การหมัก
                ;
        //String[] verb = verb_split.split(",");

        String ingredient =              
                "sandwich"
                ///////เนื้อ
                +",bacon" 	//เบคอน
                +",beef" 	//เนื้อวัว
                +",chicken" 	//เนื้อไก่
                
                +",duck"                //เนื้อเป็ด
                +",egg"
                +",eggs"
                +",ham" 	//แฮม
                +",kidneys" //	เนื้อแพะ
                +",lamb" //	เนื้อลูกแกะ
                +",liver" //	ตับ
                +",mince" 	//เนื้อวัวสับ
                +",minced beef" 	//เนื้อวัวสับ
                +",pate" 	//สมอง
                +",salami" 	//ไส้กรอกหมูปนเนื้อวัว
                +",sausages" 	//ไส้กรอก
                +",pork" 	//เนื้อหมู
                +",sausage roll" //โรลไส้กรอก
                +",turkey" 	//ไก่งวง
                +",veal" 	//เนื้อลูกวัว
                
                
                
                ///////ผลไม้
                +",apple" 	//แอปเปิ้ล
                +",apricot" 	//แอปริคอท
                +",banana" 	//กล้วย
                +",blackberry" 	//แบลคเบอร์รี่
                +",blackcurrant" //องุ่นดำ
                +",blueberry" 	//บลูเบอร์รี่
                +",cherry" 	//เชอร์รี่
                +",coconut" 	//มะพร้าว
                +",fig"          //มะเดื่อ
                +",gooseberry" 	//กูสเบอร์รี่
                +",grape" 	//องุ่น
                +",grapefruit" 	//ผลองุ่น
                +",kiwi" 	//กีวี
                +",lemon" 	//มะนาว
                +",lime" 	//มะนาว
                +",mango" 	//มะม่วง
                +",melon" 	//แตง
                +",orange" 	//ส้ม
                +",peach" 	//ลูกท้อ
                +",pear" 	//สาลี่
                +",pineapple" 	//สับปะรด
                +",plum" 	//พลับ
                +",pomegranate" 	//ทับทิม
                +",raspberry" 	//ราสเบอร์รี่
                +",redcurrant" 	//องุ่นแดง
                +",rhubarb" 	//โกฐน้ำเต้า
                +",strawberry" 	//สตรอเบอร์รี่
                +",bunch of bananas" 	//หวีกล้วย
                +",bunch of grapes" 	//พวงองุ่น
                
                
                ////////ปลา
                +",anchovy" 	//กุ้งเคย
                +",cod"          //ปลาคอด
                //+",haddock" 	//ปลาแฮดดัค
                //+",herring" 	//ปลาแฮร์ริ่ง
                //+",kipper" 	//แฮร์ริ่งรมควัน (ปลารมควัน โดยทั่วไปเรียกว่าปลาแฮร์ริ่ง)
                //+",mackerel" 	//ปลาแมคเคอเร็ล
                //+",pilchard" 	//ปลาพิลเชิด
                //+",plaice" 	//ปลาลิ้นหมาชนิดหนึ่ง
                +",salmon" 	//ปลาแซลมอน
                +",sardine" 	//ปลาซาร์ดีน
                //+",smoked salmon" 	//แซลมอนรมควัน
                +",sole" 	//ปลาตาเดียว
                +",trout" 	//ปลาเทราท์
                +",tuna" 	//ปลาทูนา
                
                
                ///////////ผัก
                
                +",artichoke" 	//อาร์ติโชก
                +",asparagus" 	//หน่อไม้ฝรั่ง
                +",aubergine" 	//มะเขือยาวสีม่วง
                +",avocado" 	//อะโวคาโด
                //+",beansprouts" 	//ถั่วงอก
                +",beetroot" 	//หัวบีท
                +",broad beans" 	//ถั่วปากอ้า
                +",broccoli" 	//บรอคโคลี
                +",Brussels sprouts" 	//กระหล่ำปลีชนิดออกหัวตามลำต้น
                +",cabbage" 	//กะหล่ำปลี
                +",carrot" 	//แครอท
                +",cauliflower" 	//กะหล่ำดอก
                +",celery" 	//ขึ้นฉ่าย
                +",chilli" 	//พริก
                +",courgette" 	//แตง
                +",cucumber" 	//แตงกวา
                +",French beans" //ถั่วแขก
                +",garlic" 	//กระเทียม
                +",ginger" 	//ขิง
                +",leek" 	//ต้นกระเทียม
                +",lettuce" 	//ผักกาดหอม
                +",mushroom" 	//เห็ด
                +",onion" 	//หัวหอม
                +",peas" 	//ถั่ว
                //+",pepper" 	//พริกไทย
                +",potato" 	//มันฝรั่ง
                +",pumpkin" 	//ฟักทอง
                +",radish" 	//หัวไชเท้า
                +",rocket" 	//ผักร็อกเก็ต
                +",runner beans" 	//ถั่วรันเนอร์
                +",swede" 	//ลูกสวีด
                +",sweet potato"  	//มันหวาน
                +",corn" 	//ข้าวโพดหวาน
                +",tomato" 	//มะเขือเทศ
                +",tomatoes"
                +",turnip" 	//ผักกาด
                +",spinach" 	//ผักขม
                +",spring onion" 	//ต้นหอมสด
                +",squash" 	//พืชตระกูลน้ำเต้า
                +",sauce"
                +",clove of garlic" 	//กลีบกระเทียม
                +",stick of celery" 	//ต้นขึ้นฉ่าย
                
                + ",potato"
                + ",allspice"
                + ",Basil"
                + ",Beans"
                + ",cardamom"
                + ",cheese"
                + ",chilies"
                + ",chocolate"
                + ",cinnamon"
                + ",citrus"
                + ",Cloves"
                + ",Coffee beans"
                + ",Cumin"
                + ",Dill"
                + ",Fennel"
                + ",Flour"
                + ",Garlic"
                + ",Ginger"
                + ",Honey"
                + ",leftovers"
                + ",Maple syrup"
                + ",Mint"
                + ",Mushroom"
                + ",Mustard"
                + ",Nutmeg"
                + ",Nuts"
                + ",Oregano"
                + ",Pepper"
                + ",Potatoes"
                + ",Rosemary"
                + ",Saffron"
                + ",Salt"
                + ",Sugar"
                + ",Tobacco"
                + ",Turnips"
                + ",Vanilla"
                + ",Wheat" 
                
                
                
                +",butter"
                +",water"
                ;
                
              
                
        String container =    
                  "aluminum foil"
                + ",baking dish"
                + ",broiler" //เครื่องย่าง
                + ",Bundt pan"///คล้ายแม่พิม ขนมปัง
                + ",basket"   + ",bread basket"    
                + ",blender"
                /////
                + ",boil"
                + ",cooker"// เตา หม้อหุงข้าว
                ///////
                + ",bottle"
                + ",bowl"   
                + ",cake stand"
                //////////////////
                + ",coffee grinder"
                + ",coffee mill" //ที่บดกาแฟ
                ///////////
                + ",coffee maker"
                + ",cake pan"
                + ",can"
                + ",carafe" /// ขวดแก้วใหญ่ สำหรับริน
                + ",casserole" //หม้อตุ๋น
                ////////
                + ",cast iron pan"//กระทะเหล็ก
                + ",pan"
                + ",frying pan"
                //////
                + ",china"
                + ",dish"
                ////
                + ",colander"// กระชอน ที่กรอง
                + ",cookie sheet"
                + ",crockpot"/// หม้อไฟฟ้า
                + ",cup"
                + ",custard cup"
                + ",cutting board" //// เขียง
                + ",decanter"/// เหยือกสวยๆ
                + ",dutch oven"/// เตาถ่าน
                + ",egg timer"
                
                
                //////////////////////////////////////////////////////////////
                
                + ",sifter" //ที่ร่อนแป้ง
                + ",fondue set" /// ชุดฟองดู
                + ",food processor"/// เครื่องปั่น พริก ถั่ว ฯลฯ
                + ",fryer"////เครื่องทอดเฟร้นฟราย  หัวหอม ไก่
                + ",fruit bowl"
                + ",glasses"
                + ",griddle"//// เตาย่างไฟฟ้า
                + ",grill"///// เตาถ่านย่าง
                + ",grinder"/// ที่บดอาหาร
                + ",honey pot"
                
                
                + ",hot plate"////เตาไฟฟ้า
                + ",ice box"//กระติกน้ำแข็ง
                + ",ice bucket"/// กระแป๋งน้ำแข็ง           
                + ",ice cream maker"//เครื่องทำไอติม
                + ",ice cube tray"//ถาดใส่น้ำแข็งก้อน
                + ",iron skillet"/// กระทะเหล็ก
                + ",jar" /// โหลแก้ว
                + ",jug"/// เหยือก
                + ",juice glass"// แก้ว
                + ",juicer"/// ที่ปั่นผลไม้
                + ",kettle"////เครื่องต้มน้ำ 
                + ",lid"/// ฝาหม้อ        
                + ",measuring cup"//// ถ้วยตวง
                + ",microwave"
                + ",bowl"
                + ",mold" /// แม่พิม
                + ",mortar"//ครก
                + ",mug"//แก้วหนาๆ
                + ",paper towels"/// กระดาดซับมัน
                /////////////////////////////////
                + ",pepper grinder"/// ที่บด พริกไทย หมุนๆ
                + ",pepper mill"/// ที่บด พริกไทย หมุนๆ
                ////////////////////////////
                + ",pepper shaker"/// ขวดเล็กๆ ใส่พริกไทย เหยาะๆ
                + ",salt shaker"/// ขวดเล็กๆ ใส่เกลือ เหยาะๆ
                ///////////////////////
                + ",percolator"//// ที่ต้มกาแฟ คล้าย กาน้ำร้อนไฟฟ้า
                + ",platter"//// จาน ถาดใหญ่ๆ ใส่ ผักรวม  เนื้อรวม ใหญ่ๆ
                + ",plate"
                + ",pot"
                
                + ",pressure"///หม้อความดัน
                
                + ",ramekin"//// ถ้วยเซรามิก เล็กๆ ใส่ขนม คล้ายๆ ถ้วยน้ำจิ้ม
                
                + ",rice cooker"
                + ",roaster" /// เตาย่าง  เตาปิ้ง
               
                //+ ",salad bowl"/////////ถ้วยใส่สลัก ใสๆ สวยๆ
                //+ ",salad spinner"//// ถัง? ถ้วย ?  ปั่นผักให้แห้ง
                
                //////////////////////////
                //+ ",gravy boat"/// ถ้วยริน คล้ายตะเกียงอาละดิน 555
               // + ",sauce boat"/// ถ้วยริน คล้ายตะเกียงอาละดิน 555
                ///////////////////////////
                
                + ",sauce pan"/////// หม้อเล็กๆ มีที่จับยาวๆ
                //+ ",saucer"/////// จานรองแก้ว
                //+ ",serving platter"///////// จานเซิร์ฟ สวยๆ
                + ",sifter"//// ตะแกรงร่อนแป้ง คล้ายๆ ปิ่นโต
                + ",skillet"///// กระทะแบน
                //+ ",slow cooker"//// คล้ายๆ หม้อหุงข้าว แต่ เอาไปทำอาหาร ต้มๆ อุ่น
                //+ ",soup bowl"//// ถ้วย
                //+ ",spice jar"///// ขวดโหลใส่ เครื่องเทศ
                + ",steamer"///เครื่องนึ่ง
                //+ ",stew pot"////หม้อ ทำสตูว์ เหมือนหม้อ ต้มทั่วไป
                //+ ",sugar bowl"/// ถ้วยเล็กๆ ใส่น้ำตาลมีฝาปิด 
                //+ ",sugar sifter"//// ตะแกรงร่อนน้ำตาล
                //+ ",tea cup"
                //+ ",tea infuser"///// คล้ายๆ ถุงชา แต่ไม่ใช่
                //+ ",teapot"//// กาน้ำชา
                + ",timer"
                //+ ",tin" //// คล้ายกล่องอลูมิเนียม เอาไว้เป็นที่รองย่างไฟ
                + ",toaster"/// เครื่องปิ้งขนมปัง
                //+ ",toaster oven"//// คล้ายๆไมโครเวฟ แต่ไม่ใช่
                //+ ",trash bags"
                //+ ",trash can"
                + ",tray"//// ถาด
               // + ",trivet"///// ที่รองของร้อน ตะแกรงเหล็ก ไม้
                + ",tumbler"/// แก้วน้ำ
                + ",tureen"/// ชามลึกขนาดใหญ่ที่มีฝาปิด สำหรับใส่น้ำแกงและอาหารอื่น ๆ ,หม้ออบ
                //+ ",waffle iron"////เครื่องทำวัฟเฟิล
                //+ ",waste basket"///ถังขยะ
                + ",waxed"//// กระดาษไขรองอาหาร แว็ก
                + ",wok"//// กระทะก้นลึก
                //+ ",yogurt maker"//// เครื่องทำโยเกิร์ต ???
                ;
        
        String large_container =  
        "bun warmer"//เครื่องอบขนมปัง
        + ",cabinet"
        + ",counter"
        + ",cupboard"
        + ",freezer"// 
        + ",kitchen island"//// โต้ะทำอาหารกลางห้อง
        + ",refrigerator"
        + ",oven"
        + ",stove"//// เตาแก๊ส
        + ",vegetable bin"//// ตู้ใส่ผัก;
        + ",heat"
        + ",range"////เตาหุงต้มชนิดหนึ่ง, Syn. stove
                ;
                
        verb = verb.toLowerCase();
        tool = tool.toLowerCase();
        ingredient = ingredient.toLowerCase();
        container = container.toLowerCase();
        large_container = large_container.toLowerCase();
             //TESTttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt   
        
//        Scanner box1 = new Scanner(System.in);
//        
//        System.out.println("กรุณาใส่ข้อมูล");
//        String box = "" ;
//        for (int i=0; i < 2; i++){
//        box = box + box1.nextLine();
//        }
//        box = box.toLowerCase();
//        System.out.println(box);
        //box = "[[ Crack the eggs into a mixing bowl ] with [ a pinch of salt and pepper. ]]";
       // String[] sentence;1.2.3.4
        
       //TESTttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt   
        //ArrayList<String> sentence = new ArrayList( Arrays.asList( box.split("\\.|") ) );
        //ArrayList<String> temp_2 ;
        //String[] temp_1;
        
        

        //String[] sentence = test1.textArea.getText().split("[.]");
        textBox = textBox.toLowerCase();
        textBox = textBox.replace("\n", "");
        String[] sentence = textBox.split("[.]");
        
        
        script_for_animate = new String[sentence.length][10][5];
               
        
        
//        String a = "new.new.new";
//        String[] s = a.split("[.]");
//        keep = Arrays.toString(sentence);
//        System.out.println(keep);
//        keep = Arrays.toString(s);
//        System.out.println(keep);
        
              

        String[][] keepsentence = null;
        
        
        
        //ArrayList<ArrayList<String>> important_word_for_animation;   
        
        //Set<String> temporary_set ;
        
        String[] temp_sentense_string ;
        /////String[] temp_sentense_string = new String[30]; เพิ่งแก้
        //ArrayList<String> temp_sentense_list;
        Set<String> temp_sentense_set ;
        
        
        
        String[] temp_tool_string;
        //ArrayList<String> temp_tool_list;
        Set<String> temp_tool_set;
        
        String[] temp_verb_string;
        //ArrayList<String> temp_verb_list;
        Set<String> temp_verb_set;
        
        String[] temp_ingredient_string;
        //ArrayList<String> temp_ingredient_list;
        Set<String> temp_ingredient_set;
        
        String[] temp_container_string;
        //ArrayList<String> temp_container_list;
        Set<String> temp_container_set;
        
        String[] temp_Lcontainer_string;
        //ArrayList<String> temp_Lcontainer_list;
        Set<String> temp_Lcontainer_set;
        
        String[][][]  word_contain = null ;///////
        String[] temp_word_contain ;
        temp_word_contain = new String[5];
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////// 
        
        ///////////  []แรก เก็บแต่ละ ดอท []สอง เก็บแยกแต่ละ and []สาม   สำคัญสุด เอาไป animate
        /////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////
        String x;
        String[] y;
        String[] stack_word_temp = new String[5];
        for (int i=0; i < sentence.length; i++){
             x = sentence[i];
             System.out.println(i);
             System.out.println(sentence[i]);
             if(x.contains("when")){
             if(x.indexOf("when") < 5 && x.contains(","))
             {
                 
                 x = x.substring(x.indexOf(",") + 1);
//                 x.substring(x.indexOf(","));
                 System.out.println(x);
             }}
             
             y = x.split(conjunction);
             keepsentence = new String[y.length][];
             word_contain = new String[sentence.length][y.length][5];
             
            
             temp_word_contain[0] = null;
             temp_word_contain[1] = null;
             temp_word_contain[2] = null;
             temp_word_contain[3] = null;
             temp_word_contain[4] = null;
            //List<String> z = Arrays.asList(y);
            //ArrayList<String> u = (ArrayList<String>) z;
            //keepsentence.add((ArrayList<String>) Arrays.asList( sentence.get(i).split(conjunction) ));
            //System.out.println(x);
            //////if(keepsentence.get(i).size()>1){   เสียดาย  เงื่อนไขเก่า
                
                   
                    for (int j=0; j < y.length; j++){
                       
                        keepsentence[j] = y[j].split(" ");  ///Arrays.toString
                       
                        temp_sentense_string = keepsentence[j];//Bugggg
                        
                        //////temp_sentense_string = keepsentence[i][j].split(" ");//Bugggg
                        temp_sentense_set = new HashSet<String>(Arrays.asList( temp_sentense_string));
                        //temp_sentense_set = new HashSet<String>(temp_sentense_list);
                        
                       
                        temp_verb_string = verb.split(",");////////// ควรอยู่ข้างนอก
                        //temp_verb_list = (ArrayList<String>)Arrays.asList(temp_verb_string);
                        temp_verb_set = new HashSet<String>(Arrays.asList(temp_verb_string));
                        
                        temp_tool_string = tool.split(",");////////// ควรอยู่ข้างนอก
                        //temp_tool_list = (ArrayList<String>)Arrays.asList(temp_tool_string);
                        temp_tool_set = new HashSet<String>(Arrays.asList(temp_tool_string));
                        
                        
                        temp_ingredient_string = ingredient.split(",");////////// ควรอยู่ข้างนอก
                        //temp_ingredient_list = (ArrayList<String>)Arrays.asList(temp_ingredient_string);
                        temp_ingredient_set = new HashSet<String>(Arrays.asList(temp_ingredient_string));
                        
                        temp_container_string = container.split(",");////////// ควรอยู่ข้างนอก
                        //temp_container_list = (ArrayList<String>)Arrays.asList(temp_ingredient_string);
                        temp_container_set = new HashSet<String>(Arrays.asList(temp_container_string));
                                
                        temp_Lcontainer_string = large_container.split(",");////////// ควรอยู่ข้างนอก
                        //temp_Lcontainer_list = (ArrayList<String>)Arrays.asList(temp_ingredient_string);
                        temp_Lcontainer_set = new HashSet<String>(Arrays.asList(temp_Lcontainer_string));
                        
                      ///////// set retain
                        temp_verb_set.retainAll(temp_sentense_set);
                        temp_tool_set.retainAll(temp_sentense_set); 
                        temp_ingredient_set.retainAll(temp_sentense_set);
                        temp_container_set.retainAll(temp_sentense_set);
                        temp_Lcontainer_set.retainAll(temp_sentense_set);
                        
                        
                         if(temp_verb_set.size()>0){
                             
                           stack_word_temp = temp_verb_set.toArray(new String[temp_verb_set.size()]);
                           
                           word_contain[i][j][0] = stack_word_temp[0];            
                           temp_word_contain[0] = stack_word_temp[0] ;
                           
                        }
                        
                        if(temp_tool_set.size()>0){
                           stack_word_temp = temp_tool_set.toArray(new String[temp_tool_set.size()]);
                           word_contain[i][j][1] = stack_word_temp[0];
                           temp_word_contain[1] = stack_word_temp[0] ; 
                        }
                                           
                       
                        if(temp_ingredient_set.size()>0){
                           stack_word_temp = temp_ingredient_set.toArray(new String[temp_ingredient_set.size()]); 
                           word_contain[i][j][2] = stack_word_temp[0];   
                           temp_word_contain[2] = stack_word_temp[0] ; 
                        }
                        
                        
                        if(temp_container_set.size()>0){
                           stack_word_temp = temp_container_set.toArray(new String[temp_container_set.size()]); 
                           word_contain[i][j][3] = stack_word_temp[0];                  
                           temp_word_contain[3] = stack_word_temp[0] ;
                        }
                        
                        if(temp_Lcontainer_set.size()>0){
                           stack_word_temp = temp_Lcontainer_set.toArray(new String[temp_Lcontainer_set.size()]);
                           word_contain[i][j][4] = stack_word_temp[0];
                           temp_word_contain[4] = stack_word_temp[0] ;
                           
                           
                        }
                        
                        
                        
                        //////////////////////////////////////  ทำ อะไรไปเเล้วบ้าง
                        //////////////////////   ซ่อมประโยค พยายาม  ถึงขึ้นกำลังจะรู้ได้ว่า ประโยคที่ขาดไป   ขาดอะไรไปบ้าง ตอนนี้ ได้ tool ว่ามันมีกี่ตัวแล้วรึเปล่า 
             
                        //////////////////////////////////////  กำลังจะทำให้รู้ว่ามี verb container large ingredient เพราะยังไม่ได้แยก
                     
                    }
                    for (int j=0; j < y.length; j++){
                           //////////////////////////////////////////////////////////////////////// verb
                        String nU = null;
                        
                        if((word_contain[i][j][0] == nU) && ((temp_word_contain[0] == nU) == false) ){ ////////// เช็คถ้าประโยคนี้ขาด verb
                            script_for_animate[i][j][0] = temp_word_contain[0];   
                        }
                        else if((word_contain[i][j][0] == nU) == false){
                            script_for_animate[i][j][0] = word_contain[i][j][0];
                            
                        }
                                                      //////ให้เอา verb ของ tense มาใส่
                        
               
                           //////////////////////////////////////////////////////////////////////// ingredient
                        
                        if((word_contain[i][j][1] == nU) && ((temp_word_contain[1] == nU) == false) ){
                            script_for_animate[i][j][1] = temp_word_contain[1];
                        }
                        else if((word_contain[i][j][1] == nU) == false){
                            script_for_animate[i][j][1] = word_contain[i][j][1];
                        }       
                                                      
                        
                           //////////////////////////////////////////////////////////////////////// tool
                        
                        if((word_contain[i][j][2] == nU) && ((temp_word_contain[2] == nU) == false) ){
                            script_for_animate[i][j][2] = temp_word_contain[2];
                        }
                        else if((word_contain[i][j][2] == nU) == false){
                            script_for_animate[i][j][2] = word_contain[i][j][2];}
                                                       //////ให้เอา verb ของ tense มาใส่
                        
                           ////////////////////////////////////////////////////////////////////////  container
                            
                               
                        if((word_contain[i][j][3] == nU) && ((temp_word_contain[3] == nU) == false) ){
                            script_for_animate[i][j][3] = temp_word_contain[3];
                        }
                        else if((word_contain[i][j][3] == nU) == false){
                            script_for_animate[i][j][3] = word_contain[i][j][3];
                        } 
                                                      //////ให้เอา verb ของ tense มาใส่
                           
                        //////////////////////////////////////////////////////////////////////// Lcontainer
                        
                        if((word_contain[i][j][4] == nU) && ((temp_word_contain[4] == nU) == false) ){
                            script_for_animate[i][j][4] = temp_word_contain[4];
                        }
                        else if((word_contain[i][j][4] == nU) == false){
                            script_for_animate[i][j][4] = word_contain[i][j][4];
                        }        
                                                     //////ให้เอา verb ของ tense มาใส่
                            
                     System.out.println(Arrays.toString(script_for_animate[i][j]));       
                    }
                    
                ////} เสียดาย เงื่อนไขเก่า
                
                //System.out.println(Arrays.toString(script_for_animate));
            } 
        boolean flag = false;
        boolean flagi = false;
        String[][][] script = script_for_animate;
        String[][][] temp_script3 = null;
        String[][] temp_script2 = null;
        int i_ = 0;
        int j_ = 0;
        
        
        //count
        for (int i = 0; i < script.length ; i++){
            flagi = false;
            for (int j = 0; j < script[i].length ; j++){
                flag = false;
                    for (int k = 0; k < script[i][j].length ; k++){
                        if (script[i][j][k]!= null){
                            //temp_script1[k] = script[i][j][k];
                            //System.out.print(script[i][j][k]);
                            flag = true;
                    }
                        
                    }
                    if (flag){
                        //temp_script2[j_] = script[i][j];
                        //System.out.println(".");}
                        j_++;
                        flagi = true;
                    }
            
            }
            if (flagi){
                //temp_script3[i_] = temp_script2;
                //System.out.println(".");}
                i_++;
            }
        
        }
        
        temp_script2 = new String[j_][];
        temp_script3  = new String[i_][][];
        i_= 0; j_ = 0;
        ////real
        
        for (int i = 0; i < script.length ; i++){
            flagi = false;
            for (int j = 0; j < script[i].length ; j++){
                flag = false;
                    for (int k = 0; k < script[i][j].length ; k++){
                        if (script[i][j][k]!= null){
                            
                            flag = true;
                    }
                        else {
                            script[i][j][k] = "null";
                        }
                        
                    }
                    if (flag){
                        temp_script2[j_] = script[i][j];
                       
                        j_++;
                        flagi = true;
                    }
            
            }
            if (flagi){
                temp_script3[i_] = temp_script2;
               
                i_++;
            }
        
        }
        script_for_animate = temp_script3;
        
    
    
    }
}