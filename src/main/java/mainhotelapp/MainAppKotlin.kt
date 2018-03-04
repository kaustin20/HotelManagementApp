package mainhotelapp

import javafx.application.Application
import javafx.scene.control.*
import javafx.scene.layout.*
import javafx.collections.FXCollections
import hotelbackend.HotelBackend
import tornadofx.*;
import java.util.*




class ReservationView : View()
{

    override val root = vbox{

     hbox{



             button("Home"){
                    action{

                        println("Presenting 1 ")
                    }


            }
             button("Reservation System"){
                 action{

                     println("Presenting 2")
                 }


             }
             button("Rewards System"){
                 action{

                     println("Presenting 3")
                 }
             }
         button("Home"){
             action{

                 println("Presenting 1 ")
             }


         }
         button("Reservation System"){
             action{

                 println("Presenting 2")
             }


         }
         button("Rewards System"){
             action{

                 println("Presenting 3")
             }
         }

         }


        hbox {
                webview{
                    engine.load("http://google.com")

                }



        }
     }



 }











class MainAppKotlin : App(ReservationView::class)

fun main(args: Array<String>)
{

    Application.launch(MainAppKotlin::class.java, *args)


}
