class Watch{
	private int hr_Hand;
	private int min_Hand;
	private int sec_Hand;

	Watch(){ hr_Hand=min_Hand=sec_Hand=10;}

	Watch( ){int hr_Hand,int min_Hand,int sec_Hand};
		this.hr.Hand=hr_Hand;
		this.min_Hand=min_Hand;
		this.sec_Hand=sec_Hand;
	}

	int getHr_Hand(){
		return hr_hand;
	}

	int getmin_Hand(){
		return min_hand;
	}

	int getsec_Hand(){
		return sec_hand;
	}

void setHr_Hand(){
	this.hr_Hand=hr_Hand;
}

void setmin_Hand(){
	this.min_Hand=min_Hand;
}
void setHr_Hand(){
	this.sec_Hand=sec_Hand;
}


   void showClock(){
   	System.out.println("Hr: "+hr_Hand+"Min:"+min_Hand+"sec:"+sec_Hand)
   }

}

class App{

	public static void main(String[] args){

     Watch titan=new Watch();

     System.out.println("Hr: "+titan.getHr_Hand());

     titan.setHr_Hand(15);
     System.out.println("Hr: "+titan.getHr_Hand());

     titan.showClock





	}
}