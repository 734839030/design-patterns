package com.seezoon.创建型.工厂方法.静态工厂;


/**
 * 静态工厂方法模式
 * 将多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可
 * @author DF
 *
 */
public class StaticiFactoryMethod {

	
	public static void main(String[] args) {
		IProduct product = StaticFactory.produceA();
		product.productMethod();
	}
}
class StaticFactory{
	public static IProduct produceA(){
		return new ProductA();
	}
	public static IProduct produceB(){
		return new ProductB();
	}
}
interface IProduct {
	public void productMethod();
}

class ProductA implements IProduct {
	@Override
	public void productMethod() {
		System.out.println("ProductA");
	}
}

class ProductB implements IProduct {
	@Override
	public void productMethod() {
		System.out.println("ProductB");
	}
}
