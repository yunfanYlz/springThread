package com.ylz.thread.monitor;

import com.ylz.thread.ServiceLocator;
//import com.ylz.thread.service.ProducerQueueService;

/**
 * 订购处理线程
 *
 */
public class ExportProcessThread implements Runnable{

/*    
	private ProducerQueueService producerQueueService;
	
	{
		producerQueueService = (ProducerQueueService) ServiceLocator.getBean("ProducerQueueService");
	}*/
	
    public ExportProcessThread(){
    }
    
    @Override
    public void run() {
        try
        {
        	System.out.println("启动一条导出线程");
        	Thread.sleep(5 * 1000);
        	//导出完毕   发往 activeMQ 
//        	producerQueueService.sendMessage("这是一条来自新线程的消息");
        }
        catch (Exception e) 
        {
        	e.printStackTrace();
        }
        finally
        {
        }
    }
}
