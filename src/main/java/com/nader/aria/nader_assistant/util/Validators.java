package com.nader.aria.nader_assistant.util;

import java.util.regex.Pattern;

public interface Validators {

    public static boolean isNull(String value){
        return value == null;
    }

    public static boolean isNotNull(String value){
        return value != null;
    }

    public static boolean isEmpty(String value){
        return isNull(value) || value.isEmpty();
    }

    public static boolean isNotEmpty(String value){
        return isNotNull(value) && !value.isEmpty();
    }

    public static boolean isSizeRight(String value, int maxSize){
        return isSizeRight(value,1,maxSize);
    }


    public static boolean isSizeRight(String value, int minSize, int maxSize){
        return ( value.length() >= minSize ) && ( value.length() <= maxSize );
    }

    public static boolean isMinimum(String value, int minimum){
        return value.length() < minimum;
    }

    public static boolean isDigit(String value){

        for( Character c : value.toCharArray() ){
            if( !Character.isDigit(c) ){
                return false;
            }

        }
        return true;
    }


    public static boolean isNotNegativeLong(String value){

        return isDigit(value) && ( Long.valueOf(value) >= 0L );

    }

    public static boolean isSiteCorrect(String value){

        final String REG_EXP = "^(http://|https://)?(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?$";
        return Pattern.matches(REG_EXP,value);

    }

    public static boolean isEmailCorrect(String value){

        final String REG_EXP = "^[_A-Za-z0-9-+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$";
        return Pattern.matches(REG_EXP,value);
    }

    public static boolean isEqualityTwoString(String valueOne, String valueTwo){

        return ( valueOne != null )
               && ( valueTwo != null )
               && ( valueOne.equals( valueTwo ) );
    }

    public static boolean isValueOneGreaterThanOrEqualValueTwo(String valueOneString, String valueTwoString){

        if( Validators.isDigit(valueOneString) && Validators.isDigit(valueTwoString) ){

            Long valueOne = Long.valueOf(valueOneString);
            Long valueTwo = Long.valueOf(valueTwoString);

            return isValueOneGreaterThanOrEqualValueTwo(valueOne,valueTwo);
        }

        return false;
    }

    public static boolean isValueOneGreaterThanOrEqualValueTwo(Long valueOne, Long valueTwo){

      return ( valueOne >= valueTwo );

    }


}
