package ch06.Stock;
import java.util.Arrays;

public class Stock {
	static final String itemNo="111";
	static int seq=0;
	static int seq2 = 0;
	static int seq3 = 0;
    private String item;
	    private String name;
	    private int qty;
	    {
	    	seq++;
	    	seq3=seq/10;
	    	seq2=seq/100;
	    	item = itemNo + "-" + seq2+seq3+(seq%10);
	    			
	    }
	    
	 
	    public Stock( String name, int qty) {
	        
	        this.name = name;
	        this.qty = qty;
	    }
	 
	    public String getitem() { return item; }
	    public void setitem(String item) { this.item = item; }
	    public String getname() { return name; }
	    public void setname(String name) { this.name = name; }
	    public int getqty() { return qty; }
	    public void setqty(int qty) { this.qty = qty; }
	  
	    public String toString() {
			return "Stock [아이템 번호=" + item + ",아이템 이름=" + name + ",재고수량" + qty + "]";
	    }
	    }
