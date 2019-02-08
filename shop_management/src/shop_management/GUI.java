 
package shop_management;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author XFX
 */
import java.awt.*;  
import javax.swing.*; 
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;






public class GUI {
                private JTextField ansfield;
                private JButton one,two,three,four,five,six,seven,eight,nine,zero,dot,add,sub,mul,div,equal,clear;
                private String ans;
                private  double finalresult=0.0,firstnum=0.0,secondnum=0.0;
                private String operator="";
                
                
                private JButton add_to_cart,Show_all_product,empty_cart,AddProduct,DeletProduct;
                private JTextField textfield_sals_product,textfield_sals_quantity,textfield_sals_totalPrice,textfield_adm_Price,textfield_adm_Product,textfield_adm_quantity;
                
                private double price,totalPrice=0;
                private String product;
                int qun,quantity;
                
               
                 
                String prduct_admin,price_admin,qunt_admin; 
           
	      
		GUI(){
                    
                    
       
                        JFrame frame=new JFrame("Shop Management");
			JPanel panel= new JPanel();
			JPanel panel2=new JPanel();
                        JPanel panel3=new JPanel();
			JLabel label_calc=new JLabel("Calculator");
			JLabel label_admin=new JLabel("Admin Panel");
			JLabel label_salsemen=new JLabel("Salesmen");
                        JLabel label_product=new JLabel("product");
                        JLabel label_quentity=new JLabel("Quentity");
                        JLabel label_totalPrice=new JLabel("Total Price");
                       JLabel label_product_adm=new JLabel("Product");
                       JLabel label_quantity_adm=new JLabel("Quantity");
                       JLabel label_price_adm=new JLabel("Price");
                      
                     
                      JButton show_all_product=new JButton("Show all product");                      
			
			
			
			panel.setBackground(Color.yellow);
			panel2.setBackground(Color.yellow);
			panel3.setBackground(Color.red);
			
			
			
			
			
                    
                       
			one= new JButton("1");
			two= new JButton("2");
			three= new JButton("3");
			four= new JButton("4");
			five= new JButton("5");
			six= new JButton("6");
			seven= new JButton("7");
			eight= new JButton("8");
			nine= new JButton("9");
			zero= new JButton("0");
                        dot= new JButton(".");
			add= new JButton("+");
			sub= new JButton("-");
			mul= new JButton("*");
			div= new JButton("/");
			equal= new JButton("=");
			clear= new JButton("Clear"); 
			ansfield=new JTextField(null,10);
                        
                        
                        
                        
                        textfield_sals_product=new JTextField(null,10);
                        textfield_sals_quantity=new JTextField(null,10);
                        textfield_sals_totalPrice=new JTextField(null,10);
                         
                        add_to_cart=new JButton("ADD TO CART");
                        empty_cart=new JButton("Empty Cart");
                        Show_all_product=new JButton("Show All Product");
                        
                        
                        
                        textfield_adm_Product=new JTextField(null,10);
                        textfield_adm_Price=new JTextField(null,10);
                        textfield_adm_quantity=new JTextField(null,10);
                        AddProduct=new JButton("ADD Product");
                        DeletProduct=new JButton("Delete Product");
                      
                        
           //-------------calculator panel add  component     
                        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));       
                        panel.add(label_calc);
                        panel.add(ansfield); 
			panel.add(one);
			panel.add(two);
			panel.add(three);
			panel.add(four);
			panel.add(five);
			panel.add(six);
			panel.add(seven);
			panel.add(eight);
			panel.add(nine);
			panel.add(zero);
                        panel.add(dot);
			panel.add(add);
			panel.add(sub);
			panel.add(mul);
			panel.add(div);
			panel.add(equal);
			panel.add(clear);
		
                   
			
                        
                        
               //-----------------salsman add  component 
                      panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS)); 
                      panel3.add(label_salsemen);
                      panel3.add(label_product);
                      panel3.add(textfield_sals_product);
                      panel3.add(label_quentity);
                      panel3.add(textfield_sals_quantity);
                      panel3.add(add_to_cart);
                      panel3.add(label_totalPrice);
                      panel3.add(textfield_sals_totalPrice);
                      panel3.add(add_to_cart);
                      panel3.add(empty_cart);
                      panel3.add(Show_all_product);
                    
                      
                      
                      
                    /*      
                             Dimension dim=new Dimension(500,500);
                            label_product.setPreferredSize(dim);
                           textfield_sals_product.setPreferredSize(dim);*/
                       panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS)); 
                       panel2.add(label_admin);
                       panel2.add(label_product_adm);
                       panel2.add(textfield_adm_Product);
                       panel2.add(label_quantity_adm);
                       panel2.add(textfield_adm_quantity);
                       panel2.add(label_price_adm);
                       panel2.add(textfield_adm_Price);
                       panel2.add(AddProduct);
                       panel2.add(DeletProduct);                    
                      
                        
                          frame.getContentPane().add(BorderLayout.WEST,panel);
			  frame.getContentPane().add(BorderLayout.EAST,panel2);
                          frame.getContentPane().add(BorderLayout.CENTER,panel3);
                
                     
                        
                   ///////////////////////////////////////////////////////////////////////////////     
                      
                             Calc c=new Calc();
                             one.addActionListener(c);
                             two.addActionListener(c);
                             three.addActionListener(c);
                             four.addActionListener(c);
                             five.addActionListener(c);
                             six.addActionListener(c);
                             seven.addActionListener(c);
                             eight.addActionListener(c);
                             nine.addActionListener(c);
                             zero.addActionListener(c);
                             dot.addActionListener(c);
                             clear.addActionListener(c);
                             add.addActionListener(c);
                             sub.addActionListener(c);
                             mul.addActionListener(c);
                             div.addActionListener(c);
                             equal.addActionListener(c);
                             
                             
                            sales s=new sales();
                            add_to_cart.addActionListener(s);
                            Show_all_product.addActionListener(s);
                            empty_cart.addActionListener(s);
                            
                            admin a =new admin(); 
                            AddProduct.addActionListener(a);
                            
                            DeletProduct.addActionListener(a);
                            
                             
                             
                             
                             
                             
			
			frame.setSize(500,500);
                        frame.setResizable(false);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		
		
	}
    
                 private class Calc implements ActionListener
                {
                      
                      @Override
                      public void actionPerformed(ActionEvent event){
                           
		
                  JButton src=(JButton)event.getSource();
                  if(src.equals(one)){
                    String value=ansfield.getText()+one.getText();
                      ansfield.setText(value);
                  }
                  if(src.equals(two)){
                    String value=ansfield.getText()+two.getText();
                      ansfield.setText(value);
                  }
                  if(src.equals(three)){
                    String value=ansfield.getText()+three.getText();
                      ansfield.setText(value);
                  }
                  if(src.equals(four)){
                    String value=ansfield.getText()+four.getText();
                      ansfield.setText(value);
                  }
                  if(src.equals(five)){
                    String value=ansfield.getText()+five.getText();
                      ansfield.setText(value);
                  }
                   if(src.equals(six)){
                    String value=ansfield.getText()+six.getText();
                      ansfield.setText(value);
                  }
                    if(src.equals(seven)){
                    String value=ansfield.getText()+seven.getText();
                      ansfield.setText(value);
                  }
                     if(src.equals(eight)){
                    String value=ansfield.getText()+eight.getText();
                      ansfield.setText(value);
                  }
                      if(src.equals(nine)){
                    String value=ansfield.getText()+nine.getText();
                      ansfield.setText(value);
                  }
                       if(src.equals(zero)){
                    String value=ansfield.getText()+zero.getText();
                      ansfield.setText(value);
                  }
                           if(src.equals(dot)){
                    String value=ansfield.getText()+dot.getText();
                      ansfield.setText(value);
                  }
                  
                  
                    if(src.equals(clear))
                           
                       {
                            ansfield.setText(null);
                           
                       }
                    
                    
                    
                    
                    
                       
                  if(src.equals(add))
                  {
                    
                       firstnum=Double.parseDouble(ansfield.getText());
                       ansfield.setText("");
                       operator="+";
                     
                     
                 }
                  
                  if(src.equals(sub))
                  {
                      
                     firstnum=Double.parseDouble(ansfield.getText());
                       ansfield.setText("");
                       operator="-";
                       
                  }
                  
                   if(src.equals(mul))
                  {
                      
                     firstnum=Double.parseDouble(ansfield.getText());
                       ansfield.setText("");
                       operator="*";
                       
                  }
                    if(src.equals(div))
                  {
                      
                     firstnum=Double.parseDouble(ansfield.getText());
                       ansfield.setText("");
                       operator="/";
                       
                  }
                    
           if(src.equals(equal))  
           {
         secondnum=Double.parseDouble(ansfield.getText());    
        switch (operator) {
            case "":
                 ansfield.setText("Enter a value");
            case "+":
                finalresult=firstnum+secondnum;
                ans=String.format("%.2f", finalresult);
                ansfield.setText(ans);
                break;
            case "-":
                finalresult=firstnum-secondnum;
                ans=String.format("%.2f", finalresult);
                ansfield.setText(ans);
                break;
            case "*":
                finalresult=firstnum*secondnum;
                ans=String.format("%.2f", finalresult);
                ansfield.setText(ans);
                break;
            case "/":
                finalresult=firstnum/secondnum;
                ans=String.format("%.2f", finalresult);
                ansfield.setText(ans);
                break;
        }
        }
                       
                      
                      
       }
                
                     
                
         }
                 
                   private class sales implements ActionListener
                {
                      
                      @Override
                      public void actionPerformed(ActionEvent event){
                           
		
                  JButton src2=(JButton) event.getSource();
                  
                   if(src2.equals(empty_cart))
                   {
                       
                       totalPrice=0;
                       textfield_sals_product.setText(null);
                    textfield_sals_quantity.setText(null);
                     textfield_sals_totalPrice.setText(null);                      
                   }
                  
                  if(src2.equals(add_to_cart))
                  
                  {
                   
                     System.out.println("ad.............................................");
                     
                     String pro=textfield_sals_product.getText();
                  qun=Integer.parseInt(textfield_sals_quantity.getText());  
                     
                     
                     DataAccess da=new DataAccess();
                      ResultSet rs =null;
                      String t="select price,Quantity from shop_management where product="+"'"+pro+"'";
                      
                     String q=t;
                     rs=da.getData(q);
                     
                     
                     
                       try {
                          while(rs.next())
                          {
                                
                                price=rs.getDouble("price");
                               quantity=rs.getInt("Quantity");
                            
                           }
                       }
                      catch (SQLException ex) {
                          Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                          
                      }
                      try {
                          da.close();
                      } catch (SQLException ex) {
                          Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                      }
        
                       
                   
                    
                    
                   totalPrice=totalPrice+(qun*price);
                   
                  
                    String n=String.format("%.2f", totalPrice); 
                   textfield_sals_totalPrice.setText(n);
                   
                   
                   quantity=quantity-qun;
                 
                 
                   q="update shop_management set "+ "Quantity="+quantity+" where product="+"'"+textfield_sals_product.getText()+"'";
                 //  System.out.println(q);
                   int c=da.updateDB(q);
             
                     
                
                   
                   
                    textfield_sals_product.setText(null);
                    textfield_sals_quantity.setText(null);
                     
                     
                   
                   
                   
              }
                 
                  if(src2.equals(Show_all_product))
                  {
                      
           DataAccess da=new DataAccess();
        ResultSet rs =null;
       String q="select * from shop_management";
        rs=da.getData(q);
                      try {
                          while(rs.next()){
                              String product = rs.getString("product");
                              int Quantity = rs.getInt("Quantity");
                              double price=rs.getDouble("price");
                              System.out.println("Product:"+product+"\tQuantity:"+Quantity+"\tPrice:"+price);
                                                        
                              
                          }
                      }
                      catch (SQLException ex) {
                          Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                      }
                      try {
                          da.close();
                      } catch (SQLException ex) {
                          Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                      }
        
                   
                     
                  }
              }
            }
                   
                 private class admin implements ActionListener
                {
                        public void actionPerformed(ActionEvent event){
                           
		
                  JButton src3=(JButton) event.getSource();
                
                  
                   if(src3.equals(AddProduct))
                   {
                      try {
                          prduct_admin=textfield_adm_Product.getText();
                          qunt_admin=textfield_adm_quantity.getText();
                          price_admin=textfield_adm_Price.getText();
                          System.out.println("---------------------------");
                          
                          
                   DataAccess da=new DataAccess();
                    String q="insert into shop_management values('"+prduct_admin+"',"+"'"+qunt_admin+"',"+"'"+price_admin+"')";
                     int c=da.updateDB(q);
                  
                  
                  textfield_adm_Product.setText(null);
                    textfield_adm_quantity.setText(null);
                    textfield_adm_Price.setText(null);
                    da.close();
                      } 
                      
                      catch (SQLException ex) {
                          Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                      }

                      
                     
                        
                   }
                   if(src3.equals(DeletProduct))
                   {
                       DataAccess da=new DataAccess();
                        prduct_admin=textfield_adm_Product.getText();
                    String q="delete from shop_management where product='"+prduct_admin+"'";
                    System.out.println(q);
                       int c=da.updateDB(q);
                       textfield_adm_Product.setText(null);
                    
                       try {
                          da.close();
                      } catch (SQLException ex) {
                          Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                      }
                   }
                   
                   
                   }
                     
                }  
                 
              
                 
               

                     
                    
                
  
}




