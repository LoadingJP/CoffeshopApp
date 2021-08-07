package com.starbucks;

public class StarbucksMini {
	
	private String name;
    private Integer price;
    
    
    public StarbucksMini(String name, int price){
        this.name = name;
        this.price = price;
    }
    
    public StarbucksMini (String name){
        this.name = name;
    }
    
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    
    public int  getPrice()throws Exception{
        if (price == null){
            throw new Exception ("Price field cannot be empty.");
        }
        
            return price;
    }
    

}
