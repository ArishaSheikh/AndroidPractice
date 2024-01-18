class Circle(override var shapeName: String, override var shapeColour: String) :Shape{

    override fun calculateArea() {
        var pi=3.147
        println("enter radius to calculate area for circle")
        var r= readLine()?.toIntOrNull()?:0
        var area=pi*r*r
        println(area)
    }

    override fun calculatePerimeter() {
        var pi=3.147
        println("enter radius to calculate parameter for circle")
        var r= readLine()?.toIntOrNull()?:0
        var parameter=2*pi*r
        println(parameter)

    }
}