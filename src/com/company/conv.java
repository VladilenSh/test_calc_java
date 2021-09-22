package com.company;

public class conv {
    private String [] rimChisla1={"I","II","III","IV","V","VI","VII","VIII","IX"};
    private String [] rimChisla10={"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    private String [] rimChisla100={"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    private String [] rimChisla1000={"M","MM","MMM"};
    public String arabtorim="";

    public String arabtorim(int arab1){

        if(arab1>=1000){arabtorim=rimChisla1000[arab1/1000-1];arab1=arab1-1000*(arab1/1000);}
        if(arab1>=100){arabtorim=arabtorim+rimChisla100[arab1/100-1];arab1=arab1-100*(arab1/100);}
        if(arab1>=10){arabtorim=arabtorim+rimChisla10[arab1/10-1];arab1=arab1-10*(arab1/10);}
        if(arab1>=1){arabtorim=arabtorim+rimChisla1[arab1/1-1];}
        return arabtorim;
    }
}
