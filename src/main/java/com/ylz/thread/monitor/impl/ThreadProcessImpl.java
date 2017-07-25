package com.ylz.thread.monitor.impl;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import com.ylz.thread.ServiceLocator;
import com.ylz.thread.monitor.ExportProcessThread;
import com.ylz.thread.monitor.ThreadProcess;
import com.ylz.thread.monitor.bean.SingleThreadDTO;


/**
 *
 */
@Service(value="ThreadProcess")
public class ThreadProcessImpl implements ThreadProcess{

	private ThreadPoolTaskExecutor threadExecutor ;
	{
		threadExecutor = (ThreadPoolTaskExecutor) ServiceLocator.getBean("threadPoolTaskExecutor");
	}

	public void putInThreadPool(SingleThreadDTO dto) {
		ExportProcessThread thread = new ExportProcessThread(dto);
		threadExecutor.execute(thread);
	}
	
}
