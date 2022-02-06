package com.apusia.library.input;

public class DataInputContext {
    public static DataInput dataInput;

    private DataInputContext(){}

    public static DataInput getDataInput(){
        return dataInput;
    }

    public static void register(DataInput dataInput) {
        if( DataInputContext.dataInput == null )
            DataInputContext.dataInput = dataInput;
    }

}
