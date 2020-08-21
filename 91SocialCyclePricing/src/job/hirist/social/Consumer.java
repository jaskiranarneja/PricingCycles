/**
 * 
 */
package job.hirist.social;

import java.util.concurrent.BlockingQueue;

import job.hirist.social.inputJson.Cycle;

/**
 * @author Jaskiran
 *
 */
public class Consumer implements Runnable {
    private final BlockingQueue<Cycle> sharedQueue;
    private int threadNo;
    SharedUtil sharedUtil = new SharedUtil();
    public Consumer (BlockingQueue<Cycle> sharedQueue2,int threadNo) {
        this.sharedQueue = sharedQueue2;
        this.threadNo = threadNo;
    }
    @Override
    public void run() {

    	while(true) {
            try {
            	Cycle cycle = sharedQueue.take();
            	sharedUtil.consumeCycle(cycle);
            	System.out.println("Consumed: "+ cycle.getName() + ":by thread:"+threadNo);          
            } catch (Exception err) {
               err.printStackTrace();
            }
        }
    }   

}
