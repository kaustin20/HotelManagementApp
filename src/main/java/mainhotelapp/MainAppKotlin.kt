package mainhotelapp

import javafx.application.Application
import javafx.scene.control.*
import javafx.scene.layout.*
import javafx.collections.FXCollections
import hotelbackend.HotelBackend
import tornadofx.*;



class ReservationSystemUI : View()
{
    override val root : VBox by fxml("/fxml/ReservationSystemUI.fxml")


}





class MainAppKotlin : App(ReservationSystemUI::class)

fun main(args: Array<String>)
{

    Application.launch(MainAppKotlin::class.java, *args)
}
