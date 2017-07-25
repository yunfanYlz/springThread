package com.ylz.thread.monitor;

import com.ylz.thread.monitor.bean.SingleThreadDTO;

/**
 *
 */
public interface ThreadProcess{

	public void putInThreadPool(SingleThreadDTO dto);
	
}
