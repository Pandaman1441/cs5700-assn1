class Point(private var X: Double, private var Y: Double) {

    fun getCoordinates(): Pair<Double, Double>{
        return Pair(X,Y)
    }

    fun clone(): Point{
        return Point(X,Y)
    }

    fun move(deltaX: Double, deltaY: Double){
        X += deltaX
        Y += deltaY
    }
}