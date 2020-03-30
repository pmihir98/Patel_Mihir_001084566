/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chief_kmv
 */
public class MenuClass {
    int index=0;
    Scanner scan=new Scanner(System.in);
    Patient patient[]=new Patient[100];
    void OpenMenu(){
        
        boolean i=true;
        
        while(i==true){
            System.out.println("\n\n1)Create");
            System.out.println("2)History");
            System.out.println("3)Check Abnormal Vital Signs");
            System.out.println("4)Update new Vital Signs");
            System.out.println("5)Exit");
            int a=scan.nextInt();
            if(a==1){
                index++;
                CreateNewPatient(index);
            }else if(a==5){
                i=false;
            }else if(a==2){
                getHistoryPatient();
            }else if(a==4){
                updateInformation();
            }else if(a==3){
                checkAbnormal();
            }
            
        }
    }
    
    void CreateNewPatient(int m){
        
      
        
        patient[m]=new Patient();
        System.out.println("\n\nEnter Name of Patient:");
        patient[m].setName(scan.next());
       
        System.out.println("Enter the age of Person:");
        patient[m].setAge_int(scan.nextInt());
        
        
        System.out.println("Enter the Respiratory Rate:");
        patient[m].setRes_rate_int(scan.nextInt());
        
       
        
        System.out.println("Enter the Heart Rate:");
        patient[m].setHeart_rate_int(scan.nextInt());
        
         System.out.println("Enter the Blood Pressure:");
        patient[m].setBp_int(scan.nextInt());
        
        System.out.println("Enter the Weight(Kgs):");
        patient[m].setWeight_int(scan.nextDouble());
        
        System.out.println("Enter the Weight(lbs):");
        patient[m].setWeight_lbs_int(scan.nextDouble());
        
        
        if(isPatientNormal(m)==false){
            System.out.println("\n\n----------Abnormal-----------");
            patient[m].setCondition_String("=====Abnormal Condition=======");
        }else if(isPatientNormal(m)==true){
            System.out.println("\n\n------------Normal------------");
            patient[m].setCondition_String("========Normal Condition=========");
        }
       
        
    }
    
    void getHistoryPatient(){
        for(int i=1;i<=index;i++){
            
        String s=patient[i].getName();
        System.out.println(i+" "+s);
                         
        }
        System.out.println("Enter Patient's Index:");
            int k=scan.nextInt();
            
            getInformation(k);
        
    }
    
    void getInformation(int i){
        System.out.println(patient[i].getName());
           for(int l=0;l<patient[i].getAge().size();l++){
                System.out.println("\n\nVisit:"+(l+1)+":Age:"+patient[i].age.get(l));
                System.out.println("Visit:"+(l+1)+":Heart Rate:"+patient[i].heart_rate.get(l));
                System.out.println("Visit:"+(l+1)+":Respirotary Rate:"+patient[i].res_rate.get(l));
                System.out.println("Visit:"+(l+1)+":Blood Pressure:"+patient[i].blood_pressure.get(l));
                System.out.println("Visit:"+(l+1)+":Weight in KGs:"+patient[i].weight.get(l));
                System.out.println("Visit:"+(l+1)+":Weight in LBs:"+patient[i].weight_lbs.get(l));
                System.out.println("Visit:"+(l+1)+":Condition:"+patient[i].condition.get(l));
            }   
        
        
    }
    
    void updateInformation(){
        int k;
            for(int i=1;i<=index;i++){
            
            
            System.out.println(i+" "+patient[i].getName());
  
            
        }       
            System.out.println("Enter Patient's Index:");
             k=scan.nextInt();
            updatePatient(k);
    }
    
    void updatePatient(int m){
        System.out.println("\n\nEnter the new age of Person:");
        patient[m].setAge_int(scan.nextInt());
        
        System.out.println("Enter the new Respiratory Rate:");
        patient[m].setRes_rate_int(scan.nextInt());
        
        System.out.println("Enter the new Blood Pressure:");
        patient[m].setBp_int(scan.nextInt());
        
        System.out.println("Enter the new Heart Rate:");
        patient[m].setHeart_rate_int(scan.nextInt());
        
        System.out.println("Enter the new Weight(Kgs):");
        patient[m].setWeight_int(scan.nextDouble());
        
        System.out.println("Enter the new Weight(lbs):");
        patient[m].setWeight_lbs_int(scan.nextDouble());
    
        
        if(isPatientNormal(m)==false){
            System.out.println("\n\n----------Abnormal-----------");
            patient[m].setCondition_String("=====Abnormal Condition=======");
            
        }else if(isPatientNormal(m)==true){
            System.out.println("\n\n------------Normal------------");
            patient[m].setCondition_String("========Normal Condition=========");
        }
        
    }
    
