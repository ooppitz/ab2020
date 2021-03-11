package de.die_gfi.philipp.shop;

import de.die_gfi.philipp.shop.data.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Shop aShop = ShopInit.initializeTestShop();

		System.out.println(aShop);
		System.out.println(aShop.inventoryToString());


		while (true) {
			System.out.println();
			switch (input.nextLine().toLowerCase()) {
			case "login":
				if (employeeLogin(input, aShop)) {
					System.out.println("Login success.");
				}
				break;
			case "alog":
				if (adminLogin(input, aShop)) {
					System.out.println("Logged in as admin");
				}
				break;
			case "purchase":
				if (purchase(input, aShop)) {
					break;
				} else {
					continue;
				}
			case "register":
				registerAsCustomer(input, aShop);
				continue;
			case "cancel":
			case "leave":
				break;
			default:
				System.err.println("Command not recognized!");
				continue;
			}
			break;
		}

	}

	private static boolean purchase(Scanner input, Shop shop) {
		System.out.println("Please enter your email address to make a purchase (To test use \"ooppitz@github.com\"): ");
		String str = input.nextLine();
		Customer customer = shop.getCustomer(str);
		if (customer != null) {
			System.out.println(
					customer.getName() + ", welcome to " + shop.getShopName() + "\nYou can now make a purchase.");
			return customer.makePurchase(input, shop);
		} else {
			System.out.println("Seems like you are not a customer of ours yet. Please register first.");
			return false;
		}
	}

	private static boolean employeeLogin(Scanner input, Shop shop) {
		System.out.print("Please enter user name: ");
		return false;
	}

	private static boolean adminLogin(Scanner input, Shop shop) {
		System.out.print("Please enter admin password: ");
		return shop.admin.login(input.nextLine());
	}

	private static void registerAsCustomer(Scanner input, Shop shop) {
		System.out.print("Please enter your email address: ");
		String emailAddress = input.nextLine();
		if (shop.getCustomer(emailAddress) == null) {
			System.out.print("Please enter your full name: ");
			String name = input.nextLine();

			System.out.print("Please enter your street name, house number, and other details like flat number: ");
			String streetHouseNumber = input.nextLine();

			System.out.print("Please enter your post code: ");
			String postCode = input.nextLine();

			System.out.print("Please enter your city/town name: ");
			String city = input.nextLine();

			System.out.print("Please enter your country: ");
			String country = input.nextLine();

			Customer cust = new Customer(name, streetHouseNumber, postCode, city, country, emailAddress, shop);

			File file = new File(PathGetter.getDataPath() + "customers.inv");
			try (OutputStreamWriter fileWriter = new OutputStreamWriter(new FileOutputStream(file, true))) {
				fileWriter.append("\n" + cust.getCustomerNumber() + "|");
				fileWriter.append(name + "|");
				fileWriter.append(streetHouseNumber + "|");
				fileWriter.append(postCode + "|");
				fileWriter.append(city + "|");
				fileWriter.append(country + "|");
				fileWriter.append(emailAddress);
				fileWriter.flush();
				shop.addCustomer(cust);
				
				System.out.println("Successfully registered. You can now make purchases.");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("That email address is alread associated with a customer.");
		}

	}
}
