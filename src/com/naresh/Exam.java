package com.naresh;




import java.util.Collections;
import java.util.HashMap;
import java.util.Map;



public class Exam{

	public static void main(String[] args) {
		Map<Integer,String> map= new HashMap<Integer,String>(); 
        map.put(11, "a");
        
        Collections.unmodifiableMap(map);
        map.put(12, "b");
        System.out.println(map);
        
    } 
} 