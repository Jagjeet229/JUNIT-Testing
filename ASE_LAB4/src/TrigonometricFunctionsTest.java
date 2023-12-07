
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrigonometricFunctionsTest {

	double decimalpoints = 0.0001;
	final int precision = 99;

	//Quadrant 1
	
	@Test
	void testSinRad0()
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		assertEquals(Math.sin(0), TrigonometricFunctions.sinRad(0,precision), decimalpoints);
	}

	@Test
	void testCosRad0() 
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		assertEquals(Math.cos(0), TrigonometricFunctions.cosRad(0,precision), decimalpoints);
	}

	@Test
	void testTanRad0() 
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		assertEquals(Math.tan(0), TrigonometricFunctions.tanRad(0,precision), decimalpoints);
	}
	
	@Test
	void testSinDeg0() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.sin(0), TrigonometricFunctions.sinDeg(0,precision),decimalpoints);
	}
	
	@Test
	void testCosDeg0()
	{
		// this test is used for finding value for Degree
		assertEquals(Math.cos(0), TrigonometricFunctions.cosDeg(0,precision),decimalpoints);
	}

	@Test
	void testTanDeg0() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.tan(0), TrigonometricFunctions.tanDeg(0,precision),decimalpoints);
	}

	@Test
	void testSinRad30()
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		assertEquals(Math.sin(0.524), TrigonometricFunctions.sinRad(0.524,precision), decimalpoints);
	}

	@Test
	void testCosRad30() 
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		assertEquals(Math.cos(0.524), TrigonometricFunctions.cosRad(0.524,precision), decimalpoints);
	}

	@Test
	void testTanRad30() 
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		assertEquals(Math.tan(0.524), TrigonometricFunctions.tanRad(0.524,precision), decimalpoints);
	}
	
	@Test
	void testSinDeg30() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.sin(0.524), TrigonometricFunctions.sinDeg(30,precision),decimalpoints);
	}
	
	@Test
	void testCosDeg30()
	{
		// this test is used for finding value for Degree
		assertEquals(Math.cos(0.524), TrigonometricFunctions.cosDeg(30,precision),decimalpoints);
	}

	@Test
	void testTanDeg30() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.tan(0.524), TrigonometricFunctions.tanDeg(30,precision),decimalpoints);
	}
	
	@Test
	void testSinRad45()
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		assertEquals(Math.sin(0.785), TrigonometricFunctions.sinRad(0.785,precision), decimalpoints);
	}

	@Test
	void testCosRad45() 
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		assertEquals(Math.cos(0.785), TrigonometricFunctions.cosRad(0.785,precision), decimalpoints);
	}

	@Test
	void testTanRad45() 
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		assertEquals(Math.tan(0.785), TrigonometricFunctions.tanRad(0.785,precision), decimalpoints);
	}
	
	@Test
	void testSinDeg45() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.sin(0.785), TrigonometricFunctions.sinDeg(45,precision),decimalpoints);
	}
	
	@Test
	void testCosDeg45()
	{
		// this test is used for finding value for Degree
		assertEquals(Math.cos(0.785), TrigonometricFunctions.cosDeg(45,precision),decimalpoints);
	}

	@Test
	void testTanDeg45() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.tan(0.785), TrigonometricFunctions.tanDeg(45,precision),decimalpoints);
	}
	
	@Test
	void testSinRad60()
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		assertEquals(Math.sin(1.047), TrigonometricFunctions.sinRad(1.047,precision), decimalpoints);
	}

	@Test
	void testCosRad60() 
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		assertEquals(Math.cos(1.047), TrigonometricFunctions.cosRad(1.047,precision), decimalpoints);
	}

	@Test
	void testTanRad60() 
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		assertEquals(Math.tan(1.047), TrigonometricFunctions.tanRad(1.047,precision), decimalpoints);
	}
	
	@Test
	void testSinDeg60() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.sin(1.047), TrigonometricFunctions.sinDeg(60,precision),decimalpoints);
	}
	
	@Test
	void testCosDeg60()
	{
		// this test is used for finding value for Degree
		assertEquals(Math.cos(1.047), TrigonometricFunctions.cosDeg(60,precision),decimalpoints);
	}

	@Test
	void testTanDeg60() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.tan(1.047), TrigonometricFunctions.tanDeg(60,precision),decimalpoints);
	}
	
	
	//Checking for 90 degree or 1.571 Radians
	@Test
	void testSinRad90()
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		assertEquals(Math.sin(1.571), TrigonometricFunctions.sinRad(1.571,precision), decimalpoints);
	}

	@Test
	void testCosRad90() 
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		assertEquals(Math.cos(1.571), TrigonometricFunctions.cosRad(1.571,precision), decimalpoints);
	}

	@Test
	void testTanRad90() 
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		assertEquals(Math.tan(1.571), TrigonometricFunctions.tanRad(1.571,precision), decimalpoints);
	}
	
	@Test
	void testSinDeg90() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.sin(1.571), TrigonometricFunctions.sinDeg(90,precision),decimalpoints);
	}
	
	@Test
	void testCosDeg90()
	{
		// this test is used for finding value for Degree
		assertEquals(Math.cos(1.571), TrigonometricFunctions.cosDeg(90,precision),decimalpoints);
	}

	@Test
	void testTanDeg90() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.tan(1.571), TrigonometricFunctions.tanDeg(90,precision),decimalpoints);
	}

	//Quadrant 2
	
	@Test
	void testSinRad120()
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		assertEquals(Math.sin(2.094), TrigonometricFunctions.sinRad(2.094,precision), decimalpoints);
	}

	@Test
	void testCosRad120() 
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		assertEquals(Math.cos(2.094), TrigonometricFunctions.cosRad(2.094,precision), decimalpoints);
	}

	@Test
	void testTanRad120() 
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		assertEquals(Math.tan(2.094), TrigonometricFunctions.tanRad(2.094,precision), decimalpoints);
	}
	
	@Test
	void testSinDeg120() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.sin(2.094), TrigonometricFunctions.sinDeg(120,precision),decimalpoints);
	}
	
	@Test
	void testCosDeg120()
	{
		// this test is used for finding value for Degree
		assertEquals(Math.cos(2.094), TrigonometricFunctions.cosDeg(120,precision),decimalpoints);
	}

	@Test
	void testTanDeg120() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.tan(2.094), TrigonometricFunctions.tanDeg(120,precision),decimalpoints);
	}
	
	@Test
	void testSinRad150()
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		assertEquals(Math.sin(2.618), TrigonometricFunctions.sinRad(2.618,precision), decimalpoints);
	}

	@Test
	void testCosRad150() 
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		assertEquals(Math.cos(2.618), TrigonometricFunctions.cosRad(2.618,precision), decimalpoints);
	}

	@Test
	void testTanRad150() 
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		assertEquals(Math.tan(2.618), TrigonometricFunctions.tanRad(2.618,precision), decimalpoints);
	}
	
	@Test
	void testSinDeg150() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.sin(2.618), TrigonometricFunctions.sinDeg(150,precision),decimalpoints);
	}
	
	@Test
	void testCosDeg150()
	{
		// this test is used for finding value for Degree
		assertEquals(Math.cos(2.618), TrigonometricFunctions.cosDeg(150,precision),decimalpoints);
	}

	@Test
	void testTanDeg150() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.tan(2.618), TrigonometricFunctions.tanDeg(150,precision),decimalpoints);
	}
	
	@Test
	void testSinRad180()
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		assertEquals(Math.sin(3.142), TrigonometricFunctions.sinRad(3.142,precision), decimalpoints);
	}

	@Test
	void testCosRad180() 
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		assertEquals(Math.cos(3.142), TrigonometricFunctions.cosRad(3.142,precision), decimalpoints);
	}

	@Test
	void testTanRad180() 
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		assertEquals(Math.tan(3.142), TrigonometricFunctions.tanRad(3.142,precision), decimalpoints);
	}
	
	@Test
	void testSinDeg180() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.sin(3.142), TrigonometricFunctions.sinDeg(180,precision),decimalpoints);
	}
	
	@Test
	void testCosDeg180()
	{
		// this test is used for finding value for Degree
		assertEquals(Math.cos(3.142), TrigonometricFunctions.cosDeg(180,precision),decimalpoints);
	}

	@Test
	void testTanDeg180() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.tan(3.142), TrigonometricFunctions.tanDeg(180,precision),decimalpoints);
	}
	
	//Quadrant 3
	@Test
	void testSinRad210()
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		assertEquals(Math.sin(3.665), TrigonometricFunctions.sinRad(3.665,precision), decimalpoints);
	}

	@Test
	void testCosRad210() 
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		assertEquals(Math.cos(3.665), TrigonometricFunctions.cosRad(3.665,precision), decimalpoints);
	}

	@Test
	void testTanRad210() 
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		assertEquals(Math.tan(3.665), TrigonometricFunctions.tanRad(3.665,precision), decimalpoints);
	}
	
	@Test
	void testSinDeg210() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.sin(3.665), TrigonometricFunctions.sinDeg(210,precision),decimalpoints);
	}
	
	@Test
	void testCosDeg210()
	{
		// this test is used for finding value for Degree
		assertEquals(Math.cos(3.665), TrigonometricFunctions.cosDeg(210,precision),decimalpoints);
	}

	@Test
	void testTanDeg210() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.tan(3.665), TrigonometricFunctions.tanDeg(210,precision),decimalpoints);
	}
	
	@Test
	void testSinRad240()
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		assertEquals(Math.sin(4.189), TrigonometricFunctions.sinRad(4.189,precision), decimalpoints);
	}

	@Test
	void testCosRad240() 
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		assertEquals(Math.cos(4.189), TrigonometricFunctions.cosRad(4.189,precision), decimalpoints);
	}

	@Test
	void testTanRad240() 
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		assertEquals(Math.tan(4.189), TrigonometricFunctions.tanRad(4.189,precision), decimalpoints);
	}
	
	@Test
	void testSinDeg240() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.sin(4.189), TrigonometricFunctions.sinDeg(240,precision),decimalpoints);
	}
	
	@Test
	void testCosDeg240()
	{
		// this test is used for finding value for Degree
		assertEquals(Math.cos(4.189), TrigonometricFunctions.cosDeg(240,precision),decimalpoints);
	}

	@Test
	void testTanDeg240() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.tan(4.189), TrigonometricFunctions.tanDeg(240,precision),decimalpoints);
	}
	
	@Test
	void testSinRad270()
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		assertEquals(Math.sin(4.712), TrigonometricFunctions.sinRad(4.712,precision), decimalpoints);
	}

	@Test
	void testCosRad270() 
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		assertEquals(Math.cos(4.712), TrigonometricFunctions.cosRad(4.712,precision), decimalpoints);
	}

	@Test
	void testTanRad270() 
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		assertEquals(Math.tan(4.712), TrigonometricFunctions.tanRad(4.712,precision), decimalpoints);
	}
	
	@Test
	void testSinDeg270() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.sin(4.712), TrigonometricFunctions.sinDeg(270,precision),decimalpoints);
	}
	
	@Test
	void testCosDeg270()
	{
		// this test is used for finding value for Degree
		assertEquals(Math.cos(4.712), TrigonometricFunctions.cosDeg(270,precision),decimalpoints);
	}

	@Test
	void testTanDeg270() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.tan(4.712), TrigonometricFunctions.tanDeg(270,precision),decimalpoints);
	}
	
	//Quadrant 4
	@Test
	void testSinRad300()
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		assertEquals(Math.sin(5.236), TrigonometricFunctions.sinRad(5.236,precision), decimalpoints);
	}

	@Test
	void testCosRad300() 
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		assertEquals(Math.cos(5.236), TrigonometricFunctions.cosRad(5.236,precision), decimalpoints);
	}

	@Test
	void testTanRad300() 
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		assertEquals(Math.tan(5.236), TrigonometricFunctions.tanRad(5.236,precision), decimalpoints);
	}
	
	@Test
	void testSinDeg300() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.sin(5.236), TrigonometricFunctions.sinDeg(300,precision),decimalpoints);
	}
	
	@Test
	void testCosDeg300()
	{
		// this test is used for finding value for Degree
		assertEquals(Math.cos(5.236), TrigonometricFunctions.cosDeg(300,precision),decimalpoints);
	}

	@Test
	void testTanDeg300() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.tan(5.236), TrigonometricFunctions.tanDeg(300,precision),decimalpoints);
	}
	
	@Test
	void testSinRad330()
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		assertEquals(Math.sin(5.760), TrigonometricFunctions.sinRad(5.760,precision), decimalpoints);
	}

	@Test
	void testCosRad330() 
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		assertEquals(Math.cos(5.760), TrigonometricFunctions.cosRad(5.760,precision), decimalpoints);
	}

	@Test
	void testTanRad330() 
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		assertEquals(Math.tan(5.760), TrigonometricFunctions.tanRad(5.760,precision), decimalpoints);
	}
	
	@Test
	void testSinDeg330() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.sin(5.760), TrigonometricFunctions.sinDeg(330,precision),decimalpoints);
	}
	
	@Test
	void testCosDeg330()
	{
		// this test is used for finding value for Degree
		assertEquals(Math.cos(5.760), TrigonometricFunctions.cosDeg(330,precision),decimalpoints);
	}

	@Test
	void testTanDeg330() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.tan(5.760), TrigonometricFunctions.tanDeg(330,precision),decimalpoints);
	}
	
	@Test
	void testSinRad360()
	{
		// this test is used for checking sin(x) value compare to Math.sin(x)
		assertEquals(Math.sin(6.283), TrigonometricFunctions.sinRad(6.283,precision), decimalpoints);
	}

	@Test
	void testCosRad360() 
	{
		// this test is used for checking cos(x) value compare to Math.cos(x)
		assertEquals(Math.cos(6.283), TrigonometricFunctions.cosRad(6.283,precision), decimalpoints);
	}

	@Test
	void testTanRad360() 
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		assertEquals(Math.tan(6.283), TrigonometricFunctions.tanRad(6.283,precision), decimalpoints);
	}
	
	@Test
	void testSinDeg360() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.sin(6.283), TrigonometricFunctions.sinDeg(360,precision),decimalpoints);
	}
	
	@Test
	void testCosDeg360()
	{
		// this test is used for finding value for Degree
		assertEquals(Math.cos(6.283), TrigonometricFunctions.cosDeg(360,precision),decimalpoints);
	}

	@Test
	void testTanDeg360() 
	{
		// this test is used for finding value for Degree
		assertEquals(Math.tan(6.283), TrigonometricFunctions.tanDeg(360,precision),decimalpoints);
	}
}
