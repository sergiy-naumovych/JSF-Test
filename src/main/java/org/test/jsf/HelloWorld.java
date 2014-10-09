package org.test.jsf;

/**
 * Created by Matrix on 09.10.2014.
 */
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld")
public class HelloWorld {
    public HelloWorld() {
        System.out.println("HelloWorld started!");
    }

    public String getMessage() {
        return "Hello World!";
    }
}