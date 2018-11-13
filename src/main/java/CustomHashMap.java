import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Person {
	String name;
	Integer age;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=").append(name).append(", age=").append(age).append("]");
		return builder.toString();
	}

}

public class CustomHashMap {

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(new Person("kapil", 5), new Person("mahesh", 10),
				new Person("radhe", 15), new Person("suresh", 25));
		Person persons[] = new Person[4];
		for (Person person : personList) {
			persons[person.hashCode() % 4] = person;
		}
		
		for(Person person:persons){
			System.out.println(person);
		}
		
		Person newPersons[] = new Person[8];
		
		System.arraycopy(persons, 0, newPersons, 0, 4);
		
		System.out.println();
		for(Person person:newPersons){
			System.out.println(person);
		}

	}
}
