package com.zthulj.jmh;

import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;

public class JMHRunner {
    public static void main(String[] args) throws IOException, RunnerException {
        org.openjdk.jmh.Main.main(args);
    }
}
