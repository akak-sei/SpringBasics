/**
 * Created by akak on 2/22/2016.
 */

var testObject = {
    testVal: "7",
    testVal2: "5",
    testName: "frank",
    showProperties: function () {
        document.write ("name: " + testObject.testName + "<br />"
            + "hero testVal: " + testObject.testVal + "<br />"
            + "hero testVal2: " + testObject.testVal2 + "<br />");
    }
}

function Hero (name, strength, armor) {
    this.armor = armor;
    this.strength = strength;
    this.name = name;
}

function runSimpleObjectTests () {
    var dwarf = new Hero("gogli", 4, 5);
    var barbarian = new Hero ("gollum", 10, 10);

    var character = dwarf;
    document.write ("<h3>Hero Properties</h3>");
    document.write ("Name: " +character.name +"<br />");
    document.write ("Armor: " +character.armor +"<br />");
    document.write ("Strength: " +character.strength +"<br />");

    for (var x in character) {
        document.write (x +":" +dwarf[x] + "<br />");
    }

    testObject.showProperties();
}

function testNavigatorObject () {
    window.alert ("Your browser is " +window.navigator.appName);
}

function testHistoryObject () {
    window.alert ("My browser has visited " +window.history.length +" pages");
}