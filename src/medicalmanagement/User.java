/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalmanagement;

/**
 *
 * @author user
 */
class User { 
   private String name,entry,add,blood,con,date,isu; 
    
   public User(String name,String entry,String add,String blood,String con,String date,String isu)
   {
       this.name=name;
       this.entry=entry;
       this.add=add;
       this.blood=blood;
       this.con=con;
       this.date=date;
       this.isu=isu;
   }
   
   public String getname() {
       return name;
   }
   
   public String getentry() {
       return entry;
   }
   
   public String getadd() {
       return add;
   }
   
   public String getblood() {
       return blood;
   }
   
   public String getcon() {
       return con;
   }
   
   public String getdate() {
       return date;
   }
   
   public String getisu() {
       return isu;
   }
}
