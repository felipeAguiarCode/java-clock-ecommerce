package com.dio.dio.clocks.Data;

import java.util.Arrays;
import java.util.List;

import com.dio.dio.clocks.Domain.Clock;
import org.springframework.stereotype.Component;

@Component
public class ClockData {
    public static List<Clock> getClocksDatabase() {

        List<Clock> database = Arrays.asList(
                new Clock(1L, "Celestial Time", "https://gwath-store-newdemo.myshopify.com/cdn/shop/files/product_11_d6a9d16f-09b8-44ad-b1e8-c63977a3c9f1.png", 70.00, 60.00, 200),
                new Clock(2L, "Aurum Prestige", "https://gwath-store-newdemo.myshopify.com/cdn/shop/files/product_7_218628df-09dc-42cf-ba2d-7cb5e5baf097.png", 80.00, 70.00, 21),
                new Clock(3L, "The Velvet Tock", "https://gwath-store-newdemo.myshopify.com/cdn/shop/files/product_14_f09a9654-8298-4b2a-a1c9-c89ff9d29dc3.png", 90.00, 80.00, 15),
                new Clock(4L, "Astralis Maison", "https://gwath-store-newdemo.myshopify.com/cdn/shop/files/product_13_4754b709-0846-4b63-ab32-0efe1f4d71a2.png", 80.00, 70.00, 2),
                new Clock(5L, "Crown & Compass", "https://gwath-store-newdemo.myshopify.com/cdn/shop/files/product_16_31d3ebfc-9bea-428a-a1ca-4724a9c0e5ec.png", 90.00, 40.00, 5),
                new Clock(6L, "Maison Du Temps", "https://gwath-store-newdemo.myshopify.com/cdn/shop/files/product_12_3535ac39-be52-463a-9575-77630a1dc60c.png", 90.00, 69.90, 23),
                new Clock(7L, "Château Luxe", "https://gwath-store-newdemo.myshopify.com/cdn/shop/files/product_10_e4815c01-688e-40a3-a398-85d3ea2ae441.png", 90.00, 80.00, 64),
                new Clock(8L, "Chronos Regalia", "https://gwath-store-newdemo.myshopify.com/cdn/shop/files/product_8_2efbd0bc-11c5-4618-ad0e-99b5182b3dd3.png", 120.00, 60.00, 21),
                new Clock(9L, "Sovereign Pulse", "https://gwath-store-newdemo.myshopify.com/cdn/shop/files/product_21_46abb520-cb77-4945-8f77-6aa0e1594328.png", 80.00, 60.00, 11),
                new Clock(10L, "Velour Watch Co.", "https://gwath-store-newdemo.myshopify.com/cdn/shop/files/product_6_cbf9535b-1d61-4701-a401-cab6822cd03e.png", 99.00, 20.00, 10)
        );

        return database;
    }
}