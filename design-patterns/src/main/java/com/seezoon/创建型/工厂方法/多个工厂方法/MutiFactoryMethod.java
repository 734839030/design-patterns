package com.seezoon.创建型.工厂方法.多个工厂方法;


/**
 * 多个工厂方法模式
 * 是对普通工厂方法模式的改进，在普通工厂方法模式中，
 * 如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象
 * @author DF
 *
 */
public class MutiFactoryMethod {

	
	public static void main(String[] args) {
		MutiFactory factory = new MutiFactory();
		IProduct product = factory.produceA();
		product.productMethod();
	}
}
class MutiFactory{
	public IProduct produceA(){
		return new ProductA();
	}
	public IProduct produceB(){
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