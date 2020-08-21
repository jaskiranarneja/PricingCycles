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
public class Producer implements Runnable {
    private final BlockingQueue<Cycle> sharedQueue;
    private int threadNo;
    SharedUtil sharedUtil = new SharedUtil();
    public Producer(BlockingQueue<Cycle> sharedQueue2,int threadNo) {
        this.threadNo = threadNo;
        this.sharedQueue = sharedQueue2;
    }
    @Override
    public void run() {
        for(int i =0; i<sharedQueue.remainingCapacity();i++) {
            try {
            	Cycle cycle = sharedUtil.produceCycle();
            	cycle.setName(cycle.getName()+i);
                System.out.println(i+". Produced:" + cycle.getName()+":by thread:"+ threadNo);
                sharedQueue.put(cycle);
                Thread.sleep(200);
            } catch (Exception err) {
                err.printStackTrace();
            }
        }
    }

}
