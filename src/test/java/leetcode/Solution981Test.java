package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution981Test {
    @Test
    void Test1() {
        Solution981.TimeMap timeMap = new Solution981.TimeMap();
        String s = "";
        timeMap.set("love","high",10);
        timeMap.set("love","low",20);
        s += timeMap.get("love", 5);
        s += timeMap.get("love", 10);
        s += timeMap.get("love", 15);
        s += timeMap.get("love", 20);
        s += timeMap.get("love", 25);
        System.out.println(s);
    }

    @Test
    void Test2() {
        Solution981.TimeMap timeMap = new Solution981.TimeMap();
        String s = "";
        timeMap.set("a","bar",1);
        timeMap.set("x","b",3);
        s += timeMap.get("b",3);
        timeMap.set("foo","bar2",4);
        s += timeMap.get("foo",4);
        s += timeMap.get("foo",5);
        System.out.println(s);
    }

}