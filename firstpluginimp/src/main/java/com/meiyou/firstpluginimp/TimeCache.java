package com.meiyou.firstpluginimp;

import java.util.HashMap;
import java.util.Map;

/**
 * 巴掌
 * https://github.com/JeasonWong
 */

public class TimeCache {

  public static Map<String, Long> sStartTime = new HashMap<>();
  public static Map<String, Long> sEndTime = new HashMap<>();

  public static void setStartTime(String methodName, long time) {
    if(sStartTime==null){
      sStartTime = new HashMap<>();
    }
    sStartTime.put(methodName, time);
  }

  public static void setEndTime(String methodName, long time) {
    if(sEndTime==null){
      sEndTime = new HashMap<>();
    }
    sEndTime.put(methodName, time);
  }


  public static String getCostTime(String methodName) {
    if(sStartTime==null){
      sStartTime = new HashMap<>();
    }
    long start = sStartTime.get(methodName);
    if(sEndTime==null){
      sEndTime = new HashMap<>();
    }
    long end = sEndTime.get(methodName);
    return "method: " + methodName + " cost " + Long.valueOf(end - start)/(1000*1000) + "  ms";
  }

}
