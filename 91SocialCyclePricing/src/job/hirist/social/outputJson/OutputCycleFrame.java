/**
 * 
 */
package job.hirist.social.outputJson;

/**
 * @author Neeraj90
 *
 */
public class OutputCycleFrame {
	//price of various components
	double aFrame,bFrame,cFrame,dFrame;

	/**
	 * @return the aFrame
	 */
	public double getaFrame() {
		return aFrame;
	}

	/**
	 * @param aFrame the aFrame to set
	 */
	public void setaFrame(double aFrame) {
		this.aFrame = aFrame;
	}

	/**
	 * @return the bFrame
	 */
	public double getbFrame() {
		return bFrame;
	}

	/**
	 * @param bFrame the bFrame to set
	 */
	public void setbFrame(double bFrame) {
		this.bFrame = bFrame;
	}

	/**
	 * @return the cFrame
	 */
	public double getcFrame() {
		return cFrame;
	}

	/**
	 * @param cFrame the cFrame to set
	 */
	public void setcFrame(double cFrame) {
		this.cFrame = cFrame;
	}

	/**
	 * @return the dFrame
	 */
	public double getdFrame() {
		return dFrame;
	}

	/**
	 * @param dFrame the dFrame to set
	 */
	public void setdFrame(double dFrame) {
		this.dFrame = dFrame;
	}
	public double getAllFramePartsPrice() {
		return aFrame+bFrame+cFrame+dFrame;
	}
}
