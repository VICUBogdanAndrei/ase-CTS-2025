package Prototype;

import Singleton.EuPlatescProvider;
import Singleton.IPaymentProvider;

public class Main {
    public static void main(String[] args) {

        SafetyDocument s1 = new SafetyDocument();
        SafetyDocument s2 = s1.clone();

        System.out.println("S1 Hashcode: " + System.identityHashCode(s1));
        System.out.println("C1 Hashcode: " + System.identityHashCode(s2));
    }
}