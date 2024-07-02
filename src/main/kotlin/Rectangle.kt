open class Rectangle(private val point1: Point, private val point2: Point) {

    fun getPoints(): List<Point> {
        return listOf(point1, point2)
    }

    fun getArea(): Double {

    }
}
class Square(private val point1: Point, private val point2: Point) : Rectangle(point1, point2) {

}
