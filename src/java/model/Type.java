package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lipi Patel
 */
public class Type
{
    
    private String Type_id;
    private String Type_name;
    private float Basic_pay;

    /**
     * @return the Type_id
     */
    public String getType_id() {
        return Type_id;
    }

    /**
     * @param Type_id the Type_id to set
     */
    public void setType_id(String Type_id) {
        this.Type_id = Type_id;
    }

    /**
     * @return the Type_name
     */
    public String getType_name() {
        return Type_name;
    }

    /**
     * @param Type_name the Type_name to set
     */
    public void setType_name(String Type_name) {
        this.Type_name = Type_name;
    }

    /**
     * @return the Basic_pay
     */
    public float getBasic_pay() {
        return Basic_pay;
    }

    /**
     * @param Basic_pay the Basic_pay to set
     */
    public void setBasic_pay(float Basic_pay) {
        this.Basic_pay = Basic_pay;
    }
}
