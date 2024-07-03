import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class EllipseTest {
    @Test
    fun testEllipseConstruction(){
        val center = Point(1.0,2.0)
        val ellipse = Ellipse(center, 3.0,4.0)
        assertEquals(center, ellipse.getCenter())
        assertEquals(3.0, ellipse.getRadii().first)
        assertEquals(4.0, ellipse.getRadii().second)
    }

    @Test
    fun testGetArea(){
        val center = Point(1.0,2.0)
        val ellipse = Ellipse(center, 3.0,4.0)
        assertEquals(Math.PI * 3.0 * 4.0, ellipse.getArea())
    }

    @Test
    fun testMove(){
        val center = Point(1.0,2.0)
        val ellipse = Ellipse(center, 3.0,4.0)
        ellipse.move(2.0,1.0)
        assertEquals(3.0, ellipse.getCenter().getCoordinates().first)
        assertEquals(3.0, ellipse.getCenter().getCoordinates().second)
    }

    @Test
    fun testCircleConstruction(){
        val center = Point(1.0,2.0)
        val circle = Circle(center, 3.0)
        assertEquals(3.0, circle.getRadii().first)
        assertEquals(3.0, circle.getRadii().second)
        assertEquals(center, circle.getCenter())
    }

    @Test
    fun testInvalidEllipse(){
        val center = Point(1.0,2.0)
        val exception = assertFailsWith<IllegalArgumentException> {
            Ellipse(center,3.0,0.0)
        }
        assertEquals("Both radii must be greater than zero.", exception.message)
    }
}