package org.launchcode.techjobs.oo.test;
//import java.awt.Graphics;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;
/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)



public class JobTest {

    //   @Before
//        Job a1= new Job("performer","launchcode","detroit","singer","vocals");

    Job a2;
    Job a3;
    Job tester;
    Job tester2;
    Job toStringjob;
    Job tester3;

    String result;
    String result2;

    Job tester5;
    Job tester8;
    @Before
    public void Job() {
        a2 = new Job();
        a3 = new Job();
        tester = new Job("", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        tester2 = new Job("", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        tester3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }
    @Test
    public void testSettingJobId() {
        assertFalse(a2.getId() == a3.getId());
        //assertTrue(a2.getId() - a3.getId()== -1);

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(tester3.getName() instanceof String);
        assertTrue(tester3.getEmployer() instanceof Employer);
        assertTrue(tester3.getLocation() instanceof Location);
        assertTrue(tester3.getPositionType() instanceof PositionType);
        assertTrue(tester3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester",tester3.getName());
        assertEquals("ACME",tester3.getEmployer().getValue());
        assertEquals("Desert",tester3.getLocation().getValue());
        assertEquals("Quality control",tester3.getPositionType().getValue());
        assertEquals("Persistence",tester.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(tester instanceof Job != tester2 instanceof Job);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job(
                "Web Developer",
                new Employer("LaunchCode"),
                new Location("StL"),
                new PositionType("Back-end developer"),
                new CoreCompetency("Java"));

        char firstChar = job.toString().charAt(0);
        char lastChar = job.toString().charAt(job.toString().length()-1);

        assertEquals(firstChar, '\n');
        assertEquals(lastChar, '\n');
    }
//    @Test
//    public void testToStringLabel() {
//
//        Boolean labelId = tester.toString().contains("ID");
//        Boolean labelName = tester.toString().contains("Name");
//        Boolean labelEmployer = tester.toString().contains("Employer");
//        Boolean labelLocation = tester.toString().contains("Location");
//        Boolean labelPositionType = tester.toString().contains("PositionType");
//        Boolean labelCoreCompetency = tester.toString().contains("CoreCompetency");
//
//        assertTrue(labelId && labelName && labelEmployer && labelLocation && labelPositionType && labelCoreCompetency == true);
    //}
    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        Boolean labelId = tester.toString().contains("ID");
        Boolean labelName = tester.toString().contains("Name");
        Boolean labelEmployer = tester.toString().contains("Employer");
        Boolean labelLocation = tester.toString().contains("Location");
        Boolean labelPositionType = tester.toString().contains("Position Type");
        Boolean labelCoreCompetency = tester.toString().contains("Core Competency");

        assertTrue(labelId && labelName && labelEmployer && labelLocation && labelPositionType && labelCoreCompetency == true);
//st

        String test = "\nID: " + tester.getId() + "\n" +
                "Name: Data not available\n" +
                "Employer: ACME\n" +
                "Location: Data not available\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n";
        assertEquals(test, tester.toString());
//        assertEquals(tester.toString(), tester.toString());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        tester8 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        System.out.println(tester.getLocation().getValue());
        assertEquals("OOPS! This job does not seem to exist.",tester8.toString());
    }

}

