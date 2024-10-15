package org.example;

public class StudentSort implements Comparable<StudentSort> {


    private int id;
    private String name;

    public StudentSort(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentSort{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(StudentSort that) {
        return Integer.compare(this.id, that.id);
    }
}


