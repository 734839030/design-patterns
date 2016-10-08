package com.seezoon.结构型.适配器.类适配器;

/**
 * 类适配器
 * @author DF
 *类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，
 *创建一个新类，继承原有的类，实现新的接口即可。
 */
public class ClassAdapter {
	 public static void main(String[] args) {  
	        Targetable target = new Adapter();  
	        target.method1();  
	        target.method2();  
	    }  
}
class Source {  
    public void method1() {  
        System.out.println("this is original method!");  
    }  
}
interface Targetable {  
    /* 与原类中的方法相同 */  
    public void method1();  
    /* 新类的方法 */  
    public void method2();  
}  
class Adapter extends Source implements Targetable {  
	  
    @Override  
    public void method2() {  
        System.out.println("this is the targetable method!");  
    }  
}  