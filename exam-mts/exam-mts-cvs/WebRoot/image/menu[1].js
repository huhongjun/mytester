
function showsubmenu(sid)
{
	if (sid=="") sid=0;
	a = eval("submenu" + sid);

	/////////////////////////////////////
	//ÿ����һ�����⣬���� i ������ֵ
	////////////////////////////////////
	//for (i=1;i<=8;i++)
	//{
		//if (i!=sid) 
		//	eval("submenu" + i + ".style.display=\"none\";");
	//}
	if (a.style.display == "none")
	{
		eval("submenu" + sid + ".style.display=\"\";");
		eval("menuflagi" + sid + ".src=\"/newpage/images/2_08.jpg\";");
	}
	else
	{
		eval("submenu" + sid + ".style.display=\"none\";");
		eval("menuflagi" + sid + ".src=\"/newpage/images/2_18.jpg\";");
	}
}

function css_over(src)
{
	src.style.cursor="hand";
	src.style.color="#0000FF";
	src.style.textDecorationUnderline=0;
}

function css_out(src)
{
	src.style.cursor="";
	src.style.color=1;
	src.style.textDecorationUnderline=0;
}
