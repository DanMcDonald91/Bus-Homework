import java.util.ArrayList;

public class Bus {
  private String name;
  private ArrayList<Passenger>onboard;

  public Bus(String name){
    this.name = name;
    this.onboard = new ArrayList<Passenger>();
  }

  // Get The Name Of The Bus
  public String getName(){
    return this.name;
}
// Check The Bus Is Empty
  public int peopleCount() {
    return onboard.size();
  }

  // Add Passenger Onto Bus
  public void add(Passenger passenger){
    onboard.add(passenger);
  }

  // Passenger gets off the bus
  public void personLeaves(){
    onboard.clear();
  }

}

