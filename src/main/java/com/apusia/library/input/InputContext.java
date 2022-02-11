package com.apusia.library.input;

public class InputContext {

    private static InputAdapter input;

    private InputContext(){}

    public static InputAdapter getInput(){
        return input;
    }

    public static void register(InputAdapter inputAdapter) {
        if( InputContext.input == null ) {
            InputContext.input = inputAdapter;
        }
    }

}
