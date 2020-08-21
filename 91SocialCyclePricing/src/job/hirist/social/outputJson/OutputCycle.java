/**
 * 
 */
package job.hirist.social.outputJson;

/**
 * @author Neeraj90
 *
 */
public class OutputCycle {
	OutputCycleFrame frame;
	OutputHandleBrakes handleBrakes;
	OutputSeating seat;
	OutputWheels wheels;
	OutputChainAssembly chain;
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
	public OutputCycleFrame getFrame() {
		return frame;
	}
	/**
	 * @param frame the frame to set
	 */
	public void setFrame(OutputCycleFrame frame) {
		this.frame = frame;
	}
	/**
	 * @return the handleBrakes
	 */
	public OutputHandleBrakes getHandleBrakes() {
		return handleBrakes;
	}
	/**
	 * @param handleBrakes the handleBrakes to set
	 */
	public void setHandleBrakes(OutputHandleBrakes handleBrakes) {
		this.handleBrakes = handleBrakes;
	}
	/**
	 * @return the seat
	 */
	public OutputSeating getSeat() {
		return seat;
	}
	/**
	 * @param seat the seat to set
	 */
	public void setSeat(OutputSeating seat) {
		this.seat = seat;
	}
	/**
	 * @return the wheels
	 */
	public OutputWheels getWheels() {
		return wheels;
	}
	/**
	 * @param wheels the wheels to set
	 */
	public void setWheels(OutputWheels wheels) {
		this.wheels = wheels;
	}
	/**
	 * @return the chain
	 */
	public OutputChainAssembly getChain() {
		return chain;
	}
	/**
	 * @param chain the chain to set
	 */
	public void setChain(OutputChainAssembly chain) {
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
