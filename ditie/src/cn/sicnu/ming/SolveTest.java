package cn.sicnu.ming;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolveTest {


    @Test
    public void getSubwayMessage() {
        Solve solve = new Solve();
        solve.getSubwayMessage();
        System.out.println("line"+"\n");
        solve.lines.stream().forEach( x-> System.out.println(x.toString()) );
        System.out.println("总站数"+"\n");
        System.out.println( solve.map.keySet().size() );
        solve.map.keySet().forEach( x-> System.out.println(x) );

    }




}