package chapter16.generic2;

import javax.print.attribute.standard.PrinterInfo;

public class GenericPrinterMain {

	public static void main(String[] args) {

		GenericPrinter<Powder> printPowder = new GenericPrinter<Powder>();
		printPowder.setmeterial(new Powder());
		Powder powder = printPowder.getmeterial();
		System.out.println(powder);
		powder.doprinting();

		System.out.println();

		GenericPrinter<Plastic> printPlastic = new GenericPrinter<Plastic>();
		printPlastic.setmeterial(new Plastic());
		Plastic plastic = printPlastic.getmeterial();
		System.out.println(plastic);
		plastic.doprinting();

		
		System.out.println();
		// 물의 재료는 허용되면 안되지만 제네릭의 특성상 허용하는 모순이 발생한다.
		Water water=new Water();
		water.doprinting();
		
		/*
		GenericPrinter<Water> printWater = new GenericPrinter<Water>();
		printWater.setmeterial(new Water());
		System.out.println(printWater);
		*/
	}

}
