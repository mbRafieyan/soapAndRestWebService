package com.soap;

import com.bindings.ObjectFactory;
import com.bindings.SayHello;
import com.bindings.SayHelloResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;


public class SoapClient extends WebServiceGatewaySupport {

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    public JAXBElement<SayHelloResponse> getResponse(SayHello sayHello){
        return (JAXBElement<SayHelloResponse>) webServiceTemplate.marshalSendAndReceive(new ObjectFactory().createSayHello(sayHello));
    }
}
