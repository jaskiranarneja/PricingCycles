/**
 * 
 */
package job.hirist.social.outputJson;

/**
 * @author Neeraj90
 *
 */
public class OutputWheels {
	double spokes, rim, tube, tyre;

	/**
	 * @return the spokes
	 */
	public double getSpokes() {
		return spokes;
	}

	/**
	 * @param spokes the spokes to set
	 */
	public void setSpokes(double spokes) {
		this.spokes = spokes;
	}

	/**
	 * @return the rim
	 */
	public double getRim() {
		return rim;
	}

	/**
	 * @param rim the rim to set
	 */
	public void setRim(double rim) {
		this.rim = rim;
	}

	/**
	 * @return the tube
	 */
	public double getTube() {
		return tube;
	}

	/**
	 * @param tube the tube to set
	 */
	public void setTube(double tube) {
		this.tube = tube;
	}

	/**
	 * @return the tyre
	 */
	public double getTyre() {
		return tyre;
	}

	/**
	 * @param tyre the tyre to set
	 */
	public void setTyre(double tyre) {
		this.tyre = tyre;
	}
	public double getAllWheelPartsPrice() {
		return rim+spokes+tube+tyre;
	}
}
