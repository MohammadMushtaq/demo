package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class DecsendingOrderByComparitor implements Comparator<StudentSort> {

    @Override
    public int compare(StudentSort s1, StudentSort s2) {
        return Integer.compare(s2.getId(), s1.getId());
    }
}


public class StudentSortRunner {

    public static void main(String[] args) {

        List<StudentSort> studentList = List.of(new StudentSort(1, "mush"),
                new StudentSort(33, "anil"),
                new StudentSort(22, "naveen"));
        System.out.println(studentList);

        List<StudentSort> arrayList = new ArrayList<>(studentList);
        Collections.sort(arrayList);
        System.out.println("Ascending " + arrayList);

        // Collections.sort(arrayList, new DecsendingOrderByComparitor());

        arrayList.sort(new DecsendingOrderByComparitor());
        System.out.println("decending " + arrayList);

    }
}
