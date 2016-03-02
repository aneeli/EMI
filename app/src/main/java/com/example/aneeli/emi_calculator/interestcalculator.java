package com.example.aneeli.emi_calculator;

/**
 * Created by aneeli on 2/27/2016.
 */
public class interestcalculator {


      // DATA MEMBERS
    private Double mPrincipal;
    private Double mInterest;
    private Double mfive;
    private Double mten;
    private Double mfifteen;
    private Double mtwenty;
    private Double mtwentyfive;
    private Double mthirty;
    private Double rate;



    public interestcalculator() {
        mInterest = 0.0;
        mPrincipal = 0.0;
        mfive=0.0;
        mten=0.0;
        mfifteen=0.0;
        mtwenty=0.0;
        mtwentyfive=0.0;
        mthirty=0.0;

    }
    public void setprincipal$(double a){
        mPrincipal = a;
        result();

    }
    public void setinterest(double b){
        mInterest = b;
        result();

    }
    public void result (){

        rate = mInterest/1200;

        mfive = mPrincipal * rate * ((Double) (Math.pow((1 + rate), 60)) / (Double) ((Math.pow((1 + rate), 60)) - 1));
        mten=  mPrincipal * rate * ((Double)(Math.pow((1 + rate), 120)) / (Double)((Math.pow((1 + rate), 120)) - 1));
        mfifteen=  mPrincipal * rate * ((Double)(Math.pow((1 + rate), 180)) / (Double)((Math.pow((1 + rate), 180)) - 1));
        mtwenty=  mPrincipal * rate * ((Double)(Math.pow((1 + rate), 240)) / (Double)((Math.pow((1 + rate), 240)) - 1));
        mtwentyfive=  mPrincipal * rate * ((Double)(Math.pow((1 + rate), 300)) / (Double)((Math.pow((1 + rate), 300)) - 1));
        mthirty=  mPrincipal * rate * ((Double)(Math.pow((1 + rate), 360)) / (Double)((Math.pow((1 + rate), 360)) - 1));

    }


    public Double getmfive() {return mfive;}
    public Double getmten() {return mten;}
    public Double getmfifeteen() {return mfifteen;}
    public Double getmtwenty() {return mtwenty;}
    public Double getmtwentyfive() {return mtwentyfive;}
    public Double getmthirty() {return mthirty;}





}
