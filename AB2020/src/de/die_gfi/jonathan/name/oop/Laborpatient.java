package de.die_gfi.jonathan.name.oop;

//@author jonazhan Göth
public class Laborpatient extends Patient implements VitaminSpiegel {
	double VitaminA=unbekannter_wert;
	double VitaminB=unbekannter_wert;
	double VitaminC=unbekannter_wert;
	double VitaminD=unbekannter_wert;
	public static final double unbekannter_wert = -1;
	
	public Laborpatient(int a, double h, double g, String v, String n, String d) {
		super(a, h, g, v, n, d);
	}

	//get Vitamin a
	public double getA() {
		return VitaminA;
	}

	
	public void setA(double wert) {
		
	}

	//get Vitamin b
	public void getB(double wert) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setB(double wert) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getC(double wert) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setC(double wert) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getD(double wert) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setD(double wert) {
		// TODO Auto-generated method stub
		
	}

	

}
