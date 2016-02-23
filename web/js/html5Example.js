/**
 * Created by akak on 2/23/2016.
 */

function testQuery () {
    document.querySelector('#first').onclick=testAlert;
}

function testQueryAll () {
    var list = document.querySelectorAll('.clickableP');
    for (var i=0; i<list.length; i++) {
        list[i].onclick=testAlert;
    }
}

function testAlert () {
    window.alert ("something was clicked");
}