function aa(a){p(document.frm.state,a);}
function ab(a){p(document.frm.exp_year,a);}
function ac(a){p(document.frm.exp_month,a);}
function ad(a){p(document.frm.exp_day,a);}
function ae(a){p(document.frm.dob_year,a);}
function af(a){p(document.frm.dob_month,a);}
function ag(a){p(document.frm.dob_day,a);}

function p(a,b){
	for(i in a.options)
		if(a.options[i].value==b){
			a.options[i].selected=true;
			break;}}

function xx(a,b){
	for(i=0;i<a.options.length;i++)
		if(a.options[i].value==b){
			a.options[i].selected=true;
			break;}}