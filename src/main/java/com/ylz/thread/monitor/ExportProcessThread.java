package com.ylz.thread.monitor;

import com.ylz.thread.monitor.bean.SingleThreadDTO;

//import com.ylz.thread.service.ProducerQueueService;

/**
 * 订购处理线程
 *
 */
public class ExportProcessThread implements Runnable{
	
	
	private SingleThreadDTO dto;
/*    
	private ProducerQueueService producerQueueService;
	
	{
		producerQueueService = (ProducerQueueService) ServiceLocator.getBean("ProducerQueueService");
	}*/
	
    public ExportProcessThread(SingleThreadDTO dto){
    	this.dto = dto;
    }
    
    @Override
    public void run() {
        try
        {
        	System.out.println("-----------------");
        	System.out.println("threadPool 提供线程启动");
        	System.out.println(dto.getText());
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
