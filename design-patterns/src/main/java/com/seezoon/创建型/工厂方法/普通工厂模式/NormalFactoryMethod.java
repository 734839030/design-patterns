package com.seezoon.创建型.工厂方法.普通工厂模式;

/**
 * 普通工厂方法比较常用
 * @author DF
 *
 */
public class NormalFactoryMethod {

	
	public static void main(String[] args) {
		Factory factory= new Factory();
		IProduct product = factory.produce("A");
		product.productMethod();
	}
}
class Factory{
	/**
	 * 一般可以做成配置 比如xml 
	 * @param product
	 * @return
	 */
	public IProduct produce(String product){
		if ("A".equals(product)) {
			return new ProductA();
		} else if ("B".equals(product)) {
			return new ProductB();
		} else {
			return null;
		}
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