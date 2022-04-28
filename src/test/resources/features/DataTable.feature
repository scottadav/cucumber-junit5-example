Feature: Demonstrate datatable display bug

  Scenario: Print datatable
    Given a data table exists
      | ColumnA | ColumnB | ColumnC |
      | 1       | 2       | 3       |
      | 4       | 5       | 6       |
      | 7       | 8       | 9       |
      | *       | 0       | #       |
