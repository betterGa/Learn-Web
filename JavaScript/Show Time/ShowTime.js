function ShowTime()
{var Upper=["天","一","二","三","四","五","六"];

//创建 Date 对象时，可以使用许多方法对其进行操作。 
d=new Date();


//一个变量的类型取决于第一次赋值的类型
time=d.getYear()+"年";
time=d.getFullYear()+"年";
time+=(d.getMonth()+1)+"月";
time+=d.getDate()+"日";
time+="星期 "+Upper[d.getDay()]+"       ";
time+=addZero(d.getHours())+"时";
time+=addZero(d.getMinutes())+"分";
time+=addZero(d.getSeconds())+"秒";


//window.document.write(time);在文档页面显示

//window.status=time;已过时


setTimeout("ShowTime()",1000);


//alert(time);弹出警告框






}

function addZero(i)
{if(i<10) return '0'+i;
return i}