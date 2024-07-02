open class Ellipse(private val center: Point, private val radius1: Double, private val radius2: Double) {

    init {
        require((Math.PI * radius1 * radius2) != 0.0)
    }
    fun getCenter() : Point{
        return center
    }

    fun getRadii() : Pair<Double, Double>{
        return Pair(radius1, radius2)
    }

    fun getArea() : Double{
        return Math.PI * radius1 * radius2
    }

    fun move(deltaX: Double, deltaY: Double){
        center.move(deltaX,deltaY)
    }
}

class Circle(center: Point, radius: Double) : Ellipse(center, radius, radius){

}