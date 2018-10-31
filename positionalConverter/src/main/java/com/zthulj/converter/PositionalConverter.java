package com.zthulj.converter;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PositionalConverter {

    public static class Position{
        public String name;
        public int start, end;

        public Position(String name, int start, int end) {
            this.name = name;
            this.start = start;
            this.end = end;
        }
    }

    private final Position[] positions;
    private final List<Position> positionsLst;

    public PositionalConverter(Position[] positions) {
        this.positions = positions;
        this.positionsLst = Arrays.asList(positions);
    }

    public Map<String,String> convert_1(String positionalValue){
        Map<String,String> result = new HashMap<>();
        for (int i = 0; i < this.positions.length; i++) {
            Position current = this.positions[i]; // only one access to the array
            result.put(current.name, positionalValue.substring(current.start,current.end));
        }
        return result;
    }

    public Map<String,String> convert_2(String positionalValue){
        Map<String,String> result = new ConcurrentHashMap<>();
        IntStream.of(0,this.positions.length-1).boxed()
                .parallel()
                .forEach(i -> {
                    Position current = this.positions[i]; // only one access to the array
                    result.put(current.name, positionalValue.substring(current.start,current.end));
                });
        return result;
    }

    public Map<String,String> convert_3(String positionalValue){
        Map<String,String> result = new HashMap<>();
        for (int i = 0; i < this.positionsLst.size(); i++) {
            Position current = this.positionsLst.get(i); // only one access to the array
            result.put(current.name, positionalValue.substring(current.start,current.end));
        }
        return result;
    }

    public Map<String,String> convert_4(String positionalValue){
        return this.positionsLst.parallelStream()
        .collect(Collectors.toMap(
                e -> e.name,
                e -> positionalValue.substring(e.start,e.end)));
    }
}
