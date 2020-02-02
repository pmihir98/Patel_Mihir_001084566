/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2a;

/**
 *
 * @author patelmihir
 */
import java.util.Scanner;
public class Assignment_2A {
static patientProp pp = new patientProp();
static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        System.out.println("Enter Age Group : ");
        pp.setAgeGrp(input.nextInt());
        
        System.out.println("Enter Respiratory rate : ");
        pp.setRespRt(input.nextInt());
        
        System.out.println("Enter Heart rate : ");
        pp.setRespRt(input.nextInt());
        
        System.out.println("Enter Blood pressure  : ");
        pp.setRespRt(input.nextInt());
        
        System.out.println("Enter Weight in Kilos : ");
        pp.setRespRt(input.nextInt());
        
        System.out.println("Enter Weight in pounds : ");
        pp.setRespRt(input.nextInt());
        
        if (isPatientNormal()==true){
            System.out.println("Condition is normal");
        } else if (isPatientNormal()==false) {
            System.out.println("Condition is anormal");
            
        }
        
        
        
    }
    
    static boolean isPatientNormal(){
        
        if(pp.getAgeGrp() == 0 && pp.getAgeGrp() == 1) {
            if(pp.getRespRt() <= 50 &&  pp.getRespRt() >=30 &&
                    pp.getHeartRt() >= 120 && pp.getHeartRt() <=160 &&
                    pp.getBp() >= 50 && pp.getBp() <= 70 &&
                    pp.getWeightKg() >= 2 && pp.getWeightKg() <= 3 &&
                    pp.getWeightLb() >=4.5 && pp.getWeightLb() <= 7 ){
                return true;
            }else{
                return false;
            }
               }
    else if(pp.getAgeGrp() == 0 && pp.getAgeGrp() == 1) {
            if(pp.getRespRt() <= 30 &&  pp.getRespRt() >=20 &&
                    pp.getHeartRt() >= 80 && pp.getHeartRt() <=140 &&
                    pp.getBp() >= 70 && pp.getBp() <= 100 &&
                    pp.getWeightKg() >= 4 && pp.getWeightKg() <= 10 &&
                    pp.getWeightLb() >= 9 && pp.getWeightLb() <= 22 ){
                return true;
            }else{
                return false;
            }
        
   
    
    }
        else if(pp.getAgeGrp() == 1 && pp.getAgeGrp() == 3) {
            if(pp.getRespRt() >= 20 &&  pp.getRespRt() <=30 &&
                    pp.getHeartRt() >= 80 && pp.getHeartRt() <=130 &&
                    pp.getBp() >= 80 && pp.getBp() <= 110 &&
                    pp.getWeightKg() >= 10 && pp.getWeightKg() <= 14 &&
                    pp.getWeightLb() >= 22 && pp.getWeightLb() <= 31 ){
                return true;
            }else{
                return false;
            }
        
   
    
    }
        else if(pp.getAgeGrp() == 3 && pp.getAgeGrp() == 5) {
            if(pp.getRespRt() >= 20 &&  pp.getRespRt() <=30 &&
                    pp.getHeartRt() >= 80 && pp.getHeartRt() <=120 &&
                    pp.getBp() >= 80 && pp.getBp() <= 110 &&
                    pp.getWeightKg() >= 14 && pp.getWeightKg() <= 18 &&
                    pp.getWeightLb() >= 31 && pp.getWeightLb() <= 40 ){
                return true;
            }else{
                return false;
            }
        
   
    
    }
        else if(pp.getAgeGrp() == 6 && pp.getAgeGrp() == 12) {
            if(pp.getRespRt() >= 20 &&  pp.getRespRt() <=30 &&
                    pp.getHeartRt() >= 70 && pp.getHeartRt() <=110 &&
                    pp.getBp() >= 80 && pp.getBp() <= 120 &&
                    pp.getWeightKg() >= 20 && pp.getWeightKg() <= 42 &&
                    pp.getWeightLb() >=41 && pp.getWeightLb() <= 92 ){
                return true;
            }else{
                return false;
            }
        
   
    
    }
        else if(pp.getAgeGrp() >= 13) {
            if(pp.getRespRt() >= 12 &&  pp.getRespRt() <=20 &&
                    pp.getHeartRt() >= 55 && pp.getHeartRt() <=105 &&
                    pp.getBp() >= 110 && pp.getBp() <= 120 &&
                    pp.getWeightKg() >  50  &&
                    pp.getWeightLb() >= 110  ){
                return true;
            }else{
                return false;
            }
        
   
    
    }
    return true;
}
}