package com.ylz.thread.monitor;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;



/**
 * 线程监控接口
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  Administrator
 * @version  [版本号, 2015-8-22]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public interface IThreadPoolMonitorService<MONITOR_BEAN>
{
    /**
     * 多线程监控服务处理方法
     * <功能详细描述>
     * @return
     * @see [类、类#方法、类#成员]
     */
    public MONITOR_BEAN execute();
    
    /**
     * 获取线程池对象
     * <功能详细描述>
     * @return
     * @see [类、类#方法、类#成员]
     */
    public ThreadPoolTaskExecutor getExecutor();
    
    /**
     * 设置线程池对象
     * <功能详细描述>
     * @param executor
     * @see [类、类#方法、类#成员]
     */
    public void setExecutor(ThreadPoolTaskExecutor executor);
}
