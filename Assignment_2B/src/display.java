
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
            System.out.println("3. Check whether Patient is abnormal or not");
            System.out.println("4. Update Patient records");       
            System.out.println("5. Exit here");
            
            a = sc.nextInt();
            
            
            if (a==1) {
                index++;
                createPatient(index);
                
                   
            }
            
            else if (a==2){

               history();
               
                
            } 
            
            else if (a == 3){
             
                chkVitalSigns(index);
                
            }
            
            else if (a == 4){
                updateInfo();
                
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
        
        System.out.println("Enter Weight in Pound : ");
        p[n].setWieght_lb_int(sc.nextInt());
        
        if (isPatientNormal(n)==true){
            System.out.println("Condition is normal");
        } else if (isPatientNormal(n)==false) {
            System.out.println("Condition is abnormal");
            
        }
        
        
        
        
    }
    
        void history(){
        for(int i=1;i<=index;i++){
            
        String s=p[i].getName();
        System.out.println(i+" "+s);
                         
        }
        System.out.println("Enter Patient's Index:");
            int k=sc.nextInt();
            
           getInfo(k);
         
        
    }
    
   
        
        
        void getInfo(int i){
       System.out.println(p[i].getName());
           
       for(int l=0;l<p[i].getAge().size();l++){
                System.out.println("Visit:"+(l+1)+":Age:"+p[i].age.get(l));
                System.out.println("Visit:"+(l+1)+":Heart Rate:"+p[i].heart_rt.get(l));
                System.out.println("Visit:"+(l+1)+":Respirotary Rate:"+p[i].resp_rt.get(l));
                System.out.println("Visit:"+(l+1)+":Blood Pressure:"+p[i].bp.get(l));
                System.out.println("Visit:"+(l+1)+":Weight in KGs:"+p[i].weight_kg.get(l));
                System.out.println("Visit:"+(l+1)+":Weight in LBs:"+p[i].weight_lb.get(l));
            }  
   }
        
        
    
    
    void updateInfo(){
        int k;
            for(int i=1;i<=index;i++){
            
            
            System.out.println(i+" "+p[i].getName());
  
            
        }       
            System.out.println("Enter Patient's Index:");
             k=sc.nextInt();
            updatePatient(k);
    }
    
    void updatePatient(int m){
        
        System.out.println("Enter the new age of Person:");
        p[m].setAge_int(sc.nextInt());
        
        System.out.println("Enter the new Respiratory Rate:");
        p[m].setResp_rt_int(sc.nextInt());
        
        System.out.println("Enter the new Blood Pressure:");
        p[m].setBp_int(sc.nextInt());
        
        System.out.println("Enter the new Heart Rate:");
        p[m].setHeart_rt_int(sc.nextInt());
        
        System.out.println("Enter the new Weight(Kgs):");
        p[m].setWeight_kg_int(sc.nextInt());
        
        System.out.println("Enter the new Weight(lbs):");
        p[m].setWieght_lb_int(sc.nextInt());
    
        
        if (isPatientNormal(m)==true){
            System.out.println("Condition is normal");
        } else if (isPatientNormal(m)==false) {
            System.out.println("Condition is abnormal");
            
        }
        
    }
    
    void checkAbnormal(){
        int z;
          
        for(int i=1;i<=index;i++){
            System.out.println(i+" "+p[i].getName());
            }
          
          System.out.println("Enter Patient's Index:");
             z=sc.nextInt();
             chkVitalSigns(z);
          
    }
    
    
    void chkVitalSigns(int o){
        
        String sgn=new String();
        int xy =0; 
        System.out.println("Available options are:\n1)Respitory Rate\n2)Heart Rate\n3)Weight (KG) \n4)Weight (LB)  ");
        
        while(xy==0){
        System.out.println("Enter Vital Sign you want to check:");
        sgn=sc.next();
       
        if (sgn.equals("Respiratory_Rate")==true) {
            System.out.println("Enter Respiratory Rate to check:");
           
            int res_rate= sc.nextInt();
           
            if(checkRes_rate(p[o].getResp_rt_int(),res_rate)==false){
                System.out.println("----------ABNORMAL-----------");
                xy++;
            }else if(checkRes_rate(p[o].getResp_rt_int(),res_rate)==true){
                System.out.println("=========Normal============");
                xy++;
            }          
        }
        else  if (sgn.equals("Heart_Rate")==true) {
            System.out.println("Enter Heart Rate to check:");
            int heart_rate=sc.nextInt();
            if(checkHeart_rate(p[o].getHeart_rt_int(),heart_rate)==false){
                System.out.println("----------ABNORMAL-----------");
                xy++;
            }else if(checkHeart_rate(p[o].getHeart_rt_int(),heart_rate)==true){
                System.out.println("=========Normal============");
                xy++;
            }          
        }
        else  if (sgn.equals("Blood_Pressure")==true) {
            System.out.println("Enter Respiratory Rate to check:");
            int bp=sc.nextInt();
            if(checKbp(p[o].getBp_int(),bp)==false){
                System.out.println("----------ABNORMAL-----------");
                xy++;
            }else if(checKbp(p[o].getBp_int(),bp)==true){
                System.out.println("=========Normal============");
                xy++;
            }          
        }
        else  if (sgn.equals("Weight_in_Kgs")==true) {
            System.out.println("Enter Weigth in KG to check:");
            int weight=sc.nextInt();
            if(checkWeight_kg(p[o].getWeight_kg_int(),weight)==false){
                System.out.println("----------ABNORMAL-----------");
                xy++;
            }else if(checkWeight_kg(p[o].getWeight_kg_int(),weight)==true){
                System.out.println("=========Normal============");
                xy++;
            }          
        }
        else  if (sgn.equals("Weight_in_Pounds")==true) {
            System.out.println("Enter Respiratory Rate to check:");
            int weight_lbs=sc.nextInt();
            if(checKWeight_Lb(p[o].getWieght_lb_int(),weight_lbs)==false){
                System.out.println("----------ABNORMAL-----------");
                xy++;
            }else if(checKWeight_Lb(p[o].getWieght_lb_int(),weight_lbs)==true){
                System.out.println("=========Normal============");
                xy++;
            }          
        }
        else{
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
    boolean checKbp(int age, int bp) {

        if (age == 0) {
            if (bp >= 50 && bp <= 70) {
                return true;
            } else {
                return false;
            }

        } else if (age > 0 && age <= 1) {
            if (bp >= 70 && bp <= 100) {
                return true;
            } else {
                return false;
            }
        } else if (age > 1 && age <= 3) {
            if (bp >= 80 && bp <= 110) {
                return true;
            } else {
                return false;
            }
        } else if (age > 3 && age <= 5) {
            if (bp >= 80 && bp <= 110) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 6 && age <= 12) {
            if (bp >= 80 && bp <= 120) {
                return true;
            } else {
                return false;
            }
        } else if (age >= 13) {
            if (bp >= 110 && bp <= 120) {
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


