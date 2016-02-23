/**
 * Created by akak on 2/23/2016.
 */

window.addEventListener ("load", testWebStorage, false);

function testWebStorage () {
    var button = document.getElementById ("button");
    button.addEventListener("click", saveText, false);
}

function saveText () {
    var dpOne = document.getElementById ("one").value;
    var dpTwo = document.getElementById ("two").value;
    sessionStorage.setItem (dpOne, dpTwo);

    display (dpOne);

    document.getElementById ("one").value = "";
    document.getElementById ("two").value = "";
}

function display () {
    var rightboxText = document.getElementById ("rightbox");
    rightboxText.innerHTML = "";

    for (var x=0; x<sessionStorage.length; x++) {
        var a = sessionStorage.key(x);
        var b = sessionStorage.getItem(a);
        rightboxText.innerHTML += a+" -> " +b +"<br />";
    }

}