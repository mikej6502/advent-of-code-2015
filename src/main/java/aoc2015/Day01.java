package aoc2015;

public class Day01
{
    public static int processDirections( final String directions )
    {
        return directions.chars().map( c -> c == '(' ? 1 : -1  ).sum();
    }
}
