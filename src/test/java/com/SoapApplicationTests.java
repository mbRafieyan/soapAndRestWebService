/*
package com;


import com.bindings.*;
import com.config.BeanConfigure;
import com.soap.SoapClient;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import javax.xml.bind.JAXBElement;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanConfigure.class, loader = AnnotationConfigContextLoader.class)
@SpringBootTest
class SoapApplicationTests {

    @Autowired
    SoapClient soapClient;

	@Test
	void contextLoads() {
        InquiryByNationalCode inquiryByNationalCode = new InquiryByNationalCode();

        ObjectFactory factory = new ObjectFactory();
        JAXBElement<String> nationalCodeStr = factory.createParameterNationalCode("10360061261");

        Parameter parameter = new Parameter();
        parameter.setNationalCode(nationalCodeStr);
        JAXBElement<Parameter> nationalCodePar = factory.createParameter(parameter);

        inquiryByNationalCode.setParam(nationalCodePar);
        InquiryByNationalCodeResponse inquiryByNationalCodeResponse = soapClient.getInquiryByNationalCodeResponse(inquiryByNationalCode);
        JAXBElement<Result> inquiryByNationalCodeResult = inquiryByNationalCodeResponse.getInquiryByNationalCodeResult();

        Result value = inquiryByNationalCodeResult.getValue();

        System.out.println("name is: " + value.getName().getValue());
        System.out.println("address is: " + value.getAddress().getValue());
    }
}
*/
