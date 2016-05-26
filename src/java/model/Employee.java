/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lipi Patel
 */
public class Employee
{
   private String emp_ssn;
   private String Fname;
   private String Gender;
  // private String startDate;   
   private String dnum;
     private String empType;
       private String pMethod;

    public Employee()
    {
        
    }
   
    public Employee(String essn,String fname,String gender,String Dnum,String emptype,String pmethod)
       {
           
           emp_ssn=essn;
       Fname=fname;
       Gender=gender;
       //startDate=startdate;
       dnum=Dnum;
       empType=emptype;
       pMethod=pmethod;
       
           
       }
    /**
     * @return the Emp_ssn
     */
    public String getEmp_ssn() {
        return emp_ssn;
    }

    /**
     * @param Emp_ssn the Emp_ssn to set
     */
    public void setEmp_ssn(String Emp_ssn) {
        this.emp_ssn = Emp_ssn;
    }

    /**
     * @return the Fname
     */
    public String getFname() {
        return Fname;
    }

    /**
     * @param Fname the Fname to set
     */
    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    /**
     * @return the startDate
     */
    /*public String getStartDate() {
        return startDate;
    }

    
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    } */

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the dnum
     */
    public String getDnum() {
        return dnum;
    }

    /**
     * @param dnum the dnum to set
     */
    public void setDnum(String dnum) {
        this.dnum = dnum;
    }

    /**
     * @return the empType
     */
    public String getEmpType() {
        return empType;
    }

    /**
     * @param empType the empType to set
     */
    public void setEmpType(String empType) {
        this.empType = empType;
    }

    /**
     * @return the pMethod
     */
    public String getpMethod() {
        return pMethod;
    }

    /**
     * @param pMethod the pMethod to set
     */
    public void setpMethod(String pMethod) {
        this.pMethod = pMethod;
    }


    
   
      
}
