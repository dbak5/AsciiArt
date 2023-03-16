/*
Name: DaHye Baker
ID: 30063368
Assessment 1: Activity 4 Task C
*/

fun main(args: Array<String>) {
    // Inputs for rectangle
    println("Please enter rectangle width: ")
    var widthRectangle = readln().toInt()

    println("Please enter rectangle height: ")
    var heightRectangle = readln().toInt()

    // Calculations for rectangle
    val asciiHeightRectangle = heightRectangle - 2
    val asciiSpacesRectangle = widthRectangle - 2

    print("\n")

    // Print first line
    repeat(widthRectangle)
    {
        print("#")
    }
    print("\n")

    // Print middle lines
    repeat(asciiHeightRectangle)
    {
    print("#")
        repeat(asciiSpacesRectangle)
        {
            print(" ")
        }
        print("#\n")
    }

    // Print last line
    repeat(widthRectangle)
    {
        print("#")
    }
    print("\n")

    // Input for triangle
    println("\nPlease enter triangle height: ")
    var heightTriangle = readln().toInt()

    val asciiHeightTriangle = heightTriangle - 2

    // Print first line
    println("\n#")

    // Print middle lines
    for (i in 1..asciiHeightTriangle){
        print("#")
        repeat(i-1){
            print(" ")
        }
        print("#\n")
    }

    // Print last line
    repeat(heightTriangle)
    {
        print("#")
    }
    print("\n")
}


