package com;

import com.bindings.HelloRequest;
import com.bindings.ObjectFactory;
import com.bindings.SayHello;
import com.bindings.SayHelloResponse;
import com.soap.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBElement;
import java.util.HashMap;
import java.util.Map;

@RestController
public class restController {

    @Autowired
    SoapClient soapClient;

    @GetMapping(path = "/hello")
    public Map<String, String> getResponse(HttpServletRequest request) {

        String name = request.getParameter("name");

        ObjectFactory factory = new ObjectFactory();
        HelloRequest helloRequest = factory.createHelloRequest();
        helloRequest.setName(name);
        SayHello sayHello = factory.createSayHello();
        sayHello.setHelloRequest(helloRequest);

        JAXBElement<SayHelloResponse> result = soapClient.getResponse(sayHello);

        Map<String, String> responseValue = new HashMap<>();
        responseValue.put("message ", result.getValue().getHelloResponse().getMessage());

        return responseValue;
    }
}
