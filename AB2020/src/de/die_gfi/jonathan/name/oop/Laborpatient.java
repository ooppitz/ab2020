package de.die_gfi.jonathan.name.oop;

public class Laborpatient extends Patient implements VitaminSpiegel {
	double VitaminA=unbekannter_wert;
	double VitaminB=unbekannter_wert;
	double VitaminC=unbekannter_wert;
	double VitaminD=unbekannter_wert;
	public static final double unbekannter_wert = -1;
	
	public Laborpatient(int a, double h, double g, String v, String n, String d) {
		super(a, h, g, v, n, d);
	}

	@Override
	public void getA(double wert) {
		
	}

	@Override
	public void setA(double wert) {
		// TODO Auto-generated method stub
		
	}

	@Override
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
