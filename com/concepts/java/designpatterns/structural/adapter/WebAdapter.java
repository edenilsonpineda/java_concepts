package com.concepts.java.designpatterns.structural.adapter;

public class WebAdapter implements WebRequester{
    private WebService service;

    public void connect(WebService currentWebService){
        this.service = currentWebService;
    }

    @Override
    public int request(Object object) {
        Object result = this.toJson(object);
        Object response = service.request(result);
        if(response != null)
            return 200; // OK status code
        
        return 500; // Server error status code
    }
    
    // Simulate conversion to json
    private Object toJson(Object input){
        Object object = input;
        System.out.println(object.toString());
        return object;
    }
}
