package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("Home", "2023", 30000, "444 Dreams Blvd", 1, 500, 2000));
        assets.add(new House("Vacation Home", "2034", 400000, "333 Success Drive", 2, 1500, 5000));
        assets.add(new Vehicle());

    }
}