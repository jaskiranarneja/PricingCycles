/**
 * 
 */
package job.hirist.social.inputJson;

/**
 * @author Neeraj90
 *
 */
public class Cycle {
	CycleFrame frame;
	HandleBrakes handleBrakes;
	Seating seat;
	Wheels wheels;
	ChainAssembly chain;
	String dateOfPricing;
	String name;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the frame
	 */
	public CycleFrame getFrame() {
		return frame;
	}
	/**
	 * @param frame the frame to set
	 */
	public void setFrame(CycleFrame frame) {
		this.frame = frame;
	}
	/**
	 * @return the handleBrakes
	 */
	public HandleBrakes getHandleBrakes() {
		return handleBrakes;
	}
	/**
	 * @param handleBrakes the handleBrakes to set
	 */
	public void setHandleBrakes(HandleBrakes handleBrakes) {
		this.handleBrakes = handleBrakes;
	}
	/**
	 * @return the seat
	 */
	public Seating getSeat() {
		return seat;
	}
	/**
	 * @param seat the seat to set
	 */
	public void setSeat(Seating seat) {
		this.seat = seat;
	}
	/**
	 * @return the wheels
	 */
	public Wheels getWheels() {
		return wheels;
	}
	/**
	 * @param wheels the wheels to set
	 */
	public void setWheels(Wheels wheels) {
		this.wheels = wheels;
	}
	/**
	 * @return the chain
	 */
	public ChainAssembly getChain() {
		return chain;
	}
	/**
	 * @param chain the chain to set
	 */
	public void setChain(ChainAssembly chain) {
		this.chain = chain;
	}
	/**
	 * @return the dateOfPricing
	 */
	public String getDateOfPricing() {
		return dateOfPricing;
	}
	/**
	 * @param dateOfPricing the dateOfPricing to set
	 */
	public void setDateOfPricing(String dateOfPricing) {
		this.dateOfPricing = dateOfPricing;
	}
	
	
}
