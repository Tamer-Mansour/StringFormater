package com.example.stringformatter;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public boolean isValid(String input) {
        Map<Character, Character> map = new HashMap<>();


        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        Stack<Character> stack = new Stack<>();

        for(char i : input.toCharArray()){
            if(map.containsKey(i)){
                stack.push(i);
            } else if(!stack.empty() && map.get(stack.peek())==i){
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}
