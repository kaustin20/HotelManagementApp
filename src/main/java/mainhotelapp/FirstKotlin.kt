package mainhotelapp

import javafx.scene.control.Label
import javafx.scene.layout.HBox
import tornadofx.*

fun speakKotlin(statement: String) : String
{
    return "The Statement is: " + statement
}

class HelloWorld : View() {
    override val root = hbox {
        label("Hello world")
    }
}