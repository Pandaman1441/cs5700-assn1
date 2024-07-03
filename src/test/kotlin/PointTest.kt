import kotlin.test.Test
import kotlin.test.assertEquals

class PointTest {
    @Test
    fun testPointConstruction() {
        val point = Point(1.0,2.0)
        assertEquals(1.0, point.getCoordinates().first)
        assertEquals(2.0, point.getCoordinates().second)
    }
    @Test
    fun testCloning() {
        val point = Point(2.0,4.0)
        val clonedPoint = point.clone()
        assertEquals(point.getCoordinates().first, clonedPoint.getCoordinates().first)
        assertEquals(point.getCoordinates().second, clonedPoint.getCoordinates().second)
    }

}