package com.java8;

@FunctionalInterface
interface Cab {
	//void bookCab(String value);
	public int show(String s1, String s3);
}

class Uber  {

//	@Override
//	public void bookCab(String value) {
//		System.out.println("Booked Cab --Arriving Soon");
//	}

	public static int doShow(String s1, String s3) {
		return s1.lastIndexOf(s3);
	}
}

class LambdaExpression {

	public static void main(String[] args) {
		// 1 approach
		Cab cab = Uber::doShow;
		cab.show("Prathap", "Devaraj");
		// cab.bookCab();

		// 2 approach anonymous inner class
//		Cab cab1 = new Cab() {
//			
//			@Override
//			public void bookCab() {
//				System.out.println("Booked Cab --Arriving Soon");
//			}
//		};

		// cab1.bookCab();

		// 3 approach Lambda Expression
//	//	Cab cb = (String value) -> System.out.println("Booked Cab --Arriving Soon " + value);
//
//		cb.bookCab("prathap");

	}
}
