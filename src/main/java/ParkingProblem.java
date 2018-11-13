import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Coordinate {
	int x;
	int y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
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
		Coordinate other = (Coordinate) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coordinate [x=").append(x).append(", y=").append(y).append("]");
		return builder.toString();
	}

}

class Owner {
	public int unitcost;
	Set<Coordinate> coordinates = new LinkedHashSet<>();

	public void add(Coordinate coordinate) {
		this.coordinates.add(coordinate);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Owner [unitcost=").append(unitcost).append(", coordinates=").append(coordinates).append("]");
		return builder.toString();
	}
	
}

public class ParkingProblem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Integer numberOfParkingSpace = Integer.parseInt(scanner.nextLine());
		
	
		List<Owner> owners=new ArrayList<>();
		for (int ii = 1; ii <= numberOfParkingSpace; ii++) {
			String line = scanner.nextLine();
			String [] arr=line.split(" ");
			Owner owner = new Owner();
			owner.unitcost=Integer.parseInt(arr[4]);
			for (int i = Integer.parseInt(arr[0]); i <= Integer.parseInt(arr[2]); i++) {
				for (int j = Integer.parseInt(arr[1]); j <= Integer.parseInt(arr[3]); j++) {

					owner.add(new Coordinate(i, j));
				}

			}
			owners.add(owner);
		}
		int totalCost=0;
		for(int ii=0;ii<numberOfParkingSpace;ii++){
			HashSet<Coordinate> hashSet=new HashSet<>(owners.get(ii).coordinates);
			HashSet<Coordinate> totalHashSet=new HashSet<>();
			for(int jj=0;jj<numberOfParkingSpace;jj++){
				if(ii!=jj)
					totalHashSet.addAll(owners.get(jj).coordinates);
			}
			hashSet.retainAll(totalHashSet);
			
			totalCost=totalCost+(hashSet.size()*owners.get(ii).unitcost);
		}
		System.out.println(totalCost);

	}
}
