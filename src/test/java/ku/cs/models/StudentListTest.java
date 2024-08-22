package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void testAddNewStudent(){
        StudentList s1 = new StudentList();
        s1.addNewStudent("6610405964" , "Mic" , 85);
        assertEquals("Mic",s1.findStudentById("6610405964").getName());
        assertEquals(85,s1.findStudentById("6610405964").getScore());
        assertEquals("6610405964",s1.findStudentById("6610405964").getId());



    }

    @Test
    void testFindStudentById() {
        StudentList s1 = new StudentList();
        s1.addNewStudent("6610405964" , "Mic");
        s1.addNewStudent("6610400000" , "Moc");
        s1.addNewStudent("6610411111" , "Mec");

        assertEquals("Mic",s1.findStudentById("6610405964").getName());
        assertEquals("Moc",s1.findStudentById("6610400000").getName());
        assertEquals("Mec",s1.findStudentById("6610411111").getName());
    }

    @Test
    void testGiveScoreToId() {
        StudentList s1 = new StudentList();
        s1.addNewStudent("6610405964" , "Mic");
        s1.addNewStudent("6610400000" , "Moc");
        s1.addNewStudent("6610411111" , "Mec");

        s1.giveScoreToId("6610405964" , 50);
        assertEquals(50,s1.findStudentById("6610405964").getScore());
        s1.giveScoreToId("6610405964" , 10);
        assertEquals(60,s1.findStudentById("6610405964").getScore());

        s1.giveScoreToId("6610400000" , 100);
        assertEquals(100,s1.findStudentById("6610400000").getScore());
        s1.giveScoreToId("6610400000" , -10);
        assertEquals(100,s1.findStudentById("6610400000").getScore());

        s1.giveScoreToId("6610411111" , 0);
        assertEquals(0,s1.findStudentById("6610411111").getScore());
        s1.giveScoreToId("6610411111" , 20);
        assertEquals(20,s1.findStudentById("6610411111").getScore());



    }

    @Test
    void testViewGradeOfId() {
        StudentList s1 = new StudentList();
        s1.addNewStudent("6610405964" , "Mic" , 85);
        s1.addNewStudent("6610400000" , "Moc" , 62);
        s1.addNewStudent("6610411111" , "Mec" , 30);

        assertEquals("A",s1.viewGradeOfId("6610405964"));

        assertEquals("C",s1.viewGradeOfId("6610400000"));

        assertEquals("F",s1.viewGradeOfId("6610411111"));


    }
}