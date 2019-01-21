package jdbc;

/*
 * to execute the command -> CTRL + Enter
 * 
 * use <database_name>; // to select the database you want to work it.
 * create table <table_name> (<column1_name> <column1_type>, <column2_name> <column2_type>, .... ); // int = integer, varchar(80) = string and its size.
 * desc <table_name>; // to describe your table.
 * insert into <table_name> values (<column1_value>, <column2_value>, ...);
 * select * from <table_name>; // * means all columns. // to fetch all table.
 * select * from <table_name> order by <column_name>; 
 * select * from <table_name> order by <column_name> asc/desc; 
 * select <table_name> from <database_name> where <where, condition> // eg -> select username from student where userid = 3;
 * set autocommit = 0;  // If autocommit is 1, you cannot back the previous transaction.
 * commit; // commit changes // you cannot go the last transaction.
 * rollback; // undo changes. // remove last transaction.
 * delete from <table_name> where <where, condition>; // eg -> delete from student where rollNo > 2;
 * delete from <table_name>; // it deletes all table from the database. // you can go back. - DML
 * truncate <table_name> // it deletes all table form the database. // you cannot go back!  - DDL
 * set sql_safe_updates = 0; // 
 * 
 * drop <table_name>;
 * drop database <database_name>;
 * show <table_name>;
 * show <databases>;
 * 
 * some aggregate functions.
 * ----------------------------------------------------------------------------------------------------------------------
 * select count(*) from student; // it returns you the number of all rows.
 * select max/min/avg/sum(<column_name>) from <table_name>; // it returns you the max/min/avg/sum value in the column. //
 * 
 * select count(*) as <title> from student; // as = alias
 * select max/min/avg/sum(<column_name>) as <title> from <table_name>;
 * ----------------------------------------------------------------------------------------------------------------------
 * 
 * 
 * There are some Languages in MySQL.
 * 1) DDL     = Data Definition Language. (When you create table, database, drop table, ...)
 * 2) DML     = Data Manipulation Language. (When you insert, update, delete a value)
 * 3) DRL/DQL = DRL(Data Retrieve Language / Data Query Language ) ()
 * 4) TCL     = Transaction Control Language
 * 
 */


public class MySQLCommands {

}
