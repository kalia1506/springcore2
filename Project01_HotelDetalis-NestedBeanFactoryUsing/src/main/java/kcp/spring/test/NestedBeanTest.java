package kcp.spring.test;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;

import kcp.spring.controller.MainController;
import kcp.spring.vo.HotelDetailsVO;

public class NestedBeanTest {

	public static void main(String[] args) {
		String parent = "kcp/spring/configuration/bussiness-parent-bean.xml";
		String child = "kcp/spring/configuration/persistance-child-bean.xml";
		List<HotelDetailsVO> listVO=null;
		MainController controller=null;
		// parent container
		DefaultListableBeanFactory pBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader pReader = new XmlBeanDefinitionReader(pBeanFactory);
		pReader.loadBeanDefinitions(parent);
		// child Container
		DefaultListableBeanFactory cBeanFactory = new DefaultListableBeanFactory(pBeanFactory);
		XmlBeanDefinitionReader cReader = new XmlBeanDefinitionReader(cBeanFactory);
		cReader.loadBeanDefinitions(child);
		controller = cBeanFactory.getBean("hotelDetailsController", MainController.class);
		try {
			listVO=controller.displayHotelDetalis("ee", "jj");
			for (HotelDetailsVO vo : listVO) {
				System.out.println(vo);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
