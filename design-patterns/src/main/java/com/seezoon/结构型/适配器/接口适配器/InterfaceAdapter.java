package com.seezoon.结构型.适配器.接口适配器;

/**
 * 接口适配器
 * @author DF
 *接口的适配器模式：当不希望实现一个接口中所有的方法时，
 *可以创建一个抽象类Adapter，实现所有方法，我们写别的类的时候，继承抽象类即可。
 */
public class InterfaceAdapter {
	public static void main(String[] args) {
		Sourceable source1 = new Source1();  
	    Sourceable source2 = new Source2();  
	      
	    source1.method1();  
	    source1.method2();  
	    source2.method1();  
	    source2.method2();  
	}
}
interface Sourceable {  
    public void method1();  
    public void method2();  
}  
abstract class AbstractAdapter implements Sourceable{  
    public void method1(){}  
    public void method2(){}  
}  
class Source1 extends AbstractAdapter {  
    public void method1(){  
        System.out.println("the sourceable interface's second Source1!");  
    }  
} 
class Source2 extends AbstractAdapter {  
    public void method2(){  
        System.out.println("the sourceable interface's second Source2!");  
    }  
}  