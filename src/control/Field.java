package control;

/**
 * Created by Work on 10/10/2015.
 */
public class Field {

    private Class datatype;
    private Object data;

    public Field(Object data){
        this.datatype = data.getClass();
        this.data = data;
    }

    //for creating field without data being set
    public Field(Class datatype){
        this.datatype = datatype;
    }

    //sets data of field if same datatype, else returns false without setting data
    public boolean setData(Object data){
        if(this.datatype.equals(data.getClass())){
            this.data = data;
            return true;
        }
        return false;
    }

    public Class getDatatype() {
        return datatype;
    }

    public Object getData() {
        return data;
    }
}
