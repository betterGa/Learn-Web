function ShowTime()
{var Upper=["��","һ","��","��","��","��","��"];

//���� Date ����ʱ������ʹ����෽��������в����� 
d=new Date();


//һ������������ȡ���ڵ�һ�θ�ֵ������
time=d.getYear()+"��";
time=d.getFullYear()+"��";
time+=(d.getMonth()+1)+"��";
time+=d.getDate()+"��";
time+="���� "+Upper[d.getDay()]+"       ";
time+=addZero(d.getHours())+"ʱ";
time+=addZero(d.getMinutes())+"��";
time+=addZero(d.getSeconds())+"��";


//window.document.write(time);���ĵ�ҳ����ʾ

//window.status=time;�ѹ�ʱ


setTimeout("ShowTime()",1000);


//alert(time);���������






}

function addZero(i)
{if(i<10) return '0'+i;
return i}