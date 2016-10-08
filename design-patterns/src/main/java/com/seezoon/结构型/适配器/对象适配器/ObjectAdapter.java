package com.seezoon.结构型.适配器.对象适配器;

/**
 * 对象适配器
 * @author DF
 *对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Adapter类，持有原类的一个实例，
 *在Adapter类的方法中，调用实例的方法就行。
 */
public class ObjectAdapter {
	public static void main(String[] args) {
		Source source = new Source();
		Adapter adapter = new Adapter(source);
		adapter.method1();
		adapter.method2();
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

class Adapter implements Targetable {

	private Source source;

	public Adapter(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

	@Override
	public void method1() {
		source.method1();
	}
}