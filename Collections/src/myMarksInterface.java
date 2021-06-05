import java.util.Comparator;

public class myMarksInterface implements Comparator<students>
{
    
    public int compare(students s1, students s2) 
    {
        return s2.getMarks() - s1.getMarks();
    }
}
  
class myNameComparator implements Comparator<students>
{
    public int compare(students s1, students s2)
    {
        return s1.getName().compareTo(s2.getName());
    

}
}