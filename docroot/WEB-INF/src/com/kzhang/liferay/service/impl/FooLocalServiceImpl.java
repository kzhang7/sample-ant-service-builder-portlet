package com.kzhang.liferay.service.impl;

import com.kzhang.liferay.sample.BarBean;
import com.kzhang.liferay.sample.SampleBean;
import com.kzhang.liferay.service.base.FooLocalServiceBaseImpl;
import com.liferay.portal.kernel.bean.BeanReference;

/**
 * The implementation of the foo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.kzhang.liferay.service.FooLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.kzhang.liferay.service.base.FooLocalServiceBaseImpl
 * @see com.kzhang.liferay.service.FooLocalServiceUtil
 */
public class FooLocalServiceImpl extends FooLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.kzhang.liferay.service.FooLocalServiceUtil} to access the foo local service.
     */
	
	public void helloWorld(){
		System.out.println("Example 1 using xml config:");
		sampleBean.sample();
		
		System.out.println("Example 2 using annotation:");
		barBean.bar();
	}

	public SampleBean getSampleBean() {
		return sampleBean;
	}

	public void setSampleBean(SampleBean sampleBean) {
		this.sampleBean = sampleBean;
	}
	
	private SampleBean sampleBean;
	
	@BeanReference(type = BarBean.class)
	private BarBean barBean;
}
