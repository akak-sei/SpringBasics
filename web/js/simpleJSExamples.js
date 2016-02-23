/**
 * Created by akak on 2/19/2016.
 */

//print to document
document.write("hello world");

function myTestFunction (x, y) {
    document.write(x +" " +" " +mySimpleReturnFunction());
}

function mySimpleReturnFunction () {
    var returnVal = "this is also a test";

    return returnVal;
}

function myOperatorTest () {
    var operatorTest = 3*2;


    window.alert ("myOperatorTest: " +operatorTest);
}

function myComparatorTest () {
    var x = 4;
    var y = 2;

    x == y; //is equal to
    x != y; //is not equal to
    x === y; //strict equal to
    x !== y; //strict is not equal to
    x > y; //is greater than
    x < y; //is less than
    x >= y; //is greater than or equal to
    x <= y; //is less than or equal to
}

function myIfTest () {
    document.write("hello world");
    var x = 5;
    var y = 6;

    if (x == y) {
        window.alert ("if alert!");
    } else {
        window.alert ("else alert!");
    }

    if (x != 7) {
        document.write ("x is not 7");
        if (y ==6) {
            document.write ("y is 6");
        }
    }
}

function myComplexIfTest () {
    var x = 5;
    var y = 6;

    if ((x > 4) && (y > 5)) {
        window.alert ("this is a complex if test!");
    }
}

function mySwitchTest () {
    var month = "Jan";

    switch (month) {
        case "Jan": document.write ("Month is January");
            break;
        case "Feb": document.write ("Month is February");
            break;
        case "Mar": document.write ("Month is March");
            break;
        case "Apr": document.write ("Month is April");
            break;
        case "May": document.write ("Month is May");
            break;
        case "Jun": document.write ("Month is June");
            break;
        case "Jul": document.write ("Month is July");
            break;
        case "Aug": document.write ("Month is August");
            break;
        default: document.write ("no match");

    }
}

function mySimplePromptTest () {
    var promptVal = window.prompt ("please type your name below");

    if (promptVal.length > 5) {
        document.write ("That's a long name!");
    } else {
        document.write ("That's a short name!");
    }
}

function myForTest () {

    for (test = 1; test < 11; test++) {
        document.write ("I will add another " +test);
    }
}

function myWhileTest () {
    var test = 1;

    while (test < 5) {
        document.write ("this is a test of while <br />");
        test++;
    }
}

function myArrayTest () {
    var cars = ["Ferrari" , "Mercedes", "Ford", "Range Rover"];
    cars[1] = "Toyota";

    document.write ("Length: " +cars.length +"<br />");
    document.write (cars[1] +"<br />");

    var boats = new Array ("Big one", "Small one");
    boats.push("Cargo");

    for (var i=0; i < boats.length; i++) {
        document.write (boats[i] +"<br />")
    }
}