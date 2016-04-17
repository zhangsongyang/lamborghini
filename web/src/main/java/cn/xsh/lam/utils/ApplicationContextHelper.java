package cn.xsh.lam.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Spring工具类
 * 
 */
//@Component
public class ApplicationContextHelper implements ApplicationContextAware {
	private  ApplicationContext appCtx;

	/**
	 * 此方法可以把ApplicationContext对象inject到当前类中作为一个静态成员变量
	 * 
	 * @param applicationContext
	 *            ApplicationContext 对象
	 * @throws BeansException
	 */
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		appCtx = applicationContext;
	}

	/**
	 * 获取ApplicationContext
	 * 
	 * @return
	 */
	public  ApplicationContext getApplicationContext() {
		return this.appCtx;
	}

	/**
	 * 这是一个便利的方法，帮助我们快速得到一个BEAN
	 * 
	 * @param beanName
	 *            bean的名字
	 * @return 返回一个bean对象
	 */
	public  Object getBean(String beanName) {
		return appCtx.getBean(beanName);
	}
}
