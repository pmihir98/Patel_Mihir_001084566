/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import Business.VitalSignHistory;
import Business.VitalSigns;


public class VitalSignHistory {
    
    public VitalSignHistory()
    {
     vitalSignHistory = new ArrayList<VitalSigns>();
    }
    
    private ArrayList<VitalSigns> vitalSignHistory;

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
     public VitalSigns addVitals() {
    
        VitalSigns vs = new VitalSigns();
        vitalSignHistory.add(vs);
        return vs;
        
    }
    
    public void deleteVitals(VitalSigns v){
    
        vitalSignHistory.remove(v);
    }
    
    public ArrayList<VitalSigns> getAbnormalList(double maxbp, double minbp){
        ArrayList<VitalSigns> abnList = new ArrayList<>();
        for(VitalSigns vs: vitalSignHistory) {
            if(vs.getBloodPressure()>maxbp || vs.getBloodPressure()<minbp){
                abnList.add(vs);
                
            }
        }
        return(abnList);
        
    
    } 
   
        
    
    } 

