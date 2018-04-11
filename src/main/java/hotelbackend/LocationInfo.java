package hotelbackend;

public class LocationInfo {
    public enum allRegionTypes {
        //   *  Southwest (1)
//         *  Northwest (2)
//         *  Southcentral (3)
//         *  Northcentral (4)
//         *  Northeast (5)
//         *  Southeast (6)
//         *  Alaska (7)
//         *  PacificIslands (8)
        SouthWest, NorthWest, SouthCental,NorthCentral,
        NorthEast,SouthEast,Alaska,PacificIslands
    }

    public enum SouthWest{
        	California,Arizona,Nevada,Utah
    }

    public enum NorthWest{
        Washington, Oregon, Idaho

    }

    public enum SouthCentral{
       NewMexico,Oklahoma,Texas,Louisiana

    }
    public enum NorthCentral{
        Montana,Wyoming,Colorado,NorthDakoda,SouthDakoda,Nebraska,Kansas


    }
    public enum SouthEast{
        Mississippi,Alabama,Georgia,Florida,Arkansas,NorthCarolina,SouthCarolina,Tennessee



    }
    public enum NorthEast
    {
        Minnesota,NewHampshire,Iowa,Missouri,Wisconsin,Illinois,Kentucky,Indiana,Ohio,Michigan,Virginia,
        WestVirginia,Maryland,Delaware,Newjersey,Pennsylvania,Connecticut,RhodeIsland,NewYork,
        Massachusetts,Vermont,Maine

    }

    public enum Alaska
    {
        Alaska,
    }

    public enum  PacificIslands
    {
        Hawaii,
    }
    public enum allStateTypes {
        fridge, microwave, couch, telephone, iron, safe, cofferMaker, stereo, miniBar

    }
}
