public static List<Line> getInstances(Class<? extends Line> clazz, int counter)

public class Line2D{

	List lines = new ArrayList<Line>();
    for(int i=0;i< counter; i++)
    {
        lines.add(clazz.newInstance());
    }
    return lines;
}

List<StartLine> men = Line.getInstances(StartLine.class,10);
List<EndLine> men = Line.getInstances(EndLine.class,10)
	