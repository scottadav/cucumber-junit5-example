package com.example.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

/**
 * Setup steps that initialize the currently active example/scenario state to a certain value.
 */
public class Steps {
    @Given("a data table exists")
    public void aDataTableExists(DataTable dataTable) {
    }
}
