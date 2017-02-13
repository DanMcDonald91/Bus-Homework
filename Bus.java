import java.util.ArrayList;

public class Bus {
  private String name;
  private ArrayList<Passenger>bus_stop;

  public Bus(String name){
    this.name = name;
    this.bus_stop = new ArrayList<Passenger>();
  }

  public String getName(){
    return this.name;
  }
}