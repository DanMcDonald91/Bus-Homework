import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
public class BusTest{
  Bus bus;
  Passenger homer;
  Passenger barney;
  Passenger lenny;
  Passenger carl;

  @Before
  public void before() {
    bus = new Bus("The MonoRail");
    homer = new Passenger("Homer");
    barney = new Passenger("Barney");
    lenny = new Passenger("Lenny");
    carl = new Passenger("Carl");
  }

  @Test
  public void hasName() {
    assertEquals("The MonoRail", bus.getName());
  }

  @Test
  public void CheckBusEmpty(){
    assertEquals(0, bus.peopleCount());
  }

  @Test
  public void testAddPerson(){
    bus.add(homer);

    assertEquals(1, bus.peopleCount());
  }

  @Test
  public void testPersonLeaves(){
    bus.add(homer);

    assertEquals(1, bus.peopleCount());
    bus.personLeaves();

    assertEquals(0, bus.peopleCount());
  }
}