package com.redhat.ceylon.maven.test;


import org.apache.maven.shared.invoker.MavenInvocationException;
import org.junit.Test;

public class CeylondMojoIT extends MojoTest {

    @Test
    public void helloWorld() throws MavenInvocationException {
        mvn("src/test/resources/com/redhat/ceylon/maven/test/hello-world.xml", 
                "clean", "org.ceylon-lang:ceylon-maven-plugin:ceylond");
    }
    
}
