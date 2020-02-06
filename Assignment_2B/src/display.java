
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
            
        String string = p[i].getName();
        System.out.println(i+" "+string);
                         
        }
       // int 
            
           // getInformation(k);
    }
    
    
    void checkVitalSigns(int o){
        
        String sgn=new String();
        int xy =0; 
        System.out.println("Available options are:\n1)Respitory Rate\n2)Heart Rate\n3)Weight (KG) \n4)Weight (LB)  ");
        
        while(xy==0){
        System.out.println("Enter Vital Sign you want to check:");
        sgn=sc.next();
       
        if (sgn.equals("Respiratory_Rate")==true) {
            System.out.println("Enter Respiratory Rate to check:");
           
            int res_rate= sc.nextInt();
           
            if(checkRes_rate(p[o].getAge_int(),res_rate)==false){
                System.out.println("----------ABNORMAL-----------");
                xy++;
            }else if(checkRes_rate(p[o].getAge_int(),res_rate)==true){
                System.out.println("=========Normal============");
                xy++;
            }          
        }else  if (sgn.equals("Heart_Rate")==true) {
            System.out.println("Enter Heart Rate to check:");
            int heart_rate=sc.nextInt();
            if(checkHeart_rate(p[o].getAge_int(),heart_rate)==false){
                System.out.println("----------ABNORMAL-----------");
                xy++;
            }else if(checkHeart_rate(p[o].getAge_int(),heart_rate)==true){
                System.out.println("=========Normal============");
                xy++;
            }          
        }else  if (sgn.equals("Blood_Pressure")==true) {
            System.out.println("Enter Respiratory Rate to check:");
            int bp=sc.nextInt();
            if(checKbp(p[o].getAge_int(),bp)==false){
                System.out.println("----------ABNORMAL-----------");
                xy++;
            }else if(checKbp(p[o].getAge_int(),bp)==true){
                System.out.println("=========Normal============");
                xy++;
            }          
        }else  if (sgn.equals("Weight_in_Kgs")==true) {
            System.out.println("Enter Weigth in KG to check:");
            int weight=sc.nextInt();
            if(checkWeight_kg(p[o].getAge_int(),weight)==false){
                System.out.println("----------ABNORMAL-----------");
                xy++;
            }else if(checkWeight_kg(p[o].getAge_int(),weight)==true){
                System.out.println("=========Normal============");
                xy++;
            }          
        }else  if (sgn.equals("Weight_in_Pounds")==true) {
            System.out.println("Enter Respiratory Rate to check:");
            int weight_lbs=sc.nextInt();
            if(checKWeight_Lb(p[o].getAge_int(),weight_lbs)==false){
                System.out.println("----------ABNORMAL-----------");
                xy++;
            }else if(checKWeight_Lb(p[o].getAge_int(),weight_lbs)==true){
                System.out.println("=========Normal============");
                xy++;
            }          
        }else{
            System.out.println("Incorrect Input \n Please enter again!!!");
        }
    }
    }
    
    
    
    
    boolean checkRes_rate(int age,int rate){
        
            if(age>=0 && age<=1){
                if(rate>=30 && rate<=50){
                    return true;
                }else{
                    return false;
                }
            }else if(age>1 && age<=3){
                if(rate>=20 && rate<=30){
                    return true;
                }else{
                    return false;
                }
            } else if(age>3 && age<=5){
                if(rate>=20 && rate<=30){
                    return true;
                }else{
                    return false;
                }
            } else if(age>=6 && age<=12){
                if(rate>=20 && rate<=30){
                    return true;
                }else{
                    return false;
                }
            } else if(age>12){
                if(rate>=12 && rate<=20){
                    return true;
                }else{
                    return false;
                }
            } 
            return true;
        
    }
    
    
    boolean checkHeart_rate(int age, int heartRate) {

        if (age == 0) {
            if (heartRate >= 120 && heartRate <= 160) {
                return true;
            } else {
                return false;
            }

        } else if (age > 0 && age <= 1) {
            if (heartRate >= 80 && heartRate <= 140) {
                return true;
            } else {
                return false;
            }
        } else if (age > 1 && age <= 3) {
            if (heartRate >= 80 && heartRate <= 130) {
                return true;
            } else {
                return false;
            }
        } else if (age > 3 && age <= 5) {
            if (heartRate >= 20 && heartRate <= 30) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 6 && age <= 12) {
            if (heartRate >= 70 && heartRate <= 110) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 13) {
            if (heartRate >= 55 && heartRate <= 105) {
                return true;
            } else {
                return false;
            }
        }
        return true;

    }
    boolean checKbp(int age, int stolicBP) {

        if (age == 0) {
            if (stolicBP >= 50 && stolicBP <= 70) {
                return true;
            } else {
                return false;
            }

        } else if (age > 0 && age <= 1) {
            if (stolicBP >= 70 && stolicBP <= 100) {
                return true;
            } else {
                return false;
            }
        } else if (age > 1 && age <= 3) {
            if (stolicBP >= 80 && stolicBP <= 110) {
                return true;
            } else {
                return false;
            }
        } else if (age > 3 && age <= 5) {
            if (stolicBP >= 80 && stolicBP <= 110) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 6 && age <= 12) {
            if (stolicBP >= 80 && stolicBP <= 120) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 13) {
            if (stolicBP >= 110 && stolicBP <= 120) {
                return true;
            } else {
                return false;
            }
        }
        return true;

    }
    
    boolean checkWeight_kg(int age, int Weightkgs) {

        if (age == 0) {
            if (Weightkgs >= 2 && Weightkgs <= 3) {
                return true;
            } else {
                return false;
            }

        } else if (age > 0 && age <= 1) {
            if (Weightkgs >= 4 && Weightkgs <= 10) {
                return true;
            } else {
                return false;
            }
        } else if (age > 1 && age <= 3) {
            if (Weightkgs >= 10 && Weightkgs <= 14) {
                return true;
            } else {
                return false;
            }
        } else if (age > 3 && age <= 5) {
            if (Weightkgs >= 14 && Weightkgs <= 18) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 6 && age <= 12) {
            if (Weightkgs >= 20 && Weightkgs <= 42) {
                return true;
            } else {
                return false;
            }
        } else if (age > 12) {
            if (Weightkgs >= 50) {
                return true;
            } else {
                return false;
            }
        }
        return true;

    }
    
    boolean checKWeight_Lb(int age, int weightPnds) {

        if (age == 0) {
            if (weightPnds >= 4.5 && weightPnds <= 7) {
                return true;
            } else {
                return false;
            }

        } else if (age >= 0 && age <= 1) {
            if (weightPnds >= 9 && weightPnds <= 22) {
                return true;
            } else {
                return false;
            }
        } else if (age > 1 && age <= 3) {
            if (weightPnds >= 22 && weightPnds <= 31) {
                return true;
            } else {
                return false;
            }
        } else if (age > 3 && age <= 5) {
            if (weightPnds >= 31 && weightPnds <= 40) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 6 && age <= 12) {
            if (weightPnds >= 41 && weightPnds <= 92) {
                return true;
            } else {
                return false;
            }
        } else if (age > 12) {
            if (weightPnds >= 110) {
                return true;
            } else {
                return false;
            }
        }
        return true;

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


