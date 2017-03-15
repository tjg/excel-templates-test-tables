# excel-templates-test-tables

## Problem

If a template has a table, and you render an excel file with a changed column name, Excel will complain:

> Excel could not open test.xlsx because some content is unreadable. Do you want to open and repair this workbook?


## Usage

- Run `excel-templates-test-tables.core/bad`.
- Open `test-bad.xlsx`, newly created in the project's root dir. Excel should complain.


## Analysis

I renamed `test-bad.xlsx` to `test-bad.xlsx.zip`, opened it, and
examined its contents:

- **./xl/sharedStrings.xml:** column name from the template
- **./xl/tables/table1.xml:** column name from the template
- **./xl/worksheets/sheet1.xml:** column name I changed it to at runtime

So there's a conflict between the template's column name and the new one.
