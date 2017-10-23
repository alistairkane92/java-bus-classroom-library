//bus capacity is 25
//passengers are made of person class

public class Bus{
    private Person[] capacity;

    public Bus(){
        this.capacity = new Person[25];
    }

    public int passengerCount(){
        int count = 0;

        for(Person person : this.capacity){
            if (person != null){
            count ++;
            }
        }

        return count;
    }

    public void addPassenger(Person person){
        if (!isBusFull()){
            int passengerCount = passengerCount();
            this.capacity[passengerCount] = person;
        }
    }

    public boolean isBusFull(){
        return passengerCount() == this.capacity.length;
    }
}
