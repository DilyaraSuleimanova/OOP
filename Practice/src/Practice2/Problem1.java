package Practice2;

class Students {
    private String name, id;
    private int yearOfStudy;
    
    public Students (String name, String id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    
    public int getYearOfStudy() {
        return yearOfStudy;
    }
    
    public void increaseYearOfStudy() {
        this.yearOfStudy++;
    }
}


public class Problem1 {

	public static void main(String[] args) {
		Students my = new Students("Dilyara", "B030109");
		
		my.increaseYearOfStudy();
		
		System.out.println(my.getName() + "\n" + my.getId() + "\n" + my.getYearOfStudy());

	}

}
