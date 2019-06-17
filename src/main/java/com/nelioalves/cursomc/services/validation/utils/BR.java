package com.nelioalves.cursomc.services.validation.utils;

public class BR {

    public static boolean isValidCPF(final String ssn) {
	return !ssn.trim().equals("");
    }

    public static boolean isValidCNPJ(final String tin) {
	return !tin.trim().equals("");
    }

}
