function aa(a){p(document.frm.state,a)}
function ab(a){p(document.frm.exp_year,a)}
function ac(a){p(document.frm.exp_month,a)}
function ad(a){p(document.frm.exp_day,a)}
function ae(a){p(document.frm.dob_year,a)}
function af(a){p(document.frm.dob_month,a)}
function ag(a){p(document.frm.dob_day,a)}

function p(a,b){for(c in a.options)if(a.options[c].value==b){a.options[c].selected=true;break}}

function isNumberKey(evt){
var charCode=(evt.which)?evt.which:event.keyCode
if(charCode>31&&(charCode<48||charCode>57))
return false;
return true;
}


function setDateTime(){
var d=new Date();
var month=d.getMonth();
var day=d.getDate();
var year=d.getFullYear();
var hour=d.getHours();
var minute=d.getMinutes();

month=month+1;
minute=Math.ceil(minute/5)*5;

p(document.frm.month,month);
p(document.frm.day,day);
p(document.frm.year,year);
p(document.frm.hours,hour);
p(document.frm.minute,minute);
}

function va(a){p(document.frm.type,a)}
function vb(a){p(document.frm.location,a)}