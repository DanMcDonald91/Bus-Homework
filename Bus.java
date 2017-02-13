import java.util.ArrayList;

public class Bus {
  private String name;
  private ArrayList<Passenger>onboard;

  public Bus(String name){
    this.name = name;
    this.onboard = new ArrayList<Passenger>();
  }

  public String getName(){
    return this.name;
  }
  public int peopleCount() {
    return onboard.size();
  }
}