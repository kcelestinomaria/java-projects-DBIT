
class Patient{

    // Declare and set variables to private
    // to enable encapsulation
    private String firstName;
    private String secondName;
    private int Age;
    private String Disease;
    private String dateOfAdmission;
    private String dateOfDischarge;

    public static void main(String[] args) {
        System.out.println("Welcome! This is the Patient Class!");
    }

    // setter method for variable 'firstName'
    public void setfirstName(String firstName){
        this.firstName = firstName;
        //return firstName;
    }

    // setter method for variable 'secondName'
    public void setsecondName(String secondName){
        this.secondName = secondName;
        //return secondName;
    }

    // getter method for both 'firstName' & 'secondName'
    public String getFullNames(){
        return firstName + ' ' + secondName;
    }

    // setter method for 'Age'
    public void setAge(int Age){
        this.Age = Age;
    }

    // getter method for 'Age'
    public int getAge(){
        return Age;
    }

    // setter method for 'Disease'
    public void setDisease(String Disease){
        this.Disease = Disease;
    }

    // getter method for 'Disease'
    public String getDisease() {
        return Disease;
    }

    // setter method for 'DateOfAdmission'
    public void setDateOfAdmission(String dateOfAdmission){
        this.dateOfAdmission = dateOfAdmission;
    }

    // getter method for 'DateOfAdmission'
    public String getDateOfAdmission(){
        return dateOfAdmission;
    }

    // setter method for 'DateOfDischarge'
    /**
     * @param dateOfDischarge
     */
    public void setDateOfDischarge(String dateOfDischarge){
        this.dateOfDischarge = dateOfDischarge;
    }

    // getter method for 'DateOfDischarge'
    public String getDateOfDischarge(){
        return dateOfDischarge;
    }
}