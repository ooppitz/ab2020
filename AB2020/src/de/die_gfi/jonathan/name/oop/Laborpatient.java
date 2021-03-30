package de.die_gfi.jonathan.name.oop;

//@author jonazhan Göth
/**
 * 
 * @author Jonathan Göth
 *
 */
public class Laborpatient extends Patient implements VitaminSpiegel {
	double VitaminA=Unbekannter_wert;
	double VitaminB=Unbekannter_wert;
	double VitaminC=Unbekannter_wert;
	double VitaminD=Unbekannter_wert;
	public static final double Unbekannter_wert = -1;
	
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
	public double getB() {
		return VitaminB;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setB(double wert) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getC() {
		return VitaminC;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setC(double wert) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getD() {
		return VitaminD;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setD(double wert) {
		// TODO Auto-generated method stub
		
	}



	

	

}
