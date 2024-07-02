import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

class Line(private val point1: Point, private val point2: Point) {

    private val run = abs(point1.getCoordinates().first - point2.getCoordinates().first)
    private val rise = abs(point1.getCoordinates().second - point2.getCoordinates().second)
    init {
        require(sqrt(run.pow(2.0) + rise.pow(2.0)) != 0.0)
    }
    fun getPoints(): List<Point>{
        return listOf(point1, point2)
    }

    fun getSlope(): Double{
        return rise / run
    }

    fun getLength(): Double{
        return sqrt(run.pow(2.0) + rise.pow(2.0))
    }

    fun move(deltaX: Double, deltaY: Double){
        point1.move(deltaX, deltaY)
        point2.move(deltaX, deltaY)
    }
}