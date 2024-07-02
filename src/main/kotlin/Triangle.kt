import kotlin.math.abs

class Triangle(private val point1: Point, private val point2: Point, private val point3: Point) {
    private val p1 = point1.getCoordinates()
    private val p2 = point2.getCoordinates()
    private val p3 = point3.getCoordinates()
    init{
        require(1/2 * (abs(
            p1.first * (p2.second - p3.second) +
            p2.first * (p3.second - p1.second) +
            p3.first * (p1.second - p2.second))) != 0.0)
    }

    fun getPoints(): List<Point>{
        return listOf(point1,point2,point3)
    }

    fun getArea(): Double{
        // 1/2 | x1(y2-y3) + x2(y3-y1) + x3(y1-y2) |
        return 1/2 * (abs(
                p1.first * (p2.second - p3.second) +
                p2.first * (p3.second - p1.second) +
                p3.first * (p1.second - p2.second)))
    }

    fun move(deltaX: Double, deltaY: Double){
        point1.move(deltaX,deltaY)
        point2.move(deltaX,deltaY)
        point3.move(deltaX,deltaY)
    }

}