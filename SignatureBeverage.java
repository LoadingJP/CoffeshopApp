package com.starbucks;

public class SignatureBeverage extends StarbucksMini {
	
	 	private StarbucksMini SignatureSize;
	    private String name;
	    int cost;
	    
	    // constructor for derived class with some fields inherited from its super class
	    
	    public SignatureBeverage(String name, int price, StarbucksMini SignatureSize){
	        super(name, price);
	        // initializes the current class SignatureBeverage size variable
	        this.SignatureSize = SignatureSize;
	        
	        // initializing the derived class variable cost to 
	        this.cost = price;
	    }
	    
	    
	    
	    @Override
	    public int getPrice()throws Exception {
	        /** Signature beverage calls its own method getPrice()
	         * to get the price of same type of coffee StarbucksMini but different size*
	         */
	        return cost + SignatureSize.getPrice();
	    }
	    
	    /* mutator method to modify the size of signature beverage*/
	    
	    public void setSignatureBeverage(SignatureBeverage SignatureSize ){
	        this.SignatureSize = SignatureSize;
	    }
	    
	    // acccessor method to get the size  of coffee of type StarbucksMini
	    
	    public StarbucksMini getSignatureBeverage(){
	        return SignatureSize;
	        
	    }

}
