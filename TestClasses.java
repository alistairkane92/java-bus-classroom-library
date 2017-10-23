import static org.junit.Assert.assertEquals;
import org.junit.*;

public class TestClasses{
    Person person;
    Book book;
    Bus bus;
    Classroom classroom;
    Library library;
    Busstop busstop;

    @Before
    public void before() {
        bus = new Bus();
        classroom = new Classroom();
        library = new Library();
        book = new Book();
        person = new Person();
        busstop = new Busstop();
    }

    @Test
    public void busHasNoPassengers(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void busAddsPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void busIsFull(){
        for (int i = 0; i < 30; i++){
            bus.addPassenger(person);
        }
        assertEquals(25, bus.passengerCount());
    }

    @Test
    public void classroomHasNoStudents(){
        assertEquals(0, classroom.studentCount());
    }

    @Test
    public void classroomAddsStudent(){
        classroom.addStudent(person);
        assertEquals(1, classroom.studentCount());
    }

    @Test
    public void classroomIsFull(){
        for (int i = 0; i < 15; i++){
            classroom.addStudent(person);
        }
        assertEquals(10, classroom.studentCount());
    }

    @Test
    public void libraryHasNoStock(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void libraryAddsBook(){
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void libraryIsFull(){
        for (int i = 0; i < 100; i++){
            library.addBook(book);
        }
            assertEquals(50, library.stockCount());
    }

    @Test
    public void busstopHasQueue(){
        assertEquals(0, busstop.queueCount());
    }

    @Test
    public void busstopAddsToQueue(){
        busstop.addQueuer(person);
        assertEquals(1, busstop.queueCount());
    }

    @Test
    public void busstopRemovesPersonFromQueue(){
        busstop.addQueuer(person);
        busstop.addQueuer(person);
        busstop.addQueuer(person);
        busstop.removeQueuer(person);

        assertEquals(2, busstop.queueCount());
    }

    @Test
    public void busstopAddsPersonToBus(){
        busstop.addQueuerToBus(person);

        assertEquals(1, bus.passengerCount());
    }
}
