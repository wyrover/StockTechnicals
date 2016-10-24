package com.jasonlam604.stocktechnicals.overlays;

/**
 * Pivots Points are significant levels chartists can use to determine directional movement,
 * support and resistance.
 *
 */
public class PivotPoints {

	public static int ZONE_POS_1 = 1;
	public static int ZONE_POS_2 = 2;
	public static int ZONE_POS_3 = 3 ;
	public static int ZONE_POS_4 = 4;
	public static int ZONE_POS_5 = 5;
	public static int ZONE_POS_6 = 6;
	public static int ZONE_POS_7 = 7;

	public static int ZONE_NEG_1 = -1;
	public static int ZONE_NEG_2 = -2;
	public static int ZONE_NEG_3 = -3;
	public static int ZONE_NEG_4 = -4;
	public static int ZONE_NEG_5 = -5;
	public static int ZONE_NEG_6 = -6;
	public static int ZONE_NEG_7 = -7;

	private double pivotPoint;
	private double r1;
	private double r2;
	private double r3;
	private double r4;
	private double r5;
	private double r6;
	private double r7;
	private double s1;
	private double s2;
	private double s3;
	private double s4;
	private double s5;
	private double s6;
	private double s7;
	
	
	public PivotPoints() {

	}
	
	public class PivotPoint {
		
		private double pivotPointValue;

	}
	
	/**
	 * Generate Support and Resistance values
	 */
	private PivotPoint generatePivotPoints(double high, double low, double close) {
		
		// Pivot Point
		this.pivotPoint = (high + low + close) / 3;

		// Resistance Values
		this.r1 = this.pivotPoint + (0.382 * (high - low));
		this.r2 = this.pivotPoint + (0.618 * (high - low));
		this.r3 = this.pivotPoint + (1 * (high - low));
		this.r4 = this.pivotPoint + (1.27 * (high - low));
		this.r5 = this.pivotPoint + (1.618 * (high - low));
		this.r6 = this.pivotPoint + (2 * (high - low));
		this.r7 = this.pivotPoint + (2.618 * (high - low));

		// Support Values
		this.s1 = this.pivotPoint - (0.382 * (high - low));
		this.s2 = this.pivotPoint - (0.618 * (high - low));
		this.s3 = this.pivotPoint - (1 * (high - low));
		this.s4 = this.pivotPoint - (1.27 * (high - low));
		this.s5 = this.pivotPoint - (1.618 * (high - low));
		this.s6 = this.pivotPoint - (2 * (high - low));
		this.s7 = this.pivotPoint - (2.618 * (high - low));
		
		PivotPoint pivotPoint = new PivotPoint();
		
		return pivotPoint;
	}
}