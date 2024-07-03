import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class RectangleTest {

    @Test
    fun testRectangleConstruction(){
        val point1 = Point(0.0,0.0)
        val point2 = Point(2.0,3.0)
        val rectangle = Rectangle(point1,point2)
        assertEquals(point1, rectangle.getPoints()[0])
        assertEquals(point2, rectangle.getPoints()[1])
    }

    @Test
    fun testGetArea(){
        val point1 = Point(0.0,0.0)
        val point2 = Point(2.0,3.0)
        val rectangle = Rectangle(point1, point2)
        assertEquals(6.0, rectangle.getArea())
    }

    @Test
    fun testMove(){
        val point1 = Point(0.0,0.0)
        val point2 = Point(2.0,3.0)
        val rectangle = Rectangle(point1, point2)
        rectangle.move(2.0,0.0)
        assertEquals(2.0, rectangle.getPoints()[0].getCoordinates().first)
        assertEquals(4.0, rectangle.getPoints()[1].getCoordinates().first)
    }

    @Test
    fun testSquareConstruction(){
        val point1 = Point(0.0,0.0)
        val point2 = Point(2.0,2.0)
        val square = Square(point1, point2)

        assertEquals(point1, square.getPoints()[0])
        assertEquals(point2, square.getPoints()[1])
    }

    @Test
    fun testInvalidSquare(){
        val point1 = Point(0.0,0.0)
        val point2 = Point(2.0,3.0)
        val exception = assertFailsWith<IllegalArgumentException> {
            Square(point1, point2)
        }
        assertEquals("All sides must be equal in length to be a square", exception.message)
    }
}