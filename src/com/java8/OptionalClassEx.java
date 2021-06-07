package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalClassEx {

    public static void main(String[] args) {
       String[] strings = new String[10];
  //     strings[5] = "Vinod";
       Optional<String > checkNull = Optional.ofNullable (strings[5]);
       if(checkNull.isPresent ()){
           System.out.println ("Word Present");
       } else {
           System.out.println ("Word is null");
       }

    }
}
