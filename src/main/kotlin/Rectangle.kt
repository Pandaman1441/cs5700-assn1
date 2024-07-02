import kotlin.math.abs

open class Rectangle(private val point1: Point, private val point2: Point) {
    init{
        require(abs(point1.getCoordinates().first - point2.getCoordinates().first) != 0.0)
        require(abs(point1.getCoordinates().second - point2.getCoordinates().second) != 0.0)
    }
    fun getPoints(): List<Point> {
        return listOf(point1, point2)
    }

    fun getArea(): Double {
        val width = abs(point1.getCoordinates().first - point2.getCoordinates().first)
        val height = abs(point1.getCoordinates().second - point2.getCoordinates().second)
        return width * height
    }
    fun move(deltaX: Double, deltaY: Double){
        point1.move(deltaX,deltaY)
        point2.move(deltaX,deltaY)
    }
}
class Square(private val point1: Point, private val point2: Point) : Rectangle(point1, point2) {
    init {
        val point1Coordinates = point1.getCoordinates()
        val point2Coordinates = point1.getCoordinates()
        require(point1Coordinates.first - point2Coordinates.first == point1Coordinates.second - point2Coordinates.second)
    }
}
