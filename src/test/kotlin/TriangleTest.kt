import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class TriangleTest {

    @Test
    fun testTriangleConstruction(){
        val point1 = Point(0.0,0.0)
        val point2 = Point(4.0,0.0)
        val point3 = Point(0.0,3.0)
        val triangle = Triangle(point1,point2,point3)

        assertEquals(point1, triangle.getPoints()[0])
        assertEquals(point2, triangle.getPoints()[1])
        assertEquals(point3, triangle.getPoints()[2])
    }

    @Test
    fun testGetArea(){
        val point1 = Point(0.0,0.0)
        val point2 = Point(4.0,0.0)
        val point3 = Point(0.0,3.0)
        val triangle = Triangle(point1,point2,point3)

        assertEquals(6.0, triangle.getArea())
    }

    @Test
    fun testMove(){
        val point1 = Point(0.0,0.0)
        val point2 = Point(4.0,0.0)
        val point3 = Point(0.0,3.0)
        val triangle = Triangle(point1,point2,point3)
        triangle.move(2.0,1.0)

        assertEquals(2.0,triangle.getPoints()[0].getCoordinates().first)
        assertEquals(1.0,triangle.getPoints()[0].getCoordinates().second)
        assertEquals(6.0,triangle.getPoints()[1].getCoordinates().first)
        assertEquals(1.0,triangle.getPoints()[1].getCoordinates().second)
        assertEquals(2.0,triangle.getPoints()[2].getCoordinates().first)
        assertEquals(4.0,triangle.getPoints()[2].getCoordinates().second)
    }

    @Test
    fun testInvalidTriangle(){
        val point1 = Point(0.0,0.0)
        val point2 = Point(4.0,0.0)
        val point3 = Point(3.0,0.0)
        val exception = assertFailsWith<IllegalArgumentException>{
            Triangle(point1,point2,point3)
        }
        assertEquals("All 3 points can not be on the same line.", exception.message)
    }
}