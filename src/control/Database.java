package control;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Work on 10/10/2015.
 */
public abstract class Database {

    private List<DatabaseEntry> databaseEntries;

    public String save(){

    }

    abstract Field[] getFields();

    public DatabaseEntry[] getDatabaseEntries(){

    }

    public DatabaseEntry[] queryDatabase(Query query){

    }

    void addDatabaseEntry(DatabaseEntry databaseEntry){

    }

}
