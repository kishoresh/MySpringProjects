package com.spring.aop.aspectj;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.CONSTRUCTOR)   //With this compiler shows and error in Operation class. @Target annotation tells us where our annotation will be applicable.
//@Target(ElementType.FIELD)         //With this compiler shows and error in Operation class.
@Target(ElementType.METHOD)          //This is default, as without this also it was working.
@Retention(RetentionPolicy.RUNTIME)  //W/o this also it is working. It just states whether the annotation will be available to the JVM at runtime or not.
public @interface LogExecutionTime {

}
