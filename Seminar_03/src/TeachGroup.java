import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeachGroup implements Iterable<Student> {
    private List<Student> studentList;
    static int id;

    public TeachGroup() {
        id = 0;
        studentList = new ArrayList<>();
    }

    @Override
    public Iterator<Student> iterator() {
        return new GroupIterator();
    }

    public void addStudent(String name){
        Student student = new Student(id++,name);
        studentList.add(student);
    }

    class GroupIterator implements Iterator<Student>{

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < studentList.size();
        }

        @Override
        public Student next() {
            return studentList.get(index++);
        }
    }
}
