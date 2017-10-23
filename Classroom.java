//classroom capacity is 10
//students are made of person class

class Classroom {
    private Person[] capacity;

    public Classroom(){
        this.capacity = new Person[10];
    }

    public int studentCount(){
        int count = 0;

        for(Person person : this.capacity){
            if (person != null){
                count ++;
            }
        }

        return count;
    }

    public void addStudent(Person person){
        if (!isClassroomFull()){
            int studentCount = studentCount();
            this.capacity[studentCount] = person;
        }
    }

    public boolean isClassroomFull(){
        return studentCount() == this.capacity.length;
    }
}
