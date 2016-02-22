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
