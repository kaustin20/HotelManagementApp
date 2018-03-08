package mainhotelapp

import javafx.scene.control.*
import javafx.scene.layout.HBox
import javafx.scene.text.Text
import tornadofx.*
import javafx.scene.control.ListCell



//create listView singleton
var addPackagesList by singleAssign<ListView<String>>()

class PackagesTableViewCell (packagesColumn: TableColumn<AvailableRooms, String>): TableCell<AvailableRooms, String>()
{
    val listView = ListView<String>()

    init{
        isEditable = false

        this.prefWidthProperty().bind(packagesColumn.widthProperty())
        this.prefHeightProperty().set(100.0)


    }

    override fun updateItem(item: String?, empty: Boolean) {
        super.updateItem(item, empty)

        //pass in a string to the updateItem, the string
        //will be a strings separated by commas
        //ex.) one,two,three,four...
        //then we will use the comma as the separator and
        //map each word to an item in a List, inside of a ListView
        //then we will retain the list view, set it equal to
        //the list view property in the class (create one if not created)
        //and set the graphic property equal to the listView
        //then set text to null
        //done




        //if not null split into array, if null make empty array
        val pkgListAry = if(item != null) item!!.split(";".toRegex()) else listOf()



            listView.prefWidthProperty().bind(this.widthProperty())
            listView.setCellFactory { PackageListViewCell() }
            listView.editableProperty().set(false)
            listView.items = pkgListAry.observable()

             graphic = listView



        //graphics need to equal a list view
//        graphic = //a ListView

        //we are not using text propery for this cell
//        text = null

    }



//    override fun startEdit() {
//        super.startEdit()
//    }



}


 class PackageListViewCell : ListCell<String>()
 {
     val hbox = HBox()
     val textObj = Text()
     val checkBox = CheckBox()

     init {
         hbox.prefWidthProperty().bind(this.widthProperty())
     }

    public override fun updateItem(item: String?, empty: Boolean) {
        super.updateItem(item, empty)

        textObj.text = "Hello World"


        checkBox.isSelected = false
        checkBox.isDisable = true

        hbox.add(textObj)

        hbox.add(checkBox)

        graphic = hbox




    }
}
