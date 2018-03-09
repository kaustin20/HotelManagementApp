package couchdb;

import com.couchbase.lite.CouchbaseLiteException;
import com.couchbase.lite.Database;
import com.couchbase.lite.Document;
import com.couchbase.lite.util.Log;
import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.HashMap;

public class DB
{

   private Database allDB = CouchbaseSingleton.getInstance().getDatabase();


    //use this function to create documents, pass in the database name, and new hashMap (if one exists)
    Document createDoc(String withDBName, HashMap<String, Object> newHashMap) throws IllegalArgumentException
    {
        Document newDoc = null;

        if((withDBName == "")||(withDBName == null))
        {
            throw new IllegalArgumentException("Database name cannot be left blank");
        }
        else{
            newDoc = allDB.getDocument(withDBName);

            if(newHashMap != null)
            {
                try{
                    newDoc.putProperties(newHashMap);
                }
                catch (CouchbaseLiteException e)
                {
                    Log.e(Log.TAG, "Cannot create document **FROM DB CLASS**", e);
                }
            }
        }


        return newDoc;
    }





    //pass in the EXISTING document name, and updated HashMap
    Document saveToDoc(String dBName, HashMap<String,Object> updatedHashMap) throws IllegalArgumentException
    {
        Document updatedDoc = null;
        if((dBName == "")||(dBName == null))
        {
            throw new IllegalArgumentException("Database name cannot be left blank");
        }
        else{
            Document currentDoc = allDB.getExistingDocument(dBName);
            try{
                currentDoc.putProperties(updatedHashMap);
            }
            catch (CouchbaseLiteException e)
            {
                Log.e(Log.TAG, "Cannot save document **FROM DB CLASS**", e);
            }

            updatedDoc = allDB.getExistingDocument(dBName);
        }

        return updatedDoc;
    }

}
