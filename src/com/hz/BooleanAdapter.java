package com.hz;

public class BooleanAdapter {

    private ConsoleReader _reader;

    public BooleanAdapter() {
        _reader = new ConsoleReader();
    }

    public boolean readLine() {
        String ans = _reader.readLine();

        return true;
    }
}
