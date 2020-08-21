/**
 * 
 */
package job.hirist.social.outputJson;

/**
 * @author Neeraj90
 *
 */
public class OutputSeating {
	double aSeat,bSeat,cSeat,dSeat;

	/**
	 * @return the aSeat
	 */
	public double getaSeat() {
		return aSeat;
	}

	/**
	 * @param aSeat the aSeat to set
	 */
	public void setaSeat(double aSeat) {
		this.aSeat = aSeat;
	}

	/**
	 * @return the bSeat
	 */
	public double getbSeat() {
		return bSeat;
	}

	/**
	 * @param bSeat the bSeat to set
	 */
	public void setbSeat(double bSeat) {
		this.bSeat = bSeat;
	}

	/**
	 * @return the cSeat
	 */
	public double getcSeat() {
		return cSeat;
	}

	/**
	 * @param cSeat the cSeat to set
	 */
	public void setcSeat(double cSeat) {
		this.cSeat = cSeat;
	}

	/**
	 * @return the dSeat
	 */
	public double getdSeat() {
		return dSeat;
	}

	/**
	 * @param dSeat the dSeat to set
	 */
	public void setdSeat(double dSeat) {
		this.dSeat = dSeat;
	}
	public double getAllSeatPartsPrice() {
		return aSeat+bSeat+cSeat+dSeat;
	}
}
