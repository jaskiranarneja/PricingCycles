package job.hirist.social;

import com.google.gson.Gson;

import job.hirist.social.inputJson.Cycle;
import job.hirist.social.outputJson.OutputCycle;

public class SharedUtil {
	static String inputJson ="{'name':'Aone','dateOfPricing': '28 July 2016','frame':{'aFrame':'aFrame','bFrame':'bFrame','cFrame':'cFrame','dFrame':'dFrame'},'handleBrakes':{'aHandleBrake':'aHandleBrake','bHandleBrake':'bHandleBrake','cHandleBrake':'cHandleBrake','dHandleBrake':'dHandleBrake'},'seat':{'aSeat':'aSeat','bSeat':'bSeat','cSeat':'cSeat','dSeat':'dSeat'},'wheels':{'spokes':'spokes','rim':'rim','tube':'tube','tyre':'tyre'},'chain':{'aChain':'aChain','bChain':'bChain','cChain':'cChain','dChain':'dChain'}}";
	static String outputPriceJson="{'dateOfPricing': '28 July 2016','frame':{'aFrame':100,'bFrame':200,'cFrame':300,'dFrame':400.80},'handleBrakes':{'aHandleBrake':100,'bHandleBrake':200,'cHandleBrake':300,'dHandleBrake':400},'seat':{'aSeat':300,'bSeat':400,'cSeat':500,'dSeat':600},'wheels':{'spokes':200,'rim':400,'tube':500,'tyre':600},'chain':{'aChain':700,'bChain':800,'cChain':1000,'dChain':1200}}";
	Gson gson = new Gson();
	public void consumeCycle(Cycle cycle) {		
		OutputCycle outputCycle =gson.fromJson(outputPriceJson, OutputCycle.class);
		outputCycle.setName(cycle.getName());
		calculatePrice(outputCycle);
	}
	public Cycle produceCycle() {
		Cycle cycle =gson.fromJson(inputJson, Cycle.class);
		return cycle;
	}
	public void calculatePrice(OutputCycle outputCycle) {
		double price = 0.0;
		double framePrice = outputCycle.getFrame().getAllFramePartsPrice();
		double hbPrice = outputCycle.getHandleBrakes().getAllHandleBrakesPartsPrice();
		double seatPrice = outputCycle.getSeat().getAllSeatPartsPrice();
		double wheelsPrice = outputCycle.getWheels().getAllWheelPartsPrice();
		double chainPrice = outputCycle.getChain().getAllChainPartsPrice();
		price = framePrice+hbPrice+seatPrice+wheelsPrice+chainPrice;
		display(outputCycle,price,framePrice,hbPrice,seatPrice,wheelsPrice,chainPrice);
		
	}
	
	public void display(OutputCycle outputCycle,double price,double framePrice,double hbPrice,double seatPrice,double wheelsPrice,double chainPrice) {
		System.out.println("-------Cycle pricing for "+outputCycle.getName()+"------");
		System.out.println("-------Total pricing ------Rs"+ price);
		System.out.println("-------1. Frame ------Rs"+ framePrice);
		System.out.println("-------2. Handle Brake ------Rs"+ hbPrice);
		System.out.println("-------3. Seating ------Rs"+ seatPrice);
		System.out.println("-------4. Wheels ------Rs"+ wheelsPrice);
		System.out.println("-------5. Chain Assembly ------Rs"+ chainPrice);
	}

}
