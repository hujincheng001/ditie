package cn.sicnu.ming;

import org.junit.Test;

import static org.junit.Assert.*;

public class subwayTest {

    @Test
    public void main() {
        new subway().main( " -b 洪湖里 复兴路 -map subway.txt -o routine.txt" );
        new subway().main( "-a 1号线 -map subway.txt -o station.txt" );
        new subway().main( "-map subway.txt" );
    }
}