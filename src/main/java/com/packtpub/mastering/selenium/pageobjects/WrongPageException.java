package com.packtpub.mastering.selenium.pageobjects;

/**
 * Created by simon.wilby on 28/10/2016.
 */
public class WrongPageException extends RuntimeException{
    public WrongPageException(String message){
        super(message);
    }
}
