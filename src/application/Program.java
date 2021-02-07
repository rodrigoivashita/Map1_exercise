package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file path: ");
		String path = sc.nextLine();

		Map<String, Integer> vote = new TreeMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] field = line.split(",");
				String candidate = (field[0]);
				Integer value = Integer.valueOf(field[1]);

				if (!vote.containsKey(candidate)) {
					vote.put(candidate, Integer.valueOf(value));
				} else {
					int sum = value + vote.getOrDefault(candidate, value);
					vote.put(candidate, Integer.valueOf(sum));
				}

				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		for (Entry<String, Integer> c : vote.entrySet()) {
			System.out.println(c.getKey() + ": " + c.getValue());
		}
		sc.close();
	}
}
