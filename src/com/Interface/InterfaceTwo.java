package com.Interface;
interface VoterIdDetails{
    void age();
    void nationality();
    static void state(){
        System.out.println("Must permanent address inside tamilNadu");
    }
}
interface EmployeeRules{
    void salary();
    void transfer();
    void leave();
}
interface PassportDetails extends VoterIdDetails{
    void address();
}
class CompanyOne implements EmployeeRules,VoterIdDetails{

    @Override
    public void age() {
        System.out.println("Age must have 18 or above 18.");
    }

    @Override
    public void nationality() {
        System.out.println("Must have indian citizen.");
    }

    @Override
    public void salary() {
        System.out.println("Salary is minimum 10000.");
    }

    @Override
    public void transfer() {
        System.out.println("Transfer within a india.");
    }

    @Override
    public void leave() {
        System.out.println("Take leaves minimum 12 days per year.");
    }
}
class CompanyTwo extends CompanyOne implements PassportDetails{

    @Override
    public void address() {
        System.out.println("Need Your valid address.");
    }
}
public class InterfaceTwo{
    public static void main(String[] args) {
        System.out.println("__________________________");
        System.out.println("Company One Requirements :");
        CompanyOne companyOne= new CompanyOne();
        companyOne.age();
        companyOne.leave();
        companyOne.nationality();
        companyOne.transfer();
        companyOne.salary();
        VoterIdDetails.state();
        System.out.println("__________________________");

        System.out.println("Company Two requirements :");
        CompanyTwo companyTwo= new CompanyTwo();
        companyTwo.address();
        companyTwo.age();
        companyTwo.nationality();
        companyTwo.transfer();
        companyTwo.salary();
        VoterIdDetails.state();
        System.out.println("__________________________");

    }
}
