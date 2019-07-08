package com.sukshi.buildinfolib;

public class BuildInfoUtils {

    public String getBuildInfoString(){
        System.out.println("From buildinfoutils aar");
         String uri = BuildConfig.SomeURL;
        return "This is called from buildinfoutils aar";
    }


}
