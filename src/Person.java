import java.time.Year;

public class Person
{
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;

    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID='" + ID + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }
    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    /**
     * Method to get the formal name from the Person object
     * @return return the title first and last name arranged as a formal name String
     */

    public String getFormalName()
    {
        return title + " " + firstName + " " + lastName;
    }

    /**
     * Get the age as an int assuming that it is for the current year
     * @return the current age
     */

    public int getAge()
    {
       return Integer.parseInt(Year.now().toString()) - YOB;
    }

    /**
     *
     * @param year
     * @return
     */
    public int getAge(int year)
    {
        return year - YOB;
    }

    /**
     *
     * @return Returns object data in CSV format
     */

    public String toCSVRecord()
    {
        return  ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }


    /**
     * XML Data for person
     * <Person>
     *     <ID>ID</ID>
     *     <firstName>firstName</firstName>
     *     <lastName>lastName</lastName>
     *     <title>title</title>
     *     <YOB>YOB</YOB>
     *     </Person>
     */
}
