package application;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		// It is a collection of key/value pairs.
		// Does not allow repetition of key object
		// Elements are indexed by key object (have no position)
		// Accessing, inserting and removing elements is fast
		// Common usage: cookies, localstorage, any key-value model
		Map<Product, Double> stock = new HashMap<>();

		// Main implementations
		Map<Product, Double> speedy = new HashMap<>();
		Map<?, ?> slow = new TreeMap<>();
		Map<?, ?> intermediary = new LinkedHashMap<>();

		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);

		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);

		Product ps = new Product("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
	}
}