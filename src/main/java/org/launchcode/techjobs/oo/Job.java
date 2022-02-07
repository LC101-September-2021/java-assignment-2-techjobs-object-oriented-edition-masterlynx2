package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    //    public String toString() {
//        if (this.getName().equals("")) {
//            this.name += "Data not available";
//        } else if(this.getEmployer().equals("")) {
//               this.employer += "Data not available";
//        } else if(this.location== null) {
//            return "Data not available";
//        } else if(this.positionType== null) {
//            return "Data not available";
//        } else if(this.coreCompetency== null) {
//            return "Data not available";
//            }else{ String result = " ID:  _______" + this.getId() + "\n" +
//                    " Name:  _______" + this.getName() + "\n" +
//                    " Employer:  _______" + this.getEmployer() + "\n" +
//                    " Location:  _______" + this.getLocation() + "\n" +
//                    " PositionType:  _______" + this.getPositionType() + "\n" +
//                    " CoreCompetency:  _______" + this.getCoreCompetency() + "\n";
//            return result;
//
//        }
    @Override
    public String toString(){
        String output= "";

        if (this.getName().equals("") && this.getEmployer().getValue().equals("")
                && this.getLocation().getValue().equals("")&& this.getPositionType().getValue().equals("")&&this.getCoreCompetency().getValue().equals("")){
            return "OOPS! This job does not seem to exist.";
        }

        if (this.getName().equals("")) {
            setName("Data not available");
        }  if(this.getEmployer().getValue().equals(""))  {
            setEmployer( new Employer( "Data not available"));
        } if (this.getLocation().getValue().equals("")){
            setLocation(new Location("Data not available"));
        }if (this.getPositionType().getValue().equals("")){
            setPositionType(new PositionType("Data not available"));
        } if (this.getCoreCompetency().getValue().equals("")){
            setCoreCompetency(new CoreCompetency("Data not available"));
        }

        output = String.format("\n ID: %d\n" +
                "Name: %s\n" +
                "Employer: %s\n" +
                "Location: %s\n" +
                "PositionType: %s\n" +
                "CoreCompetency: %s\n",id, name, employer.getValue(), location.getValue(),positionType.getValue(),coreCompetency.getValue());

//        if (this.getName().equals("")) {
//            output += '\n' + "Name: Data not available";
//        } else if(this.getEmployer().equals(""))  {
//            output += '\n' + "Employer: Data not available";
//        }else if (this.getLocation().equals("")){
//            output += '\n' + "Location: Data not available";
//        }else if (this.getPositionType().equals("")){
//            output += '\n' + "PositionType: Data not available";
//        }else if (this.getCoreCompetency().equals("")){
//            output += '\n' +  "CoreCompetency: Data not available";
//        }

        return output;


    }

}
//}