/**
 * 
 */
package job.hirist.social.outputJson;

/**
 * @author Neeraj90
 *
 */
public class OutputHandleBrakes {
	double aHandleBrake,bHandleBrake,cHandleBrake,dHandleBrake;

	/**
	 * @return the aHandleBrake
	 */
	public double getaHandleBrake() {
		return aHandleBrake;
	}

	/**
	 * @param aHandleBrake the aHandleBrake to set
	 */
	public void setaHandleBrake(double aHandleBrake) {
		this.aHandleBrake = aHandleBrake;
	}

	/**
	 * @return the bHandleBrake
	 */
	public double getbHandleBrake() {
		return bHandleBrake;
	}

	/**
	 * @param bHandleBrake the bHandleBrake to set
	 */
	public void setbHandleBrake(double bHandleBrake) {
		this.bHandleBrake = bHandleBrake;
	}

	/**
	 * @return the cHandleBrake
	 */
	public double getcHandleBrake() {
		return cHandleBrake;
	}

	/**
	 * @param cHandleBrake the cHandleBrake to set
	 */
	public void setcHandleBrake(double cHandleBrake) {
		this.cHandleBrake = cHandleBrake;
	}

	/**
	 * @return the dHandleBrake
	 */
	public double getdHandleBrake() {
		return dHandleBrake;
	}

	/**
	 * @param dHandleBrake the dHandleBrake to set
	 */
	public void setdHandleBrake(double dHandleBrake) {
		this.dHandleBrake = dHandleBrake;
	}
	public double getAllHandleBrakesPartsPrice() {
		return aHandleBrake+bHandleBrake+cHandleBrake+dHandleBrake;
	}
}
