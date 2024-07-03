import kotlin.test.Test
import kotlin.test.assertEquals

class LineTest {

    @Test
    fun testLineConstruction(){
        val point1 = Point(1.0,2.0)
        val point2 = Point(3.0,4.0)
        val line = Line(point1,point2)

        val points = line.getPoints()
        assertEquals(point1, points[0])
        assertEquals(point2, points[1])
    }

    @Test
    fun testGetSlope(){
        val point1 = Point(1.0,2.0)
        val point2 = Point(3.0,4.0)
        val line = Line(point1,point2)

        assertEquals(1.0, line.getSlope())
    }

    @Test
    fun testGetLength(){
        val point1 = Point(1.0,2.0)
        val point2 = Point(5.0,5.0)
        val line = Line(point1,point2)

        assertEquals(5.0, line.getLength())
    }

    @Test
    fun testMove(){
        val point1 = Point(1.0,2.0)
        val point2 = Point(3.0,4.0)
        val line = Line(point1,point2)
        line.move(3.0,2.0)
        val points = line.getPoints()

        assertEquals(4.0, points[0].getCoordinates().first)
        assertEquals(4.0, points[0].getCoordinates().second)
        assertEquals(6.0, points[1].getCoordinates().first)
        assertEquals(6.0, points[1].getCoordinates().second)
    }
}