    void checkAbnormal(){
        int k;
          for(int i=1;i<=index;i++){
            System.out.println(i+" "+patient[i].getName());
            }
          System.out.println("\n\nEnter Patient's Index:");
             k=scan.nextInt();
             checkVitalSigns(k);
          
    }
    
    void checkVitalSigns(int o){
        String sign=new String();
        int abc=0;
        System.out.println("\n\nAvailable options are:\n1)Respitory_Rate\n2)Heart_Rate\n3)Blood_Pressure\n4)Weight_in_Kgs\n5)Weight_in_Pounds  ");
        while(abc==0){
        System.out.println("\nEnter Vital Sign you want to check:");
        sign=scan.next();
        if (sign.equals("Respiratory_Rate")==true) {
            System.out.println("\n\nEnter Respiratory Rate to check:");
            int res_rate=scan.nextInt();
            if(verifyRes_rate(patient[o].getAge_int(),res_rate)==false){
                System.out.println("\n\n----------ABNORMAL-----------");
                abc++;
            }else if(verifyRes_rate(patient[o].getAge_int(),res_rate)==true){
                System.out.println("\n\n=========Normal============");
                abc++;
            }          
        }else  if (sign.equals("Heart_Rate")==true) {
            System.out.println("\n\nEnter Heart Rate to check:");
            int heart_rate=scan.nextInt();
            if(verifyHeart_rate(patient[o].getAge_int(),heart_rate)==false){
                System.out.println("\n\n----------ABNORMAL-----------");
                abc++;
            }else if(verifyHeart_rate(patient[o].getAge_int(),heart_rate)==true){
                System.out.println("\n\n=========Normal============");
                abc++;
            }          
        }else  if (sign.equals("Blood_Pressure")==true) {
            System.out.println("\n\nEnter Respiratory Rate to check:");
            int bp=scan.nextInt();
            if(verifyStolic_bp(patient[o].getAge_int(),bp)==false){
                System.out.println("\n\n----------ABNORMAL-----------");
                abc++;
            }else if(verifyStolic_bp(patient[o].getAge_int(),bp)==true){
                System.out.println("\n\n=========Normal============");
                abc++;
            }          
        }else  if (sign.equals("Weight_in_Kgs")==true) {
            System.out.println("\n\nEnter Weigth in KG to check:");
            double weight=scan.nextDouble();
            if(verifyWeight_kgs(patient[o].getAge_int(),weight)==false){
                System.out.println("\n\n----------ABNORMAL-----------");
                abc++;
            }else if(verifyWeight_kgs(patient[o].getAge_int(),weight)==true){
                System.out.println("\n\n=========Normal============");
                abc++;
            }          
        }else  if (sign.equals("Weight_in_Pounds")==true) {
            System.out.println("\n\nEnter Respiratory Rate to check:");
            double weight_lbs=scan.nextDouble();
            if(verifyWeight_pnds(patient[o].getAge_int(),weight_lbs)==false){
                System.out.println("\n\n----------ABNORMAL-----------");
                abc++;
            }else if(verifyWeight_pnds(patient[o].getAge_int(),weight_lbs)==true){
                System.out.println("\n\n=========Normal============");
                abc++;
            }          
        }else{
            System.out.println("\n\nIncorrect Input \n Please enter again!!!");
        }
    }
    }
    
