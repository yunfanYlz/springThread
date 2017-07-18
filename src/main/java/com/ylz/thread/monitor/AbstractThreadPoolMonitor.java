package com.ylz.thread.monitor;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.ylz.thread.monitor.IThreadPoolMonitorService;


public abstract class AbstractThreadPoolMonitor<MONITOR_BEAN> implements IThreadPoolMonitorService<MONITOR_BEAN>
{
    /**
     * 线程池对象
     */
    protected ThreadPoolTaskExecutor executor;

    /**
     * 执行线程处理
     */
    @Override
    public abstract MONITOR_BEAN execute();
    
    @Override
    public ThreadPoolTaskExecutor getExecutor() {
        return executor;
    }

    @Override
    public void setExecutor(ThreadPoolTaskExecutor executor) {
        this.executor = executor;
    }
    
}
