/**
 * Created by akak on 2/22/2016.
 */

function testSimpleDom () {
    var testElement;
    var parent;

    testElement = document.getElementById ("main").innerHTML;
    alert (testElement);
    //testElement = document.images[0];

    parent = document.childNodes[0].nodeName;
    window.alert (parent);
}

function writeFormContent () {
    window.alert ("got here");
    var title = document.getElementById ("element1").value;
    var desc = document.getElementById ("desc1").value;

    document.write ("<h3>Title:</h3>h3>" + title + "<br />>");
    document.write ("<h3>Description:</h3>h3>" + desc + "<br />>");
}

function testCssChange () {
    var bluediv = document.getElementById("div1");
    bluediv.style.backgroundColor = "blue";
}

function initEventListener () {
    var e1 = document.getElementById ("eventListenerTest");
    e1.addEventListener("click",goToWebPage, false);
}

function goToWebPage () {
    window.location = "http://www.cnn.com";
}