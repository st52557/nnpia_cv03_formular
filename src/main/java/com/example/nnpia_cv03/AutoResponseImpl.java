package com.example.nnpia_cv03;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS) // prototype - pokaždé nová response.
public class AutoResponseImpl implements AutoResponse{

    private String response = "";


    @Override
    public String getResponse(String msg) {

        if(response.length() > 1){
            return response;
        }

        response = "Na dotazy tohoto typu nereaguji.";
        if(msg.length() >0){
            if(Character.isUpperCase(msg.charAt(0))){
                response = "Děkuji za zprávu, brzi se Vám ozvu. S přáním hezkého dne Morty Smith.";
            }
        }

        return response;

    }

}
