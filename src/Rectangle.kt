class Rectangle(override var shapeName: String, override var shapeColour: String) :Shape {
    override fun calculateArea() {
                println("Enter Length to calculate area for rectangle")
                var length= readLine()?.toIntOrNull()?:0
                println("enter width")
                var width= readLine()?.toIntOrNull()?:0
                var area=length*width
        println(area)
            }


        override fun calculatePerimeter() {
            println("Enter length to calculate parameter for rectangle")
            var length=readLine()?.toIntOrNull()?:0
            println("enter width")
            var width=readLine()?.toIntOrNull()?:0
            var parameter=2*(length+width)
            println(parameter)
        }



}