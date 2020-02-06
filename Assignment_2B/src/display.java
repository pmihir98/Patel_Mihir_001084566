
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patelmihir
 */
public class display {
    
    int index = 0;
    Patient p[] = new Patient[10000];
    Scanner sc  = new Scanner(System.in);
    int a = 0;
    
    int i = 0;
    
    void displayMenu(){
    
    while( i == 0){
            System.out.println("1. Create Patient Record");
            System.out.println("2. History of Patient");
            System.out.println("3. Check whether p is abnormal or not");
            System.out.println("4. Update p records");       
            System.out.println("5. Exit here");
            
            a = sc.nextInt();
            
            
            if (a==1) {
                index++;
                createPatient(index);
                
                   
            }
            
            else if (a==2){
               // getHistory();
                
           
            } 
            
            else if (a == 3){
               // checkVitals();
                
            }
            
            else if (a == 4){
                //updateVitals();
                
            }
           
            else if (a==5){
            i = 2;
                
    
            }
            
    
        }
    
    }
    
    
    
    
    void createPatient(int n){
         p[n]= new Patient();
        
        System.out.println("Enter Patient Name : ");
        p[n].setName(sc.next());
        
        System.out.println("Enter Age group");
        p[n].setAge_int(sc.nextInt());
        
        System.out.println("Enter Respiratory rate : ");
        p[n].setResp_rt_int(sc.nextInt());
        
        System.out.println("Enter Heart rate : ");
        p[n].setHeart_rt_int(sc.nextInt());
        
        System.out.println("Enter Blood pressure  : ");
        p[n].setBp_int(sc.nextInt());
        
        System.out.println("Enter Weight in Kilos : ");
        p[n].setWeight_kg_int(sc.nextInt());
        
        if (isPatientNormal(n)==true){
            System.out.println("Condition is normal");
        } else if (isPatientNormal(n)==false) {
            System.out.println("Condition is anormal");
            
        }
        
        
        
        
    }
    
    void getHistroy(){
        for(int i=1;i<=index;i++){
            
        String s= p[i].getName();
        System.out.println(i+" "+s);
                         
        }
       // int 
            
           // getInformation(k);
    }
    
     boolean isPatientNormal(int a){
        
        
        System.out.println(p[a].getAge_int());
        if(p[a].getAge_int()>=0 && p[a].getAge_int()<=1){
            System.out.println("Infant");
            if (p[a].getResp_rt_int() >=30 && p[a].getResp_rt_int() <=50 && 
                    p[a].getHeart_rt_int() >=120 && p[a].getHeart_rt_int() <=160 && 
                    p[a].getBp_int() >=50 && p[a].getBp_int()<=70 &&
                    p[a].getWeight_kg_int()>=2 && p[a].getWeight_kg_int()<=3 &&
                    p[a].getWieght_lb_int()>=4 && p[a].getWieght_lb_int() <=7) {
                return true;
            }else{
                return false;
            }           
        }
        else if(p[a].getAge_int()>1 && p[a].getAge_int()<=3){
            System.out.println("Toddler");
            if (p[a].getResp_rt_int()>=20 && p[a].getResp_rt_int()<=30 && 
                    p[a].getHeart_rt_int()>=80 && p[a].getHeart_rt_int()<=140 && 
                    p[a].getBp_int()>=70 && p[a].getBp_int()<=100 &&
                    p[a].getWeight_kg_int()>=4 && p[a].getWeight_kg_int()<=10 &&
                    p[a].getWieght_lb_int()>=9 && p[a].getWieght_lb_int()<=22) {
                return true;
            }else{
                return false;
            }           
            
        }else if(p[a].getAge_int()>3 && p[a].getAge_int()<=5){
            System.out.println("school");
            if (p[a].getResp_rt_int()>=20 && p[a].getResp_rt_int()<=30 && 
                    p[a].getHeart_rt_int()>=80 && p[a].getHeart_rt_int()<=140 && 
                    p[a].getBp_int()>=80 && p[a].getBp_int()<=110 &&
                    p[a].getWeight_kg_int()>=10 && p[a].getWeight_kg_int()<=14 &&
                    p[a].getWieght_lb_int()>=22 && p[a].getWieght_lb_int()<=31) {
                return true;
            }else{
                return false;
            }           
            
        }else if(p[a].getAge_int()>=6 && p[a].getAge_int()<=12){
            System.out.println("Kid");
            if (p[a].getResp_rt_int()>=20 && p[a].getResp_rt_int()<=30 && 
                    p[a].getHeart_rt_int()>=80 && p[a].getHeart_rt_int()<=120 && 
                    p[a].getBp_int()>=80 && p[a].getBp_int()<=110 &&
                    p[a].getWeight_kg_int()>=20 && p[a].getWeight_kg_int()<=42 &&
                    p[a].getWieght_lb_int()>=41 && p[a].getWieght_lb_int()<=92) {
                return true;
                
            }else{
                return false;
            }           
            
        }else if(p[a].getAge_int()>12){
            
            System.out.println("Adult");
            if (p[a].getResp_rt_int()>=12 && p[a].getResp_rt_int()<=20 && 
                    p[a].getHeart_rt_int()>=55 && p[a].getHeart_rt_int()<=105 && 
                    p[a].getBp_int()>=110 && p[a].getBp_int()<=120 &&
                    p[a].getWeight_kg_int()>=50 &&
                    p[a].getWieght_lb_int()>=110 ) {
                return true;
            }else{
                return false;
            }           
            
        }
        
        return true;
    }
        
            
     
}       