    boolean verifyRes_rate(int age,int rate){
            if (age == 0) {
                if (rate >= 30 && rate <= 50) {
                return true;
            } else {
                return false;
            }
        }else if(age>=0 && age<=1){
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
    boolean verifyHeart_rate(int age, int heartRate) {

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
    boolean verifyStolic_bp(int age, int stolicBP) {

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
    
    boolean verifyWeight_kgs(int age, double Weightkgs) {

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
    
    boolean verifyWeight_pnds(int age, double weightPnds) {

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
    
    
    
    
    boolean isPatientNormal(int p){
        
        
        System.out.println(patient[p].getAge_int());
        if(patient[p].getAge_int()==0){
            //System.out.println("Infant");
            if (patient[p].getRes_rate_int()>=30 && patient[p].getRes_rate_int()<=50 && 
                    patient[p].getHeart_rate_int()>=120 && patient[p].getHeart_rate_int()<=160 && 
                    patient[p].getBp_int()>=50 && patient[p].getBp_int()<=70 &&
                    patient[p].getWeight_int()>=2 && patient[p].getWeight_int()<=3 &&
                    patient[p].getWeight_lbs_int()>=4 && patient[p].getWeight_lbs_int()<=7) {
                return true;
            }else{
                return false;
            }
        }else if(patient[p].getAge_int()>=0 && patient[p].getAge_int()<=1){
            //System.out.println("Infant");
            if (patient[p].getRes_rate_int()>=20 && patient[p].getRes_rate_int()<=30 && 
                    patient[p].getHeart_rate_int()>=80 && patient[p].getHeart_rate_int()<=140 && 
                    patient[p].getBp_int()>=70 && patient[p].getBp_int()<=100 &&
                    patient[p].getWeight_int()>=4 && patient[p].getWeight_int()<=10 &&
                    patient[p].getWeight_lbs_int()>=9 && patient[p].getWeight_lbs_int()<=22) {
                return true;
            }else{
                return false;
            }           
        }else if(patient[p].getAge_int()>1 && patient[p].getAge_int()<=3){
            //System.out.println("Toddler");
            if (patient[p].getRes_rate_int()>=20 && patient[p].getRes_rate_int()<=30 && 
                    patient[p].getHeart_rate_int()>=80 && patient[p].getHeart_rate_int()<=130 && 
                    patient[p].getBp_int()>=80 && patient[p].getBp_int()<=110 &&
                    patient[p].getWeight_int()>=10 && patient[p].getWeight_int()<=14 &&
                    patient[p].getWeight_lbs_int()>=22 && patient[p].getWeight_lbs_int()<=31) {
                return true;
            }else{
                return false;
            }           
            
        }else if(patient[p].getAge_int()>3 && patient[p].getAge_int()<=5){
            //System.out.println("school");
            if (patient[p].getRes_rate_int()>=20 && patient[p].getRes_rate_int()<=30 && 
                    patient[p].getHeart_rate_int()>=80 && patient[p].getHeart_rate_int()<=120 && 
                    patient[p].getBp_int()>=80 && patient[p].getBp_int()<=110 &&
                    patient[p].getWeight_int()>=14 && patient[p].getWeight_int()<=18 &&
                    patient[p].getWeight_lbs_int()>=31 && patient[p].getWeight_lbs_int()<=40) {
                return true;
            }else{
                return false;
            }           
            
        }else if(patient[p].getAge_int()>=6 && patient[p].getAge_int()<=12){
            //System.out.println("bacha");
            if (patient[p].getRes_rate_int()>=20 && patient[p].getRes_rate_int()<=30 && 
                    patient[p].getHeart_rate_int()>=70 && patient[p].getHeart_rate_int()<=110 && 
                    patient[p].getBp_int()>=80 && patient[p].getBp_int()<=120 &&
                    patient[p].getWeight_int()>=20 && patient[p].getWeight_int()<=42 &&
                    patient[p].getWeight_lbs_int()>=41 && patient[p].getWeight_lbs_int()<=92) {
                return true;
                
            }else{
                return false;
            }           
            
        }else if(patient[p].getAge_int()>12){
            
            //System.out.println("Adult");
            if (patient[p].getRes_rate_int()>=12 && patient[p].getRes_rate_int()<=20 && 
                    patient[p].getHeart_rate_int()>=55 && patient[p].getHeart_rate_int()<=105 && 
                    patient[p].getBp_int()>=110 && patient[p].getBp_int()<=120 &&
                    patient[p].getWeight_int()>=50 &&
                    patient[p].getWeight_lbs_int()>=110 ) {
                return true;
            }else{
                return false;
            }           
            
        }
        return true;
    }
    
    
}
