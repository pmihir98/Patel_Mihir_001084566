
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patelmihir
 */
public class Patient {
    
    int weight_kg_int;
    int weight_lb_int;
    int resp_rt_int;
    int heart_rt_int;
    int bp_int;
    int age_int;
    String name;
    
    ArrayList<Integer> age = new ArrayList<>(100);
    ArrayList<Integer> weight_kg = new ArrayList<>(100);
    ArrayList<Integer> weight_lb = new ArrayList<>(100);
    ArrayList<Integer> resp_rt = new ArrayList<>(100);
    ArrayList<Integer> heart_rt = new ArrayList<>(100);
    ArrayList<Integer> bp = new ArrayList<>(100);
    
    String str = new String();
    public int getAge_int() {
        return age_int;
    }

    public void setAge_int(int age_int) {
        age.add(age_int);
        this.age_int = age_int;
    }
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public int getWeight_kg_int() {
        return weight_kg_int;
    }

    public void setWeight_kg_int(int weight_kg_int) {
        weight_kg.add(weight_kg_int);
        this.weight_kg_int = weight_kg_int;
    }

    public int getWieght_lb_int() {
        return weight_lb_int;
    }

    public void setWieght_lb_int(int wieght_lb_int) {
        
        weight_lb.add(weight_lb_int);
        this.weight_lb_int = wieght_lb_int;
    }

    public int getResp_rt_int() {
        return resp_rt_int;
    }

    public void setResp_rt_int(int resp_rt_int) {
        resp_rt.add(resp_rt_int);
        this.resp_rt_int = resp_rt_int;
    }

    public int getHeart_rt_int() {
        return heart_rt_int;
    }

    public void setHeart_rt_int(int heart_rt_int) {
        heart_rt.add(heart_rt_int);
        this.heart_rt_int = heart_rt_int;
    }

    public int getBp_int() {
        return bp_int;
    }

    public void setBp_int(int bp_int) {
        bp.add(bp_int);
        this.bp_int = bp_int;
    }

    public ArrayList<Integer> getAge() {
        return age;
    }

    public void setAge(ArrayList<Integer> age) { 
        this.age = age;
    }

    public ArrayList<Integer> getWeight_kg() {
        return weight_kg;
    }

    public void setWeight_kg(ArrayList<Integer> weight_kg) {
        this.weight_kg = weight_kg;
    }

    public ArrayList<Integer> getWeight_lb() {
        return weight_lb;
    }

    public void setWeight_lb(ArrayList<Integer> weight_lb) {
        this.weight_lb = weight_lb;
    }

    public ArrayList<Integer> getResp_rt() {
        return resp_rt;
    }

    public void setResp_rt(ArrayList<Integer> resp_rt) {
        this.resp_rt = resp_rt;
    }

    public ArrayList<Integer> getHeart_rt() {
        return heart_rt;
    }

    public void setHeart_rt(ArrayList<Integer> heart_rt) {
        this.heart_rt = heart_rt;
    }

    public ArrayList<Integer> getBp() {
        return bp;
    }

    public void setBp(ArrayList<Integer> bp) {
        this.bp = bp;
    }

    
    
    
    
}
